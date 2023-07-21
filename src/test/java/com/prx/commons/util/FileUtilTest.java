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
package com.prx.commons.util;

import com.prx.commons.enums.keys.SizeKey;
import com.prx.commons.pojo.SizeDescriptor;

import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * FileUtilTest.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.0, 14-10-2020
 */
class FileUtilTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = FileUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    @Test
    void getSizeDescriptor() {
        assertNotNull(FileUtil.getSizeDescriptor(2, 1024L));
        assertNotNull(FileUtil.getSizeDescriptor(7, 102400L));
    }

    /**
     * Method under test: {@link FileUtil#getSizeDescriptor(int, long)}
     */
    @Test
    void testGetSizeDescriptor() {
        SizeDescriptor actualSizeDescriptor = FileUtil.getSizeDescriptor(3, 3L);
        assertEquals(3.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.GIGABYTES, actualSizeDescriptor.getSizeKey());
    }

    /**
     * Method under test: {@link FileUtil#getSizeDescriptor(int, long)}
     */
    @Test
    void testGetSizeDescriptor2() {
        SizeDescriptor actualSizeDescriptor = FileUtil.getSizeDescriptor(1, 1L);
        assertEquals(1.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.KILOBYTES, actualSizeDescriptor.getSizeKey());
    }

    /**
     * Method under test: {@link FileUtil#getSizeDescriptor(int, long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSizeDescriptor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 1024 out of bounds for length 9
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:46)
        //   See https://diff.blue/R013 to resolve this issue.

        FileUtil.getSizeDescriptor(1024, 3L);
    }

    /**
     * Method under test: {@link FileUtil#getSizeDescriptor(int, long)}
     */
    @Test
    void testGetSizeDescriptor4() {
        SizeDescriptor actualSizeDescriptor = FileUtil.getSizeDescriptor(3, Long.MAX_VALUE);
        assertEquals(8191.0d, actualSizeDescriptor.getSize());
        assertEquals(SizeKey.YOTABYTES, actualSizeDescriptor.getSizeKey());
    }

    /**
     * Method under test: {@link FileUtil#getSizeDescriptor(int, long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSizeDescriptor5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 1029 out of bounds for length 9
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:46)
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:44)
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:44)
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:44)
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:44)
        //       at com.prx.commons.util.FileUtil.getSizeDescriptor(FileUtil.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        FileUtil.getSizeDescriptor(1024, Long.MAX_VALUE);
    }

}
