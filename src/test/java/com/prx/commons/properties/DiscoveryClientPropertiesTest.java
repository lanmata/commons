/*
 * @(#)DiscoveryClientPropertiesTest.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.prx.commons.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * DiscoveryClientPropertiesTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
class DiscoveryClientPropertiesTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link DiscoveryClientProperties}
     *   <li>{@link DiscoveryClientProperties#setMaxConnectionsPerHost(Integer)}
     *   <li>{@link DiscoveryClientProperties#setMaxTotalConnections(Integer)}
     *   <li>{@link DiscoveryClientProperties#setName(String)}
     *   <li>{@link DiscoveryClientProperties#setTrustStoreFile(String)}
     *   <li>{@link DiscoveryClientProperties#setTrustStorePassword(String)}
     *   <li>{@link DiscoveryClientProperties#getMaxConnectionsPerHost()}
     *   <li>{@link DiscoveryClientProperties#getMaxTotalConnections()}
     *   <li>{@link DiscoveryClientProperties#getName()}
     *   <li>{@link DiscoveryClientProperties#getTrustStoreFile()}
     *   <li>{@link DiscoveryClientProperties#getTrustStorePassword()}
     * </ul>
     */
    @Test
    void testConstructor() {
        DiscoveryClientProperties actualDiscoveryClientProperties = new DiscoveryClientProperties();
        actualDiscoveryClientProperties.setMaxConnectionsPerHost(3);
        actualDiscoveryClientProperties.setMaxTotalConnections(3);
        actualDiscoveryClientProperties.setName("Name");
        actualDiscoveryClientProperties.setTrustStoreFile("Trust Store File");
        actualDiscoveryClientProperties.setTrustStorePassword("iloveyou");
        assertEquals(3, actualDiscoveryClientProperties.getMaxConnectionsPerHost().intValue());
        assertEquals(3, actualDiscoveryClientProperties.getMaxTotalConnections().intValue());
        assertEquals("Name", actualDiscoveryClientProperties.getName());
        assertEquals("Trust Store File", actualDiscoveryClientProperties.getTrustStoreFile());
        assertEquals("iloveyou", actualDiscoveryClientProperties.getTrustStorePassword());
    }

    @Test
    void testGettersAndSetters() {
        final var discoveryClient = new DiscoveryClientProperties();
        discoveryClient.setMaxTotalConnections(100);
        discoveryClient.setMaxConnectionsPerHost(10);
        discoveryClient.setName("Nombre de cliente");
        discoveryClient.setTrustStoreFile("nombre_archivo");
        discoveryClient.setTrustStorePassword("·$%&/()kadsfjdasf");

        assertEquals(100, discoveryClient.getMaxTotalConnections());
        assertEquals(10, discoveryClient.getMaxConnectionsPerHost());
        assertEquals("Nombre de cliente", discoveryClient.getName());
        assertEquals("nombre_archivo", discoveryClient.getTrustStoreFile());
        assertEquals("·$%&/()kadsfjdasf", discoveryClient.getTrustStorePassword());
    }

}
