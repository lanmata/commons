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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * ExchangeInstrumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class ExchangeInstrumentTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ExchangeInstrument#ExchangeInstrument()}
     *   <li>{@link ExchangeInstrument#setActive(Boolean)}
     *   <li>{@link ExchangeInstrument#setExchange(Exchange)}
     *   <li>{@link ExchangeInstrument#setIdentifier(String)}
     *   <li>{@link ExchangeInstrument#setInstrument(Instrument)}
     *   <li>{@link ExchangeInstrument#toString()}
     *   <li>{@link ExchangeInstrument#getActive()}
     *   <li>{@link ExchangeInstrument#getExchange()}
     *   <li>{@link ExchangeInstrument#getIdentifier()}
     *   <li>{@link ExchangeInstrument#getInstrument()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ExchangeInstrument actualExchangeInstrument = new ExchangeInstrument();
        actualExchangeInstrument.setActive(true);
        Exchange exchange = new Exchange();
        exchange.setActive(true);
        exchange.setDescription("The characteristics of someone or something");
        exchange.setHeadquarters("Headquarters");
        exchange.setId(1L);
        exchange.setInstruments(new ArrayList<>());
        exchange.setName("Name");
        exchange.setTimeZone("UTC");
        actualExchangeInstrument.setExchange(exchange);
        actualExchangeInstrument.setIdentifier("42");
        LocalCoin coinSource = new LocalCoin();
        coinSource.setActive(true);
        coinSource.setId(1);
        coinSource.setName("Name");
        coinSource.setSymbol("Symbol");
        LocalCoin coinTarget = new LocalCoin();
        coinTarget.setActive(true);
        coinTarget.setId(1);
        coinTarget.setName("Name");
        coinTarget.setSymbol("Symbol");
        Instrument instrument = new Instrument();
        instrument.setActive(true);
        instrument.setCoinSource(coinSource);
        instrument.setCoinTarget(coinTarget);
        instrument.setDescription("The characteristics of someone or something");
        instrument.setId(1L);
        instrument.setName("Name");
        actualExchangeInstrument.setInstrument(instrument);
        String actualToStringResult = actualExchangeInstrument.toString();
        assertTrue(actualExchangeInstrument.getActive());
        assertSame(exchange, actualExchangeInstrument.getExchange());
        assertEquals("42", actualExchangeInstrument.getIdentifier());
        assertSame(instrument, actualExchangeInstrument.getInstrument());
        assertEquals(
                "{\"exchange\":{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"timeZone"
                        + "\":\"UTC\",\"headquarters\":\"Headquarters\",\"active\":true,\"instruments\":[]},\"instrument\":{\"id\":1,\"name\":"
                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"coinSource\":{\"id\":1,\"symbol\":"
                        + "\"Symbol\",\"name\":\"Name\",\"active\":true},\"coinTarget\":{\"id\":1,\"symbol\":\"Symbol\",\"name\":\"Name\",\"active\""
                        + ":true},\"active\":true},\"active\":true,\"identifier\":\"42\"}",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ExchangeInstrument#ExchangeInstrument(Exchange, Instrument, Boolean, String)}
     *   <li>{@link ExchangeInstrument#setActive(Boolean)}
     *   <li>{@link ExchangeInstrument#setExchange(Exchange)}
     *   <li>{@link ExchangeInstrument#setIdentifier(String)}
     *   <li>{@link ExchangeInstrument#setInstrument(Instrument)}
     *   <li>{@link ExchangeInstrument#toString()}
     *   <li>{@link ExchangeInstrument#getActive()}
     *   <li>{@link ExchangeInstrument#getExchange()}
     *   <li>{@link ExchangeInstrument#getIdentifier()}
     *   <li>{@link ExchangeInstrument#getInstrument()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Exchange exchange = new Exchange();
        exchange.setActive(true);
        exchange.setDescription("The characteristics of someone or something");
        exchange.setHeadquarters("Headquarters");
        exchange.setId(1L);
        exchange.setInstruments(new ArrayList<>());
        exchange.setName("Name");
        exchange.setTimeZone("UTC");

        LocalCoin coinSource = new LocalCoin();
        coinSource.setActive(true);
        coinSource.setId(1);
        coinSource.setName("Name");
        coinSource.setSymbol("Symbol");

        LocalCoin coinTarget = new LocalCoin();
        coinTarget.setActive(true);
        coinTarget.setId(1);
        coinTarget.setName("Name");
        coinTarget.setSymbol("Symbol");

        Instrument instrument = new Instrument();
        instrument.setActive(true);
        instrument.setCoinSource(coinSource);
        instrument.setCoinTarget(coinTarget);
        instrument.setDescription("The characteristics of someone or something");
        instrument.setId(1L);
        instrument.setName("Name");
        ExchangeInstrument actualExchangeInstrument = new ExchangeInstrument(exchange, instrument, true, "42");
        actualExchangeInstrument.setActive(true);
        Exchange exchange2 = new Exchange();
        exchange2.setActive(true);
        exchange2.setDescription("The characteristics of someone or something");
        exchange2.setHeadquarters("Headquarters");
        exchange2.setId(1L);
        exchange2.setInstruments(new ArrayList<>());
        exchange2.setName("Name");
        exchange2.setTimeZone("UTC");
        actualExchangeInstrument.setExchange(exchange2);
        actualExchangeInstrument.setIdentifier("42");
        LocalCoin coinSource2 = new LocalCoin();
        coinSource2.setActive(true);
        coinSource2.setId(1);
        coinSource2.setName("Name");
        coinSource2.setSymbol("Symbol");
        LocalCoin coinTarget2 = new LocalCoin();
        coinTarget2.setActive(true);
        coinTarget2.setId(1);
        coinTarget2.setName("Name");
        coinTarget2.setSymbol("Symbol");
        Instrument instrument2 = new Instrument();
        instrument2.setActive(true);
        instrument2.setCoinSource(coinSource2);
        instrument2.setCoinTarget(coinTarget2);
        instrument2.setDescription("The characteristics of someone or something");
        instrument2.setId(1L);
        instrument2.setName("Name");
        actualExchangeInstrument.setInstrument(instrument2);
        String actualToStringResult = actualExchangeInstrument.toString();
        assertTrue(actualExchangeInstrument.getActive());
        assertSame(exchange2, actualExchangeInstrument.getExchange());
        assertEquals("42", actualExchangeInstrument.getIdentifier());
        assertSame(instrument2, actualExchangeInstrument.getInstrument());
        assertEquals(
                "{\"exchange\":{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"timeZone"
                        + "\":\"UTC\",\"headquarters\":\"Headquarters\",\"active\":true,\"instruments\":[]},\"instrument\":{\"id\":1,\"name\":"
                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"coinSource\":{\"id\":1,\"symbol\":"
                        + "\"Symbol\",\"name\":\"Name\",\"active\":true},\"coinTarget\":{\"id\":1,\"symbol\":\"Symbol\",\"name\":\"Name\",\"active\""
                        + ":true},\"active\":true},\"active\":true,\"identifier\":\"42\"}",
                actualToStringResult);
    }

    @Test
    void test_default_constructor() {
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
    void test() {
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
