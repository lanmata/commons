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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * RolTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 31-01-2021
 */
class RoleTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Role}
     *   <li>{@link Role#setActive(Boolean)}
     *   <li>{@link Role#setDescription(String)}
     *   <li>{@link Role#setFeatures(List)}
     *   <li>{@link Role#setId(String)}
     *   <li>{@link Role#setName(String)}
     *   <li>{@link Role#toString()}
     *   <li>{@link Role#getActive()}
     *   <li>{@link Role#getDescription()}
     *   <li>{@link Role#getFeatures()}
     *   <li>{@link Role#getId()}
     *   <li>{@link Role#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Role actualRole = new Role();
        actualRole.setActive(true);
        actualRole.setDescription("The characteristics of someone or something");
        ArrayList<Feature> features = new ArrayList<>();
        actualRole.setFeatures(features);
        actualRole.setId("42");
        actualRole.setName("Name");
        String actualToStringResult = actualRole.toString();
        assertTrue(actualRole.getActive());
        assertEquals("The characteristics of someone or something", actualRole.getDescription());
        assertSame(features, actualRole.getFeatures());
        assertEquals("42", actualRole.getId());
        assertEquals("Name", actualRole.getName());
        assertEquals("Role{id='42', name='Name', description='The characteristics of someone or something', features=[],"
                + " active=true}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        var rol = new Role();
        var features = new ArrayList<Feature>();
        var feature = new Feature();

        feature.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        feature.setName("Feature");
        feature.setDescription("Descripción de feature");
        feature.setActive(true);
        features.add(feature);
        rol.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
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
                () -> assertNotEquals(new Role(), rol)
        );
    }

}
