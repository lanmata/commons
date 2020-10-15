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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * NotifyMessageRequestTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class NotifyMessageRequestTest {

    @Test
    void testGetterAndSetter(){
        final var notifyMessageRequest = new NotifyMessageRequest();

        notifyMessageRequest.setCritical(true);
        notifyMessageRequest.setListDestiny(new ArrayList<>());
        notifyMessageRequest.setMessage("Exito");
        notifyMessageRequest.setAppName("App X");
        notifyMessageRequest.setAppToken("ABC1289");
        notifyMessageRequest.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Getters And Setters",
            () -> assertNotNull(notifyMessageRequest.getCritical()),
            () -> assertNotNull(notifyMessageRequest.getListDestiny()),
            () -> assertNotNull(notifyMessageRequest.getMessage()),
            () -> assertNotNull(notifyMessageRequest.getAppName()),
            () -> assertNotNull(notifyMessageRequest.getAppToken()),
            () -> assertNotNull(notifyMessageRequest.getClass())
            );
    }

}