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

package com.umdev.commons.constants.keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * SizeKeyTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class SizeKeyTest {

    @Test
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
    void testValueOf() {
        assertEquals("b", SizeKey.valueOf("BYTES").toString());
    }

}
