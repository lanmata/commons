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
    "id",
    "name",
    "description",
    "coinSource",
    "coinTarget",
    "active"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instrument implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("coinSource")
    private LocalCoin coinSource;
    @JsonProperty("coinTarget")
    private LocalCoin coinTarget;
    @JsonProperty("active")
    private Boolean active;

    @Override
    public String toString() {
        return toJson(this);
    }
}
