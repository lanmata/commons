package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@JsonPropertyOrder({
        "exchangeId",
        "instrumentId",
        "active",
        "identifier"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeInstrument {
    @JsonProperty("exchange")
    private Exchange exchange;
    @JsonProperty("instrument")
    private Instrument instrument;
    @JsonProperty("activeId")
    private Boolean active;
    @JsonProperty("identifier")
    private String identifier;

    public String toString(){
        return toJson(this);
    }

}
