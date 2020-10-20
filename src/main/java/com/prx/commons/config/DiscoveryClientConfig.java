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
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase para la configuración de las conexiones segura con el componente netgo-service-monitor
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2020-02-15
 */
@Configuration
@NoArgsConstructor
public class DiscoveryClientConfig {

    @Value("${security.discovery.client.name}")
    private String clientName;
    @Value("${security.discovery.client.trust-store-file}")
    private String trustStoreFile;
    @Value("${security.discovery.client.trust-store-password}")
    private String trustStorePassword;
    @Value("${security.discovery.client.max-total-connections}")
    private Integer maxTotalConnections;
    @Value("${security.discovery.client.max-connections-per-host}")
    private Integer maxConnectionsPerHost;

    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() {
        DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
        EurekaJerseyClientImpl.EurekaJerseyClientBuilder builder =
            new EurekaJerseyClientImpl.EurekaJerseyClientBuilder();

        builder.withClientName(clientName);
        builder.withTrustStoreFile(trustStoreFile, trustStorePassword);
        builder.withMaxTotalConnections(10);
        builder.withMaxConnectionsPerHost(10);
        args.setEurekaJerseyClient(builder.build());

        return args;
    }

}
