package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.enums.keys.SizeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "sizeKey",
        "size"
})
public class SizeDescriptor {
    @JsonProperty("sizeKey")
    private SizeKey sizeKey;
    @JsonProperty("size")
    private double size;

    public String toString(){
        return toJson(this);
    }
}
