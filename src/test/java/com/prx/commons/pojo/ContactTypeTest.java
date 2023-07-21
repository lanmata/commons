/*
 * @(#)ContactTypeTest.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */

package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * ContactTypeTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 31-01-2021
 */
class ContactTypeTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ContactType}
     *   <li>{@link ContactType#setActive(Boolean)}
     *   <li>{@link ContactType#setDescription(String)}
     *   <li>{@link ContactType#setId(String)}
     *   <li>{@link ContactType#setName(String)}
     *   <li>{@link ContactType#toString()}
     *   <li>{@link ContactType#getActive()}
     *   <li>{@link ContactType#getDescription()}
     *   <li>{@link ContactType#getId()}
     *   <li>{@link ContactType#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ContactType actualContactType = new ContactType();
        actualContactType.setActive(true);
        actualContactType.setDescription("The characteristics of someone or something");
        actualContactType.setId("42");
        actualContactType.setName("Name");
        String actualToStringResult = actualContactType.toString();
        assertTrue(actualContactType.getActive());
        assertEquals("The characteristics of someone or something", actualContactType.getDescription());
        assertEquals("42", actualContactType.getId());
        assertEquals("Name", actualContactType.getName());
        assertEquals("ContactType{id='42', name='Name', description='The characteristics of someone or something',"
                + " active=true}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        var contactType = new ContactType();

        contactType.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        contactType.setName("Tipo de contacto");
        contactType.setDescription("Descripción tipo de contacto");
        contactType.setActive(true);
        assertAll("Getters And Setters",
                () -> assertNotNull(contactType.getId()),
                () -> assertNotNull(contactType.getName()),
                () -> assertNotNull(contactType.getActive()),
                () -> assertNotNull(contactType.getDescription()),
                () -> assertNotNull(contactType.toString()),
                () -> assertNotEquals(1, contactType.hashCode()),
                () -> assertNotEquals(new ContactType(), contactType)
        );
    }

}
