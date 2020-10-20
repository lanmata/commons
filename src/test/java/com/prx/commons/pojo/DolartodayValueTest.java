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

import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * DolartodayValueTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class DolartodayValueTest {

    @Test
    void gettersAndSetters(){
        final var dolarTodayValue = new DolartodayValue();

        dolarTodayValue.setBitcoinRef(200252.25D);
        dolarTodayValue.setCencoex(2525269.745D);
        dolarTodayValue.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        dolarTodayValue.setDolartoday(26635896.256D);
        dolarTodayValue.setEfectivo(115258.745D);
        dolarTodayValue.setEfectivoCucuta(12536.25D);
        dolarTodayValue.setEfectivoReal(225856.254D);
        dolarTodayValue.setInstrumentDescriptor("Bs");
        dolarTodayValue.setLocalbitcoinRef(145258.368D);
        dolarTodayValue.setPromedio(1415425.25D);
        dolarTodayValue.setSicad1(45678.6543D);
        dolarTodayValue.setSicad2(98457.78634D);
        dolarTodayValue.setPromedioReal(8754.97854D);
        dolarTodayValue.setTransferCucuta(987452.54232D);
        dolarTodayValue.setTransferencia(23432942.8764324D);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(dolarTodayValue.getBitcoinRef()),
            () -> assertNotNull(dolarTodayValue.getCencoex()),
            () -> assertNotNull(dolarTodayValue.getDateTime()),
            () -> assertNotNull(dolarTodayValue.getDolartoday()),
            () -> assertNotNull(dolarTodayValue.getEfectivo()),
            () -> assertNotNull(dolarTodayValue.getEfectivoCucuta()),
            () -> assertNotNull(dolarTodayValue.getEfectivoReal()),
            () -> assertNotNull(dolarTodayValue.getInstrumentDescriptor()),
            () -> assertNotNull(dolarTodayValue.getLocalbitcoinRef()),
            () -> assertNotNull(dolarTodayValue.getPromedio()),
            () -> assertNotNull(dolarTodayValue.getSicad1()),
            () -> assertNotNull(dolarTodayValue.getSicad2()),
            () -> assertNotNull(dolarTodayValue.getPromedioReal()),
            () -> assertNotNull(dolarTodayValue.getTransferCucuta()),
            () -> assertNotNull(dolarTodayValue.getTransferencia()),
            () -> assertNotNull(dolarTodayValue.toString()),
            () -> assertNotEquals(1, dolarTodayValue.hashCode()),
            () -> assertNotEquals(new DolartodayValue(), dolarTodayValue)
                 );

    }

}