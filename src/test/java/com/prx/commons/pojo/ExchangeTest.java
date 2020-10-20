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

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * ExchangeTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class ExchangeTest {

    @Test
    void gettersAndSetters(){
        final var exchange = new Exchange();

        exchange.setActive(true);
        exchange.setDescription("Descripción");
        exchange.setHeadquarters("DC");
        exchange.setId(1L);
        exchange.setInstruments(new ArrayList<>());
        exchange.setName("Nombre");
        exchange.setTimeZone("America/Caracas");

        assertAll("Test Getters And Setters",
            () -> assertNotNull(exchange.getActive()),
            () -> assertTrue(exchange.getActive()),
            () -> assertNotNull(exchange.getDescription()),
            () -> assertNotNull(exchange.getHeadquarters()),
            () -> assertNotNull(exchange.getId()),
            () -> assertNotNull(exchange.getInstruments()),
            () -> assertNotNull(exchange.getName()),
            () -> assertNotNull(exchange.getTimeZone()),
            () -> assertNotNull(exchange.toString()),
            () -> assertNotEquals(1, exchange.hashCode()),
            () -> assertNotEquals(new Exchange(), exchange)
                 );
    }

}