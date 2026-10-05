/*
 * @(#)NoticeTest.java
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

import static org.junit.jupiter.api.Assertions.*;

class NoticeTest {

    @Test
    @DisplayName("Test Notice Constructor and Getters")
    void testConstructor() {
        var user = new User();
        var application = new Application();
        var noticeType = new NoticeType();
        var createdAt = LocalDateTime.now();

        Notice actual = new Notice();
        actual.setUser(user);
        actual.setApplication(application);
        actual.setNoticeType(noticeType);
        actual.setCreatedAt(createdAt);

        assertSame(user, actual.getUser());
        assertSame(application, actual.getApplication());
        assertSame(noticeType, actual.getNoticeType());
        assertEquals(createdAt, actual.getCreatedAt());
    }

    @Test
    @DisplayName("Test Notice Getters and Setters")
    void testGettersAndSetters() {
        var notice = new Notice();
        notice.setUser(new User());
        notice.setApplication(new Application());
        notice.setNoticeType(new NoticeType());
        notice.setCreatedAt(LocalDateTime.now());
        assertAll("Getters And Setters",
                () -> assertNotNull(notice.getUser()),
                () -> assertNotNull(notice.getApplication()),
                () -> assertNotNull(notice.getNoticeType()),
                () -> assertNotNull(notice.getCreatedAt()),
                () -> assertNotNull(notice.toString()),
                () -> assertNotEquals(1, notice.hashCode()),
                () -> assertNotEquals(new Notice(), notice)
        );
    }
}
