package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataValueMarket implements Serializable {

    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("last")
    private Double last;
    @JsonProperty("low")
    private Double low;
    @JsonProperty("high")
    private Double high;
    @JsonProperty("open")
    private Double open;
    @JsonProperty("close")
    private Double close;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("instrumentId")
    private Long instrumentId;
    @JsonProperty("market")
    private Long marketId;

    @Override
    public String toString() {
        return toJson(this);
    }

}

