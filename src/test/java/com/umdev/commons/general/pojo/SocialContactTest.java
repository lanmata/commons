/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */
package com.umdev.commons.general.pojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocialContactTest {

    @Test
    @DisplayName("Default constructor initializes object")
    void defaultConstructorInitializesObject() {
        SocialContact socialContact = new SocialContact();
        assertNotNull(socialContact);
    }

    @Test
    @DisplayName("toString returns non-null value")
    void toStringReturnsNonNullValue() {
        SocialContact socialContact = new SocialContact();
        assertNotNull(socialContact.toString());
    }

    @Test
    @DisplayName("hashCode does not return default value")
    void hashCodeDoesNotReturnDefaultValue() {
        SocialContact socialContact = new SocialContact();
        assertNotEquals(0, socialContact.hashCode());
    }

    @Test
    @DisplayName("Equals method returns false for different objects")
    void equalsMethodReturnsFalseForDifferentObjects() {
        SocialContact socialContact1 = new SocialContact();
        SocialContact socialContact2 = new SocialContact();
        assertNotEquals(socialContact1, socialContact2);
    }

    @Test
    @DisplayName("Equals method returns true for same object")
    void equalsMethodReturnsTrueForSameObject() {
        SocialContact socialContact = new SocialContact();
        assertEquals(socialContact, socialContact);
    }
}
