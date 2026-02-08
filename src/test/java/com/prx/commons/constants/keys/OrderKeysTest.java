package com.prx.commons.constants.keys;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
/**
 * Unit tests for {@link OrderKeys}.
 */
class OrderKeysTest {

    @Test
    @DisplayName("Each OrderKeys enum value returns its name as key")
    void testKeyMethod() {
        for (OrderKeys key : OrderKeys.values()) {
            assertEquals(key.name(), key.key());
        }
    }

    @Test
    @DisplayName("Enum values are present and non-null")
    void testEnumValues() {
        assertNotNull(OrderKeys.ORDER_PLACED);
        assertNotNull(OrderKeys.ORDER_CANCELLED);
        assertNotNull(OrderKeys.ORDER_COMPLETED);
        assertNotNull(OrderKeys.ORDER_NOT_FOUND);
    }

    @Test
    @DisplayName("OrderKeys contain expected entries")
    void values() {
        assertTrue(OrderKeys.values().length > 0);
    }

}
