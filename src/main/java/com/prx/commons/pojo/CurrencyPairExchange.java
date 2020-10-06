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
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "id", "currencyBase", "currencyVariable", "decimalDisplay", "enabled"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return toJson(this);
    }
}
