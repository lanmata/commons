/*
 *  @(#)Contact.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.commons.general.pojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.UUID;

/// Contact.
///
/// @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
/// @version 1.0.3, 29-09-2020
@JsonPropertyOrder({"id", "content", "contactType", "person", "active"})
public class Contact implements Serializable {

    private UUID id;
    private String content;
    private ContactType contactType;
    private Person person;
    private Boolean active;

    /// Default constructor.
    public Contact() {
        //Default constructor
    }

    /// Getters and Setters.
    /// @return id of the contact.
    public UUID getId() {
        return this.id;
    }

    /// @return content of the contact.
    public String getContent() {
        return this.content;
    }

    /// @return contact type of the contact.
    public ContactType getContactType() {
        return this.contactType;
    }

    /// @return person of the contact.
    public Person getPerson() {
        return this.person;
    }

    /// @return active of the contact.
    public Boolean getActive() {
        return this.active;
    }

    /// @param id of the contact.
    public void setId(UUID id) {
        this.id = id;
    }

    /// @param content of the contact.
    public void setContent(String content) {
        this.content = content;
    }

    /// @param contactType of the contact.
    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    /// @param person of the contact.
    public void setPerson(Person person) {
        this.person = person;
    }

    /// @param active of the contact.
    public void setActive(Boolean active) {
        this.active = active;
    }

    /// @return the string representation of the contact.
    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id +
                "', content='" + content + '\'' +
                ", contactType=" + contactType +
                ", person=" + person +
                ", active=" + active +
                '}';
    }
}
