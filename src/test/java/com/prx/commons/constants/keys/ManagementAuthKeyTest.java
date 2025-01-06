package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ManagementAuthKeyTest {

    @Test
    void keys() {
        for (final var managementAuthKey : ManagementAuthKey.values()) {
            Assertions.assertTrue(Arrays.asList(ManagementAuthKey.values()).contains(managementAuthKey));
        }
    }

}
