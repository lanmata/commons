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
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * ContactTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ContactTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Contact}
     *   <li>{@link Contact#setActive(Boolean)}
     *   <li>{@link Contact#setContactType(ContactType)}
     *   <li>{@link Contact#setContent(String)}
     *   <li>{@link Contact#setId(String)}
     *   <li>{@link Contact#setPerson(Person)}
     *   <li>{@link Contact#toString()}
     *   <li>{@link Contact#getActive()}
     *   <li>{@link Contact#getContactType()}
     *   <li>{@link Contact#getContent()}
     *   <li>{@link Contact#getId()}
     *   <li>{@link Contact#getPerson()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Contact actualContact = new Contact();
        actualContact.setActive(true);
        ContactType contactType = new ContactType();
        contactType.setActive(true);
        contactType.setDescription("The characteristics of someone or something");
        contactType.setId("42");
        contactType.setName("Name");
        actualContact.setContactType(contactType);
        actualContact.setContent("Not all who wander are lost");
        actualContact.setId("42");
        Person person = new Person();
        person.setBirthdate(LocalDate.of(1970, 1, 1));
        person.setFirstName("Jane");
        person.setGender("Gender");
        person.setId("42");
        person.setLastName("Doe");
        person.setMiddleName("Middle Name");
        actualContact.setPerson(person);
        String actualToStringResult = actualContact.toString();
        assertTrue(actualContact.getActive());
        assertSame(contactType, actualContact.getContactType());
        assertEquals("Not all who wander are lost", actualContact.getContent());
        assertEquals("42", actualContact.getId());
        assertSame(person, actualContact.getPerson());
        assertEquals("Contact{id='42', content='Not all who wander are lost', contactType=ContactType{id='42', name='Name',"
                + " description='The characteristics of someone or something', active=true}, person=Person{id='42',"
                + " firstName='Jane', middleName='Middle Name', lastName='Doe', gender='Gender', birthdate=1970-01-01},"
                + " active=true}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        var contact = new Contact();
        var contactType = new ContactType();

        contactType.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        contactType.setName("Tipo de contacto");
        contactType.setDescription("Descripción tipo de contacto");
        contactType.setActive(true);

        contact.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        contact.setPerson(new Person());
        contact.setContent("Content");
        contact.setContactType(contactType);
        contact.setActive(true);
        assertAll("Getters And Setters",
                () -> assertNotNull(contact.getActive()),
                () -> assertNotNull(contact.getContactType()),
                () -> assertNotNull(contact.getContent()),
                () -> assertNotNull(contact.getPerson()),
                () -> assertNotNull(contact.getId()),
                () -> assertNotNull(contact.toString()),
                () -> assertNotEquals(1, contact.hashCode()),
                () -> assertNotEquals(new Contact(), contact)
        );
    }

}
