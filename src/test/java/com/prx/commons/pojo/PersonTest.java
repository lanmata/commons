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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
        person.setFirstName("Pepe");
        person.setGender("M");
        person.setId(1L);
        person.setLastName("Perez");
        person.setMiddleName("Lolo");

        assertAll("Test Getters And Setters",
            () -> assertNotEquals(-1,person.getId()),
            () -> assertNotNull(person.getGender()),
            () -> assertNotNull(person.getBirthdate()),
            () -> assertNotNull(person.getFirstName()),
            () -> assertNotNull(person.getMiddleName()),
            () -> assertNotNull(person.getLastName()),
            () -> assertNotNull(person.toString()),
            () -> assertNotEquals(1, person.hashCode()),
            () -> assertNotEquals(new Person(), person)
                 );
    }

}