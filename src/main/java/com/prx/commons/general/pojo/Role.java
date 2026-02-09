/*
 * @(#)Rol.java
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Represents a role assigned to users, including features and activation flag.
 */
@JsonNaming
public class Role implements Serializable {

    @NotNull
    @JsonProperty("id")
    private UUID id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotBlank
    @JsonProperty("description")
    private String description;

    @JsonProperty("features")
    private List<Feature> features;

    @NotNull
    @JsonProperty("active")
    private Boolean active;

    /** No-argument constructor. */
    public Role() {
        // Default constructor
    }

    /**
     * Returns the role identifier.
     *
     * @return UUID id of the role
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Sets the role identifier.
     *
     * @param id UUID id of the role
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Returns the role name.
     *
     * @return name of the role
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the role name.
     *
     * @param name name of the role
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the role description.
     *
     * @return description of the role
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the role description.
     *
     * @param description description of the role
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the features associated with this role.
     *
     * @return list of {@link Feature}
     */
    public List<Feature> getFeatures() {
        return this.features;
    }

    /**
     * Sets the features associated with this role.
     *
     * @param features list of features
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /**
     * Returns whether the role is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the active flag for the role.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns a string representation of the role.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Role{id='" + id
                + "', name='" + name
                + "', description='" + description
                + "', features=" + features
                + ", active="
                + active + "}";
    }
}
