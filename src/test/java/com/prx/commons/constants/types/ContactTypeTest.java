package com.prx.commons.constants.types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTypeTest {

    @Test
    void valueOfEmail() {
        assertEquals(ContactType.EMAIL, ContactType.valueOf("EMAIL"));
    }

    @Test
    void valueOfPhone() {
        assertEquals(ContactType.PHONE, ContactType.valueOf("PHONE"));
    }

    @Test
    void valueOfWhatsapp() {
        assertEquals(ContactType.WHATSAPP, ContactType.valueOf("WHATSAPP"));
    }

    @Test
    void valueOfTelegram() {
        assertEquals(ContactType.TELEGRAM, ContactType.valueOf("TELEGRAM"));
    }

    @Test
    void valueOfTwitter() {
        assertEquals(ContactType.TWITTER, ContactType.valueOf("TWITTER"));
    }

    @Test
    void valuesContainsAllEnumConstants() {
        ContactType[] expectedValues = {ContactType.EMAIL, ContactType.PHONE, ContactType.WHATSAPP, ContactType.TELEGRAM, ContactType.TWITTER};
        assertArrayEquals(expectedValues, ContactType.values());
    }

    @Test
    void valueOfInvalidEnumConstant() {
        assertThrows(IllegalArgumentException.class, () -> ContactType.valueOf("INVALID"));
    }
}
