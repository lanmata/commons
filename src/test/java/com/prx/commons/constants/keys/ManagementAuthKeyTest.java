package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class ManagementAuthKeyTest {

    @Test
    @DisplayName("ManagementAuthKey enum values are accessible")
    void keys() {
        for (ManagementAuthKey key : ManagementAuthKey.values()) {
            assertNotNull(key.value);
        }
    }
}
