/*
 *  @(#)ExchangeInstrument.java
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
import com.prx.commons.util.JsonUtil;

@JsonPropertyOrder({"exchangeId", "instrumentId", "active", "identifier"
})
public class ExchangeInstrument {

    @JsonProperty("exchange")
    private Exchange exchange;
    @JsonProperty("instrument")
    private Instrument instrument;
    @JsonProperty("activeId")
    private Boolean active;
    @JsonProperty("identifier")
    private String identifier;

    /**
     * Default constructor.
     */
    public ExchangeInstrument() {
        //Default constructor
    }

    public ExchangeInstrument(Exchange exchange, Instrument instrument, Boolean active, String identifier) {
        this.exchange = exchange;
        this.instrument = instrument;
        this.active = active;
        this.identifier = identifier;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String toString(){
        return JsonUtil.toJson(this);
    }

}
