package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link UserKeys}.
 */
class UserKeysTest {

    @Test
    void testKeyMethod() {
        for (UserKeys key : UserKeys.values()) {
            assertEquals(key.name(), key.key());
        }
    }

    @Test
    void testEnumValues() {
        assertNotNull(UserKeys.USER_CREATED);
        assertNotNull(UserKeys.USER_UPDATED);
        assertNotNull(UserKeys.USER_DELETED);
        assertNotNull(UserKeys.USER_NOT_FOUND);
    }
}
