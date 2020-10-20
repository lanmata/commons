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

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * FileDescriptorTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class FileDescriptorTest {

    @Test
    void gettersAndSetters(){
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

}