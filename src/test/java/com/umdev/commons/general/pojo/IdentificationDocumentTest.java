/*
 * @(#)IdentificationDocumentTest.java
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
package com.umdev.commons.general.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.UUID;

/**
 * IdentificationDocumentTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 22-11-2020
 */
class IdentificationDocumentTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link IdentificationDocument}
     *   <li>{@link IdentificationDocument#setExpirationDate(LocalDate)}
     *   <li>{@link IdentificationDocument#setId(UUID)}
     *   <li>{@link IdentificationDocument#setIdentificationType(int)}
     *   <li>{@link IdentificationDocument#setNumber(String)}
     *   <li>{@link IdentificationDocument#setPerson(Person)}
     *   <li>{@link IdentificationDocument#toString()}
     *   <li>{@link IdentificationDocument#getExpirationDate()}
     *   <li>{@link IdentificationDocument#getId()}
     *   <li>{@link IdentificationDocument#getIdentificationType()}
     *   <li>{@link IdentificationDocument#getNumber()}
     *   <li>{@link IdentificationDocument#getPerson()}
     * </ul>
     */
    @Test
    void testConstructor() {
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        IdentificationDocument actualIdentificationDocument = new IdentificationDocument();
        LocalDate expirationDate = LocalDate.of(1970, 1, 1);
        actualIdentificationDocument.setExpirationDate(expirationDate);
        actualIdentificationDocument.setId(uuid);
        actualIdentificationDocument.setIdentificationType(1);
        actualIdentificationDocument.setNumber("42");
        Person person = new Person();
        person.setBirthdate(LocalDate.of(1970, 1, 1));
        person.setFirstName("Jane");
        person.setGender("Gender");
        person.setId(uuid);
        person.setLastName("Doe");
        person.setMiddleName("Middle Name");
        actualIdentificationDocument.setPerson(person);
        assertSame(expirationDate, actualIdentificationDocument.getExpirationDate());
        assertEquals(uuid, actualIdentificationDocument.getId());
        assertEquals(1, actualIdentificationDocument.getIdentificationType());
        assertEquals("42", actualIdentificationDocument.getNumber());
        assertSame(person, actualIdentificationDocument.getPerson());
    }

    @Test
    void testGettersAndSetters() {
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        final var identificationDocument = new IdentificationDocument();
        identificationDocument.setExpirationDate(LocalDate.now(ZoneId.systemDefault()));
        identificationDocument.setIdentificationType(1);
        identificationDocument.setId(uuid);
        identificationDocument.setNumber("25073765-3");
        identificationDocument.setPerson(new Person());
        assertNotNull(identificationDocument.toString());
        assertNotNull(identificationDocument.getPerson());
        assertNotNull(identificationDocument.getNumber());
        assertNotNull(identificationDocument.getExpirationDate());
        assertNotEquals(UUID.randomUUID(), identificationDocument.getId());
        assertNotEquals(-1, identificationDocument.getIdentificationType());
    }

}
