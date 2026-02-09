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
package com.prx.commons.message.to;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * NotifyMessageResponseTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class NotifyMessageResponseTest {

    /**
     * Method under test: default or parameterless constructor of {@link NotifyMessageResponse}
     */
    @Test
    @DisplayName("Test Constructor")
    void testConstructor() {
        NotifyMessageResponse actualNotifyMessageResponse = new NotifyMessageResponse();
        assertNull(actualNotifyMessageResponse.getCode());
        assertNull(actualNotifyMessageResponse.getMessage());
        assertNull(actualNotifyMessageResponse.getDateTime());
    }

    @Test
    @DisplayName("Test Getter And Setter")
    void testGetterAndSetter() {
        final var notifiMessageResponse = new NotifyMessageResponse();

        notifiMessageResponse.setCode(200);
        notifiMessageResponse.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        notifiMessageResponse.setMessage("Éxito");

        assertAll("Getters And Setters",
                () -> assertNotNull(notifiMessageResponse.getCode()),
                () -> assertNotNull(notifiMessageResponse.getDateTime()),
                () -> assertNotNull(notifiMessageResponse.getMessage())
        );
    }

}
