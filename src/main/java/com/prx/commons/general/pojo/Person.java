/*
 *  @(#)Person.java
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prx.commons.util.DateUtil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Represents a person with basic identification fields and contact information.
 *
 * <p>This POJO includes validation annotations for common constraints and
 * provides standard getters and setters.</p>
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @version 1.0.3, 29-09-2020
 */
public class Person implements Serializable {

    private UUID id;
    @NotBlank
    @Size(min = 2, max = 20)
    private String firstName;
    @Size(min = 2, max = 20)
    private String middleName;
    @Size(min = 2, max = 20)
    private String lastName;
    @Size(min = 1, max = 1)
    @NotBlank
    private String gender;
    @NotNull
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    private LocalDate birthdate;
    private List<Contact> contacts;

    /** Default constructor. */
    public Person() {
        // Default constructor.
    }

    /**
     * Returns the identifier of the person.
     *
     * @return the person's UUID identifier
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the person's first name.
     *
     * @return first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the person's middle name.
     *
     * @return middle name
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Returns the person's last name.
     *
     * @return last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the person's gender code (single character).
     *
     * @return gender code
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Returns the person's birthdate.
     *
     * @return birthdate as {@link LocalDate}
     */
    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    /**
     * Returns the contact list associated with the person.
     *
     * @return list of {@link Contact} or null if none
     */
    public List<Contact> getContacts() {
        return this.contacts;
    }

    /**
     * Sets the person's identifier.
     *
     * @param id the UUID to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the middle name.
     *
     * @param middleName the middle name to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the gender code.
     *
     * @param gender the gender code to set (single character)
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Sets the birthdate.
     *
     * @param birthdate the birthdate to set
     */
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Sets the contact list.
     *
     * @param contacts list of {@link Contact}
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id +
                "', firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                (contacts != null ? ", contacts=" + contacts : "") +
                '}';
    }
}
