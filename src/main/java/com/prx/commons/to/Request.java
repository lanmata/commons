package com.prx.commons.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "dateTime",
    "appName",
    "appToken"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("appName")
    private String appName;
    @JsonProperty("appToken")
    private String appToken;

    @Override
    public String toString() {
        return toJson(this);
    }
}
