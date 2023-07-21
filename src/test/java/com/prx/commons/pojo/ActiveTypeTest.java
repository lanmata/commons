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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * ActiveTypeTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ActiveTypeTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ActiveType}
     *   <li>{@link ActiveType#setActive(Boolean)}
     *   <li>{@link ActiveType#setDescription(String)}
     *   <li>{@link ActiveType#setId(Long)}
     *   <li>{@link ActiveType#setName(String)}
     *   <li>{@link ActiveType#toString()}
     *   <li>{@link ActiveType#getActive()}
     *   <li>{@link ActiveType#getDescription()}
     *   <li>{@link ActiveType#getId()}
     *   <li>{@link ActiveType#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ActiveType actualActiveType = new ActiveType();
        actualActiveType.setActive(true);
        actualActiveType.setDescription("The characteristics of someone or something");
        actualActiveType.setId(1L);
        actualActiveType.setName("Name");
        String actualToStringResult = actualActiveType.toString();
        assertTrue(actualActiveType.getActive());
        assertEquals("The characteristics of someone or something", actualActiveType.getDescription());
        assertEquals(1L, actualActiveType.getId().longValue());
        assertEquals("Name", actualActiveType.getName());
        assertEquals(
                "ActiveType{id=1, name='Name', description='The characteristics of someone or something'," + " active=true}",
                actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
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
