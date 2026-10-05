/*
 * @(#)ManagedClientAuditEventTest.java
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

class ManagedClientAuditEventTest {

    @Test
    @DisplayName("Test ManagedClientAuditEvent Constructor and Getters")
    void testConstructor() {
        var id = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var clientId = UUID.randomUUID();
        var occurredAt = LocalDateTime.now();
        var details = Map.<String, Object>of("scope", "read");

        ManagedClientAuditEvent actual = new ManagedClientAuditEvent();
        actual.setId(id);
        actual.setClientId(clientId);
        actual.setEventType(AuditEventType.CLIENT_TOKEN_ISSUED);
        actual.setIpAddress("127.0.0.1");
        actual.setOutcome(AuditOutcome.SUCCESS);
        actual.setDetails(details);
        actual.setOccurredAt(occurredAt);

        assertEquals(id, actual.getId());
        assertEquals(clientId, actual.getClientId());
        assertEquals(AuditEventType.CLIENT_TOKEN_ISSUED, actual.getEventType());
        assertEquals("127.0.0.1", actual.getIpAddress());
        assertEquals(AuditOutcome.SUCCESS, actual.getOutcome());
        assertEquals(details, actual.getDetails());
        assertEquals(occurredAt, actual.getOccurredAt());
    }

    @Test
    @DisplayName("Test ManagedClientAuditEvent Getters and Setters")
    void testGettersAndSetters() {
        var event = new ManagedClientAuditEvent();
        event.setId(UUID.randomUUID());
        event.setClientId(UUID.randomUUID());
        event.setEventType(AuditEventType.CLIENT_TOKEN_ISSUE_FAILED);
        event.setIpAddress("::1");
        event.setOutcome(AuditOutcome.FAILURE);
        event.setDetails(Map.of());
        event.setOccurredAt(LocalDateTime.now());
        assertAll("Getters And Setters",
                () -> assertNotNull(event.getId()),
                () -> assertNotNull(event.getClientId()),
                () -> assertNotNull(event.getEventType()),
                () -> assertNotNull(event.getIpAddress()),
                () -> assertNotNull(event.getOutcome()),
                () -> assertNotNull(event.getDetails()),
                () -> assertNotNull(event.getOccurredAt()),
                () -> assertNotNull(event.toString()),
                () -> assertNotEquals(1, event.hashCode()),
                () -> assertNotEquals(new ManagedClientAuditEvent(), event)
        );
    }
}
