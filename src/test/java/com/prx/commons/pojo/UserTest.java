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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * UserTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class UserTest {

    @Test
    void gettersAndSetters() {
        final var user = new User();
        final var roles = new ArrayList<Role>();
        final var rol = new Role();
        var features = new ArrayList<Feature>();
        var feature = new Feature();

        feature.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        feature.setName("Feature");
        feature.setDescription("Descripción de feature");
        feature.setActive(true);
        features.add(feature);
        rol.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        rol.setName("Rol");
        rol.setDescription("Descripción de rol");
        rol.setFeatures(features);
        rol.setActive(true);

        roles.add(rol);
        user.setActive(true);
        user.setAlias("Alias de usuario");
        user.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        user.setPerson(new Person());
        user.setPassword("WERtyuik4567890");
        user.setRoles(roles);

        assertAll("Getters And Setters",
                () -> assertNotNull(user.getId()),
                () -> assertNotNull(user.getAlias()),
                () -> assertNotNull(user.getPassword()),
                () -> assertNotNull(user.getPerson()),
                () -> assertNotNull(user.getRoles()),
                () -> assertTrue(user.isActive()),
                () -> assertNotNull(user.toString()),
                () -> assertNotEquals(1, user.hashCode()),
                () -> assertNotEquals(new User(), user)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link User}
     *   <li>{@link User#setActive(boolean)}
     *   <li>{@link User#setAlias(String)}
     *   <li>{@link User#setId(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setPerson(Person)}
     *   <li>{@link User#setRoles(List)}
     *   <li>{@link User#toString()}
     *   <li>{@link User#getAlias()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getPerson()}
     *   <li>{@link User#getRoles()}
     *   <li>{@link User#isActive()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setActive(true);
        actualUser.setAlias("Alias");
        actualUser.setId("42");
        actualUser.setPassword("iloveyou");
        Person person = new Person();
        person.setBirthdate(LocalDate.of(1970, 1, 1));
        person.setFirstName("Jane");
        person.setGender("Gender");
        person.setId("42");
        person.setLastName("Doe");
        person.setMiddleName("Middle Name");
        actualUser.setPerson(person);
        ArrayList<Role> roles = new ArrayList<>();
        actualUser.setRoles(roles);
        String actualToStringResult = actualUser.toString();
        assertEquals("Alias", actualUser.getAlias());
        assertEquals("42", actualUser.getId());
        assertEquals("iloveyou", actualUser.getPassword());
        assertSame(person, actualUser.getPerson());
        assertSame(roles, actualUser.getRoles());
        assertTrue(actualUser.isActive());
        assertEquals(
                "User{id='42', alias='Alias', password='iloveyou', active=true, person=Person{id='42', firstName='Jane',"
                        + " middleName='Middle Name', lastName='Doe', gender='Gender', birthdate=1970-01-01}, roles=[]}",
                actualToStringResult);
    }
}
