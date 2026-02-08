package com.prx.commons.general.pojo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    @DisplayName("Application instance initializes correctly")
    void applicationInitialization() {
        Application application = new Application();
        assertNotNull(application);
    }

    @Test
    @DisplayName("Set and get ID")
    void setIdAndGetId() {
        Application application = new Application();
        UUID id = UUID.randomUUID();
        application.setId(id);
        assertEquals(id, application.getId());
    }

    @Test
    @DisplayName("Set and get name")
    void setNameAndGetName() {
        Application application = new Application();
        String name = "Test Application";
        application.setName(name);
        assertEquals(name, application.getName());
    }

    @Test
    @DisplayName("Set and get description")
    void setDescriptionAndGetDescription() {
        Application application = new Application();
        String description = "This is a test application.";
        application.setDescription(description);
        assertEquals(description, application.getDescription());
    }

    @Test
    @DisplayName("Set and get active flag")
    void setActiveAndGetActive() {
        Application application = new Application();
        application.setActive(true);
        assertTrue(application.getActive());
    }

    @Test
    @DisplayName("Set and get createdDate")
    void setCreatedDateAndGetCreatedDate() {
        Application application = new Application();
        LocalDateTime now = LocalDateTime.now();
        application.setCreatedDate(now);
        assertEquals(now, application.getCreatedDate());
    }

    @Test
    @DisplayName("Set and get lastUpdate")
    void setLastUpdateAndGetLastUpdate() {
        Application application = new Application();
        LocalDateTime now = LocalDateTime.now();
        application.setLastUpdate(now);
        assertEquals(now, application.getLastUpdate());
    }

    @Test
    @DisplayName("Set and get serviceTypeId")
    void setServiceTypeIdAndGetServiceTypeId() {
        Application application = new Application();
        UUID serviceTypeId = UUID.randomUUID();
        application.setServiceTypeId(serviceTypeId);
        assertEquals(serviceTypeId, application.getServiceTypeId());
    }

    @Test
    @DisplayName("Set and get user list")
    void setUserListAndGetUserList() {
        Application application = new Application();
        List<User> userList = new ArrayList<>();
        application.setUserList(userList);
        assertEquals(userList, application.getUserList());
    }
}
