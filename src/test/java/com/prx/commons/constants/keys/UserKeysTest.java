package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link UserKeys}.
 */
class UserKeysTest {

    @Test
    @DisplayName("Each UserKeys enum value returns its name as key")
    void testKeyMethod() {
        for (UserKeys key : UserKeys.values()) {
            assertEquals(key.name(), key.key());
        }
    }

    @Test
    @DisplayName("Enum values are present and non-null")
    void testEnumValues() {
        assertNotNull(UserKeys.USER_CREATED);
        assertNotNull(UserKeys.USER_UPDATED);
        assertNotNull(UserKeys.USER_DELETED);
        assertNotNull(UserKeys.USER_NOT_FOUND);
    }
}
