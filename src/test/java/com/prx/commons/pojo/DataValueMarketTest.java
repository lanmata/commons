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
 * DataValueMarketTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class DataValueMarketTest {

    @Test
    void gettersAndSetters() {
        final var dataValueMarket = new DataValueMarket();

        dataValueMarket.setVolume(145.452D);
        dataValueMarket.setOpen(22536.D);
        dataValueMarket.setMarketId(2L);
        dataValueMarket.setAsk(1452.36D);
        dataValueMarket.setLow(4582.36D);
        dataValueMarket.setLast(8536.69D);
        dataValueMarket.setInstrumentId(22L);
        dataValueMarket.setHigh(7858.36D);
        dataValueMarket.setClose(4562.36D);
        dataValueMarket.setBid(892.36D);
        dataValueMarket.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Test Getters And Setters",
                () -> assertNotNull(dataValueMarket.getVolume()),
                () -> assertNotNull(dataValueMarket.getOpen()),
                () -> assertNotNull(dataValueMarket.getMarketId()),
                () -> assertNotNull(dataValueMarket.getAsk()),
                () -> assertNotNull(dataValueMarket.getLow()),
                () -> assertNotNull(dataValueMarket.getLast()),
                () -> assertNotNull(dataValueMarket.getInstrumentId()),
                () -> assertNotNull(dataValueMarket.getHigh()),
                () -> assertNotNull(dataValueMarket.getClose()),
                () -> assertNotNull(dataValueMarket.getBid()),
                () -> assertNotNull(dataValueMarket.getDateTime()),
                () -> assertNotNull(dataValueMarket.toString()),
                () -> assertNotEquals(1, dataValueMarket.hashCode()),
                () -> assertNotEquals(new DataValueMarket(), dataValueMarket)
        );

    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link DataValueMarket}
     *   <li>{@link DataValueMarket#setAsk(Double)}
     *   <li>{@link DataValueMarket#setBid(Double)}
     *   <li>{@link DataValueMarket#setClose(Double)}
     *   <li>{@link DataValueMarket#setDateTime(LocalDateTime)}
     *   <li>{@link DataValueMarket#setHigh(Double)}
     *   <li>{@link DataValueMarket#setInstrumentId(Long)}
     *   <li>{@link DataValueMarket#setLast(Double)}
     *   <li>{@link DataValueMarket#setLow(Double)}
     *   <li>{@link DataValueMarket#setMarketId(Long)}
     *   <li>{@link DataValueMarket#setOpen(Double)}
     *   <li>{@link DataValueMarket#setVolume(Double)}
     *   <li>{@link DataValueMarket#toString()}
     *   <li>{@link DataValueMarket#getAsk()}
     *   <li>{@link DataValueMarket#getBid()}
     *   <li>{@link DataValueMarket#getClose()}
     *   <li>{@link DataValueMarket#getDateTime()}
     *   <li>{@link DataValueMarket#getHigh()}
     *   <li>{@link DataValueMarket#getInstrumentId()}
     *   <li>{@link DataValueMarket#getLast()}
     *   <li>{@link DataValueMarket#getLow()}
     *   <li>{@link DataValueMarket#getMarketId()}
     *   <li>{@link DataValueMarket#getOpen()}
     *   <li>{@link DataValueMarket#getVolume()}
     * </ul>
     */
    @Test
    void testConstructor() {
        DataValueMarket actualDataValueMarket = new DataValueMarket();
        actualDataValueMarket.setAsk(10.0d);
        actualDataValueMarket.setBid(10.0d);
        actualDataValueMarket.setClose(10.0d);
        LocalDateTime dateTime = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualDataValueMarket.setDateTime(dateTime);
        actualDataValueMarket.setHigh(10.0d);
        actualDataValueMarket.setInstrumentId(1L);
        actualDataValueMarket.setLast(10.0d);
        actualDataValueMarket.setLow(10.0d);
        actualDataValueMarket.setMarketId(1L);
        actualDataValueMarket.setOpen(10.0d);
        actualDataValueMarket.setVolume(10.0d);
        String actualToStringResult = actualDataValueMarket.toString();
        assertEquals(10.0d, actualDataValueMarket.getAsk().doubleValue());
        assertEquals(10.0d, actualDataValueMarket.getBid().doubleValue());
        assertEquals(10.0d, actualDataValueMarket.getClose().doubleValue());
        assertSame(dateTime, actualDataValueMarket.getDateTime());
        assertEquals(10.0d, actualDataValueMarket.getHigh().doubleValue());
        assertEquals(1L, actualDataValueMarket.getInstrumentId().longValue());
        assertEquals(10.0d, actualDataValueMarket.getLast().doubleValue());
        assertEquals(10.0d, actualDataValueMarket.getLow().doubleValue());
        assertEquals(1L, actualDataValueMarket.getMarketId().longValue());
        assertEquals(10.0d, actualDataValueMarket.getOpen().doubleValue());
        assertEquals(10.0d, actualDataValueMarket.getVolume().doubleValue());
        assertEquals(
                "DataValueMarket{bid=10.0, ask=10.0, last=10.0, low=10.0, high=10.0, open=10.0, close=10.0, volume=10.0,"
                        + " dateTime=1970-01-01T00:00, instrumentId=1, marketId=1}",
                actualToStringResult);
    }

}
