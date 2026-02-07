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

package com.umdev.commons.general.pojo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

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
     *   <li>{@link Role#setId(UUID)}
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
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        Role actualRole = new Role();
        actualRole.setActive(true);
        actualRole.setDescription("The characteristics of someone or something");
        ArrayList<Feature> features = new ArrayList<>();
        actualRole.setFeatures(features);
        actualRole.setId(uuid);
        actualRole.setName("Name");
        assertTrue(actualRole.getActive());
        assertEquals("The characteristics of someone or something", actualRole.getDescription());
        assertSame(features, actualRole.getFeatures());
        assertEquals(uuid, actualRole.getId());
        assertEquals("Name", actualRole.getName());
    }

    @Test
    void testGettersAndSetters() {
        var role = new Role();
        var features = new ArrayList<Feature>();
        var feature = new Feature();
        var uuid = UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b");

        feature.setId(UUID.randomUUID());
        feature.setName("Feature");
        feature.setDescription("Feature description");
        feature.setActive(true);
        features.add(feature);
        role.setId(uuid);
        role.setName("Role");
        role.setDescription("Role description");
        role.setFeatures(features);
        role.setActive(true);
        assertAll("Getters And Setters",
                () -> assertNotNull(role.getId()),
                () -> assertNotNull(role.getName()),
                () -> assertNotNull(role.getActive()),
                () -> assertNotNull(role.getDescription()),
                () -> assertNotNull(role.getFeatures()),
                () -> assertNotNull(role.toString()),
                () -> assertNotEquals(1, role.hashCode()),
                () -> assertNotEquals(new Role(), role)
        );
    }

}
