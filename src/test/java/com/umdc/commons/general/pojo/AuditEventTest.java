/*
 * @(#)AuditEventTest.java
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
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AuditEventTest {

    @Test
    @DisplayName("Test AuditEvent Constructor and Getters")
    void testConstructor() {
        var id = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var userId = UUID.randomUUID();
        var applicationId = UUID.randomUUID();
        var occurredAt = LocalDateTime.now();
        var createdAt = LocalDateTime.now();
        var details = Map.<String, Object>of("attempt", 1);

        AuditEvent actual = new AuditEvent();
        actual.setId(id);
        actual.setUserId(userId);
        actual.setApplicationId(applicationId);
        actual.setEventType(AuditEventType.LOGIN_SUCCESS);
        actual.setIpAddress("127.0.0.1");
        actual.setUserAgent("JUnit");
        actual.setOccurredAt(occurredAt);
        actual.setDetails(details);
        actual.setCreatedAt(createdAt);

        assertEquals(id, actual.getId());
        assertEquals(userId, actual.getUserId());
        assertEquals(applicationId, actual.getApplicationId());
        assertEquals(AuditEventType.LOGIN_SUCCESS, actual.getEventType());
        assertEquals("127.0.0.1", actual.getIpAddress());
        assertEquals("JUnit", actual.getUserAgent());
        assertEquals(occurredAt, actual.getOccurredAt());
        assertEquals(details, actual.getDetails());
        assertEquals(createdAt, actual.getCreatedAt());
    }

    @Test
    @DisplayName("Test AuditEvent Getters and Setters")
    void testGettersAndSetters() {
        var auditEvent = new AuditEvent();
        auditEvent.setId(UUID.randomUUID());
        auditEvent.setUserId(UUID.randomUUID());
        auditEvent.setApplicationId(UUID.randomUUID());
        auditEvent.setEventType(AuditEventType.PASSWORD_CHANGE);
        auditEvent.setIpAddress("::1");
        auditEvent.setUserAgent("JUnit/1.0");
        auditEvent.setOccurredAt(LocalDateTime.now());
        auditEvent.setDetails(Map.of());
        auditEvent.setCreatedAt(LocalDateTime.now());
        assertAll("Getters And Setters",
                () -> assertNotNull(auditEvent.getId()),
                () -> assertNotNull(auditEvent.getUserId()),
                () -> assertNotNull(auditEvent.getApplicationId()),
                () -> assertNotNull(auditEvent.getEventType()),
                () -> assertNotNull(auditEvent.getIpAddress()),
                () -> assertNotNull(auditEvent.getUserAgent()),
                () -> assertNotNull(auditEvent.getOccurredAt()),
                () -> assertNotNull(auditEvent.getDetails()),
                () -> assertNotNull(auditEvent.getCreatedAt()),
                () -> assertNotNull(auditEvent.toString()),
                () -> assertNotEquals(1, auditEvent.hashCode()),
                () -> assertNotEquals(new AuditEvent(), auditEvent)
        );
    }
}
