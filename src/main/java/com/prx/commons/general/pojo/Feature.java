/*
 * @(#)Feature.java
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

package com.prx.commons.general.pojo;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;
import java.util.UUID;

/**
 * Feature.
 *
 * Represents a capability or permission that can be assigned to roles.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 31-01-2021
 */
@JsonNaming
public class Feature implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private Boolean active;

    /** Default constructor. */
    public Feature() {
        // Default constructor.
    }

    /**
     * Returns the feature identifier.
     *
     * @return feature UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the feature name.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the description of the feature.
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns whether the feature is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the feature identifier.
     *
     * @param id feature UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the feature name.
     *
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the feature description.
     *
     * @param description description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets whether the feature is active.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns string representation of the feature.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Feature{" +
                "id='" + id +
                "', name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
