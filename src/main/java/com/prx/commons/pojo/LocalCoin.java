/*
 *  @(#)LocalCoin.java
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
 * LocalCoin.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class LocalCoin implements Serializable {

    private Integer id;
    private String symbol;
    private String name;
    private Boolean active;

    /**
     * Default constructor.
     */
    public LocalCoin() {
        //Default constructor.
    }

    public Integer getId() {
        return this.id;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "LocalCoin{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
