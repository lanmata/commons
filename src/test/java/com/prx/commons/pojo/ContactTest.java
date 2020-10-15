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
package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ContactTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 08-10-2020
 */
class ContactTest {

    @Test
    void testGettersAndSetters(){
        var contact = new Contact();

        contact.setId(1);
        contact.setPerson(new Person());
        contact.setContent("Contenido");
        contact.setContactTypeId(1);
        contact.setActive(true);
        assertAll("Getters And Setters",
            () -> assertNotNull(contact.getActive()),
            () -> assertNotNull(contact.getContactTypeId()),
            () -> assertNotNull(contact.getContent()),
            () -> assertNotNull(contact.getId()),
            () -> assertNotEquals(new Contact(), contact),
            () -> assertFalse(contact.hashCode() == 0)
                 );
    }

}