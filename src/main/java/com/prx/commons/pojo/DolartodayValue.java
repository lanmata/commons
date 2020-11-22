/*
 *  @(#)DolartodayValue.java
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
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
    "dateTime",
    "instrumentDescriptor",
    "transferencia",
    "transfer_cucuta",
    "efectivo_real",
    "efectivo_cucuta",
    "promedio;",
    "promedio_real",
    "cencoex",
    "sicad1",
    "sicad2",
    "bitcoin_ref",
    "localbitcoin_ref",
    "dolartoday"
})
@Setter
@Getter
@NoArgsConstructor
public class DolartodayValue {

    @JsonProperty("dateTime")
    private LocalDateTime dateTime;
    @JsonProperty("instrumentDescriptor")
    private String instrumentDescriptor;
    @JsonProperty("transferencia")
    private Double transferencia;
    @JsonProperty("transfer_cucuta")
    private Double transferCucuta;
    @JsonProperty("efectivo")
    private Double efectivo;
    @JsonProperty("efectivo_real")
    private Double efectivoReal;
    @JsonProperty("efectivo_cucuta")
    private Double efectivoCucuta;
    @JsonProperty("promedio")
    private Double promedio;
    @JsonProperty("promedio_real")
    private Double promedioReal;
    @JsonProperty("cencoex")
    private Double cencoex;
    @JsonProperty("sicad1")
    private Double sicad1;
    @JsonProperty("sicad2")
    private Double sicad2;
    @JsonProperty("bitcoin_ref")
    private Double bitcoinRef;
    @JsonProperty("localbitcoin_ref")
    private Double localbitcoinRef;
    @JsonProperty("dolartoday")
    private Double dolartoday;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
