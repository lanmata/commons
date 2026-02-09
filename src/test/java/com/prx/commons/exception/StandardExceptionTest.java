package com.prx.commons.exception;

import com.prx.commons.constants.httpstatus.type.MessageType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class StandardExceptionTest {

    @Test
    @DisplayName("Constructor sets default app when MessageType is null")
    void constructorWithNullMessageType() {
        StandardException exception = new StandardException(null);
        assertNull(exception.getStatus());
        assertEquals("NO-DEF", exception.getApp());
    }

    @Test
    @DisplayName("Constructor preserves cause when MessageType and throwable provided")
    void constructorWithMessageTypeAndThrowable() {
        MessageType messageType = MessageType.DEFAULT_MESSAGE;
        Throwable throwable = new Throwable();
        StandardException exception = new StandardException(messageType, throwable);
        assertEquals(throwable, exception.getCause());
    }

    @Test
    @DisplayName("Constructor sets app and cause when app, MessageType and throwable provided")
    void constructorWithAppMessageTypeAndThrowable() {
        MessageType messageType = MessageType.DEFAULT_MESSAGE;
        Throwable throwable = new Throwable();
        StandardException exception = new StandardException("App", messageType, throwable);
        assertEquals("App", exception.getApp());
        assertEquals(throwable, exception.getCause());
    }

    @Test
    @DisplayName("getCode returns the correct code from MessageType")
    void getCodeReturnsCorrectCode() {
        MessageType messageType = MessageType.DEFAULT_MESSAGE;
        // no-op
        StandardException exception = new StandardException(messageType);
        assertEquals(0, exception.getCode());
    }

    @Test
    @DisplayName("getStatus returns an empty status string when no status set")
    void getStatusReturnsCorrectStatus() {
        MessageType messageType = MessageType.DEFAULT_MESSAGE;
        StandardException exception = new StandardException(messageType);
        assertTrue(exception.getStatus().getStatus().isEmpty());
    }

    @Test
    @DisplayName("getApp returns the provided app string")
    void getAppReturnsCorrectApp() {
        StandardException exception = new StandardException("App", null);
        assertEquals("App", exception.getApp());
    }

    @Test
    @DisplayName("StandardException returns correct code and app id")
    void testGetters() {
        StandardException ex = new StandardException("APP", MessageType.DEFAULT_MESSAGE, new RuntimeException());
        assertEquals(MessageType.DEFAULT_MESSAGE.getCode(), ex.getCode());
        assertEquals("APP", ex.getApp());
    }
}
