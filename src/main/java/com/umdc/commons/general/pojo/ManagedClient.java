/*
 * @(#)ManagedClient.java
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
import java.util.List;
import java.util.UUID;

/**
 * ManagedClient.
 *
 * Represents an M2M managed client credential registration for the MCAM feature.
 * The {@code applicationId} is a logical foreign key managed outside this library
 * (by {@code com.umdc.persistence}), so it is kept as a raw identifier rather than
 * a nested {@link Application} object.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class ManagedClient implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private UUID applicationId;
    private String secretHash;
    private String prevSecretHash;
    private List<String> scopes;
    private Boolean active;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdAt;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime lastUpdatedAt;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime secretLastRotatedAt;

    /** Default constructor. */
    public ManagedClient() {
        // Default constructor.
    }

    /**
     * Returns the managed client identifier.
     *
     * @return managed client UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the client name, unique within an application.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the client description.
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns the identifier of the application this client belongs to.
     *
     * @return application UUID
     */
    public UUID getApplicationId() {
        return this.applicationId;
    }

    /**
     * Returns the bcrypt hash of the current client secret.
     *
     * @return secret hash
     */
    public String getSecretHash() {
        return this.secretHash;
    }

    /**
     * Returns the bcrypt hash of the previous secret, kept during the rotation grace period.
     *
     * @return previous secret hash, or null when not rotating
     */
    public String getPrevSecretHash() {
        return this.prevSecretHash;
    }

    /**
     * Returns the authorised OAuth2 scopes.
     *
     * @return list of scopes
     */
    public List<String> getScopes() {
        return this.scopes;
    }

    /**
     * Returns whether the client is allowed to issue tokens.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Returns the creation timestamp.
     *
     * @return creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Returns the timestamp of the last metadata update.
     *
     * @return last update timestamp
     */
    public LocalDateTime getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * Returns the timestamp of the most recent secret rotation.
     *
     * @return secret rotation timestamp
     */
    public LocalDateTime getSecretLastRotatedAt() {
        return this.secretLastRotatedAt;
    }

    /**
     * Sets the managed client identifier.
     *
     * @param id managed client UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the client name.
     *
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the client description.
     *
     * @param description description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the identifier of the application this client belongs to.
     *
     * @param applicationId application UUID
     */
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the bcrypt hash of the current client secret.
     *
     * @param secretHash secret hash to set
     */
    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }

    /**
     * Sets the bcrypt hash of the previous secret.
     *
     * @param prevSecretHash previous secret hash to set
     */
    public void setPrevSecretHash(String prevSecretHash) {
        this.prevSecretHash = prevSecretHash;
    }

    /**
     * Sets the authorised OAuth2 scopes.
     *
     * @param scopes list of scopes to set
     */
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * Sets whether the client is allowed to issue tokens.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Sets the creation timestamp.
     *
     * @param createdAt creation timestamp to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets the timestamp of the last metadata update.
     *
     * @param lastUpdatedAt last update timestamp to set
     */
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * Sets the timestamp of the most recent secret rotation.
     *
     * @param secretLastRotatedAt secret rotation timestamp to set
     */
    public void setSecretLastRotatedAt(LocalDateTime secretLastRotatedAt) {
        this.secretLastRotatedAt = secretLastRotatedAt;
    }

    /**
     * Returns a string representation of the managed client. The secret hashes are
     * intentionally omitted to avoid leaking sensitive material through logs.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "ManagedClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", applicationId=" + applicationId +
                ", scopes=" + scopes +
                ", active=" + active +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", secretLastRotatedAt=" + secretLastRotatedAt +
                '}';
    }
}
