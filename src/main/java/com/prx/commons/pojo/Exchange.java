package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class Exchange implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("headquarters")
    private String headquarters;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("instruments")
    private List<Instrument> instruments;

    @Override
    public String toString() {
        return toJson(this);
    }
}
