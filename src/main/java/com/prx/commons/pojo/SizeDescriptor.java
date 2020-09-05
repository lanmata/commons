package com.prx.commons.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.enums.keys.SizeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SizeDescriptor {
    private SizeKey sizeKey;
    private double size;

    public String toString(){
        return toJson(this);
    }
}
