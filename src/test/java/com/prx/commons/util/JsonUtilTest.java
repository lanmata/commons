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
package com.prx.commons.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JsonUtilTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 14-10-2020
 */
class JsonUtilTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = JsonUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    /**
     * Method under test: {@link JsonUtil#toJson(Object)}
     */
    @Test
    void testToJson() {
        assertEquals("\"Obj Source\"", JsonUtil.toJson("Obj Source"));
        assertEquals("null", JsonUtil.toJson(null));
        assertEquals("\"42\"", JsonUtil.toJson("42"));
        assertEquals("42", JsonUtil.toJson(42));
        assertEquals("\"\"", JsonUtil.toJson(""));
    }

}
