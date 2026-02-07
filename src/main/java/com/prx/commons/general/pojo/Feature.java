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

/// Feature.
///
/// @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
/// @version 1.0.3.20200904-01, 31-01-2021
@JsonNaming
public class Feature implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private Boolean active;

    /// Default constructor.
    public Feature() {
        //Default constructor.
    }

    ///  @return the ID of the feature
    public UUID getId() {
        return this.id;
    }

    ///  @return the name of the feature
    public String getName() {
        return this.name;
    }

    ///  @return the description of the feature
    public String getDescription() {
        return this.description;
    }

    ///  @return the active status of the feature
    public Boolean getActive() {
        return this.active;
    }

    ///  @param id the ID of the feature
    public void setId(UUID id) {
        this.id = id;
    }

    ///  @param name the name of the feature
    public void setName(String name) {
        this.name = name;
    }

    ///  @param description the description of the feature
    public void setDescription(String description) {
        this.description = description;
    }

    ///  @param active the active status of the feature
    public void setActive(Boolean active) {
        this.active = active;
    }

    ///  @return the string representation of the feature
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
