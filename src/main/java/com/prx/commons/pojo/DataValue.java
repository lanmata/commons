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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.enums.types.OperationType;
import com.prx.commons.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DataValue.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@Setter
@Getter
@NoArgsConstructor
@JsonPropertyOrder({"id", "lastValue", "currencyPairExchange", "dateTime", "operationType", "amount"})
public class DataValue implements Serializable {

    private Long id;
    private BigDecimal lastValue;
    private CurrencyPairExchange currencyPairExchange;
    private LocalDateTime dateTime;
    private OperationType operationType;
    private BigDecimal amount;

    @Override
    public String toString(){
        return JsonUtil.toJson(this);
    }
}
