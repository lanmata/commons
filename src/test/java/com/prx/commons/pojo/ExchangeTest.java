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
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
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
    void gettersAndSetters() {
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

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Exchange}
     *   <li>{@link Exchange#setActive(Boolean)}
     *   <li>{@link Exchange#setDescription(String)}
     *   <li>{@link Exchange#setHeadquarters(String)}
     *   <li>{@link Exchange#setId(Long)}
     *   <li>{@link Exchange#setInstruments(List)}
     *   <li>{@link Exchange#setName(String)}
     *   <li>{@link Exchange#setTimeZone(String)}
     *   <li>{@link Exchange#toString()}
     *   <li>{@link Exchange#getActive()}
     *   <li>{@link Exchange#getDescription()}
     *   <li>{@link Exchange#getHeadquarters()}
     *   <li>{@link Exchange#getId()}
     *   <li>{@link Exchange#getInstruments()}
     *   <li>{@link Exchange#getName()}
     *   <li>{@link Exchange#getTimeZone()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Exchange actualExchange = new Exchange();
        actualExchange.setActive(true);
        actualExchange.setDescription("The characteristics of someone or something");
        actualExchange.setHeadquarters("Headquarters");
        actualExchange.setId(1L);
        ArrayList<Instrument> instruments = new ArrayList<>();
        actualExchange.setInstruments(instruments);
        actualExchange.setName("Name");
        actualExchange.setTimeZone("UTC");
        String actualToStringResult = actualExchange.toString();
        assertTrue(actualExchange.getActive());
        assertEquals("The characteristics of someone or something", actualExchange.getDescription());
        assertEquals("Headquarters", actualExchange.getHeadquarters());
        assertEquals(1L, actualExchange.getId().longValue());
        assertSame(instruments, actualExchange.getInstruments());
        assertEquals("Name", actualExchange.getName());
        assertEquals("UTC", actualExchange.getTimeZone());
        assertEquals(
                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"timeZone\":\"UTC\","
                        + "\"headquarters\":\"Headquarters\",\"active\":true,\"instruments\":[]}",
                actualToStringResult);
    }

}
