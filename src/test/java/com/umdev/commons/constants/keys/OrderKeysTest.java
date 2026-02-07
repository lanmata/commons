package com.umdev.commons.constants.keys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link OrderKeys}.
 */
class OrderKeysTest {

    @Test
    void testKeyMethod() {
        for (OrderKeys key : OrderKeys.values()) {
            assertEquals(key.name(), key.key());
        }
    }

    @Test
    void testEnumValues() {
        assertNotNull(OrderKeys.ORDER_PLACED);
        assertNotNull(OrderKeys.ORDER_CANCELLED);
        assertNotNull(OrderKeys.ORDER_COMPLETED);
        assertNotNull(OrderKeys.ORDER_NOT_FOUND);
    }
}
