/*
 *  @(#)DataValue.java
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
import com.prx.commons.enums.types.OperationType;
import static com.prx.commons.util.JsonUtil.toJson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({"id", "lastValue", "currencyPairExchange", "dateTime", "operationType", "amount"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataValue implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("lastValue")
    private BigDecimal lastValue;
    @JsonProperty("currencyPairExchange")
    private CurrencyPairExchange currencyPairExchange;
    @JsonProperty("dateTime")
    private LocalDateTime dateTime;
    @JsonProperty("operationType")
    private OperationType operationType;
    @JsonProperty("amount")
    private BigDecimal amount;

    @Override
    public String toString(){
        return toJson(this);
    }
}
