/*
 *  @(#)MessageActivityUtilTest.java
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
package com.prx.commons.util;

import com.prx.commons.message.pojo.to.MessageActivity;
import com.prx.commons.general.to.Response;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * MessageActivityUtilTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 15-10-2020
 */
class MessageActivityUtilTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = MessageActivityUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    /**
     * Method under test: {@link MessageActivityUtil#toResponse(MessageActivity)}
     */
    @Test
    void testToResponse() {
        MessageActivity<?> messageActivity = new MessageActivity<>();
        messageActivity.setCode(1);
        messageActivity.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        messageActivity.setMessage("Not all who wander are lost");
        Response actualToResponseResult = MessageActivityUtil.toResponse(messageActivity);
        assertEquals(1, actualToResponseResult.getCode().intValue());
        assertEquals("Not all who wander are lost", actualToResponseResult.getMessage());
    }

    /**
     * Method under test: {@link MessageActivityUtil#toResponse(MessageActivity, Response)}
     */
    @Test
    void testToResponse2() {
        MessageActivity<?> messageActivity = new MessageActivity<>();
        messageActivity.setCode(1);
        messageActivity.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        messageActivity.setMessage("Not all who wander are lost");

        Response response = new Response();
        response.setCode(1);
        response.setDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        response.setMessage("Not all who wander are lost");
        MessageActivityUtil.toResponse(messageActivity, response);
        assertEquals(1, response.getCode().intValue());
        assertEquals("Not all who wander are lost", response.getMessage());
    }

    @Test
    void toResponse() {
        final var messageActivity = new MessageActivity<Map<Integer, String>>();
        final var messageActivity1 = new MessageActivity<Map<Integer, String>>();
        messageActivity.setCode(200);
        messageActivity.setMessage("Valor 00");
        messageActivity1.setCode(201);
        messageActivity1.setMessage("Valor 001");
        assertNotNull(MessageActivityUtil.toResponse(messageActivity));
        assertNotNull(MessageActivityUtil.toResponse(messageActivity1));
    }

}
