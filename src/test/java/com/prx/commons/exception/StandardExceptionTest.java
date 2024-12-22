package com.prx.commons.exception;

import com.prx.commons.enums.types.MessageType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StandardExceptionTest {

    @Test
    void constructorWithNullMessageType() {
        StandardException exception = new StandardException(null);
        assertNull(exception.getStatus());
        assertEquals("NO-DEF", exception.getApp());
    }

    @Test
    void constructorWithMessageTypeAndThrowable() {
        MessageType messageType = mock(MessageType.class);
        Throwable throwable = new Throwable();
        StandardException exception = new StandardException(messageType, throwable);
        assertEquals(throwable, exception.getCause());
    }

    @Test
    void constructorWithAppMessageTypeAndThrowable() {
        MessageType messageType = mock(MessageType.class);
        Throwable throwable = new Throwable();
        StandardException exception = new StandardException("App", messageType, throwable);
        assertEquals("App", exception.getApp());
        assertEquals(throwable, exception.getCause());
    }

    @Test
    void getCodeReturnsCorrectCode() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getCode()).thenReturn(123);
        StandardException exception = new StandardException(messageType);
        assertEquals(123, exception.getCode());
    }

    @Test
    void getStatusReturnsCorrectStatus() {
        MessageType messageType = mock(MessageType.class);
        when(messageType.getStatus()).thenReturn("Status");
        StandardException exception = new StandardException(messageType);
        assertEquals("Status", exception.getStatus().getStatus());
    }

    @Test
    void getAppReturnsCorrectApp() {
        StandardException exception = new StandardException("App", null);
        assertEquals("App", exception.getApp());
    }

}
