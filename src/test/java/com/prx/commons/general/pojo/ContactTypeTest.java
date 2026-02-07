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

package com.prx.commons.general.pojo;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

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
     *   <li>{@link ContactType#setId(UUID)}
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
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        ContactType actualContactType = new ContactType();
        actualContactType.setActive(true);
        actualContactType.setDescription("The characteristics of someone or something");
        actualContactType.setId(uuid);
        actualContactType.setName("Name");
        assertTrue(actualContactType.getActive());
        assertEquals("The characteristics of someone or something", actualContactType.getDescription());
        assertEquals(uuid, actualContactType.getId());
        assertEquals("Name", actualContactType.getName());
    }

    @Test
    void testGettersAndSetters() {
        var contactType = new ContactType();
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");

        contactType.setId(uuid);
        contactType.setName("Contact Type Name");
        contactType.setDescription("Contact Description");
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
