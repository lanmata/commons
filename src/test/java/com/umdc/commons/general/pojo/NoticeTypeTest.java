/*
 * @(#)NoticeTypeTest.java
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

class NoticeTypeTest {

    @Test
    @DisplayName("Test NoticeType Constructor and Getters")
    void testConstructor() {
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        var createdAt = LocalDateTime.now();
        var updatedAt = LocalDateTime.now();

        NoticeType actual = new NoticeType();
        actual.setId(uuid);
        actual.setName("SYSTEM");
        actual.setDescription("System notice");
        actual.setCreatedAt(createdAt);
        actual.setUpdatedAt(updatedAt);
        actual.setActive(true);

        assertEquals(uuid, actual.getId());
        assertEquals("SYSTEM", actual.getName());
        assertEquals("System notice", actual.getDescription());
        assertEquals(createdAt, actual.getCreatedAt());
        assertEquals(updatedAt, actual.getUpdatedAt());
        assertTrue(actual.getActive());
    }

    @Test
    @DisplayName("Test NoticeType Getters and Setters")
    void testGettersAndSetters() {
        var noticeType = new NoticeType();
        noticeType.setId(UUID.randomUUID());
        noticeType.setName("ALERT");
        noticeType.setDescription("Alert notice");
        noticeType.setCreatedAt(LocalDateTime.now());
        noticeType.setUpdatedAt(LocalDateTime.now());
        noticeType.setActive(true);
        assertAll("Getters And Setters",
                () -> assertNotNull(noticeType.getId()),
                () -> assertNotNull(noticeType.getName()),
                () -> assertNotNull(noticeType.getDescription()),
                () -> assertNotNull(noticeType.getCreatedAt()),
                () -> assertNotNull(noticeType.getUpdatedAt()),
                () -> assertNotNull(noticeType.getActive()),
                () -> assertNotNull(noticeType.toString()),
                () -> assertNotEquals(1, noticeType.hashCode()),
                () -> assertNotEquals(new NoticeType(), noticeType)
        );
    }
}
