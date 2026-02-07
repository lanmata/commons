package com.prx.commons.util;

import com.prx.commons.constants.httpstatus.type.MessageType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HttpStatusUtil unit tests")
class HttpStatusUtilTest {

    @Test
    @DisplayName("Private constructor should throw InvocationTargetException when invoked reflectively")
    void constructorThrowsInvocationTargetException() throws NoSuchMethodException {
        final var constructor = HttpStatusUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    @Test
    @DisplayName("All public int constants should map to a MessageType with matching code and non-empty status")
    void allIntConstantsMapToMessageType() throws IllegalAccessException, NoSuchFieldException {
        final Field[] fields = HttpStatusUtil.class.getFields();
        int checked = 0;
        for (Field f : fields) {
            if (Modifier.isStatic(f.getModifiers()) && f.getType().equals(int.class)) {
                final int value = f.getInt(null);
                final MessageType mt = HttpStatusUtil.getMessageType(value);
                assertNotNull(mt, () -> "MessageType must not be null for code: " + value);
                assertEquals(value, mt.getCode(), () -> "MessageType code must match constant value for " + f.getName());
                assertNotNull(mt.getStatus(), "Status must not be null for code: " + value);
                assertFalse(mt.getStatus().isEmpty(), "Status must not be empty for code: " + value);

                // Check corresponding string constant if present
                try {
                    final Field s = HttpStatusUtil.class.getField(f.getName() + "_STR");
                    final Object sVal = s.get(null);
                    assertEquals(String.valueOf(value), sVal,
                            () -> "String constant " + s.getName() + " must equal String.valueOf(" + value + ")");
                } catch (NoSuchFieldException noSuchFieldException) {
                    // Not all int constants may have a *_STR companion; that's acceptable.
                    throw noSuchFieldException;
                }
                checked++;
            }
        }
        assertTrue(checked > 0, "There should be at least one public int constant to verify");
    }

    @Test
    @DisplayName("Unknown and out-of-range codes should return the DEFAULT_MESSAGE")
    void unknownCodesReturnDefaultMessage() {
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(-1), "Negative codes should map to DEFAULT_MESSAGE");
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(600), "Codes above known ranges should map to DEFAULT_MESSAGE");
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(199), "Unmapped boundary code should map to DEFAULT_MESSAGE");
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(299), "Unmapped boundary code should map to DEFAULT_MESSAGE");
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(399), "Unmapped boundary code should map to DEFAULT_MESSAGE");
        assertSame(MessageType.DEFAULT_MESSAGE, HttpStatusUtil.getMessageType(499), "Unmapped boundary code should map to DEFAULT_MESSAGE");
    }

    @Test
    @DisplayName("Specific sanity checks for representative codes across categories")
    void representativeCodesMapCorrectly() {
        MessageType mt100 = HttpStatusUtil.getMessageType(HttpStatusUtil.CONTINUE);
        assertEquals(HttpStatusUtil.CONTINUE, mt100.getCode());

        MessageType mt200 = HttpStatusUtil.getMessageType(HttpStatusUtil.OK);
        assertEquals(HttpStatusUtil.OK, mt200.getCode());

        MessageType mt300 = HttpStatusUtil.getMessageType(HttpStatusUtil.MULTIPLE_CHOICES);
        assertEquals(HttpStatusUtil.MULTIPLE_CHOICES, mt300.getCode());

        MessageType mt400 = HttpStatusUtil.getMessageType(HttpStatusUtil.BAD_REQUEST);
        assertEquals(HttpStatusUtil.BAD_REQUEST, mt400.getCode());

        MessageType mt500 = HttpStatusUtil.getMessageType(HttpStatusUtil.INTERNAL_SERVER_ERROR);
        assertEquals(HttpStatusUtil.INTERNAL_SERVER_ERROR, mt500.getCode());
    }
}
