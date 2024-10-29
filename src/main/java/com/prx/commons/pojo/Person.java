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
package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prx.commons.util.DateUtil;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public class Person implements Serializable {

    private String id;
    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;
    @Size(min = 2, max = 20)
    private String middleName;
    @Size(min = 2, max = 20)
    private String lastName;
    @Size(min = 1, max = 1)
    private String gender;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    private LocalDate birthdate;

    /**
     * Default constructor.
     */
    public Person() {
        //Default constructor.
    }

    public String getId() {
        return this.id;
    }

    public @NotNull @Size(min = 2, max = 20) String getFirstName() {
        return this.firstName;
    }

    public @Size(min = 2, max = 20) String getMiddleName() {
        return this.middleName;
    }

    public @Size(min = 2, max = 20) String getLastName() {
        return this.lastName;
    }

    public @Size(min = 1, max = 1) String getGender() {
        return this.gender;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(@NotNull @Size(min = 2, max = 20) String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(@Size(min = 2, max = 20) String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(@Size(min = 2, max = 20) String lastName) {
        this.lastName = lastName;
    }

    public void setGender(@Size(min = 1, max = 1) String gender) {
        this.gender = gender;
    }

    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id +
                "', firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
