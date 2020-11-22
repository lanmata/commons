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
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * RequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
class RequestTest {

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