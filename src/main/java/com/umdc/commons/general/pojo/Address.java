/*
 * @(#)Address.java
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

import java.io.Serializable;
import java.util.UUID;

/**
 * Address.
 *
 * Represents a physical address associated with a person.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class Address implements Serializable {
    private UUID id;
    private String content;
    private String zipcode;
    private UUID personId;

    /** Default constructor. */
    public Address() {
        // Default constructor.
    }

    /**
     * Returns the address identifier.
     *
     * @return address UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the address text.
     *
     * @return address
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Returns the zip code.
     *
     * @return zipcode
     */
    public String getZipcode() {
        return this.zipcode;
    }

    /**
     * Returns the identifier of the person this address belongs to.
     *
     * @return person UUID
     */
    public UUID getPersonId() {
        return this.personId;
    }

    /**
     * Sets the address identifier.
     *
     * @param id address UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the address text.
     *
     * @param content address to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets the zip code.
     *
     * @param zipcode zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * Sets the identifier of the person this address belongs to.
     *
     * @param personId person UUID
     */
    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    /**
     * Returns a string representation of the address.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Address{" +
                "id='" + id +
                "', address='" + content + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", personId=" + personId +
                '}';
    }
}
