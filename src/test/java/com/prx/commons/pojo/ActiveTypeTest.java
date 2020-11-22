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

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ActiveTypeTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ActiveTypeTest {

    @Test
    void testGettersAndSetters(){
        final var activeType = new ActiveType();

        activeType.setActive(true);
        activeType.setDescription("Descripción");
        activeType.setId(1L);
        activeType.setName("Nombre de activo");

        assertAll("Getters And Setters",
            () -> assertNotNull(activeType.getActive()),
            () -> assertNotNull(activeType.getDescription()),
            () -> assertNotNull(activeType.getId()),
            () -> assertNotNull(activeType.getName()),
            () -> assertNotNull(activeType.toString()),
            () -> assertNotEquals(1, activeType.hashCode()),
            () -> assertNotEquals(new ActiveType(), activeType)
                 );
    }

}