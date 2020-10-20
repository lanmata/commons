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

import com.prx.commons.pojo.MessageActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

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

    @Test
    void toResponse() {
        final var messageActivity = new MessageActivity();
        final var messageActivity1 = new MessageActivity();
        final var mapMessage = new ConcurrentHashMap<Integer, String>();
        mapMessage.put(0,"Valor 00");
        mapMessage.put(1,"Valor 01");
        mapMessage.put(2,"Valor 02");
        messageActivity.setMessages(mapMessage);
        messageActivity1.setMessages(new ConcurrentHashMap<>());
        assertNotNull(MessageActivityUtil.toResponse(messageActivity));
        assertNotNull(MessageActivityUtil.toResponse(messageActivity1));
    }

}