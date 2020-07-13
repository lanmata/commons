package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "id",
    "firstName",
    "middleName",
    "lastName",
    "gender",
    "birthdate",
    "contactList"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

    @JsonProperty("id")
    private Long id;
    @NotNull
    @Size(min = 2, max = 20)
    @JsonProperty("firstName")
    private String firstName;
    @Size(min = 2, max = 20)
    @JsonProperty("middleName")
    private String middleName;
    @Size(min = 2, max = 20)
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("contactList")
    private List<Contact> contactList;


    @Override
    public String toString() {
        return toJson(this);
    }

}
