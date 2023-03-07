/*
 *  @(#)ClientRestTemplate.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

package com.prx.commons.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Plantilla para implementaci&oacute;n de cliente
 *
 * @author <a href="mailto:lui.antonio.mata@gmail.com">Luis Mata</a>
 * @since 2019-08-23
 */
public class ClientRestTemplate {

    protected final MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;
    protected RestTemplate restTemplate;

    public ClientRestTemplate(MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter) {
        this.mappingJackson2HttpMessageConverter = mappingJackson2HttpMessageConverter;
        init();
    }

    /**
     * Inicializa las propiedades para el cliente de servicio REST
     */
    protected final void init() {
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(APPLICATION_JSON);
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(mappingJackson2HttpMessageConverter);

        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();

        // Inicializa el rest template agregando un interceptor para hacer debug de mensajes y convertidor de mensajes.
        restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        restTemplate.setInterceptors(interceptors);
        restTemplate.setMessageConverters(messageConverters);
    }
}
