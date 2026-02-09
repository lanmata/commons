package com.prx.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonToStringTest {

    @Test
    @DisplayName("toString omits contacts when null and includes when present")
    void toStringContactsBranch() {
        Person p = new Person();
        p.setId(UUID.fromString("7cde528b-3f13-4d0d-8573-d22996b17d3b"));
        p.setFirstName("John");
        p.setLastName("Doe");
        p.setGender("M");
        p.setBirthdate(LocalDate.of(1990, 1, 1));

        String s1 = p.toString();
        // when contacts is null, string should not contain 'contacts='
        assertFalse(s1.contains("contacts="));

        // set contacts and verify branch that includes contacts
        Contact c = new Contact();
        c.setContent("contact@example.com");
        p.setContacts(List.of(c));
        String s2 = p.toString();
        assertTrue(s2.contains("contacts="));
    }
}

