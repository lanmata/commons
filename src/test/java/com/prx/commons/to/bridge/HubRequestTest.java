/*
 *  @(#)HubRequestTest.java
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

package com.prx.commons.to.bridge;

import com.prx.commons.pojo.DataValueMarket;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * HubRequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
class HubRequestTest {

    @Test
    void testGettersAndSetters() {
        final var localDateTime = LocalDateTime.of(2020, 10, 29, 21, 31);
        final var clock = Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());
        final var dataValueMarket = new DataValueMarket();
        final var list = new ArrayList<DataValueMarket>();
        final var hubRequest = new HubRequest();

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

        hubRequest.setDataValueMarkets(list);
        hubRequest.setAppName("Nombre de aplicación");
        hubRequest.setAppToken("token de aplicación");
        hubRequest.setDateTime(LocalDateTime.now(clock));

        assertAll("Getters And Setters",
            () -> assertNotNull(hubRequest.getAppName()),
            () -> assertNotNull(hubRequest.getDateTime()),
            () -> assertNotNull(hubRequest.getAppToken()),
            () -> assertNotNull(hubRequest.getDataValueMarkets()),
            () -> assertNotEquals(-1, hubRequest.hashCode()),
            () -> assertNotEquals(new HubRequest(), hubRequest),
            () -> assertNotNull(hubRequest.toString())
                 );
    }

}