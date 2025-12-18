/*
 *  @(#)ResponseTest.java
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

package com.umdev.commons.general.to;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * ResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
class ResponseTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Response}
     *   <li>{@link Response#setCode(Integer)}
     *   <li>{@link Response#setDateTime(LocalDateTime)}
     *   <li>{@link Response#setMessage(String)}
     *   <li>{@link Response#toString()}
     *   <li>{@link Response#getCode()}
     *   <li>{@link Response#getDateTime()}
     *   <li>{@link Response#getMessage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Response actualResponse = new Response();
        actualResponse.setCode(1);
        LocalDateTime dateTime = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualResponse.setDateTime(dateTime);
        actualResponse.setMessage("Not all who wander are lost");
        String actualToStringResult = actualResponse.toString();
        assertEquals(1, actualResponse.getCode().intValue());
        assertSame(dateTime, actualResponse.getDateTime());
        assertEquals("Not all who wander are lost", actualResponse.getMessage());
        assertEquals("Response{dateTime=1970-01-01T00:00, code=1, message='Not all who wander are lost'}",
                actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var localDateTime = LocalDateTime.of(2020, 10, 29, 21, 31);
        final var response = new Response();
        final var clock = Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());

        response.setMessage("Mensaje de respuesta");
        response.setCode(200);
        response.setDateTime(LocalDateTime.now(clock));

        assertAll("Getters And Setters",
                () -> assertNotNull(response.getCode()),
                () -> assertNotNull(response.getMessage()),
                () -> assertNotNull(response.getDateTime())
        );
    }

}
