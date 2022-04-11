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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        final var roles = new ArrayList<Role>();
        final var rol = new Role();
        var features = new ArrayList<Feature>();
        var feature =  new Feature();

        feature.setId(1L);
        feature.setName("Feature");
        feature.setDescription("Descripción de feature");
        feature.setActive(true);
        features.add(feature);
        rol.setId(1L);
        rol.setName("Rol");
        rol.setDescription("Descripción de rol");
        rol.setFeatures(features);
        rol.setActive(true);

        roles.add(rol);
        user.setActive(true);
        user.setAlias("Alias de usuario");
        user.setId(1L);
        user.setPerson(new Person());
        user.setPassword("WERtyuik4567890");
        user.setRoles(roles);

        assertAll("Getters And Setters",
            () -> assertNotNull(user.getId()),
            () -> assertNotNull(user.getAlias()),
            () -> assertNotNull(user.getPassword()),
            () -> assertNotNull(user.getPerson()),
            () -> assertNotNull(user.getRoles()),
            () -> assertTrue(user.isActive()),
            () -> assertNotNull(user.toString()),
            () -> assertNotEquals(1, user.hashCode()),
            () -> assertNotEquals(new User(), user)
                 );
    }
}
