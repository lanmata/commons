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
package com.prx.commons.pojo;

import java.util.concurrent.ConcurrentHashMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * MessageActivityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class MessageActivityTest {

    @Test
    void gettersAndSetters(){
        final var messageActivity = new MessageActivity();

        messageActivity.setMessages(new ConcurrentHashMap<>());
        messageActivity.setObjectResponse(new Object());

        assertAll("Test Getters And Setters",
            () -> assertNotNull(messageActivity.getMessages()),
            () -> assertNotNull(messageActivity.getObjectResponse()),
            () -> assertNotEquals(1, messageActivity.hashCode()),
            () -> assertNotEquals(new MessageActivity(), messageActivity),
            () -> assertNotNull(messageActivity.toString())
                 );
    }

}