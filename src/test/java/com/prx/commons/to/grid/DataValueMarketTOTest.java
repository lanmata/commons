/*
 *  @(#)DataValueMarketTOTest.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

package com.prx.commons.to.grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * DataValueMarketToTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 30-09-2020
 */
class DataValueMarketTOTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link DataValueMarketTO}
     *   <li>{@link DataValueMarketTO#setInstrument(String)}
     *   <li>{@link DataValueMarketTO#setMarket(String)}
     *   <li>{@link DataValueMarketTO#toString()}
     *   <li>{@link DataValueMarketTO#getInstrument()}
     *   <li>{@link DataValueMarketTO#getMarket()}
     * </ul>
     */
    @Test
    void testConstructor() {
        DataValueMarketTO actualDataValueMarketTO = new DataValueMarketTO();
        actualDataValueMarketTO.setInstrument("Instrument");
        actualDataValueMarketTO.setMarket("Market");
        String actualToStringResult = actualDataValueMarketTO.toString();
        assertEquals("Instrument", actualDataValueMarketTO.getInstrument());
        assertEquals("Market", actualDataValueMarketTO.getMarket());
        assertEquals("DataValueMarketTO{market='Market', instrument='Instrument'}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var localDateTime = LocalDateTime.of(2020, 10, 29, 21, 31);
        final var clock = Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());
        final var dataValueMarketTO = new DataValueMarketTO();

        dataValueMarketTO.setInstrument("USDCLP");
        dataValueMarketTO.setMarket("BTX");
        dataValueMarketTO.setAsk(1258.36D);
        dataValueMarketTO.setBid(1256.25D);
        dataValueMarketTO.setClose(1258.69D);
        dataValueMarketTO.setHigh(1258.72D);
        dataValueMarketTO.setDateTime(LocalDateTime.now(clock));
        dataValueMarketTO.setInstrumentId(42L);
        dataValueMarketTO.setLast(1258.33D);
        dataValueMarketTO.setMarketId(1L);
        dataValueMarketTO.setVolume(225.21D);
        dataValueMarketTO.setLow(1255.33D);

        Assertions.assertAll("Getters And Setters",
                () -> Assertions.assertNotNull(dataValueMarketTO.getAsk()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getBid()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getLow()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getLast()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getHigh()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getClose()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getMarket()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getVolume()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getMarketId()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getDateTime()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getInstrument()),
                () -> Assertions.assertNotNull(dataValueMarketTO.getInstrumentId()),
                () -> Assertions.assertNotNull(dataValueMarketTO.toString()),
                () -> Assertions.assertNotEquals(dataValueMarketTO, new DataValueMarketTO()),
                () -> Assertions.assertNotEquals(1, dataValueMarketTO.hashCode())
        );
    }

}
