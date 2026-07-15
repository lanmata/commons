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
package com.umdc.commons.general.pojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.UUID;

/**
 * Contact.
 *
 * Represents a contact entry with a content value and contact type.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({"id", "content", "contactType", "personId", "applicationId", "active"})
public class Contact implements Serializable {

    private UUID id;
    private String content;
    private ContactType contactType;
    private UUID personId;
    private UUID applicationId;
    private Boolean active;

    /** Default constructor. */
    public Contact() {
        // Default constructor
    }

    /**
     * Returns the identifier of the contact.
     *
     * @return contact UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns contact content string (for example, email or phone number).
     *
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Returns the type of contact.
     *
     * @return {@link ContactType}
     */
    public ContactType getContactType() {
        return this.contactType;
    }

    /**
     * Returns the identifier of the person this contact belongs to.
     *
     * @return person UUID
     */
    public UUID getPersonId() {
        return this.personId;
    }

    /**
     * Returns the identifier of the application this contact was captured for, if any.
     *
     * @return application UUID, or null when the contact is not application-specific
     */
    public UUID getApplicationId() {
        return this.applicationId;
    }

    /**
     * Returns whether the contact is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the contact identifier.
     *
     * @param id contact UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the content string for the contact.
     *
     * @param content content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets the contact type.
     *
     * @param contactType the contact type to set
     */
    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    /**
     * Sets the identifier of the person this contact belongs to.
     *
     * @param personId person UUID
     */
    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    /**
     * Sets the identifier of the application this contact was captured for.
     *
     * @param applicationId application UUID
     */
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets whether the contact is active.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns string representation of the contact.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id +
                "', content='" + content + '\'' +
                ", contactType=" + contactType +
                ", personId=" + personId +
                ", applicationId=" + applicationId +
                ", active=" + active +
                '}';
    }
}
