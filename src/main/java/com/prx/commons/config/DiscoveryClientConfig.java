/*
 *  @(#)DiscoveryClientConfig.java
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
package com.prx.commons.config;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl;
import com.prx.commons.properties.DiscoveryClientProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;

/**
 * DiscoveryClientProperties. Clase para la configuración de las conexiones segura con el componente
 * netgo-service-monitor
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 15-02-2020
 */
@Configuration
@RequiredArgsConstructor
public class DiscoveryClientConfig {

    /**
     * discoveryClientProperties.
     */
    private final DiscoveryClientProperties discoveryClientProperties;

    /**
     * Retorna un objeto de tipo {@link DiscoveryClient.DiscoveryClientOptionalArgs}
     *
     * @return {@link DiscoveryClient.DiscoveryClientOptionalArgs}
     */
    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(EurekaJerseyClientImpl.EurekaJerseyClientBuilder sslContext) {
        var args = new DiscoveryClient.DiscoveryClientOptionalArgs();
        args.setEurekaJerseyClient(sslContext.build());
        return args;
    }

    /**
     * Obtiene un contructor de clientes para Eureka a traves de Jersey.
     *
     * @return Objeto de tipo {@link SSLContext}
     */
    @Bean
    public EurekaJerseyClientImpl.EurekaJerseyClientBuilder sslContext() {
        var builder = new EurekaJerseyClientImpl.EurekaJerseyClientBuilder();
        builder.withClientName(discoveryClientProperties.getName());
        builder.withTrustStoreFile(discoveryClientProperties.getTrustStoreFile(),
                discoveryClientProperties.getTrustStorePassword());
        builder.withMaxTotalConnections(10);
        builder.withMaxConnectionsPerHost(10);
        return builder;
    }

}
