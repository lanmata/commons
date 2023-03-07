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

import com.prx.commons.pojo.ActiveType;
import com.prx.commons.pojo.Contact;
import com.prx.commons.pojo.ContactType;
import com.prx.commons.pojo.Person;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

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

    @Test
    void toJson() {
        final var activeType = new ActiveType();

        activeType.setActive(true);
        activeType.setDescription("Descripción");
        activeType.setId(1L);
        activeType.setName("Nombre de activo");

        assertNotNull(JsonUtil.toJson(activeType));
    }

}
