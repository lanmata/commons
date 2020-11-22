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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
    void gettersAndSetters(){
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

}