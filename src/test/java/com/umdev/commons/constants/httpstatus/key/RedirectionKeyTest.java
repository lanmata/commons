package com.umdev.commons.constants.httpstatus.key;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("RedirectionKey enum unit tests")
class RedirectionKeyTest {

    @Test
    @DisplayName("All RedirectionKey values should be present and iterable")
    void valuesPresence() {
        for (RedirectionKey key : RedirectionKey.values()) {
            assertNotNull(key, () -> "RedirectionKey enum value should not be null: " + key);
            assertTrue(Arrays.asList(RedirectionKey.values()).contains(key));
        }
    }

    @Test
    @DisplayName("getCode and getCodeToString should be consistent and getStatus non-empty")
    void codeAndStatusConsistency() {
        for (RedirectionKey key : RedirectionKey.values()) {
            assertEquals(String.valueOf(key.getCode()), key.getCodeToString(),
                    () -> "getCodeToString must equal String.valueOf(getCode()) for " + key.name());
            assertNotNull(key.getStatus(), "Status must not be null");
            assertFalse(key.getStatus().isEmpty(), "Status must not be empty");
        }
    }

    @Test
    @DisplayName("valueOf should return the enum when passed a valid name")
    void valueOfValidName() {
        for (RedirectionKey key : RedirectionKey.values()) {
            assertEquals(key, RedirectionKey.valueOf(key.name()));
        }
    }

    @Test
    @DisplayName("valueOf should throw IllegalArgumentException for an invalid name")
    void valueOfInvalidNameThrows() {
        assertThrows(IllegalArgumentException.class, () -> RedirectionKey.valueOf("NO_SUCH_CONSTANT"));
    }

    @Test
    @DisplayName("valueOf should throw NullPointerException when passed null")
    void valueOfNullThrows() {
        assertThrows(NullPointerException.class, () -> RedirectionKey.valueOf(null));
    }

    @Test
    @DisplayName("ordinals should be contiguous starting from zero")
    void ordinalsContiguous() {
        RedirectionKey[] values = RedirectionKey.values();
        for (int i = 0; i < values.length; i++) {
            assertEquals(i, values[i].ordinal(), "Enum ordinals must be contiguous and start at 0");
        }
    }
}

