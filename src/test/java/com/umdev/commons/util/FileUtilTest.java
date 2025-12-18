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
package com.umdev.commons.util;

import com.umdev.commons.constants.keys.SizeKey;
import com.umdev.commons.io.pojo.SizeDescriptor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilTest {

    @Test
    @DisplayName("Get size descriptor for small file size")
    void getSizeDescriptorForSmallFileSize() {
        SizeDescriptor sizeDescriptor = FileUtil.getSizeDescriptor(0, 512L);
        assertEquals(512.0d, sizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, sizeDescriptor.getSizeKey());
    }

    @Test
    @DisplayName("Get size descriptor for large file size")
    void getSizeDescriptorForLargeFileSize() {
        SizeDescriptor sizeDescriptor = FileUtil.getSizeDescriptor(0, 10485760L); // 10 MB
        assertEquals(10.0d, sizeDescriptor.getSize());
        assertEquals(SizeKey.MEGABYTES, sizeDescriptor.getSizeKey());
    }

    @Test
    @DisplayName("Get size descriptor for maximum file size")
    void getSizeDescriptorForMaximumFileSize() {
        SizeDescriptor sizeDescriptor = FileUtil.getSizeDescriptor(0, Long.MAX_VALUE);
        assertEquals(8191.0d, sizeDescriptor.getSize());
        assertEquals(SizeKey.PETABYTES, sizeDescriptor.getSizeKey());
    }

    @Test
    @DisplayName("Get size descriptor for zero file size")
    void getSizeDescriptorForZeroFileSize() {
        SizeDescriptor sizeDescriptor = FileUtil.getSizeDescriptor(0, 0L);
        assertEquals(0.0d, sizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, sizeDescriptor.getSizeKey());
    }

    @Test
    @DisplayName("Get size descriptor for negative file size")
    void getSizeDescriptorForNegativeFileSize() {
        SizeDescriptor sizeDescriptor = FileUtil.getSizeDescriptor(0, -1024L);
        assertEquals(-1024.0d, sizeDescriptor.getSize());
        assertEquals(SizeKey.BYTES, sizeDescriptor.getSizeKey());
    }
}
