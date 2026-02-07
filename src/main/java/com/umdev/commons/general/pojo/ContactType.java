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

package com.umdev.commons.general.pojo;

import com.fasterxml.jackson.databind.annotation.JsonNaming;


import java.io.Serializable;
import java.util.UUID;

/**
 * ContactType.
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

    ///  Default constructor.
    public ContactType() {
        //Default constructor
    }

    ///  @return UUID ID.
    public UUID getId() {
        return id;
    }

    ///  @param id UUID ID.
    public void setId(UUID id) {
        this.id = id;
    }

    ///  @return String Name.
    public String getName() {
        return name;
    }

    ///  @param name String Name.
    public void setName(String name) {
        this.name = name;
    }

    ///  @return String Description.
    public String getDescription() {
        return description;
    }

    ///  @param description String Description.
    public void setDescription(String description) {
        this.description = description;
    }

    ///  @return Boolean Active.
    public Boolean getActive() {
        return active;
    }

    ///  @param active Boolean Active.
    public void setActive(Boolean active) {
        this.active = active;
    }

    ///  @return Returns a string representation of the object.
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
