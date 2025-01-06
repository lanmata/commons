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

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.prx.commons.constants.keys.SizeKey;
import org.junit.jupiter.api.Test;

/**
 * FileDescriptorTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class FileDescriptorTest {

    @Test
    void gettersAndSetters() {
        final var fileDescriptor = new FileDescriptor();

        fileDescriptor.setName("Nombre");
        fileDescriptor.setPath("Ruta");
        fileDescriptor.setSizeDescriptor(new SizeDescriptor());
        fileDescriptor.setType("LS");

        assertAll("Test Getters And Setters",
                () -> assertNotNull(fileDescriptor.getName()),
                () -> assertNotNull(fileDescriptor.getPath()),
                () -> assertNotNull(fileDescriptor.getSizeDescriptor()),
                () -> assertNotNull(fileDescriptor.getType()),
                () -> assertNotNull(fileDescriptor.toString()),
                () -> assertNotEquals(1, fileDescriptor.hashCode()),
                () -> assertNotEquals(new FileDescriptor(), fileDescriptor)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link FileDescriptor}
     *   <li>{@link FileDescriptor#setName(String)}
     *   <li>{@link FileDescriptor#setPath(String)}
     *   <li>{@link FileDescriptor#setSizeDescriptor(SizeDescriptor)}
     *   <li>{@link FileDescriptor#setType(String)}
     *   <li>{@link FileDescriptor#toString()}
     *   <li>{@link FileDescriptor#getName()}
     *   <li>{@link FileDescriptor#getPath()}
     *   <li>{@link FileDescriptor#getSizeDescriptor()}
     *   <li>{@link FileDescriptor#getType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        FileDescriptor actualFileDescriptor = new FileDescriptor();
        actualFileDescriptor.setName("Name");
        actualFileDescriptor.setPath("Path");
        SizeDescriptor sizeDescriptor = new SizeDescriptor(SizeKey.BYTES, 10.0d);

        actualFileDescriptor.setSizeDescriptor(sizeDescriptor);
        actualFileDescriptor.setType("Type");
        assertEquals("Name", actualFileDescriptor.getName());
        assertEquals("Path", actualFileDescriptor.getPath());
        assertSame(sizeDescriptor, actualFileDescriptor.getSizeDescriptor());
        assertEquals("Type", actualFileDescriptor.getType());
    }

}
