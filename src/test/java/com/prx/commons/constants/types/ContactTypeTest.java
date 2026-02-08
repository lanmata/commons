package com.prx.commons.constants.types;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ContactTypeTest {

    @Test
    @DisplayName("valueOf returns EMAIL for 'EMAIL'")
    void valueOfEmail() {
        assertEquals(ContactType.EMAIL, ContactType.valueOf("EMAIL"));
    }

    @Test
    @DisplayName("valueOf returns PHONE for 'PHONE'")
    void valueOfPhone() {
        assertEquals(ContactType.PHONE, ContactType.valueOf("PHONE"));
    }

    @Test
    @DisplayName("valueOf returns WHATSAPP for 'WHATSAPP'")
    void valueOfWhatsapp() {
        assertEquals(ContactType.WHATSAPP, ContactType.valueOf("WHATSAPP"));
    }

    @Test
    @DisplayName("valueOf returns TELEGRAM for 'TELEGRAM'")
    void valueOfTelegram() {
        assertEquals(ContactType.TELEGRAM, ContactType.valueOf("TELEGRAM"));
    }

    @Test
    @DisplayName("valueOf returns TWITTER for 'TWITTER'")
    void valueOfTwitter() {
        assertEquals(ContactType.TWITTER, ContactType.valueOf("TWITTER"));
    }

    @Test
    @DisplayName("ContactType.values contains all expected enum constants")
    void valuesContainsAllEnumConstants() {
        ContactType[] expectedValues = {ContactType.EMAIL, ContactType.PHONE, ContactType.WHATSAPP, ContactType.TELEGRAM, ContactType.TWITTER};
        assertArrayEquals(expectedValues, ContactType.values());
    }

    @Test
    @DisplayName("valueOf throws IllegalArgumentException for invalid constant")
    void valueOfInvalidEnumConstant() {
        assertThrows(IllegalArgumentException.class, () -> ContactType.valueOf("INVALID"));
    }
}
