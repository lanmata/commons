package com.prx.commons.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SocialContact {

    @Override
    public String toString(){
        return toJson(this);
    }
}
