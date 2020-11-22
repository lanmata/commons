/*
 *  @(#)FindExchangeInstrumentResponseTest.java
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
package com.prx.commons.to.mc;

import com.prx.commons.pojo.Exchange;
import com.prx.commons.pojo.ExchangeInstrument;
import com.prx.commons.pojo.Instrument;
import com.prx.commons.pojo.LocalCoin;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * FindExchangeInstrumentResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 06-10-2020
 */
class FindExchangeInstrumentResponseTest {
    @Test
    void testGettersAndSetters() {
        final var findExchangeInstrumentResponse = new FindExchangeInstrumentResponse();
        final var exchangeInstrument = new ExchangeInstrument();
        final var list = new ArrayList<ExchangeInstrument>();
        final var instruments = new ArrayList<Instrument>();
        final var instrument = new Instrument();
        final var coinTarget = new LocalCoin();
        final var coinSource = new LocalCoin();
        final var exchange = new Exchange();

        coinTarget.setId(111);
        coinTarget.setName("CLP");
        coinTarget.setActive(true);
        coinTarget.setSymbol("CLP");

        coinSource.setId(112);
        coinSource.setName("BS");
        coinSource.setSymbol("BS");
        coinSource.setActive(true);

        instrument.setId(1L);
        instrument.setActive(true);
        instrument.setName("CLPBS");
        instrument.setCoinSource(coinSource);
        instrument.setCoinTarget(coinTarget);
        instrument.setDescription("Descripción");

        exchange.setId(111L);
        exchange.setActive(true);
        exchange.setName("Bitcan");
        exchange.setTimeZone("UTC-3");
        exchange.setInstruments(instruments);
        exchange.setDescription("Descripción");
        exchange.setHeadquarters("Headquarters");

        exchangeInstrument.setActive(true);
        exchangeInstrument.setExchange(exchange);
        exchangeInstrument.setInstrument(instrument);
        exchangeInstrument.setIdentifier("Identificador");

        findExchangeInstrumentResponse.setCode(200);
        findExchangeInstrumentResponse.setList(list);
        findExchangeInstrumentResponse.setMessage("Mensaje");
        findExchangeInstrumentResponse.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Getters And Setters",
            () -> assertNotNull(findExchangeInstrumentResponse.getCode()),
            () -> assertNotNull(findExchangeInstrumentResponse.getList()),
            () -> assertNotNull(findExchangeInstrumentResponse.getMessage()),
            () -> assertNotNull(findExchangeInstrumentResponse.getDateTime()),
            () -> assertNotNull(findExchangeInstrumentResponse.toString()),
            () -> assertNotEquals(new FindExchangeInstrumentResponse(), findExchangeInstrumentResponse),
            () -> assertNotEquals(1, findExchangeInstrumentResponse.hashCode())
                 );

    }

}