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

package com.prx.commons.enums.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * ContactTypeTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class ContactTypeTest {

    @Test
    void keys() {
        for (final var tp : ContactType.values()) {
            Assertions.assertTrue(Arrays.asList(ContactType.values()).contains(tp));
            assertNotNull(ContactType.getContactType(tp.ordinal()));
        }
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetContactType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 5
        //       at com.prx.commons.enums.types.ContactType.getContactType(ContactType.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        ContactType.getContactType(42);
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    void testGetContactType2() {
        assertEquals(ContactType.PHONE, ContactType.getContactType(1));
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    void testGetContactType3() {
        assertEquals(ContactType.EMAIL, ContactType.getContactType(0));
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    void testGetContactType4() {
        assertEquals(ContactType.WHATSAPP, ContactType.getContactType(2));
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    void testGetContactType5() {
        assertEquals(ContactType.TELEGRAM, ContactType.getContactType(3));
    }

    /**
     * Method under test: {@link ContactType#getContactType(int)}
     */
    @Test
    void testGetContactType6() {
        assertEquals(ContactType.TWITTER, ContactType.getContactType(4));
    }

}
