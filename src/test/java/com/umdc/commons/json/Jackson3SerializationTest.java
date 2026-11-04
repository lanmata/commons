/*
 *  @(#)Jackson3SerializationTest.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 */

package com.umdc.commons.json;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.umdc.commons.general.pojo.Role;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

/** Verifies that the commons POJOs serialize and deserialize with Jackson 3 ({@code tools.jackson}). */
class Jackson3SerializationTest {

    private final ObjectMapper mapper = JsonMapper.builder().build();

    @Test
    @DisplayName("Role round-trips through Jackson 3 keeping the @JsonProperty names")
    void roleRoundTrip() {
        Role role = new Role();
        role.setId(UUID.randomUUID());
        role.setName("admin");
        role.setDescription("Administrator");
        role.setActive(Boolean.TRUE);
        role.setApplicationId(UUID.randomUUID());

        String json = mapper.writeValueAsString(role);
        JsonNode node = mapper.readTree(json);

        assertTrue(node.has("id"));
        assertTrue(node.has("applicationId"));
        assertEquals("admin", node.get("name").asString());

        Role back = mapper.readValue(json, Role.class);
        assertEquals(role.getId(), back.getId());
        assertEquals(role.getApplicationId(), back.getApplicationId());
        assertEquals(Boolean.TRUE, back.getActive());
    }
}
