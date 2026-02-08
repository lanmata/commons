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
package com.prx.commons.message.pojo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;

/**
 * MailTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
@SuppressWarnings("Convert2Diamond")
class MailTest {

    @Test
    @DisplayName("Getters and setters provide non-null values and hash/equals behave")
    void gettersAndSetters() {
        final var mail = new Mail();

        mail.setContent("");
        mail.setFrom("usuario@dominio.ext");
        mail.setModel(new HashMap<String, Object>());
        mail.setSubject("Asunto");
        mail.setTo("usuario@dominio.ext, usuario2@dominio.ext");

        assertAll("Test Getters and Setters",
                () -> assertNotNull(mail.getFrom()),
                () -> assertNotNull(mail.getModel()),
                () -> assertNotNull(mail.getContent()),
                () -> assertNotNull(mail.getSubject()),
                () -> assertNotNull(mail.getTo()),
                () -> assertNotNull(mail.toString()),
                () -> assertNotEquals(1, mail.hashCode()),
                () -> assertNotEquals(new Mail(), mail)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Mail}
     *   <li>{@link Mail#setContent(String)}
     *   <li>{@link Mail#setFrom(String)}
     *   <li>{@link Mail#setModel(Map)}
     *   <li>{@link Mail#setSubject(String)}
     *   <li>{@link Mail#setTo(String)}
     *   <li>{@link Mail#toString()}
     *   <li>{@link Mail#getContent()}
     *   <li>{@link Mail#getFrom()}
     *   <li>{@link Mail#getModel()}
     *   <li>{@link Mail#getSubject()}
     *   <li>{@link Mail#getTo()}
     * </ul>
     */
    @Test
    @DisplayName("Constructor sets fields and toString matches expected format")
    void testConstructor() {
        Mail actualMail = new Mail();
        actualMail.setContent("Not all who wander are lost");
        actualMail.setFrom("jane.doe@example.org");
        HashMap<String, Object> model = new HashMap<>();
        actualMail.setModel(model);
        actualMail.setSubject("Hello from the Dreaming Spires");
        actualMail.setTo("alice.liddell@example.org");
        String actualToStringResult = actualMail.toString();
        assertEquals("Not all who wander are lost", actualMail.getContent());
        assertEquals("jane.doe@example.org", actualMail.getFrom());
        assertSame(model, actualMail.getModel());
        assertEquals("Hello from the Dreaming Spires", actualMail.getSubject());
        assertEquals("alice.liddell@example.org", actualMail.getTo());
        assertEquals("Mail{from='jane.doe@example.org', to='alice.liddell@example.org', subject='Hello from the Dreaming"
                + " Spires', content='Not all who wander are lost', model={}}", actualToStringResult);
    }

}
