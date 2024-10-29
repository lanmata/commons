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

package com.prx.commons.event;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prx.commons.pojo.DataValueMarket;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * DataValueMarketTimeEventTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class DataValueMarketTimeEventTest {

    @Test
    void callTest() {
        final var dataValueMarketTimeEvent = new DataValueMarketTimeEvent(new Object(), new ArrayList<>());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getDataValueMarkets());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getSource());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getDataValueMarkets());
        Assertions.assertNotEquals(1, dataValueMarketTimeEvent.getTimestamp());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DataValueMarketTimeEvent#DataValueMarketTimeEvent(Object, List)}
     *   <li>{@link DataValueMarketTimeEvent#getDataValueMarkets()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ArrayList<DataValueMarket> dataValueMarkets = new ArrayList<>();
        assertSame(dataValueMarkets, (new DataValueMarketTimeEvent("Source", dataValueMarkets)).getDataValueMarkets());
    }

    /**
     * Method under test: {@link DataValueMarketTimeEvent#DataValueMarketTimeEvent(Object, List)}
     */
    @Test
    void testConstructor2() {
        assertTrue((new DataValueMarketTimeEvent("Source", new ArrayList<>())).getDataValueMarkets().isEmpty());
    }

    /**
     * Method under test: {@link DataValueMarketTimeEvent#DataValueMarketTimeEvent(Object, List)}
     */
    @Test
    void testConstructor3() {
        DataValueMarket dataValueMarket = new DataValueMarket();
        dataValueMarket.setAsk(10.0d);
        dataValueMarket.setBid(10.0d);
        dataValueMarket.setClose(10.0d);
        dataValueMarket.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        dataValueMarket.setHigh(10.0d);
        dataValueMarket.setInstrumentId(1L);
        dataValueMarket.setLast(10.0d);
        dataValueMarket.setLow(10.0d);
        dataValueMarket.setMarketId(1L);
        dataValueMarket.setOpen(10.0d);
        dataValueMarket.setVolume(10.0d);

        ArrayList<DataValueMarket> dataValueMarkets = new ArrayList<>();
        dataValueMarkets.add(dataValueMarket);
        assertEquals(1, (new DataValueMarketTimeEvent("Source", dataValueMarkets)).getDataValueMarkets().size());
    }

    /**
     * Method under test: {@link DataValueMarketTimeEvent#DataValueMarketTimeEvent(Object, List)}
     */
    @Test
    void testConstructor4() {
        DataValueMarket dataValueMarket = new DataValueMarket();
        dataValueMarket.setAsk(10.0d);
        dataValueMarket.setBid(10.0d);
        dataValueMarket.setClose(10.0d);
        dataValueMarket.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        dataValueMarket.setHigh(10.0d);
        dataValueMarket.setInstrumentId(1L);
        dataValueMarket.setLast(10.0d);
        dataValueMarket.setLow(10.0d);
        dataValueMarket.setMarketId(1L);
        dataValueMarket.setOpen(10.0d);
        dataValueMarket.setVolume(10.0d);

        DataValueMarket dataValueMarket2 = new DataValueMarket();
        dataValueMarket2.setAsk(0.5d);
        dataValueMarket2.setBid(0.5d);
        dataValueMarket2.setClose(0.5d);
        dataValueMarket2.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        dataValueMarket2.setHigh(0.5d);
        dataValueMarket2.setInstrumentId(2L);
        dataValueMarket2.setLast(0.5d);
        dataValueMarket2.setLow(0.5d);
        dataValueMarket2.setMarketId(2L);
        dataValueMarket2.setOpen(0.5d);
        dataValueMarket2.setVolume(0.5d);

        ArrayList<DataValueMarket> dataValueMarkets = new ArrayList<>();
        dataValueMarkets.add(dataValueMarket2);
        dataValueMarkets.add(dataValueMarket);
        assertEquals(2, (new DataValueMarketTimeEvent("Source", dataValueMarkets)).getDataValueMarkets().size());
    }

}
