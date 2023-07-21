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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

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
    void gettersAndSetters() {
        final var person = new Person();

        person.setBirthdate(LocalDate.of(1979, 4, 14));
        person.setFirstName("Pepe");
        person.setGender("M");
        person.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        person.setLastName("Perez");
        person.setMiddleName("Lolo");

        assertAll("Test Getters And Setters",
                () -> assertNotEquals(-1, person.getId()),
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

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Person}
     *   <li>{@link Person#setBirthdate(LocalDate)}
     *   <li>{@link Person#setFirstName(String)}
     *   <li>{@link Person#setGender(String)}
     *   <li>{@link Person#setId(String)}
     *   <li>{@link Person#setLastName(String)}
     *   <li>{@link Person#setMiddleName(String)}
     *   <li>{@link Person#toString()}
     *   <li>{@link Person#getBirthdate()}
     *   <li>{@link Person#getFirstName()}
     *   <li>{@link Person#getGender()}
     *   <li>{@link Person#getId()}
     *   <li>{@link Person#getLastName()}
     *   <li>{@link Person#getMiddleName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        LocalDate birthdate = LocalDate.of(1970, 1, 1);
        actualPerson.setBirthdate(birthdate);
        actualPerson.setFirstName("Jane");
        actualPerson.setGender("Gender");
        actualPerson.setId("42");
        actualPerson.setLastName("Doe");
        actualPerson.setMiddleName("Middle Name");
        String actualToStringResult = actualPerson.toString();
        assertSame(birthdate, actualPerson.getBirthdate());
        assertEquals("Jane", actualPerson.getFirstName());
        assertEquals("Gender", actualPerson.getGender());
        assertEquals("42", actualPerson.getId());
        assertEquals("Doe", actualPerson.getLastName());
        assertEquals("Middle Name", actualPerson.getMiddleName());
        assertEquals("Person{id='42', firstName='Jane', middleName='Middle Name', lastName='Doe', gender='Gender',"
                + " birthdate=1970-01-01}", actualToStringResult);
    }

}
