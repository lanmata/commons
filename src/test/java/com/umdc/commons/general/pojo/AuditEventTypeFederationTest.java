package com.umdc.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuditEventTypeFederationTest {

    @Test
    @DisplayName("Federation event types exist and resolve by name")
    void federationTypesResolveByName() {
        for (String name : new String[]{"FEDERATED_LOGIN", "FEDERATION_FAILED", "FEDERATION_LINKED",
                "FEDERATION_UNLINKED", "FEDERATION_PROVIDER_CHANGED"}) {
            assertEquals(name, AuditEventType.valueOf(name).name());
        }
    }
}
