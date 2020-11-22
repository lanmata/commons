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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * ClientRestTemplateTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class ClientRestTemplateTest {

    @Test
    void init() {
        final var clientRestTemplate = new ClientRestTemplate(
            new MappingJackson2HttpMessageConverter());
        clientRestTemplate.restTemplate = new RestTemplate();
        clientRestTemplate.init();
        assertNotNull(clientRestTemplate.mappingJackson2HttpMessageConverter);
        assertNotNull(clientRestTemplate.restTemplate);
    }

}