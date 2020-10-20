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

package com.prx.commons.enums.keys;

import java.util.Arrays;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;

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

        assertAll("Test String ID",
            () -> assertNotEquals(0,ExchangeKeys.BITFINEX.getId()),
            () -> assertNotEquals(0,ExchangeKeys.BITSTAMP.getId()),
            () -> assertNotEquals(0,ExchangeKeys.OKCOIN.getId())
                 );
    }

}