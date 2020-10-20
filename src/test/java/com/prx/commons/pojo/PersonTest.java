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

import java.time.LocalDate;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * PersonTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class PersonTest {

    @Test
    void gettersAndSetters(){
        final var person = new Person();

        person.setBirthdate(LocalDate.of(1979, 4, 14));
        person.setContactList(new ArrayList<>());
        person.setFirstName("Pepe");
        person.setGender("M");
        person.setId(1L);
        person.setLastName("Perez");
        person.setMiddleName("Lolo");
        person.setUserList(new ArrayList<>());

        assertAll("Test Getters And Setters",
            () -> assertNotNull(person.getId()),
            () -> assertNotNull(person.getGender()),
            () -> assertNotNull(person.getBirthdate()),
            () -> assertNotNull(person.getFirstName()),
            () -> assertNotNull(person.getMiddleName()),
            () -> assertNotNull(person.getLastName()),
            () -> assertNotNull(person.getContactList()),
            () -> assertNotNull(person.getUserList()),
            () -> assertNotNull(person.toString()),
            () -> assertNotEquals(1, person.hashCode()),
            () -> assertNotEquals(new Person(), person)
                 );
    }

}