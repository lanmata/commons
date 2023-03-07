/*
 *  @(#)DataValueMarket.java
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

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DataValueMarket.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
        "bid",
        "ask",
        "last",
        "low",
        "high",
        "open",
        "close",
        "volume",
        "dateTime",
        "instrumentId",
        "market"
})
public class DataValueMarket implements Serializable {

    private Double bid;
    private Double ask;
    private Double last;
    private Double low;
    private Double high;
    private Double open;
    private Double close;
    private Double volume;
    private LocalDateTime dateTime;
    private Long instrumentId;
    private Long marketId;

    /**
     * Default constructor.
     */
    public DataValueMarket() {
        //Default constructor.
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    @Override
    public String toString() {
        return "DataValueMarket{" +
                "bid=" + bid +
                ", ask=" + ask +
                ", last=" + last +
                ", low=" + low +
                ", high=" + high +
                ", open=" + open +
                ", close=" + close +
                ", volume=" + volume +
                ", dateTime=" + dateTime +
                ", instrumentId=" + instrumentId +
                ", marketId=" + marketId +
                '}';
    }
}

