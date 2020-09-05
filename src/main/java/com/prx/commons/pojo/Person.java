package com.prx.commons.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

    private Long id;
    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;
    @Size(min = 2, max = 20)
    private String middleName;
    @Size(min = 2, max = 20)
    private String lastName;
    private String gender;
    private String birthdate;
    private List<Contact> contactList;


    @Override
    public String toString() {
        return toJson(this);
    }

}
