package com.prx.commons.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilExtraTest {

    @Test
    @DisplayName("Utility class FileUtil should not be instantiable")
    void constructorThrows() throws Exception {
        final var constructor = FileUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThrows(Exception.class, constructor::newInstance);
    }
}

