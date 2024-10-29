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

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * MessengerTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class MessengerTest {

    @Test
    void gettersAndSetters() {
        final var messenger = new Messenger();
        messenger.setAlias("lmata");
        messenger.setName("Luis");
        messenger.setMessengerServiceId(1);
        messenger.setUser(new User());

        assertAll("Test Getters And Setters",
                () -> assertNotNull(messenger.getAlias()),
                () -> assertNotNull(messenger.getMessengerServiceId()),
                () -> assertNotNull(messenger.getName()),
                () -> assertNotNull(messenger.getUser()),
                () -> assertNotNull(messenger.toString()),
                () -> assertNotEquals(1, messenger.hashCode()),
                () -> assertNotEquals(new Messenger(), messenger)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Messenger}
     *   <li>{@link Messenger#setAlias(String)}
     *   <li>{@link Messenger#setMessengerServiceId(Integer)}
     *   <li>{@link Messenger#setName(String)}
     *   <li>{@link Messenger#setUser(User)}
     *   <li>{@link Messenger#toString()}
     *   <li>{@link Messenger#getAlias()}
     *   <li>{@link Messenger#getMessengerServiceId()}
     *   <li>{@link Messenger#getName()}
     *   <li>{@link Messenger#getUser()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Messenger actualMessenger = new Messenger();
        actualMessenger.setAlias("Alias");
        actualMessenger.setMessengerServiceId(1);
        actualMessenger.setName("Name");
        Person person = new Person();
        person.setBirthdate(LocalDate.of(1970, 1, 1));
        person.setFirstName("Jane");
        person.setGender("Gender");
        person.setId("42");
        person.setLastName("Doe");
        person.setMiddleName("Middle Name");
        User user = new User();
        user.setActive(true);
        user.setAlias("Alias");
        user.setId("42");
        user.setPassword("iloveyou");
        user.setPerson(person);
        user.setRoles(new ArrayList<>());
        actualMessenger.setUser(user);
        String actualToStringResult = actualMessenger.toString();
        assertEquals("Alias", actualMessenger.getAlias());
        assertEquals(1, actualMessenger.getMessengerServiceId().intValue());
        assertEquals("Name", actualMessenger.getName());
        assertSame(user, actualMessenger.getUser());
        assertEquals("Messenger{alias='Alias', name='Name', messengerServiceId=1, user=User{id='42', alias='Alias',"
                + " password='iloveyou', active=true, person=Person{id='42', firstName='Jane', middleName='Middle Name',"
                + " lastName='Doe', gender='Gender', birthdate=1970-01-01}, roles=[]}}", actualToStringResult);
    }

}
