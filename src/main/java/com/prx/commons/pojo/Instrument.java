/*
 *  @(#)Instrument.java
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

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

/**
 * Instrument.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class Instrument implements Serializable {

    private Long id;
    private String name;
    private String description;
    private LocalCoin coinSource;
    private LocalCoin coinTarget;
    private Boolean active;

    /**
     * Default constructor.
     */
    public Instrument() {
        //Default constructor.
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalCoin getCoinSource() {
        return this.coinSource;
    }

    public LocalCoin getCoinTarget() {
        return this.coinTarget;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoinSource(LocalCoin coinSource) {
        this.coinSource = coinSource;
    }

    public void setCoinTarget(LocalCoin coinTarget) {
        this.coinTarget = coinTarget;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coinSource=" + coinSource +
                ", coinTarget=" + coinTarget +
                ", active=" + active +
                '}';
    }
}
