package com.prx.commons.to.messenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.User;
import com.prx.commons.to.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
@JsonPropertyOrder({
        "message",
        "listDestiny",
        "isCritical"
})
public class NotifyMessageRequest extends Request {
    @JsonProperty("message")
    private String message;
    @JsonProperty("listDestiny")
    private List<String> listDestiny;
    @JsonProperty("isCritical")
    private Boolean critical;

    @Override
    public String toString() {
        return toJson(this);
    }
}
