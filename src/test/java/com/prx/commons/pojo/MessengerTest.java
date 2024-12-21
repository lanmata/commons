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

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

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
        Application application = new Application();
        application.setActive(true);
        application.setName("Application name");
        application.setDescription("Application Description");
        application.setId(UUID.fromString("6046db61-8b23-4c74-b7e1-656eaca4531f"));
        application.setCreatedDate(LocalDateTime.parse("2024-12-21T07:56:19.881103"));
        application.setLastUpdate(LocalDateTime.parse("2024-12-21T07:56:19.881103"));
        User user = new User();
        user.setActive(true);
        user.setAlias("Alias");
        user.setEmail("username@domain.ext");
        user.setId("42");
        user.setPassword("iloveyou");
        user.setPerson(person);
        user.setRoles(new ArrayList<>());
        user.setApplications(List.of(application));
        actualMessenger.setUser(user);
        String actualToStringResult = actualMessenger.toString();
        assertEquals("Alias", actualMessenger.getAlias());
        assertEquals(1, actualMessenger.getMessengerServiceId().intValue());
        assertEquals("Name", actualMessenger.getName());
        assertSame(user, actualMessenger.getUser());
        assertEquals("Messenger{alias='Alias', name='Name', messengerServiceId=1, user=User{id='42', alias='Alias'," +
                " password='iloveyou', email='username@domain.ext', active=true, person=Person{id='42', firstName='Jane'," +
                " middleName='Middle Name', lastName='Doe', gender='Gender', birthdate=1970-01-01}, roles=[]," +
                " applications=[Application{id=6046db61-8b23-4c74-b7e1-656eaca4531f, name='Application name'," +
                " description='Application Description', active=true, createdDate=2024-12-21T07:56:19.881103," +
                " lastUpdate=2024-12-21T07:56:19.881103, serviceTypeId=null, userList=null, roleList=null}]}}", actualToStringResult);
    }

}
