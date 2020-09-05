package com.prx.commons.to.grid;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.pojo.DataValueMarket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DataValueMarketTo extends DataValueMarket {
    private String market;
    private String instrument;

    public String toString(){
        return toJson(this);
    }
}
