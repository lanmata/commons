/*
 * @(#)IdentificationDocumentTest.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * IdentificationDocumentTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 22-11-2020
 */
class IdentificationDocumentTest {

    @Test
    void testGettersAndSetters() {
        final var identificationDocument = new IdentificationDocument();
        identificationDocument.setExpirationDate(LocalDate.now(ZoneId.systemDefault()));
        identificationDocument.setIdentificationType(1);
        identificationDocument.setId(2);
        identificationDocument.setNumber("25073765-3");
        identificationDocument.setPerson(new Person());
        assertNotNull(identificationDocument.toString());
        assertNotNull(identificationDocument.getPerson());
        assertNotNull(identificationDocument.getNumber());
        assertNotNull(identificationDocument.getExpirationDate());
        assertNotEquals(-1,identificationDocument.getId());
        assertNotEquals(-1, identificationDocument.getIdentificationType());
    }

}