/*
 * @(#)NoticeType.java
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
import java.util.UUID;

/**
 * NoticeType.
 *
 * Represents a category of notice that can be sent to users.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class NoticeType implements Serializable {
    private UUID id;
    private String name;
    private String description;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdAt;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime updatedAt;
    private Boolean active;

    /** Default constructor. */
    public NoticeType() {
        // Default constructor.
    }

    /**
     * Returns the notice type identifier.
     *
     * @return notice type UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the name.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the description.
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * Returns the last update timestamp.
     *
     * @return last update timestamp
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Returns whether the notice type is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the notice type identifier.
     *
     * @param id notice type UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the name.
     *
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the description.
     *
     * @param description description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Sets the last update timestamp.
     *
     * @param updatedAt last update timestamp to set
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Sets whether the notice type is active.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns a string representation of the notice type.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "NoticeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", active=" + active +
                '}';
    }
}
