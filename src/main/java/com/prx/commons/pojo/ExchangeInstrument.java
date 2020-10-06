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
import static com.prx.commons.util.JsonUtil.toJson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({"exchangeId", "instrumentId", "active", "identifier"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeInstrument {

    @JsonProperty("exchange")
    private Exchange exchange;
    @JsonProperty("instrument")
    private Instrument instrument;
    @JsonProperty("activeId")
    private Boolean active;
    @JsonProperty("identifier")
    private String identifier;

    public String toString(){
        return toJson(this);
    }

}
