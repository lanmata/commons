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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * ExchangeResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ExchangeResponseTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ExchangeResponse}
     *   <li>{@link ExchangeResponse#setExchange(Exchange)}
     *   <li>{@link ExchangeResponse#toString()}
     *   <li>{@link ExchangeResponse#getExchange()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ExchangeResponse actualExchangeResponse = new ExchangeResponse();
        Exchange exchange = new Exchange();
        exchange.setActive(true);
        exchange.setDescription("The characteristics of someone or something");
        exchange.setHeadquarters("Headquarters");
        exchange.setId(1L);
        exchange.setInstruments(new ArrayList<>());
        exchange.setName("Name");
        exchange.setTimeZone("UTC");
        actualExchangeResponse.setExchange(exchange);
        String actualToStringResult = actualExchangeResponse.toString();
        assertSame(exchange, actualExchangeResponse.getExchange());
        assertEquals(
                "ExchangeResponse{exchange={\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or"
                        + " something\",\"timeZone\":\"UTC\",\"headquarters\":\"Headquarters\",\"active\":true,\"instruments\":[]}}",
                actualToStringResult);
    }

    @Test
    void testGetterAndSetter() {
        final var exchangeResponse = new ExchangeResponse();
        final var exchange = new Exchange();

        exchange.setTimeZone("UTC -8");
        exchange.setName("Bit");
        exchange.setInstruments(new ArrayList<>());
        exchange.setId(11L);
        exchange.setHeadquarters("HHH");
        exchange.setDescription("Descripción de exchange");
        exchange.setActive(true);

        exchangeResponse.setExchange(exchange);
        exchangeResponse.setCode(200);
        exchangeResponse.setDateTime(LocalDateTime.now());
        exchangeResponse.setMessage("Éxito");

        assertAll("Getters And Setters",
                () -> assertNotNull(exchangeResponse.getExchange()),
                () -> assertNotNull(exchangeResponse.getCode()),
                () -> assertNotNull(exchangeResponse.getDateTime()),
                () -> assertNotNull(exchangeResponse.getMessage()),
                () -> assertNotNull(exchangeResponse.toString()),
                () -> assertNotEquals(1, exchangeResponse.hashCode()),
                () -> assertNotEquals(new ExchangeResponse(), exchangeResponse)
        );
    }

}
