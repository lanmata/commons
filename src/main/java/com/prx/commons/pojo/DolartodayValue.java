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

import java.time.LocalDateTime;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({"dateTime", "instrumentDescriptor", "transferencia",
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
public class DolartodayValue {

    private LocalDateTime dateTime;
    private String instrumentDescriptor;
    private Double transferencia;
    @JsonProperty("transfer_cucuta")
    private Double transferCucuta;
    private Double efectivo;
    @JsonProperty("efectivo_real")
    private Double efectivoReal;
    @JsonProperty("efectivo_cucuta")
    private Double efectivoCucuta;
    private Double promedio;
    @JsonProperty("promedio_real")
    private Double promedioReal;
    private Double cencoex;
    private Double sicad1;
    private Double sicad2;
    @JsonProperty("bitcoin_ref")
    private Double bitcoinRef;
    @JsonProperty("localbitcoin_ref")
    private Double localbitcoinRef;
    private Double dolartoday;

    /**
     * Default constructor.
     */
    public DolartodayValue() {
        //Default constructor.
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public String getInstrumentDescriptor() {
        return this.instrumentDescriptor;
    }

    public Double getTransferencia() {
        return this.transferencia;
    }

    public Double getTransferCucuta() {
        return this.transferCucuta;
    }

    public Double getEfectivo() {
        return this.efectivo;
    }

    public Double getEfectivoReal() {
        return this.efectivoReal;
    }

    public Double getEfectivoCucuta() {
        return this.efectivoCucuta;
    }

    public Double getPromedio() {
        return this.promedio;
    }

    public Double getPromedioReal() {
        return this.promedioReal;
    }

    public Double getCencoex() {
        return this.cencoex;
    }

    public Double getSicad1() {
        return this.sicad1;
    }

    public Double getSicad2() {
        return this.sicad2;
    }

    public Double getBitcoinRef() {
        return this.bitcoinRef;
    }

    public Double getLocalbitcoinRef() {
        return this.localbitcoinRef;
    }

    public Double getDolartoday() {
        return this.dolartoday;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setInstrumentDescriptor(String instrumentDescriptor) {
        this.instrumentDescriptor = instrumentDescriptor;
    }

    public void setTransferencia(Double transferencia) {
        this.transferencia = transferencia;
    }

    @JsonProperty("transfer_cucuta")
    public void setTransferCucuta(Double transferCucuta) {
        this.transferCucuta = transferCucuta;
    }

    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
    }

    @JsonProperty("efectivo_real")
    public void setEfectivoReal(Double efectivoReal) {
        this.efectivoReal = efectivoReal;
    }

    @JsonProperty("efectivo_cucuta")
    public void setEfectivoCucuta(Double efectivoCucuta) {
        this.efectivoCucuta = efectivoCucuta;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @JsonProperty("promedio_real")
    public void setPromedioReal(Double promedioReal) {
        this.promedioReal = promedioReal;
    }

    public void setCencoex(Double cencoex) {
        this.cencoex = cencoex;
    }

    public void setSicad1(Double sicad1) {
        this.sicad1 = sicad1;
    }

    public void setSicad2(Double sicad2) {
        this.sicad2 = sicad2;
    }

    @JsonProperty("bitcoin_ref")
    public void setBitcoinRef(Double bitcoinRef) {
        this.bitcoinRef = bitcoinRef;
    }

    @JsonProperty("localbitcoin_ref")
    public void setLocalbitcoinRef(Double localbitcoinRef) {
        this.localbitcoinRef = localbitcoinRef;
    }

    public void setDolartoday(Double dolartoday) {
        this.dolartoday = dolartoday;
    }

    @Override
    public String toString() {
        return "DolartodayValue{" +
                "dateTime=" + dateTime +
                ", instrumentDescriptor='" + instrumentDescriptor + '\'' +
                ", transferencia=" + transferencia +
                ", transferCucuta=" + transferCucuta +
                ", efectivo=" + efectivo +
                ", efectivoReal=" + efectivoReal +
                ", efectivoCucuta=" + efectivoCucuta +
                ", promedio=" + promedio +
                ", promedioReal=" + promedioReal +
                ", cencoex=" + cencoex +
                ", sicad1=" + sicad1 +
                ", sicad2=" + sicad2 +
                ", bitcoinRef=" + bitcoinRef +
                ", localbitcoinRef=" + localbitcoinRef +
                ", dolartoday=" + dolartoday +
                '}';
    }
}
