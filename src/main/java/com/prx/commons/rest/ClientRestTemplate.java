package com.prx.commons.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Plantilla para implementaci&oacute;n de cliente
 *
 * @author <a href="mailto:lui.antonio.mata@gmail.com">Luis Mata</a>
 * @since 2019-08-23
 */
public abstract class ClientRestTemplate {
    private static final Logger LOGGER = LogManager.getLogger(ClientRestTemplate.class);
    protected RestTemplate restTemplate;
    @Autowired
    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;

    /**
     * Inicializa las propiedades para el cliente de servicio REST
     */
    @PostConstruct
    void init() {
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(APPLICATION_JSON);
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(mappingJackson2HttpMessageConverter);

        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();

        // Inicializamos rest template agregando interceptor para hacer debug de mensajes y convertidor de mensajes.
        restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        restTemplate.setInterceptors(interceptors);
        restTemplate.setMessageConverters(messageConverters);
    }
}
