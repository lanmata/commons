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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * DolartodayValueTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class DolartodayValueTest {

    @Test
    void gettersAndSetters() {
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

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link DolartodayValue}
     *   <li>{@link DolartodayValue#setBitcoinRef(Double)}
     *   <li>{@link DolartodayValue#setCencoex(Double)}
     *   <li>{@link DolartodayValue#setDateTime(LocalDateTime)}
     *   <li>{@link DolartodayValue#setDolartoday(Double)}
     *   <li>{@link DolartodayValue#setEfectivo(Double)}
     *   <li>{@link DolartodayValue#setEfectivoCucuta(Double)}
     *   <li>{@link DolartodayValue#setEfectivoReal(Double)}
     *   <li>{@link DolartodayValue#setInstrumentDescriptor(String)}
     *   <li>{@link DolartodayValue#setLocalbitcoinRef(Double)}
     *   <li>{@link DolartodayValue#setPromedio(Double)}
     *   <li>{@link DolartodayValue#setPromedioReal(Double)}
     *   <li>{@link DolartodayValue#setSicad1(Double)}
     *   <li>{@link DolartodayValue#setSicad2(Double)}
     *   <li>{@link DolartodayValue#setTransferCucuta(Double)}
     *   <li>{@link DolartodayValue#setTransferencia(Double)}
     *   <li>{@link DolartodayValue#toString()}
     *   <li>{@link DolartodayValue#getBitcoinRef()}
     *   <li>{@link DolartodayValue#getCencoex()}
     *   <li>{@link DolartodayValue#getDateTime()}
     *   <li>{@link DolartodayValue#getDolartoday()}
     *   <li>{@link DolartodayValue#getEfectivo()}
     *   <li>{@link DolartodayValue#getEfectivoCucuta()}
     *   <li>{@link DolartodayValue#getEfectivoReal()}
     *   <li>{@link DolartodayValue#getInstrumentDescriptor()}
     *   <li>{@link DolartodayValue#getLocalbitcoinRef()}
     *   <li>{@link DolartodayValue#getPromedio()}
     *   <li>{@link DolartodayValue#getPromedioReal()}
     *   <li>{@link DolartodayValue#getSicad1()}
     *   <li>{@link DolartodayValue#getSicad2()}
     *   <li>{@link DolartodayValue#getTransferCucuta()}
     *   <li>{@link DolartodayValue#getTransferencia()}
     * </ul>
     */
    @Test
    void testConstructor() {
        DolartodayValue actualDolartodayValue = new DolartodayValue();
        actualDolartodayValue.setBitcoinRef(10.0d);
        actualDolartodayValue.setCencoex(10.0d);
        LocalDateTime dateTime = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualDolartodayValue.setDateTime(dateTime);
        actualDolartodayValue.setDolartoday(10.0d);
        actualDolartodayValue.setEfectivo(10.0d);
        actualDolartodayValue.setEfectivoCucuta(10.0d);
        actualDolartodayValue.setEfectivoReal(10.0d);
        actualDolartodayValue.setInstrumentDescriptor("Instrument Descriptor");
        actualDolartodayValue.setLocalbitcoinRef(10.0d);
        actualDolartodayValue.setPromedio(10.0d);
        actualDolartodayValue.setPromedioReal(10.0d);
        actualDolartodayValue.setSicad1(10.0d);
        actualDolartodayValue.setSicad2(10.0d);
        actualDolartodayValue.setTransferCucuta(10.0d);
        actualDolartodayValue.setTransferencia(10.0d);
        String actualToStringResult = actualDolartodayValue.toString();
        assertEquals(10.0d, actualDolartodayValue.getBitcoinRef().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getCencoex().doubleValue());
        assertSame(dateTime, actualDolartodayValue.getDateTime());
        assertEquals(10.0d, actualDolartodayValue.getDolartoday().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getEfectivo().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getEfectivoCucuta().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getEfectivoReal().doubleValue());
        assertEquals("Instrument Descriptor", actualDolartodayValue.getInstrumentDescriptor());
        assertEquals(10.0d, actualDolartodayValue.getLocalbitcoinRef().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getPromedio().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getPromedioReal().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getSicad1().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getSicad2().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getTransferCucuta().doubleValue());
        assertEquals(10.0d, actualDolartodayValue.getTransferencia().doubleValue());
        assertEquals(
                "DolartodayValue{dateTime=1970-01-01T00:00, instrumentDescriptor='Instrument Descriptor', transferencia=10.0,"
                        + " transferCucuta=10.0, efectivo=10.0, efectivoReal=10.0, efectivoCucuta=10.0, promedio=10.0,"
                        + " promedioReal=10.0, cencoex=10.0, sicad1=10.0, sicad2=10.0, bitcoinRef=10.0, localbitcoinRef=10.0,"
                        + " dolartoday=10.0}",
                actualToStringResult);
    }

}
