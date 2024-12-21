/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */

package com.prx.commons.rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriTemplateHandler;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientRestTemplateTest {

    @Test
    @DisplayName("Constructor initializes RestTemplate with default settings")
    void constructorInitializesRestTemplateWithDefaultSettings() {
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(new MappingJackson2HttpMessageConverter());
        RestTemplate restTemplate = clientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertInstanceOf(DefaultUriBuilderFactory.class, uriTemplateHandler);
        assertInstanceOf(BufferingClientHttpRequestFactory.class, restTemplate.getRequestFactory());
        assertInstanceOf(DefaultResponseErrorHandler.class, restTemplate.getErrorHandler());
        assertEquals(1, restTemplate.getMessageConverters().size());
        assertTrue(restTemplate.getInterceptors().isEmpty());
    }

    @Test
    @DisplayName("Constructor with null MappingJackson2HttpMessageConverter throws NullPointerException")
    void constructorWithNullMappingJackson2HttpMessageConverterThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new ClientRestTemplate(null));
    }

    @Test
    @DisplayName("Init method sets supported media types to application/json")
    void initMethodSetsSupportedMediaTypesToApplicationJson() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(converter);
        List<MediaType> supportedMediaTypes = converter.getSupportedMediaTypes();
        assertEquals(1, supportedMediaTypes.size());
        assertNotNull(clientRestTemplate);
        assertEquals(MediaType.APPLICATION_JSON, supportedMediaTypes.getFirst());
    }

    @Test
    @DisplayName("Init method initializes RestTemplate with empty interceptors")
    void initMethodInitializesRestTemplateWithEmptyInterceptors() {
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(new MappingJackson2HttpMessageConverter());
        RestTemplate restTemplate = clientRestTemplate.restTemplate;
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertTrue(interceptors.isEmpty());
    }

    @Test
    @DisplayName("Init method initializes RestTemplate with message converters")
    void initMethodInitializesRestTemplateWithMessageConverters() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(converter);
        RestTemplate restTemplate = clientRestTemplate.restTemplate;
        List<?> messageConverters = restTemplate.getMessageConverters();
        assertEquals(1, messageConverters.size());
        assertSame(converter, messageConverters.getFirst());
    }
}
