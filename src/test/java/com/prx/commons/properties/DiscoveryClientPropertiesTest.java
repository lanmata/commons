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