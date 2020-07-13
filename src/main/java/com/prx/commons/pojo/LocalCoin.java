package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "id",
    "name",
    "description",
    "currencySource",
    "currencyTarget",
    "active"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalCoin implements Serializable {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("active")
    private Boolean active;

    @Override
    public String toString(){
        return toJson(this);
    }

}
