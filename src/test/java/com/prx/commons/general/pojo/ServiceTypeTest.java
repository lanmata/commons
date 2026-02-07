package com.prx.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTypeTest {

    @Test
    @DisplayName("Gets and sets ID correctly")
    void getsAndSetsIdCorrectly() {
        ServiceType serviceType = new ServiceType();
        UUID id = UUID.randomUUID();
        serviceType.setId(id);
        assertEquals(id, serviceType.getId());
    }

    @Test
    @DisplayName("Gets and sets name correctly")
    void getsAndSetsNameCorrectly() {
        ServiceType serviceType = new ServiceType();
        String name = "Test Service";
        serviceType.setName(name);
        assertEquals(name, serviceType.getName());
    }

    @Test
    @DisplayName("Gets and sets description correctly")
    void getsAndSetsDescriptionCorrectly() {
        ServiceType serviceType = new ServiceType();
        String description = "Test Description";
        serviceType.setDescription(description);
        assertEquals(description, serviceType.getDescription());
    }

    @Test
    @DisplayName("Gets and sets active status correctly")
    void getsAndSetsActiveStatusCorrectly() {
        ServiceType serviceType = new ServiceType();
        serviceType.setActive(true);
        assertTrue(serviceType.isActive());
        serviceType.setActive(false);
        assertFalse(serviceType.isActive());
    }

    @Test
    @DisplayName("Default constructor initializes fields to null or false")
    void defaultConstructorInitializesFieldsToNullOrFalse() {
        ServiceType serviceType = new ServiceType();
        assertNull(serviceType.getId());
        assertNull(serviceType.getName());
        assertNull(serviceType.getDescription());
        assertFalse(serviceType.isActive());
    }

    @Test
    @DisplayName("toString returns correct string representation")
    void toStringReturnsCorrectStringRepresentation() {
        ServiceType serviceType = new ServiceType();
        UUID id = UUID.randomUUID();
        serviceType.setId(id);
        serviceType.setName("Test Service");
        serviceType.setDescription("Test Description");
        serviceType.setActive(true);
        String expected = "ServiceType{id=" + id + ", name='Test Service', description='Test Description', active=true}";
        assertEquals(expected, serviceType.toString());
    }
}
