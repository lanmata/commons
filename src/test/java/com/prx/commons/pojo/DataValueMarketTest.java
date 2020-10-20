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
 * DataValueMarketTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class DataValueMarketTest {

    @Test
    void gettersAndSetters(){
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

}