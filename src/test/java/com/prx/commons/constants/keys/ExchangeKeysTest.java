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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * ExchangeKeysTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class ExchangeKeysTest {

    @Test
    void keys() {
        for (final var tp : ExchangeKeys.values()) {
            Assertions.assertTrue(Arrays.asList(ExchangeKeys.values()).contains(tp));
        }

        Assertions.assertAll("Test String ID",
                () -> Assertions.assertNotEquals(0, ExchangeKeys.BITFINEX.getId()),
                () -> Assertions.assertNotEquals(0, ExchangeKeys.BITSTAMP.getId()),
                () -> Assertions.assertNotEquals(0, ExchangeKeys.OKCOIN.getId())
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ExchangeKeys#valueOf(String)}
     *   <li>{@link ExchangeKeys#getId()}
     * </ul>
     */
    @Test
    void testValueOf() {
        assertEquals(1, ExchangeKeys.valueOf("BITSTAMP").getId());
    }

}
