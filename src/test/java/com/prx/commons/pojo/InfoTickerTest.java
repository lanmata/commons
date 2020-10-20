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

import com.prx.commons.enums.keys.ParityKey;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * InfoTickerTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class InfoTickerTest {

    @Test
    void gettersAndSetters(){
        final var infoTicker = new InfoTicker();

        infoTicker.setClose(225.25D);
        infoTicker.setHigh(226.35D);
        infoTicker.setLow(224.95D);
        infoTicker.setOpen(225.35D);
        infoTicker.setParityKey(ParityKey.BTCBRL);
        infoTicker.setAsk(226.37D);
        infoTicker.setBid(226.28D);
        infoTicker.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        infoTicker.setInstrumentId(1222L);
        infoTicker.setLast(226.15D);
        infoTicker.setMarketId(2L);
        infoTicker.setVolume(2203D);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(infoTicker.getClose()),
            () -> assertNotNull(infoTicker.getHigh()),
            () -> assertNotNull(infoTicker.getLow()),
            () -> assertNotNull(infoTicker.getOpen()),
            () -> assertNotNull(infoTicker.getParityKey()),
            () -> assertNotNull(infoTicker.getAsk()),
            () -> assertNotNull(infoTicker.getBid()),
            () -> assertNotNull(infoTicker.getDateTime()),
            () -> assertNotNull(infoTicker.getInstrumentId()),
            () -> assertNotNull(infoTicker.getMarketId()),
            () -> assertNotNull(infoTicker.getLast()),
            () -> assertNotNull(infoTicker.getVolume()),
            () -> assertNotNull(infoTicker.toString()),
            () -> assertNotEquals(1, infoTicker.hashCode()),
            () -> assertNotEquals(new InfoTicker(), infoTicker)
                 );
    }

}