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
package com.umdev.commons.io.pojo;

import com.umdev.commons.constants.keys.SizeKey;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * SizeDescriptorTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class SizeDescriptorTest {

    @Test
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

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link SizeDescriptor#SizeDescriptor()}
     *   <li>{@link SizeDescriptor#setSize(double)}
     *   <li>{@link SizeDescriptor#setSizeKey(SizeKey)}
     *   <li>{@link SizeDescriptor#toString()}
     *   <li>{@link SizeDescriptor#getSize()}
     *   <li>{@link SizeDescriptor#getSizeKey()}
     * </ul>
     */
    @Test
    void testConstructor() {
        SizeDescriptor actualSizeDescriptor = new SizeDescriptor();
        actualSizeDescriptor.setSize(10.0d);
        actualSizeDescriptor.setSizeKey(SizeKey.BYTES);
        String actualToStringResult = actualSizeDescriptor.toString();
        assertEquals(10.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, actualSizeDescriptor.getSizeKey());
        assertEquals("SizeDescriptor{sizeKey=b, size=10.0}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link SizeDescriptor#SizeDescriptor(SizeKey, double)}
     *   <li>{@link SizeDescriptor#setSize(double)}
     *   <li>{@link SizeDescriptor#setSizeKey(SizeKey)}
     *   <li>{@link SizeDescriptor#toString()}
     *   <li>{@link SizeDescriptor#getSize()}
     *   <li>{@link SizeDescriptor#getSizeKey()}
     * </ul>
     */
    @Test
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
