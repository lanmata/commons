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
import com.prx.commons.enums.types.MessageType;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

/**
 * Excepci&oacute;n de uso est&aacute;ndar para la propagaci&oacute;n de fallos generados durante la ejecuci&oacute;n de
 * los procesos.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
class StandardExceptionTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link StandardException#StandardException(MessageType)}
     *   <li>{@link StandardException#getApp()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals("NO-DEF", (new StandardException(null)).getApp());
        assertEquals("App", (new StandardException("App", null)).getApp());
    }

    /**
     * Method under test: {@link StandardException#StandardException(MessageType, Throwable)}
     */
    @Test
    void testConstructor2() {
        MessageType messageType = mock(MessageType.class);
        StandardException actualStandardException = new StandardException(messageType, new Throwable());

        assertEquals("NO-DEF", actualStandardException.getApp());
        assertNull(actualStandardException.getStatus());
    }

    /**
     * Method under test: {@link StandardException#StandardException(String, MessageType, Throwable)}
     */
    @Test
    void testConstructor3() {
        MessageType messageType = mock(MessageType.class);
        StandardException actualStandardException = new StandardException("App", messageType, new Throwable());

        assertEquals("App", actualStandardException.getApp());
        assertNull(actualStandardException.getStatus());
    }

    /**
     * Method under test: {@link StandardException#getCode()}
     */
    @Test
    void testGetCode() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getCode()).thenReturn(1);
        assertEquals(1, (new StandardException(messageType)).getCode());
        verify(messageType).getCode();
    }

    /**
     * Method under test: {@link StandardException#getCode()}
     */
    @Test
    void testGetCode2() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getCode()).thenThrow(new StandardException(mock(MessageType.class)));
        assertThrows(StandardException.class, () -> (new StandardException(messageType, new Throwable())).getCode());
        verify(messageType).getCode();
    }

    /**
     * Method under test: {@link StandardException#getStatus()}
     */
    @Test
    void testGetStatus() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getStatus()).thenReturn("Status");
        assertEquals("Status", (new StandardException(messageType)).getStatus());
        verify(messageType).getStatus();
    }

    /**
     * Method under test: {@link StandardException#getStatus()}
     */
    @Test
    void testGetStatus2() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getStatus()).thenThrow(new StandardException(mock(MessageType.class)));
        assertThrows(StandardException.class, () -> (new StandardException(messageType, new Throwable())).getStatus());
        verify(messageType).getStatus();
    }

    @Test
    void testStandarException() {
        assertThrows(StandardException.class, () -> {
            throw new StandardException(FailCode.FORBIDDEN);
        });
    }

    @Test
    void testStandaloneException2() {
        assertThrows(StandardException.class, () -> {
            throw new StandardException("Commons", FailCode.FORBIDDEN);
        });
    }

    @Test
    void testStandaloneException3() {
        final var exception = new Exception();
        assertThrows(StandardException.class, () -> {
            throw new StandardException(FailCode.FORBIDDEN, exception);
        });
    }

    @Test
    void testStandaloneException4() {
        final var exception = new Exception();
        assertThrows(StandardException.class, () -> {
            throw new StandardException("Commons", FailCode.FORBIDDEN, exception);
        });
    }

    @Test
    void testGetters() {
        final var standarException = new StandardException(FailCode.UNAUTHORIZED);
        assertNotNull(standarException.getApp());
        assertNotEquals(-1, standarException.getCode());
        assertNotNull(standarException.getStatus());
    }
}
