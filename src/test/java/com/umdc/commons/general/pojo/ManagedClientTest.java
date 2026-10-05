/*
 * @(#)ManagedClientTest.java
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
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ManagedClientTest {

    @Test
    @DisplayName("Test ManagedClient Constructor and Getters")
    void testConstructor() {
        var id = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var applicationId = UUID.randomUUID();
        var createdAt = LocalDateTime.now();
        var lastUpdatedAt = LocalDateTime.now();
        var secretLastRotatedAt = LocalDateTime.now();
        var scopes = List.of("read", "write");

        ManagedClient actual = new ManagedClient();
        actual.setId(id);
        actual.setName("client-name");
        actual.setDescription("client description");
        actual.setApplicationId(applicationId);
        actual.setSecretHash("hash");
        actual.setPrevSecretHash("prevHash");
        actual.setScopes(scopes);
        actual.setActive(true);
        actual.setCreatedAt(createdAt);
        actual.setLastUpdatedAt(lastUpdatedAt);
        actual.setSecretLastRotatedAt(secretLastRotatedAt);

        assertEquals(id, actual.getId());
        assertEquals("client-name", actual.getName());
        assertEquals("client description", actual.getDescription());
        assertEquals(applicationId, actual.getApplicationId());
        assertEquals("hash", actual.getSecretHash());
        assertEquals("prevHash", actual.getPrevSecretHash());
        assertEquals(scopes, actual.getScopes());
        assertTrue(actual.getActive());
        assertEquals(createdAt, actual.getCreatedAt());
        assertEquals(lastUpdatedAt, actual.getLastUpdatedAt());
        assertEquals(secretLastRotatedAt, actual.getSecretLastRotatedAt());
    }

    @Test
    @DisplayName("Test ManagedClient Getters and Setters")
    void testGettersAndSetters() {
        var managedClient = new ManagedClient();
        managedClient.setId(UUID.randomUUID());
        managedClient.setName("client");
        managedClient.setDescription("description");
        managedClient.setApplicationId(UUID.randomUUID());
        managedClient.setSecretHash("hash");
        managedClient.setPrevSecretHash("prevHash");
        managedClient.setScopes(List.of("read"));
        managedClient.setActive(true);
        managedClient.setCreatedAt(LocalDateTime.now());
        managedClient.setLastUpdatedAt(LocalDateTime.now());
        managedClient.setSecretLastRotatedAt(LocalDateTime.now());
        assertAll("Getters And Setters",
                () -> assertNotNull(managedClient.getId()),
                () -> assertNotNull(managedClient.getName()),
                () -> assertNotNull(managedClient.getDescription()),
                () -> assertNotNull(managedClient.getApplicationId()),
                () -> assertNotNull(managedClient.getSecretHash()),
                () -> assertNotNull(managedClient.getPrevSecretHash()),
                () -> assertNotNull(managedClient.getScopes()),
                () -> assertNotNull(managedClient.getActive()),
                () -> assertNotNull(managedClient.getCreatedAt()),
                () -> assertNotNull(managedClient.getLastUpdatedAt()),
                () -> assertNotNull(managedClient.getSecretLastRotatedAt()),
                () -> assertNotNull(managedClient.toString()),
                () -> assertNotEquals(1, managedClient.hashCode()),
                () -> assertNotEquals(new ManagedClient(), managedClient)
        );
    }

    @Test
    @DisplayName("toString does not leak secret hashes")
    void toStringDoesNotLeakSecrets() {
        var managedClient = new ManagedClient();
        managedClient.setSecretHash("super-secret-hash");
        managedClient.setPrevSecretHash("previous-secret-hash");
        assertFalse(managedClient.toString().contains("super-secret-hash"));
        assertFalse(managedClient.toString().contains("previous-secret-hash"));
    }
}
