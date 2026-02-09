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

package com.prx.commons.constants.keys;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * SizeKeyTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SizeKeyTest {

    @Test
    @DisplayName("Test all keys")
    void keys() {
        for (final var tp : SizeKey.values()) {
            Assertions.assertTrue(Arrays.asList(SizeKey.values()).contains(tp));
            Assertions.assertNotNull(tp.toString());
        }
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link SizeKey#valueOf(String)}
     *   <li>{@link SizeKey#toString()}
     * </ul>
     */
    @Test
    @DisplayName("Test valueOf and toString methods")
    void testValueOf() {
        assertEquals("b", SizeKey.valueOf("BYTES").toString());
    }

    @Test
    @DisplayName("SizeKey values include expected constants")
    void values() {
        assertEquals(9, SizeKey.values().length);
    }

}
