/*
 * @(#)FailCodeTest.java
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
package com.prx.commons.constants.keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prx.commons.constants.httpstatus.key.ClientErrorKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

/**
 * FailCodeTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class ClientErrorKeyTest {

    @Test
    void keys() {
        for (final var tp : ClientErrorKey.values()) {
            Assertions.assertTrue(Arrays.asList(ClientErrorKey.values()).contains(tp));
            Assertions.assertNotEquals(-1, tp.getCode());
            Assertions.assertNotNull(tp.getStatus());
        }
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ClientErrorKey#valueOf(String)}
     *   <li>{@link ClientErrorKey#getCode()}
     *   <li>{@link ClientErrorKey#getStatus()}
     * </ul>
     */
    @Test
    @DisplayName("valueOf returns expected ClientErrorKey and status message")
    void testValueOf() {
        ClientErrorKey actualValueOfResult = ClientErrorKey.valueOf("BAD_REQUEST");
        assertEquals(400, actualValueOfResult.getCode());
        assertEquals("The request was malformed or contained invalid syntax.", actualValueOfResult.getStatus());
    }

}
