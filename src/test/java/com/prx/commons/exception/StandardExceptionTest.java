/*
 * @(#)StandarExceptionTest.java
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

package com.prx.commons.exception;

import com.prx.commons.enums.keys.FailCode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Excepci&oacute;n de uso est&aacute;ndar para la propagaci&oacute;n de fallos generados durante la ejecuci&oacute;n de
 * los procesos.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
class StandardExceptionTest {

    @Test
    void testStandarException(){
        assertThrows(StandardException.class, () -> {throw new StandardException(FailCode.FORBIDDEN);});
    }

    @Test
    void testStandaloneException2(){
        assertThrows(StandardException.class, () -> {throw new StandardException("Commons", FailCode.FORBIDDEN);});
    }

    @Test
    void testGetters(){
        final var standarException = new StandardException(FailCode.UNAUTHORIZED);
        assertNotNull(standarException.getApp());
        assertNotEquals(-1, standarException.getCode());
        assertNotNull(standarException.getStatus());
    }
}