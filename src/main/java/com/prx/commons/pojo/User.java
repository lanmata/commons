package com.prx.commons.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User implements Serializable {

    private Long id;
    private String alias;
    private String password;
    private Boolean active;
    private Person person;

    @Override
    public String toString() {
        return toJson(this);
    }
}
