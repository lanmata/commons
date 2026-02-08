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
package com.prx.commons.io.pojo;

import com.prx.commons.constants.keys.SizeKey;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * SizeDescriptorTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class SizeDescriptorTest {

    @Test
    @DisplayName("Getters and setters validate state and toString/hashCode behavior")
    void gettersAndSetters() {
        final var sizeDescriptor = new SizeDescriptor();

        sizeDescriptor.setSize(14);
        sizeDescriptor.setSizeKey(SizeKey.EXABYTES);

        assertAll("Test Getters And Setters",
                () -> assertNotEquals(1, sizeDescriptor.getSize()),
                () -> assertNotNull(sizeDescriptor.getSizeKey()),
                () -> assertNotNull(sizeDescriptor.toString()),
                () -> assertNotEquals(1, sizeDescriptor.hashCode()),
                () -> assertNotEquals(new SizeDescriptor(), sizeDescriptor)
        );
    }

    @Test
    @DisplayName("Default constructor sets size and sizeKey appropriately")
    void testConstructor() {
        SizeDescriptor actualSizeDescriptor = new SizeDescriptor();
        actualSizeDescriptor.setSize(10.0d);
        actualSizeDescriptor.setSizeKey(SizeKey.BYTES);
        String actualToStringResult = actualSizeDescriptor.toString();
        assertEquals(10.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, actualSizeDescriptor.getSizeKey());
        assertEquals("SizeDescriptor{sizeKey=b, size=10.0}", actualToStringResult);
    }

    @Test
    @DisplayName("Parameterized constructor preserves values and toString format")
    void testConstructor2() {
        SizeDescriptor actualSizeDescriptor = new SizeDescriptor(SizeKey.BYTES, 10.0d);
        actualSizeDescriptor.setSize(10.0d);
        actualSizeDescriptor.setSizeKey(SizeKey.BYTES);
        String actualToStringResult = actualSizeDescriptor.toString();
        assertEquals(10.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, actualSizeDescriptor.getSizeKey());
        assertEquals("SizeDescriptor{sizeKey=b, size=10.0}", actualToStringResult);
    }

}
