package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class AuthKeyTest {

    @Test
    @DisplayName("AuthKey contains expected enum values")
    void keys() {
        for (final var authKey : AuthKey.values()) {
            Assertions.assertTrue(Arrays.asList(AuthKey.values()).contains(authKey));
        }
    }
}
