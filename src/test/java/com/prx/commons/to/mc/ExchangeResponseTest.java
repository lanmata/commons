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
package com.prx.commons.to.mc;

import com.prx.commons.pojo.Exchange;
import java.time.LocalDateTime;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * ExchangeResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ExchangeResponseTest {

    @Test
    void testGetterAndSetter(){
        final var exchangeResponse = new ExchangeResponse();
        final var exchange = new Exchange();

        exchange.setTimeZone("UTC -8");
        exchange.setName("Bit");
        exchange.setInstruments(new ArrayList<>());
        exchange.setId(11L);
        exchange.setHeadquarters("HHH");
        exchange.setDescription("Descripcion de exchange");
        exchange.setActive(true);

        exchangeResponse.setExchange(exchange);
        exchangeResponse.setCode(200);
        exchangeResponse.setDateTime(LocalDateTime.now());
        exchangeResponse.setMessage("Exito");

        assertAll("Getters And Setters",
            ()-> assertNotNull(exchangeResponse.getExchange()),
            ()-> assertNotNull(exchangeResponse.getCode()),
            ()-> assertNotNull(exchangeResponse.getDateTime()),
            ()-> assertNotNull(exchangeResponse.getMessage())
                 );
    }

}