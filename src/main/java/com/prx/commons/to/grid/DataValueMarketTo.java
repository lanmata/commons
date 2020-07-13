package com.prx.commons.to.grid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.DataValueMarket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "market",
        "instrument"
})
public class DataValueMarketTo extends DataValueMarket {
    @JsonProperty("market")
    private String market;
    @JsonProperty("instrument")
    private String instrument;

    public String toString(){
        return toJson(this);
    }
}
