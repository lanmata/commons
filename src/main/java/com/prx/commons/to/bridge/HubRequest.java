package com.prx.commons.to.bridge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.DataValueMarket;
import com.prx.commons.to.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "dataValueMarkets"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HubRequest extends Request {

    @JsonProperty("dataValueMarkets")
    private List<DataValueMarket> dataValueMarkets;

    @Override
    public String toString() {
        return String.format("%s{%s, dataValueMarkets:%s}", this.getClass().getSimpleName(), super.toString(), dataValueMarkets.toString());
    }

}
