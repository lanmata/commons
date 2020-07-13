package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "alias",
    "name",
    "messengerSeviceId",
    "user"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messenger implements Serializable {

    @JsonProperty("alias")
    private String alias;
    @JsonProperty("name")
    private String name;
    @JsonProperty("messengerServiceId")
    private Integer messengerServiceId;
    @JsonProperty("user")
    private User user;
    
    @Override
    public String toString(){
        return toJson(this);
    }
    
}
