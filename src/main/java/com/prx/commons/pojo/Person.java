/*
 *  @(#)Person.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.commons.pojo;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@Getter
@Setter
@JsonNaming
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
    private LocalDate birthdate;
    private List<Contact> contactList;
    private List<User> userList;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }

}
