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
class ValidatorCommonsUtilTest {

    @Test
    void constructor() throws NoSuchMethodException {
        final var constructor = ValidatorCommonsUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

    @Test
    void esAlfabetico() {
        assertAll("Test esAlfabetico",
            () -> assertTrue(ValidatorCommonsUtil.esAlfabetico("abcgds ERTGYHJKh")),
            () -> assertFalse(ValidatorCommonsUtil.esAlfabetico("123456")),
            () -> assertFalse(ValidatorCommonsUtil.esAlfabetico(123456)),
            () ->assertFalse(ValidatorCommonsUtil.esAlfabetico(null))
                 );
    }

    @Test
    void esNumerico() {
        assertAll("Test esNumerico",
            () -> assertTrue(ValidatorCommonsUtil.esNumerico("123456789")),
            () -> assertFalse(ValidatorCommonsUtil.esNumerico("SDFGHJK")),
            () -> assertFalse(ValidatorCommonsUtil.esNumerico("2SD4FGHJK"))
                 );
    }

    @Test
    void testEsNumerico() {
        assertAll("Test esNumerico",
            () -> assertTrue(ValidatorCommonsUtil.esNumerico(1252)),
            () -> assertTrue(ValidatorCommonsUtil.esNumerico(12523456789098765L)),
            () -> assertTrue(ValidatorCommonsUtil.esNumerico(1252.869D)),
            () -> assertTrue(ValidatorCommonsUtil.esNumerico(BigDecimal.valueOf(1589.36D))),
            () -> assertFalse(ValidatorCommonsUtil.esNumerico("2SD4FGHJK")),
            () -> assertFalse(ValidatorCommonsUtil.esNumerico(new Contact()))
                 );
    }

    @Test
    void esNulo() {
        assertTrue(ValidatorCommonsUtil.esNulo(null));
        assertFalse(ValidatorCommonsUtil.esNulo("2345678as"));
    }

    @Test
    void esNoNulo() {
        assertTrue(ValidatorCommonsUtil.esNoNulo("ASDFGHJK"));
        assertFalse(ValidatorCommonsUtil.esNoNulo(null));
    }

    @Test
    void esVacio() {
        assertAll("Test esVacio",
            () -> assertTrue(ValidatorCommonsUtil.esVacio("")),
            () -> assertFalse(ValidatorCommonsUtil.esVacio("AbchSY 23456789"))
                 );
    }

    @Test
    void testEsVacio() {
        final var list = new ArrayList<>();

        list.add("elemento 1");
        list.add("elemento 2");
        list.add("elemento 3");

        assertAll("Test esVacio",
            () -> assertTrue(ValidatorCommonsUtil.esListaVacia(new ArrayList<>())),
            () -> assertFalse(ValidatorCommonsUtil.esListaVacia(list))
                 );
    }

    @Test
    void totalTiempo() {
        assertTrue(ValidatorCommonsUtil.totalTiempo(145859654L) > 1L);
        assertFalse(ValidatorCommonsUtil.totalTiempo(145859654L) < 1L);
    }

    @Test
    void esEmail() {
        assertAll("Test esEmail",
            () -> assertTrue(ValidatorCommonsUtil.esEmail("usuario@dominio.ext")),
            () -> assertFalse(ValidatorCommonsUtil.esEmail("usuario"))
                 );
    }

    @Test
    void validaIgualdad() {
        assertAll("Test validaIgualdad",
            () -> assertTrue(ValidatorCommonsUtil.validaIgualdad("ABC1236", "ABC1236")),
            () -> assertFalse(ValidatorCommonsUtil.validaIgualdad("ABC1236", "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommonsUtil.validaIgualdad("ABC1236", null)),
            () -> assertFalse(ValidatorCommonsUtil.validaIgualdad(null, "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommonsUtil.validaIgualdad("", "ABC123sdsd6")),
            () -> assertFalse(ValidatorCommonsUtil.validaIgualdad("·$%&/jk", ""))
                 );
    }

}