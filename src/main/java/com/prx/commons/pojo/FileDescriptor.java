package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "name",
        "sizeDescriptor",
        "type",
        "path"
})
public class FileDescriptor {
    @JsonProperty("name")
    private String name;
    @JsonProperty("sizeDescriptor")
    private SizeDescriptor sizeDescriptor;
    @JsonProperty("type")
    private String type;
    @JsonProperty("path")
    private String path;

    public String toString(){
        return toJson(this);
    }
}
