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
 * ExchangeInstrumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class ExchangeInstrumentTest {

    @Test
    void test_default_constructor(){
        final var exchangeInstrument = new ExchangeInstrument();

        exchangeInstrument.setIdentifier("Identificador 0001");
        exchangeInstrument.setInstrument(new Instrument());
        exchangeInstrument.setExchange(new Exchange());
        exchangeInstrument.setActive(true);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(exchangeInstrument.getActive()),
            () -> assertTrue(exchangeInstrument.getActive()),
            () -> assertNotNull(exchangeInstrument.getExchange()),
            () -> assertNotNull(exchangeInstrument.getIdentifier()),
            () -> assertNotNull(exchangeInstrument.getInstrument()),
            () -> assertNotNull(exchangeInstrument.toString()),
            () -> assertNotEquals(1, exchangeInstrument.hashCode()),
            () -> assertNotEquals(new ExchangeInstrument(), exchangeInstrument)
                 );
    }

    @Test
    void test(){
        final var exchangeInstrument = new ExchangeInstrument(new Exchange(), new Instrument(), true, "Identifier 001");

        assertAll("Test Getters And Setters",
                () -> assertNotNull(exchangeInstrument.getActive()),
                () -> assertTrue(exchangeInstrument.getActive()),
                () -> assertNotNull(exchangeInstrument.getExchange()),
                () -> assertNotNull(exchangeInstrument.getIdentifier()),
                () -> assertNotNull(exchangeInstrument.getInstrument()),
                () -> assertNotNull(exchangeInstrument.toString()),
                () -> assertNotEquals(1, exchangeInstrument.hashCode()),
                () -> assertNotEquals(new ExchangeInstrument(), exchangeInstrument)
        );
    }

}
