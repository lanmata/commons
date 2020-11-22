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

package com.prx.commons.enums.types;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * CriptocurrencyTypeTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class CriptocurrencyTypeTest {

    @Test
    void keys() {
        Arrays.stream(CriptocurrencyType.values()).map(tp -> Arrays.asList(CriptocurrencyType.values()).contains(tp))
            .forEach(Assertions::assertTrue);

        assertAll("Test String currency", () -> assertNotNull(CriptocurrencyType.BITCOIN.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.BITCOIN_CASH.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.CARDANO.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.CLP.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.EOS.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.ETHER.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.NANO.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.TRON.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.USD.getStrCurrency()),
            () -> assertNotNull(CriptocurrencyType.IOTA.getStrCurrency()));
    }

}