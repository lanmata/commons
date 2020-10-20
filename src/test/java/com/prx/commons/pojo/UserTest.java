/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */
package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * UserTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class UserTest {

    @Test
    void gettersAndSetters(){
        final var user = new User();

        user.setActive(true);
        user.setAlias("Alias de usuario");
        user.setId(1L);
        user.setPerson(new Person());
        user.setPassword("WERtyuik4567890");

        assertAll("Getters And Setters",
            () -> assertNotNull(user.getId()),
            () -> assertNotNull(user.getAlias()),
            () -> assertNotNull(user.getPassword()),
            () -> assertNotNull(user.getPerson()),
            () -> assertTrue(user.isActive()),
            () -> assertNotNull(user.toString()),
            () -> assertNotEquals(1, user.hashCode()),
            () -> assertNotEquals(new User(), user)
                 );
    }
}