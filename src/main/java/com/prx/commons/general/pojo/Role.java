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

    // No-argument constructor
    public Role() {
        // Default constructor
    }

    // Getters and setters
    /// @return UUID id of the role
    public UUID getId() {
        return this.id;
    }

    /// @param id UUID id of the role
    public void setId(UUID id) {
        this.id = id;
    }

    /// @return String name of the role
    public String getName() {
        return this.name;
    }

    /// @param name String name of the role
    public void setName(String name) {
        this.name = name;
    }

    /// @return String description of the role
    public String getDescription() {
        return this.description;
    }

    /// @param description String description of the role
    public void setDescription(String description) {
        this.description = description;
    }

    /// @return List<Feature> features of the role
    public List<Feature> getFeatures() {
        return this.features;
    }

    /// @param features List<Feature> features of the role
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /// @return Boolean active of the role
    public Boolean getActive() {
        return this.active;
    }

    /// @param active Boolean active of the role
    public void setActive(Boolean active) {
        this.active = active;
    }

    /// @return String representation of the role
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
