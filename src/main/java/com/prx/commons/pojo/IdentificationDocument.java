/*
 * @(#)IdentificationDocument.java
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

package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * IdentificationDocument.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 22-11-2020
 */
@JsonPropertyOrder({"id", "number", "expirationDate", "identificationType", "person"})
public class IdentificationDocument implements Serializable {
    private String id;
    private String number;
    private LocalDate expirationDate;
    private int identificationType;
    private Person person;

    /**
     * Default constructor.
     */
    public IdentificationDocument() {
        //Default constructor.
    }

    public String getId() {
        return this.id;
    }

    public String getNumber() {
        return this.number;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public int getIdentificationType() {
        return this.identificationType;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setIdentificationType(int identificationType) {
        this.identificationType = identificationType;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "IdentificationDocument{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", expirationDate=" + expirationDate +
                ", identificationType=" + identificationType +
                ", person=" + person +
                '}';
    }
}
