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
package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * CurrencyPairExchangeTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class CurrencyPairExchangeTest {

    @Test
    void gettersAndSetters(){
        final var currencyPairExchange = new CurrencyPairExchange();

        currencyPairExchange.setId(12);
        currencyPairExchange.setEnabled(true);
        currencyPairExchange.setCurrencyBase(14);
        currencyPairExchange.setDecimalDisplay(2);
        currencyPairExchange.setCurrencyVariable(23);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(currencyPairExchange.getId()),
            () -> assertNotNull(currencyPairExchange.getEnabled()),
            () -> assertTrue(currencyPairExchange.getEnabled()),
            () -> assertNotNull(currencyPairExchange.getCurrencyBase()),
            () -> assertNotNull(currencyPairExchange.getDecimalDisplay()),
            () -> assertNotNull(currencyPairExchange.getCurrencyVariable()),
            () -> assertNotNull(currencyPairExchange.toString()),
            () -> assertNotEquals(1, currencyPairExchange.hashCode()),
            () -> assertNotEquals(new CurrencyPairExchange(), currencyPairExchange)
                 );
    }

}