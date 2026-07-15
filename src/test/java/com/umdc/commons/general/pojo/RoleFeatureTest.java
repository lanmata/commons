/*
 * @(#)RoleFeatureTest.java
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

package com.umdc.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RoleFeatureTest {

    @Test
    @DisplayName("Test RoleFeature Constructor and Getters")
    void testConstructor() {
        var role = new Role();
        role.setId(UUID.randomUUID());
        role.setName("Role");
        var feature = new Feature();
        feature.setId(UUID.randomUUID());
        feature.setName("Feature");
        RoleFeature actual = new RoleFeature();
        actual.setRole(role);
        actual.setFeature(feature);
        actual.setActive(true);
        assertSame(role, actual.getRole());
        assertSame(feature, actual.getFeature());
        assertTrue(actual.getActive());
    }

    @Test
    @DisplayName("Test RoleFeature Getters and Setters")
    void testGettersAndSetters() {
        var roleFeature = new RoleFeature();
        roleFeature.setRole(new Role());
        roleFeature.setFeature(new Feature());
        roleFeature.setActive(false);
        assertAll("Getters And Setters",
                () -> assertNotNull(roleFeature.getRole()),
                () -> assertNotNull(roleFeature.getFeature()),
                () -> assertNotNull(roleFeature.getActive()),
                () -> assertNotNull(roleFeature.toString()),
                () -> assertNotEquals(1, roleFeature.hashCode()),
                () -> assertNotEquals(new RoleFeature(), roleFeature)
        );
    }
}
