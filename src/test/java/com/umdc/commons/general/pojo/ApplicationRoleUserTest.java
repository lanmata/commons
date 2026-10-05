/*
 * @(#)ApplicationRoleUserTest.java
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

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationRoleUserTest {

    @Test
    @DisplayName("Test ApplicationRoleUser Constructor and Getters")
    void testConstructor() {
        var id = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var creatorId = UUID.randomUUID();
        var user = new User();
        var role = new Role();
        var application = new Application();
        var createdDate = LocalDateTime.now();

        ApplicationRoleUser actual = new ApplicationRoleUser();
        actual.setId(id);
        actual.setUser(user);
        actual.setRole(role);
        actual.setApplication(application);
        actual.setActive(true);
        actual.setProfileImageRef("N/A");
        actual.setCreatorId(creatorId);
        actual.setCreatedDate(createdDate);

        assertEquals(id, actual.getId());
        assertSame(user, actual.getUser());
        assertSame(role, actual.getRole());
        assertSame(application, actual.getApplication());
        assertTrue(actual.getActive());
        assertEquals("N/A", actual.getProfileImageRef());
        assertEquals(creatorId, actual.getCreatorId());
        assertEquals(createdDate, actual.getCreatedDate());
    }

    @Test
    @DisplayName("Test ApplicationRoleUser Getters and Setters")
    void testGettersAndSetters() {
        var applicationRoleUser = new ApplicationRoleUser();
        applicationRoleUser.setId(UUID.randomUUID());
        applicationRoleUser.setUser(new User());
        applicationRoleUser.setRole(new Role());
        applicationRoleUser.setApplication(new Application());
        applicationRoleUser.setActive(true);
        applicationRoleUser.setProfileImageRef("ref.png");
        applicationRoleUser.setCreatorId(UUID.randomUUID());
        applicationRoleUser.setCreatedDate(LocalDateTime.now());
        assertAll("Getters And Setters",
                () -> assertNotNull(applicationRoleUser.getId()),
                () -> assertNotNull(applicationRoleUser.getUser()),
                () -> assertNotNull(applicationRoleUser.getRole()),
                () -> assertNotNull(applicationRoleUser.getApplication()),
                () -> assertNotNull(applicationRoleUser.getActive()),
                () -> assertNotNull(applicationRoleUser.getProfileImageRef()),
                () -> assertNotNull(applicationRoleUser.getCreatorId()),
                () -> assertNotNull(applicationRoleUser.getCreatedDate()),
                () -> assertNotNull(applicationRoleUser.toString()),
                () -> assertNotEquals(1, applicationRoleUser.hashCode()),
                () -> assertNotEquals(new ApplicationRoleUser(), applicationRoleUser)
        );
    }
}
