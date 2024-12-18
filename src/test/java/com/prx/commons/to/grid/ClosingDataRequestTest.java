/*
 *  @(#)ClosingDataRequestTest.java
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

import com.prx.commons.pojo.DataValueMarket;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * ClosingDataRequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 30-09-2020
 */
class ClosingDataRequestTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ClosingDataRequest}
     *   <li>{@link ClosingDataRequest#setDataValueMarketList(List)}
     *   <li>{@link ClosingDataRequest#toString()}
     *   <li>{@link ClosingDataRequest#getDataValueMarketList()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ClosingDataRequest actualClosingDataRequest = new ClosingDataRequest();
        ArrayList<DataValueMarket> dataValueMarketList = new ArrayList<>();
        actualClosingDataRequest.setDataValueMarketList(dataValueMarketList);
        String actualToStringResult = actualClosingDataRequest.toString();
        assertSame(dataValueMarketList, actualClosingDataRequest.getDataValueMarketList());
        assertEquals("ClosingDataRequest{dataValueMarketList=[]}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var localDateTime = LocalDateTime.of(2020, 10, 29, 21, 31);
        final var clock = Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());
        final var closingDataRequest = new ClosingDataRequest();
        final var dataValueMarket = new DataValueMarket();
        final var list = new ArrayList<DataValueMarket>();

        dataValueMarket.setDateTime(LocalDateTime.now(clock));
        dataValueMarket.setInstrumentId(12L);
        dataValueMarket.setVolume(2000.25D);
        dataValueMarket.setClose(1196.36D);
        dataValueMarket.setHigh(1200.25D);
        dataValueMarket.setLast(1200.25D);
        dataValueMarket.setOpen(1195.35D);
        dataValueMarket.setAsk(1200.25D);
        dataValueMarket.setBid(1195.35D);
        dataValueMarket.setLow(1195.35D);
        dataValueMarket.setMarketId(1L);
        list.add(dataValueMarket);

        closingDataRequest.setDataValueMarketList(list);
        closingDataRequest.setAppName("Nombre de aplicación");
        closingDataRequest.setAppToken("token de aplicación");
        closingDataRequest.setDateTime(LocalDateTime.now(clock));

        assertAll("Getters And Setters",
                () -> assertNotNull(closingDataRequest.getDateTime()),
                () -> assertNotNull(closingDataRequest.getAppName()),
                () -> assertNotNull(closingDataRequest.getAppToken()),
                () -> assertNotNull(closingDataRequest.getDataValueMarketList()),
                () -> assertNotNull(closingDataRequest.toString()),
                () -> assertNotEquals(1, closingDataRequest.hashCode()),
                () -> assertNotEquals(new ClosingDataRequest(), closingDataRequest)
        );
    }

}
