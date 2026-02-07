package com.umdev.commons.constants.keys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AuthKeyTest {

    @Test
    void keys() {
        for (final var authKey : AuthKey.values()) {
            Assertions.assertTrue(Arrays.asList(AuthKey.values()).contains(authKey));
        }
    }
}
