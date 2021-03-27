/*
 * @(#)RolTest.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */

package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * RolTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 31-01-2021
 */
class RolTest {

    @Test
    void testGettersAndSetters(){
        var rol = new Rol();
        var features = new ArrayList<Feature>();
        var feature =  new Feature();

        feature.setId(1L);
        feature.setName("Feature");
        feature.setDescription("Descripción de feature");
        feature.setActive(true);
        features.add(feature);
        rol.setId(1);
        rol.setName("Rol");
        rol.setDescription("Descripción de rol");
        rol.setFeatures(features);
        rol.setActive(true);
        assertAll("Getters And Setters",
            () -> assertNotNull(rol.getId()),
            () -> assertNotNull(rol.getName()),
            () -> assertNotNull(rol.getActive()),
            () -> assertNotNull(rol.getDescription()),
            () -> assertNotNull(rol.getFeatures()),
            () -> assertNotNull(rol.toString()),
            () -> assertNotEquals(1, rol.hashCode()),
            () -> assertNotEquals(new Rol(), rol)
        );
    }

}