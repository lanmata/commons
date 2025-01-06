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
package com.prx.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Set and get ID")
    void setAndGetId() {
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        User user = new User();
        user.setId(uuid);
        assertEquals(uuid, user.getId());
    }

    @Test
    @DisplayName("Set and get alias")
    void setAndGetAlias() {
        User user = new User();
        user.setAlias("userAlias");
        assertEquals("userAlias", user.getAlias());
    }

    @Test
    @DisplayName("Set and get password")
    void setAndGetPassword() {
        User user = new User();
        user.setPassword("password123");
        assertEquals("password123", user.getPassword());
    }

    @Test
    @DisplayName("Set and get email")
    void setAndGetEmail() {
        User user = new User();
        user.setEmail("test@example.com");
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    @DisplayName("Set and get active status")
    void setAndGetActiveStatus() {
        User user = new User();
        user.setActive(true);
        assertTrue(user.isActive());
    }

    @Test
    @DisplayName("Set and get person")
    void setAndGetPerson() {
        User user = new User();
        Person person = new Person();
        user.setPerson(person);
        assertSame(person, user.getPerson());
    }

    @Test
    @DisplayName("Set and get roles")
    void setAndGetRoles() {
        User user = new User();
        List<Role> roles = new ArrayList<>();
        Role role = new Role();
        roles.add(role);
        user.setRoles(roles);
        assertSame(roles, user.getRoles());
    }

    @Test
    @DisplayName("Set and get applications")
    void setAndGetApplications() {
        User user = new User();
        List<Application> applications = new ArrayList<>();
        Application app = new Application();
        applications.add(app);
        user.setApplications(applications);
        assertSame(applications, user.getApplications());
    }

    @Test
    @DisplayName("toString returns non-null value")
    void toStringReturnsNonNullValue() {
        User user = new User();
        assertNotNull(user.toString());
    }

    @Test
    @DisplayName("hashCode does not return default value")
    void hashCodeDoesNotReturnDefaultValue() {
        User user = new User();
        assertNotEquals(0, user.hashCode());
    }

    @Test
    @DisplayName("Equals method returns false for different objects")
    void equalsMethodReturnsFalseForDifferentObjects() {
        User user1 = new User();
        User user2 = new User();
        assertNotEquals(user1, user2);
    }

    @Test
    @DisplayName("Equals method returns true for same object")
    void equalsMethodReturnsTrueForSameObject() {
        User user = new User();
        assertEquals(user, user);
    }
}
