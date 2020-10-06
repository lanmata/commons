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

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ClosingDataResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 01-10-2020
 */
class ClosingDataResponseTest {

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

        assertAll ("Getters And Setters",
            () -> assertNotNull(closingDataResponse.getList()),
            () -> assertNotNull(closingDataResponse.getCode()),
            () -> assertNotNull(closingDataResponse.getMessage()),
            () -> assertNotNull(closingDataResponse.getDateTime())
                  );
    }

}
