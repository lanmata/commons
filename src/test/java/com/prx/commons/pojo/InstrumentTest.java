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
import org.junit.jupiter.api.Test;

/**
 * InstrumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class InstrumentTest {

    @Test
    void gettersAndSetters(){
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

}