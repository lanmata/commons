/*
 * @(#)ContactType.java
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
 * ContactType.
 *
 * Represents a category of contact information (for example, EMAIL, PHONE).
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 30-01-2021
 */
@JsonNaming
public class ContactType implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private Boolean active;

    /** Default constructor. */
    public ContactType() {
        // Default constructor
    }

    /**
     * Returns the identifier.
     *
     * @return UUID id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets the identifier.
     *
     * @param id UUID id
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Returns the name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns whether the contact type is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the active flag.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns a string representation of this contact type.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "ContactType{" +
                "id='" + id +
                "', name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
