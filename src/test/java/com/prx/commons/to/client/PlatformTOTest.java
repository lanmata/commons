/*
 *  @(#)PlatformTOTest.java
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

package com.prx.commons.to.client;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * PlatformTOTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 29-09-2020
 */
class PlatformTOTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link PlatformTO}
     *   <li>{@link PlatformTO#setStatus(Integer)}
     *   <li>{@link PlatformTO#toString()}
     *   <li>{@link PlatformTO#getStatus()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PlatformTO actualPlatformTO = new PlatformTO();
        actualPlatformTO.setStatus(1);
        String actualToStringResult = actualPlatformTO.toString();
        assertEquals(1, actualPlatformTO.getStatus().intValue());
        assertEquals("PlatformTO{status=1}", actualToStringResult);
    }

    @Test
    void testGettersAndSetters() {
        final var platformTO = new PlatformTO();

        platformTO.setStatus(1);
        assertAll("Test Getters And Setters",
                () -> assertNotNull(platformTO.getStatus()),
                () -> assertNotNull(platformTO.toString()),
                () -> assertNotEquals(1, platformTO.hashCode()),
                () -> assertNotEquals(new PlatformTO(), platformTO)
        );
    }

}
