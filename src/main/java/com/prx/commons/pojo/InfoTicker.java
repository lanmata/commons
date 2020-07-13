package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.enums.keys.ParityKey;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "low",
    "high",
    "open",
    "close",
    "parityKey"
})
@Data
public class InfoTicker extends DataValueMarket implements Serializable {

    @JsonProperty("low")
    private Double low;
    @JsonProperty("high")
    private Double high;
    @JsonProperty("open")
    private Double open;
    @JsonProperty("close")
    private Double close;
    @JsonProperty("parityKey")
    private ParityKey parityKey;

    @Override
    public String toString() {
        return toJson(this);
    }

}
