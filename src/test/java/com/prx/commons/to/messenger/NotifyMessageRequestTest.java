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
package com.prx.commons.to.messenger;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * NotifyMessageRequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class NotifyMessageRequestTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link NotifyMessageRequest}
     *   <li>{@link NotifyMessageRequest#setCritical(Boolean)}
     *   <li>{@link NotifyMessageRequest#setListDestiny(List)}
     *   <li>{@link NotifyMessageRequest#setMessage(String)}
     *   <li>{@link NotifyMessageRequest#toString()}
     *   <li>{@link NotifyMessageRequest#getCritical()}
     *   <li>{@link NotifyMessageRequest#getListDestiny()}
     *   <li>{@link NotifyMessageRequest#getMessage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        NotifyMessageRequest actualNotifyMessageRequest = new NotifyMessageRequest();
        actualNotifyMessageRequest.setCritical(true);
        ArrayList<String> listDestiny = new ArrayList<>();
        actualNotifyMessageRequest.setListDestiny(listDestiny);
        actualNotifyMessageRequest.setMessage("Not all who wander are lost");
        String actualToStringResult = actualNotifyMessageRequest.toString();
        assertTrue(actualNotifyMessageRequest.getCritical());
        assertSame(listDestiny, actualNotifyMessageRequest.getListDestiny());
        assertEquals("Not all who wander are lost", actualNotifyMessageRequest.getMessage());
        assertEquals("NotifyMessageRequest{message='Not all who wander are lost', listDestiny=[], critical=true}",
                actualToStringResult);
    }

    @Test
    void testGetterAndSetter() {
        final var notifyMessageRequest = new NotifyMessageRequest();

        notifyMessageRequest.setCritical(true);
        notifyMessageRequest.setListDestiny(new ArrayList<>());
        notifyMessageRequest.setMessage("Éxito");
        notifyMessageRequest.setAppName("App X");
        notifyMessageRequest.setAppToken("ABC1289");
        notifyMessageRequest.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Getters And Setters",
                () -> assertNotNull(notifyMessageRequest.getCritical()),
                () -> assertNotNull(notifyMessageRequest.getListDestiny()),
                () -> assertNotNull(notifyMessageRequest.getMessage()),
                () -> assertNotNull(notifyMessageRequest.getAppName()),
                () -> assertNotNull(notifyMessageRequest.getAppToken()),
                () -> assertNotEquals(1, notifyMessageRequest.hashCode()),
                () -> assertNotEquals(notifyMessageRequest, new NotifyMessageRequest()),
                () -> assertNotNull(notifyMessageRequest.toString())
        );
    }

}
