/*
 * @(#)Notice.java
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.umdc.commons.util.DateUtil;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Notice.
 *
 * Represents a notice of a given {@link NoticeType} delivered to a {@link User}
 * within an {@link Application}. The user, application, and notice type together
 * form the natural (composite) key of this entity; there is no surrogate identifier.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class Notice implements Serializable {
    private User user;
    private Application application;
    private NoticeType noticeType;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdAt;

    /** Default constructor. */
    public Notice() {
        // Default constructor.
    }

    /**
     * Returns the user this notice was delivered to.
     *
     * @return {@link User}
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Returns the application this notice belongs to.
     *
     * @return {@link Application}
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * Returns the type of this notice.
     *
     * @return {@link NoticeType}
     */
    public NoticeType getNoticeType() {
        return this.noticeType;
    }

    /**
     * Returns the creation timestamp of the notice.
     *
     * @return creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Sets the user this notice was delivered to.
     *
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Sets the application this notice belongs to.
     *
     * @param application the application to set
     */
    public void setApplication(Application application) {
        this.application = application;
    }

    /**
     * Sets the type of this notice.
     *
     * @param noticeType the notice type to set
     */
    public void setNoticeType(NoticeType noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * Sets the creation timestamp of the notice.
     *
     * @param createdAt creation timestamp to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns a string representation of the notice.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Notice{" +
                "user=" + user +
                ", application=" + application +
                ", noticeType=" + noticeType +
                ", createdAt=" + createdAt +
                '}';
    }
}
