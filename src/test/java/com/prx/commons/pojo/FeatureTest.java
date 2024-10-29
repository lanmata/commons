/*
 * @(#)FeatureTest.java
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
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * FeatureTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 31-01-2021
 */
class FeatureTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Feature}
     *   <li>{@link Feature#setActive(Boolean)}
     *   <li>{@link Feature#setDescription(String)}
     *   <li>{@link Feature#setId(String)}
     *   <li>{@link Feature#setName(String)}
     *   <li>{@link Feature#toString()}
     *   <li>{@link Feature#getActive()}
     *   <li>{@link Feature#getDescription()}
     *   <li>{@link Feature#getId()}
     *   <li>{@link Feature#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Feature actualFeature = new Feature();
        actualFeature.setActive(true);
        actualFeature.setDescription("The characteristics of someone or something");
        actualFeature.setId("42");
        actualFeature.setName("Name");
        String actualToStringResult = actualFeature.toString();
        assertTrue(actualFeature.getActive());
        assertEquals("The characteristics of someone or something", actualFeature.getDescription());
        assertEquals("42", actualFeature.getId());
        assertEquals("Name", actualFeature.getName());
        assertEquals(
                "Feature{id='42', name='Name', description='The characteristics of someone or something'," + " active=true}",
                actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        var feature = new Feature();

        feature.setId("7cde528b-3f13-4d0d-8573-d22996b17d3b");
        feature.setName("Feature");
        feature.setDescription("Descripción de feature");
        feature.setActive(true);
        assertAll("Getters And Setters",
                () -> assertNotNull(feature.getId()),
                () -> assertNotNull(feature.getName()),
                () -> assertNotNull(feature.getActive()),
                () -> assertNotNull(feature.getDescription()),
                () -> assertNotNull(feature.toString()),
                () -> assertNotEquals(1, feature.hashCode()),
                () -> assertNotEquals(new Feature(), feature)
        );
    }
}
