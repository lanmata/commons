package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
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
@Data
@AllArgsConstructor
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
        return toJson(this);
    }
}
