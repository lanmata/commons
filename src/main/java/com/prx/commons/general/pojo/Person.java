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
import java.util.Objects;
import java.util.UUID;

/// @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
/// @version 1.0.3, 29-09-2020
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

    /// Default constructor.
    public Person() {
        //Default constructor.
    }

    /// @return the id of the person.
    public UUID getId() {
        return this.id;
    }

    /// @return the first name of the person.
    public String getFirstName() {
        return this.firstName;
    }

    /// @return the middle name of the person.
    public String getMiddleName() {
        return this.middleName;
    }

    /// @return the last name of the person.
    public String getLastName() {
        return this.lastName;
    }

    /// @return the gender of the person.
    public String getGender() {
        return this.gender;
    }

    /// @return the birthdate of the person.
    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    ///  @return Collection of Contact.
    public List<Contact> getContacts() {
        return this.contacts;
    }

    ///  @param id the id of the person.
    public void setId(UUID id) {
        this.id = id;
    }

    ///  @param firstName the first name of the person.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    ///  @param middleName the middle name of the person.
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    ///  @param lastName the last name of the person.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    ///  @param gender The gender of the person.
    public void setGender(String gender) {
        this.gender = gender;
    }

    ///  @param birthdate the birthdate of the person.
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /// @param  contacts list
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    ///  @return the string representation of the person.
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
