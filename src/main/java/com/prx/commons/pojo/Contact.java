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
package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

/**
 * Contact.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({"id", "content", "contactType", "person", "active"})
public class Contact implements Serializable {

    private String id;
    private String content;
    private ContactType contactType;
    private Person person;
    private Boolean active;

    public Contact() {
        //Default constructor
    }

    public String getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public ContactType getContactType() {
        return this.contactType;
    }

    public Person getPerson() {
        return this.person;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

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
