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
package com.prx.commons.util;

import com.prx.commons.pojo.Contact;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * ValidatorCommonsTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 14-10-2020
 */
class ValidatorCommonsTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = ValidatorCommons.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    @Test
    void esAlfabetico() {
        assertAll("Test esAlfabetico",
            () -> assertTrue(ValidatorCommons.esAlfabetico("abcgds ERTGYHJKh")),
            () -> assertFalse(ValidatorCommons.esAlfabetico("123456")),
            () -> assertFalse(ValidatorCommons.esAlfabetico(123456)),
            () ->assertFalse(ValidatorCommons.esAlfabetico(null))
                 );
    }

    @Test
    void esNumerico() {
        assertAll("Test esNumerico",
            () -> assertTrue(ValidatorCommons.esNumerico("123456789")),
            () -> assertFalse(ValidatorCommons.esNumerico("SDFGHJK")),
            () -> assertFalse(ValidatorCommons.esNumerico("2SD4FGHJK"))
                 );
    }

    @Test
    void testEsNumerico() {
        assertAll("Test esNumerico",
            () -> assertTrue(ValidatorCommons.esNumerico(1252)),
            () -> assertTrue(ValidatorCommons.esNumerico(12523456789098765L)),
            () -> assertTrue(ValidatorCommons.esNumerico(1252.869D)),
            () -> assertTrue(ValidatorCommons.esNumerico(BigDecimal.valueOf(1589.36D))),
            () -> assertFalse(ValidatorCommons.esNumerico("2SD4FGHJK")),
            () -> assertFalse(ValidatorCommons.esNumerico(new Contact()))
                 );
    }

    @Test
    void esNulo() {
        assertTrue(ValidatorCommons.esNulo(null));
        assertFalse(ValidatorCommons.esNulo("2345678as"));
    }

    @Test
    void esNoNulo() {
        assertTrue(ValidatorCommons.esNoNulo("ASDFGHJK"));
        assertFalse(ValidatorCommons.esNoNulo(null));
    }

    @Test
    void esVacio() {
        assertAll("Test esVacio",
            () -> assertTrue(ValidatorCommons.esVacio("")),
            () -> assertFalse(ValidatorCommons.esVacio("AbchSY 23456789"))
                 );
    }

    @Test
    void testEsVacio() {
        final var list = new ArrayList<String>();

        list.add("elemento 1");
        list.add("elemento 2");
        list.add("elemento 3");

        assertAll("Test esVacio",
            () -> assertTrue(ValidatorCommons.esVacio(new ArrayList<String>())),
            () -> assertFalse(ValidatorCommons.esVacio(list))
                 );
    }

    @Test
    void totalTiempo() {
        assertTrue(ValidatorCommons.totalTiempo(145859654L) > 1L);
    }

    @Test
    void esEmail() {
        assertAll("Test esEmail",
            () -> assertTrue(ValidatorCommons.esEmail("usuario@dominio.ext")),
            () -> assertFalse(ValidatorCommons.esEmail("usuario"))
                 );
    }

    @Test
    void validaIgualdad() {
        assertAll("Test validaIgualdad",
            () -> assertTrue(ValidatorCommons.validaIgualdad("ABC1236", "ABC1236")),
            () -> assertFalse(ValidatorCommons.validaIgualdad("ABC1236", "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommons.validaIgualdad("ABC1236", null)),
            () -> assertFalse(ValidatorCommons.validaIgualdad(null, "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommons.validaIgualdad("", "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommons.validaIgualdad("·$%&/jk", ""))
                 );
    }

}