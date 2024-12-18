/*
 *  @(#)ClosingDataResponseTest.java
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * ClosingDataResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 01-10-2020
 */
class ClosingDataResponseTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ClosingDataResponse}
     *   <li>{@link ClosingDataResponse#setList(List)}
     *   <li>{@link ClosingDataResponse#toString()}
     *   <li>{@link ClosingDataResponse#getList()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ClosingDataResponse actualClosingDataResponse = new ClosingDataResponse();
        ArrayList<DataValueMarketTO> list = new ArrayList<>();
        actualClosingDataResponse.setList(list);
        String actualToStringResult = actualClosingDataResponse.toString();
        assertSame(list, actualClosingDataResponse.getList());
        assertEquals("ClosingDataResponse{list=[]}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var closingDataResponse = new ClosingDataResponse();
        final var dataValueMarketTO = new DataValueMarketTO();

        dataValueMarketTO.setMarketId(1L);
        dataValueMarketTO.setMarket("BTX");
        dataValueMarketTO.setAsk(1258.36D);
        dataValueMarketTO.setBid(1256.25D);
        dataValueMarketTO.setLow(1255.33D);
        dataValueMarketTO.setHigh(1258.72D);
        dataValueMarketTO.setLast(1258.33D);
        dataValueMarketTO.setClose(1258.69D);
        dataValueMarketTO.setVolume(225.21D);
        dataValueMarketTO.setInstrumentId(42L);
        dataValueMarketTO.setInstrument("USDCLP");
        dataValueMarketTO.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        closingDataResponse.setCode(200);
        closingDataResponse.setList(new ArrayList<>());
        closingDataResponse.setMessage("Respuesta de solicitud");
        closingDataResponse.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Getters And Setters", () -> assertNotNull(closingDataResponse.getList()), () -> assertNotNull(closingDataResponse.getCode()), () -> assertNotNull(closingDataResponse.getMessage()), () -> assertNotNull(closingDataResponse.getDateTime()), () -> assertNotNull(closingDataResponse.toString()), () -> assertNotEquals(new ClosingDataResponse(), closingDataResponse), () -> assertNotEquals(1, closingDataResponse.hashCode()));
    }

}
