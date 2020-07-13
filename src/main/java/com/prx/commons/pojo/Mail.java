package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis Mata <lmata@netgo.cl>
 */
@JsonPropertyOrder({
    "from",
    "to",
    "subject",
    "content",
    "model"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mail implements Serializable {

    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("content")
    private String content;
    @JsonProperty("model")
    private Map model;

    @Override
    public String toString() {
        return toJson(this);
    }
}
