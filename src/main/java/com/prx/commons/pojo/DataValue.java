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
import com.prx.commons.constants.types.OperationType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DataValue.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({"id", "lastValue", "currencyPairExchange", "dateTime", "operationType", "amount"})
public class DataValue implements Serializable {

    private Long id;
    private BigDecimal lastValue;
    private CurrencyPairExchange currencyPairExchange;
    private LocalDateTime dateTime;
    private OperationType operationType;
    private BigDecimal amount;

    /**
     * Default constructor.
     */
    public DataValue() {
        //Default constructor.
    }

    public Long getId() {
        return this.id;
    }

    public BigDecimal getLastValue() {
        return this.lastValue;
    }

    public CurrencyPairExchange getCurrencyPairExchange() {
        return this.currencyPairExchange;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public OperationType getOperationType() {
        return this.operationType;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastValue(BigDecimal lastValue) {
        this.lastValue = lastValue;
    }

    public void setCurrencyPairExchange(CurrencyPairExchange currencyPairExchange) {
        this.currencyPairExchange = currencyPairExchange;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
