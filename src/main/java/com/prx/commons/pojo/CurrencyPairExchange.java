/*
 *  @(#)CurrencyPairExchange.java
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

/**
 * CurrencyPairExchange.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
    "id", "currencyBase", "currencyVariable", "decimalDisplay", "enabled"
})
class CurrencyPairExchange implements Serializable {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("currencyBase")
    private Integer currencyBase;
    @JsonProperty("currencyVariable")
    private Integer currencyVariable;
    @JsonProperty("decimalDisplay")
    private Integer decimalDisplay;
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Default constructor.
     */
    public CurrencyPairExchange() {
        // Default constructor.
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCurrencyBase() {
        return this.currencyBase;
    }

    public Integer getCurrencyVariable() {
        return this.currencyVariable;
    }

    public Integer getDecimalDisplay() {
        return this.decimalDisplay;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("currencyBase")
    public void setCurrencyBase(Integer currencyBase) {
        this.currencyBase = currencyBase;
    }

    @JsonProperty("currencyVariable")
    public void setCurrencyVariable(Integer currencyVariable) {
        this.currencyVariable = currencyVariable;
    }

    @JsonProperty("decimalDisplay")
    public void setDecimalDisplay(Integer decimalDisplay) {
        this.decimalDisplay = decimalDisplay;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "CurrencyPairExchange{" +
                "id=" + id +
                ", currencyBase=" + currencyBase +
                ", currencyVariable=" + currencyVariable +
                ", decimalDisplay=" + decimalDisplay +
                ", enabled=" + enabled +
                '}';
    }
}
