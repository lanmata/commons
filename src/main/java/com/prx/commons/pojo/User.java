package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
@JsonInclude
@JsonPropertyOrder({
        "id",
        "alias",
        "password",
        "active",
        "person"
})
public class User implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("password")
    private String password;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("person")
    private Person person;

    @Override
    public String toString() {
        return toJson(this);
    }
}
