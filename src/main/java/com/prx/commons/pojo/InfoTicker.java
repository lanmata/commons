package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.enums.keys.ParityKey;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InfoTicker extends DataValueMarket implements Serializable {

    private Double low;
    private Double high;
    private Double open;
    private Double close;
    private ParityKey parityKey;

    @Override
    public String toString() {
        return toJson(this);
    }

}
