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

import org.junit.jupiter.api.Test;

/**
 * InstrumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class InstrumentTest {

    @Test
    void gettersAndSetters() {
        final var instrument = new Instrument();
        instrument.setId(111L);
        instrument.setName("Instrumento01");
        instrument.setDescription("Descripción de instrumento");
        instrument.setCoinTarget(new LocalCoin());
        instrument.setCoinSource(new LocalCoin());
        instrument.setActive(true);

        assertAll("Test Getters And Setters",
                () -> assertNotNull(instrument.getId()),
                () -> assertNotNull(instrument.getActive()),
                () -> assertNotNull(instrument.getName()),
                () -> assertNotNull(instrument.getDescription()),
                () -> assertNotNull(instrument.getCoinSource()),
                () -> assertNotNull(instrument.getCoinTarget()),
                () -> assertNotNull(instrument.toString()),
                () -> assertNotEquals(1, instrument.hashCode()),
                () -> assertNotEquals(new Instrument(), instrument)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Instrument}
     *   <li>{@link Instrument#setActive(Boolean)}
     *   <li>{@link Instrument#setCoinSource(LocalCoin)}
     *   <li>{@link Instrument#setCoinTarget(LocalCoin)}
     *   <li>{@link Instrument#setDescription(String)}
     *   <li>{@link Instrument#setId(Long)}
     *   <li>{@link Instrument#setName(String)}
     *   <li>{@link Instrument#toString()}
     *   <li>{@link Instrument#getActive()}
     *   <li>{@link Instrument#getCoinSource()}
     *   <li>{@link Instrument#getCoinTarget()}
     *   <li>{@link Instrument#getDescription()}
     *   <li>{@link Instrument#getId()}
     *   <li>{@link Instrument#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Instrument actualInstrument = new Instrument();
        actualInstrument.setActive(true);
        LocalCoin coinSource = new LocalCoin();
        coinSource.setActive(true);
        coinSource.setId(1);
        coinSource.setName("Name");
        coinSource.setSymbol("Symbol");
        actualInstrument.setCoinSource(coinSource);
        LocalCoin coinTarget = new LocalCoin();
        coinTarget.setActive(true);
        coinTarget.setId(1);
        coinTarget.setName("Name");
        coinTarget.setSymbol("Symbol");
        actualInstrument.setCoinTarget(coinTarget);
        actualInstrument.setDescription("The characteristics of someone or something");
        actualInstrument.setId(1L);
        actualInstrument.setName("Name");
        String actualToStringResult = actualInstrument.toString();
        assertTrue(actualInstrument.getActive());
        assertSame(coinSource, actualInstrument.getCoinSource());
        assertSame(coinTarget, actualInstrument.getCoinTarget());
        assertEquals("The characteristics of someone or something", actualInstrument.getDescription());
        assertEquals(1L, actualInstrument.getId().longValue());
        assertEquals("Name", actualInstrument.getName());
        assertEquals("Instrument{id=1, name='Name', description='The characteristics of someone or something', coinSource"
                + "=LocalCoin{id=1, symbol='Symbol', name='Name', active=true}, coinTarget=LocalCoin{id=1, symbol='Symbol',"
                + " name='Name', active=true}, active=true}", actualToStringResult);
    }

}
