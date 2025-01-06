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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prx.commons.constants.keys.ParityKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * InfoTickerTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class InfoTickerTest {

    @Test
    void gettersAndSetters() {
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

        Assertions.assertAll("Test Getters And Setters",
                () -> Assertions.assertNotNull(infoTicker.getClose()),
                () -> Assertions.assertNotNull(infoTicker.getHigh()),
                () -> Assertions.assertNotNull(infoTicker.getLow()),
                () -> Assertions.assertNotNull(infoTicker.getOpen()),
                () -> Assertions.assertNotNull(infoTicker.getParityKey()),
                () -> Assertions.assertNotNull(infoTicker.getAsk()),
                () -> Assertions.assertNotNull(infoTicker.getBid()),
                () -> Assertions.assertNotNull(infoTicker.getDateTime()),
                () -> Assertions.assertNotNull(infoTicker.getInstrumentId()),
                () -> Assertions.assertNotNull(infoTicker.getMarketId()),
                () -> Assertions.assertNotNull(infoTicker.getLast()),
                () -> Assertions.assertNotNull(infoTicker.getVolume()),
                () -> Assertions.assertNotNull(infoTicker.toString()),
                () -> Assertions.assertNotEquals(1, infoTicker.hashCode()),
                () -> Assertions.assertNotEquals(new InfoTicker(), infoTicker)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link InfoTicker}
     *   <li>{@link InfoTicker#setParityKey(ParityKey)}
     *   <li>{@link InfoTicker#toString()}
     *   <li>{@link InfoTicker#getParityKey()}
     * </ul>
     */
    @Test
    void testConstructor() {
        InfoTicker actualInfoTicker = new InfoTicker();
        actualInfoTicker.setParityKey(ParityKey.ETHCLP);
        String actualToStringResult = actualInfoTicker.toString();
        assertEquals(ParityKey.ETHCLP, actualInfoTicker.getParityKey());
        assertEquals("InfoTicker{parityKey=ETHCLP}", actualToStringResult);
    }

}
