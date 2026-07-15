/*
 * @(#)AddressTest.java
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

package com.umdc.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    @DisplayName("Test Address Constructor and Getters")
    void testConstructor() {
        var id = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var personId = UUID.randomUUID();
        Address actualAddress = new Address();
        actualAddress.setId(id);
        actualAddress.setContent("123 Main St");
        actualAddress.setZipcode("00901");
        actualAddress.setPersonId(personId);
        assertEquals(id, actualAddress.getId());
        assertEquals("123 Main St", actualAddress.getContent());
        assertEquals("00901", actualAddress.getZipcode());
        assertEquals(personId, actualAddress.getPersonId());
    }

    @Test
    @DisplayName("Test Address Getters and Setters")
    void testGettersAndSetters() {
        var address = new Address();
        address.setId(UUID.randomUUID());
        address.setContent("456 Elm St");
        address.setZipcode("00902");
        address.setPersonId(UUID.randomUUID());
        assertAll("Getters And Setters",
                () -> assertNotNull(address.getId()),
                () -> assertNotNull(address.getContent()),
                () -> assertNotNull(address.getZipcode()),
                () -> assertNotNull(address.getPersonId()),
                () -> assertNotNull(address.toString()),
                () -> assertNotEquals(1, address.hashCode()),
                () -> assertNotEquals(new Address(), address)
        );
    }
}
