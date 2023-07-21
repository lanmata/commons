/*
 *  @(#)RequestTest.java
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

package com.prx.commons.to;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * RequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
class RequestTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Request}
     *   <li>{@link Request#setAppName(String)}
     *   <li>{@link Request#setAppToken(String)}
     *   <li>{@link Request#setDateTime(LocalDateTime)}
     *   <li>{@link Request#toString()}
     *   <li>{@link Request#getAppName()}
     *   <li>{@link Request#getAppToken()}
     *   <li>{@link Request#getDateTime()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Request actualRequest = new Request();
        actualRequest.setAppName("App Name");
        actualRequest.setAppToken("ABC123");
        LocalDateTime dateTime = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualRequest.setDateTime(dateTime);
        String actualToStringResult = actualRequest.toString();
        assertEquals("App Name", actualRequest.getAppName());
        assertEquals("ABC123", actualRequest.getAppToken());
        assertSame(dateTime, actualRequest.getDateTime());
        assertEquals("Request{dateTime=1970-01-01T00:00, appName='App Name', appToken='ABC123'}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var localDateTime = LocalDateTime.of(2020, 10, 29, 21, 31);
        final var request = new Request();
        final var clock = Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());

        request.setAppName("Nombre de aplicación");
        request.setAppToken("Token de aplicación");
        request.setDateTime(LocalDateTime.now(clock));

        assertAll("Getter And Setter",
                () -> assertNotNull(request.getAppName()),
                () -> assertNotNull(request.getAppToken()),
                () -> assertNotNull(request.getDateTime()),
                () -> assertNotNull(request.toString())
        );
    }

}
