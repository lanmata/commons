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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInitializer;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriTemplateHandler;

/**
 * ClientRestTemplateTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class ClientRestTemplateTest {

    /**
     * Method under test: {@link ClientRestTemplate#ClientRestTemplate(MappingJackson2HttpMessageConverter)}
     */
    @Test
    void testConstructor() {
        ClientRestTemplate actualClientRestTemplate = new ClientRestTemplate(new MappingJackson2HttpMessageConverter());
        assertEquals(1, actualClientRestTemplate.mappingJackson2HttpMessageConverter.getSupportedMediaTypes().size());
        RestTemplate restTemplate = actualClientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(restTemplate.getRequestFactory() instanceof BufferingClientHttpRequestFactory);
        List<ClientHttpRequestInitializer> clientHttpRequestInitializers = restTemplate.getClientHttpRequestInitializers();
        assertTrue(clientHttpRequestInitializers.isEmpty());
        assertTrue(restTemplate.getErrorHandler() instanceof DefaultResponseErrorHandler);
        assertEquals(1, restTemplate.getMessageConverters().size());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertEquals(clientHttpRequestInitializers, interceptors);
        assertTrue(interceptors.isEmpty());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
    }

    /**
     * Method under test: {@link ClientRestTemplate#ClientRestTemplate(MappingJackson2HttpMessageConverter)}
     */
    @Test
    void testConstructor2() {
        ClientRestTemplate actualClientRestTemplate = new ClientRestTemplate(
                new MappingJackson2HttpMessageConverter(new ObjectMapper()));
        assertEquals(1, actualClientRestTemplate.mappingJackson2HttpMessageConverter.getSupportedMediaTypes().size());
        RestTemplate restTemplate = actualClientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(restTemplate.getRequestFactory() instanceof BufferingClientHttpRequestFactory);
        List<ClientHttpRequestInitializer> clientHttpRequestInitializers = restTemplate
                .getClientHttpRequestInitializers();
        assertTrue(clientHttpRequestInitializers.isEmpty());
        assertTrue(restTemplate.getErrorHandler() instanceof DefaultResponseErrorHandler);
        assertEquals(1, restTemplate.getMessageConverters().size());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertEquals(clientHttpRequestInitializers, interceptors);
        assertTrue(interceptors.isEmpty());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
    }

    /**
     * Method under test: {@link ClientRestTemplate#ClientRestTemplate(MappingJackson2HttpMessageConverter)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.converter.json.MappingJackson2HttpMessageConverter.setSupportedMediaTypes(java.util.List)" because "this.mappingJackson2HttpMessageConverter" is null
        //       at com.prx.commons.rest.ClientRestTemplate.init(ClientRestTemplate.java:49)
        //       at com.prx.commons.rest.ClientRestTemplate.<init>(ClientRestTemplate.java:40)
        //   See https://diff.blue/R013 to resolve this issue.

        new ClientRestTemplate(null);
    }

    /**
     * Method under test: {@link ClientRestTemplate#ClientRestTemplate(MappingJackson2HttpMessageConverter)}
     */
    @Test
    void testConstructor4() {
        Consumer<Map<MediaType, ObjectMapper>> registrar = mock(Consumer.class);
        doNothing().when(registrar).accept(Mockito.<Map<MediaType, ObjectMapper>>any());

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.registerObjectMappersForType(Object.class, registrar);
        ClientRestTemplate actualClientRestTemplate = new ClientRestTemplate(mappingJackson2HttpMessageConverter);
        assertEquals(1, actualClientRestTemplate.mappingJackson2HttpMessageConverter.getSupportedMediaTypes().size());
        RestTemplate restTemplate = actualClientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(restTemplate.getRequestFactory() instanceof BufferingClientHttpRequestFactory);
        List<ClientHttpRequestInitializer> clientHttpRequestInitializers = restTemplate
                .getClientHttpRequestInitializers();
        assertTrue(clientHttpRequestInitializers.isEmpty());
        assertTrue(restTemplate.getErrorHandler() instanceof DefaultResponseErrorHandler);
        assertEquals(1, restTemplate.getMessageConverters().size());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertEquals(clientHttpRequestInitializers, interceptors);
        assertTrue(interceptors.isEmpty());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
        verify(registrar).accept(Mockito.<Map<MediaType, ObjectMapper>>any());
    }

    @Test
    void init() {
        final var clientRestTemplate = new ClientRestTemplate(
                new MappingJackson2HttpMessageConverter());
        clientRestTemplate.restTemplate = new RestTemplate();
        clientRestTemplate.init();
        assertNotNull(clientRestTemplate.mappingJackson2HttpMessageConverter);
        assertNotNull(clientRestTemplate.restTemplate);
    }

    /**
     * Method under test: {@link ClientRestTemplate#init()}
     */
    @Test
    void testInit() {
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(new MappingJackson2HttpMessageConverter());
        clientRestTemplate.init();
        assertEquals(1, clientRestTemplate.mappingJackson2HttpMessageConverter.getSupportedMediaTypes().size());
        RestTemplate restTemplate = clientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(restTemplate.getRequestFactory() instanceof BufferingClientHttpRequestFactory);
        List<ClientHttpRequestInitializer> clientHttpRequestInitializers = restTemplate
                .getClientHttpRequestInitializers();
        assertTrue(clientHttpRequestInitializers.isEmpty());
        assertTrue(restTemplate.getErrorHandler() instanceof DefaultResponseErrorHandler);
        assertEquals(1, restTemplate.getMessageConverters().size());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertEquals(clientHttpRequestInitializers, interceptors);
        assertTrue(interceptors.isEmpty());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
    }

    /**
     * Method under test: {@link ClientRestTemplate#init()}
     */
    @Test
    void testInit2() {
        Consumer<Map<MediaType, ObjectMapper>> registrar = mock(Consumer.class);
        doNothing().when(registrar).accept(Mockito.<Map<MediaType, ObjectMapper>>any());

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.registerObjectMappersForType(Object.class, registrar);
        ClientRestTemplate clientRestTemplate = new ClientRestTemplate(mappingJackson2HttpMessageConverter);
        clientRestTemplate.init();
        verify(registrar).accept(Mockito.<Map<MediaType, ObjectMapper>>any());
        assertEquals(1, clientRestTemplate.mappingJackson2HttpMessageConverter.getSupportedMediaTypes().size());
        RestTemplate restTemplate = clientRestTemplate.restTemplate;
        UriTemplateHandler uriTemplateHandler = restTemplate.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(restTemplate.getRequestFactory() instanceof BufferingClientHttpRequestFactory);
        List<ClientHttpRequestInitializer> clientHttpRequestInitializers = restTemplate
                .getClientHttpRequestInitializers();
        assertTrue(clientHttpRequestInitializers.isEmpty());
        assertTrue(restTemplate.getErrorHandler() instanceof DefaultResponseErrorHandler);
        assertEquals(1, restTemplate.getMessageConverters().size());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        assertEquals(clientHttpRequestInitializers, interceptors);
        assertTrue(interceptors.isEmpty());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
    }

}
