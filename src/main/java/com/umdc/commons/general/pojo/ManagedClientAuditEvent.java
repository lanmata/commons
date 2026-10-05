/*
 * @(#)ManagedClientAuditEvent.java
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
 * ManagedClientAuditEvent.
 *
 * Append-only audit log entry for M2M managed client lifecycle events.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class ManagedClientAuditEvent implements Serializable {
    private UUID id;
    private UUID clientId;
    private AuditEventType eventType;
    private String ipAddress;
    private AuditOutcome outcome;
    private transient Map<String, Object> details;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime occurredAt;

    /** Default constructor. */
    public ManagedClientAuditEvent() {
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
     * Returns the identifier of the managed client this event relates to.
     *
     * @return {@link ManagedClient} UUID
     */
    public UUID getClientId() {
        return this.clientId;
    }

    /**
     * Returns the type of client lifecycle event.
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
     * Returns the outcome of the action.
     *
     * @return {@link AuditOutcome}
     */
    public AuditOutcome getOutcome() {
        return this.outcome;
    }

    /**
     * Returns the event-specific details.
     *
     * @return details bag
     */
    public Map<String, Object> getDetails() {
        return this.details;
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
     * Sets the audit event identifier.
     *
     * @param id audit event UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the identifier of the managed client this event relates to.
     *
     * @param clientId managed client UUID
     */
    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    /**
     * Sets the type of client lifecycle event.
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
     * Sets the outcome of the action.
     *
     * @param outcome the outcome to set
     */
    public void setOutcome(AuditOutcome outcome) {
        this.outcome = outcome;
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
     * Sets the timestamp when the event occurred.
     *
     * @param occurredAt occurrence timestamp to set
     */
    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }

    /**
     * Returns a string representation of the managed client audit event.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "ManagedClientAuditEvent{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", eventType=" + eventType +
                ", ipAddress='" + ipAddress + '\'' +
                ", outcome=" + outcome +
                ", details=" + details +
                ", occurredAt=" + occurredAt +
                '}';
    }
}
