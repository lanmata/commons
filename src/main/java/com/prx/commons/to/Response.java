package com.prx.commons.to;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Response {

    private String dateTime;
    private Integer code;
    private String message;

    @Override
    public String toString() {
        return toJson(this);
    }
}
