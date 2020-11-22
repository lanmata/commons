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
import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CurrencyPairExchange.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
    "id", "currencyBase", "currencyVariable", "decimalDisplay", "enabled"
})
@Setter
@Getter
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
        return JsonUtil.toJson(this);
    }
}
