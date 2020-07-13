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
    "code",
    "message"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;

    @Override
    public String toString() {
        return toJson(this);
    }
}
