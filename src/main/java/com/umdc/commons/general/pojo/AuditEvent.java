/*
 * @(#)AuditEvent.java
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
import java.util.Map;
import java.util.UUID;

/**
 * AuditEvent.
 *
 * Immutable security audit log entry — one row per user action. The {@code userId}
 * and {@code applicationId} are logical foreign keys managed outside this library
 * (by {@code com.umdc.persistence}), so they are kept as raw identifiers rather than
 * nested {@link User}/{@link Application} objects.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class AuditEvent implements Serializable {
    private UUID id;
    private UUID userId;
    private UUID applicationId;
    private AuditEventType eventType;
    private String ipAddress;
    private String userAgent;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime occurredAt;
    private transient Map<String, Object> details;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdAt;

    /** Default constructor. */
    public AuditEvent() {
        // Default constructor.
    }

    /**
     * Returns the audit event identifier.
     *
     * @return audit event UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the identifier of the user that performed the action.
     *
     * @return user UUID
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Returns the identifier of the application the action was performed in.
     *
     * @return application UUID
     */
    public UUID getApplicationId() {
        return this.applicationId;
    }

    /**
     * Returns the type of security event.
     *
     * @return {@link AuditEventType}
     */
    public AuditEventType getEventType() {
        return this.eventType;
    }

    /**
     * Returns the IPv4 or IPv6 source address of the request.
     *
     * @return IP address
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Returns the HTTP User-Agent header value of the request.
     *
     * @return user agent
     */
    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Returns the timestamp when the event occurred.
     *
     * @return occurrence timestamp
     */
    public LocalDateTime getOccurredAt() {
        return this.occurredAt;
    }

    /**
     * Returns the event-specific details.
     *
     * @return details bag (attempt count, role name, etc.)
     */
    public Map<String, Object> getDetails() {
        return this.details;
    }

    /**
     * Returns the timestamp when the row was inserted.
     *
     * @return creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Sets the audit event identifier.
     *
     * @param id audit event UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the identifier of the user that performed the action.
     *
     * @param userId user UUID
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * Sets the identifier of the application the action was performed in.
     *
     * @param applicationId application UUID
     */
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the type of security event.
     *
     * @param eventType the event type to set
     */
    public void setEventType(AuditEventType eventType) {
        this.eventType = eventType;
    }

    /**
     * Sets the IPv4 or IPv6 source address of the request.
     *
     * @param ipAddress IP address to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Sets the HTTP User-Agent header value of the request.
     *
     * @param userAgent user agent to set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Sets the timestamp when the event occurred.
     *
     * @param occurredAt occurrence timestamp to set
     */
    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }

    /**
     * Sets the event-specific details.
     *
     * @param details details bag to set
     */
    public void setDetails(Map<String, Object> details) {
        this.details = details;
    }

    /**
     * Sets the timestamp when the row was inserted.
     *
     * @param createdAt creation timestamp to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns a string representation of the audit event.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "AuditEvent{" +
                "id=" + id +
                ", userId=" + userId +
                ", applicationId=" + applicationId +
                ", eventType=" + eventType +
                ", ipAddress='" + ipAddress + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", occurredAt=" + occurredAt +
                ", details=" + details +
                ", createdAt=" + createdAt +
                '}';
    }
}
