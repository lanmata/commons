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

import com.prx.commons.general.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MessageActivityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class MessageActivityTest {

    @Test
    @DisplayName("Getters and setters operate as expected, and equals/hashCode behave")
    void gettersAndSetters() {
        final var messageActivity = new MessageActivity<User>();

        messageActivity.setCode(200);
        messageActivity.setMessage("Mensaje de respuesta.");
        messageActivity.setObjectResponse(new User());

        assertAll("Test Getters And Setters",
                () -> assertNotNull(messageActivity.getCode()),
                () -> assertNotNull(messageActivity.getMessage()),
                () -> assertNotNull(messageActivity.getObjectResponse()),
                () -> assertNotEquals(1, messageActivity.hashCode()),
                () -> assertNotEquals(new MessageActivity<User>(), messageActivity),
                () -> assertNotNull(messageActivity.toString())
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link MessageActivity}
     *   <li>{@link MessageActivity#setObjectResponse(Object)}
     *   <li>{@link MessageActivity#toString()}
     * </ul>
     */
    @Test
    @DisplayName("Constructor sets objectResponse and toString returns expected format")
    void testConstructor() {
        MessageActivity<Object> actualMessageActivity = new MessageActivity<>();
        actualMessageActivity.setObjectResponse("Object Response");
        assertEquals("MessageActivity{objectResponse=Object Response}", actualMessageActivity.toString());
    }

}
