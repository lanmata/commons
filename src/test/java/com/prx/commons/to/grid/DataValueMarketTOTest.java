/*
 *  @(#)DataValueMarketToTest.java
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
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

    @Test
    void testGettersAndSetters(){
        final var localDateTime = LocalDateTime.of(2020,10,29,21,31);
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

        assertNotNull(dataValueMarketTO.getInstrument());
        assertNotNull(dataValueMarketTO.getMarket());
        assertNotNull(dataValueMarketTO.getAsk());
        assertNotNull(dataValueMarketTO.getBid());
        assertNotNull(dataValueMarketTO.getClose());
        assertNotNull(dataValueMarketTO.getHigh());
        assertNotNull(dataValueMarketTO.getDateTime());
        assertNotNull(dataValueMarketTO.getInstrumentId());
        assertNotNull(dataValueMarketTO.getLast());
        assertNotNull(dataValueMarketTO.getMarketId());
        assertNotNull(dataValueMarketTO.getVolume());
        assertNotNull(dataValueMarketTO.getLow());
    }

}