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

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * ValidatorCommonsTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 14-10-2020
 */
@SuppressWarnings("ConstantConditions")
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
                () -> assertFalse(ValidatorCommonsUtil.esAlfabetico(null))
        );
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esAlfabetico(Object)}
     */
    @Test
    void testEsAlfabetico() {
        assertTrue(ValidatorCommonsUtil.esAlfabetico("Object"));
        assertFalse(ValidatorCommonsUtil.esAlfabetico(1));
        assertFalse(ValidatorCommonsUtil.esAlfabetico(null));
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
        assertFalse(ValidatorCommonsUtil.esNumerico((Object) "Object"));
        assertTrue(ValidatorCommonsUtil.esNumerico(1));
        assertTrue(ValidatorCommonsUtil.esNumerico(10.0d));
        assertTrue(ValidatorCommonsUtil.esNumerico(1L));
        assertTrue(ValidatorCommonsUtil.esNumerico(BigDecimal.valueOf(1L)));
        assertFalse(ValidatorCommonsUtil.esNumerico("Valor"));
        assertTrue(ValidatorCommonsUtil.esNumerico("42"));
    }

    @Test
    void esNulo() {
        assertTrue(ValidatorCommonsUtil.esNulo(null));
        assertFalse(ValidatorCommonsUtil.esNulo("2345678as"));
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esNulo(Object)}
     */
    @Test
    void testEsNulo() {
        assertFalse(ValidatorCommonsUtil.esNulo("Objeto"));
    }

    @Test
    void esVacio() {
        assertAll("Test esVacio",
                () -> assertTrue(ValidatorCommonsUtil.esVacio("")),
                () -> assertFalse(ValidatorCommonsUtil.esVacio("AbchSY 23456789"))
        );
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esVacio(String)}
     */
    @Test
    void testEsVacio2() {
        assertFalse(ValidatorCommonsUtil.esVacio("Valor"));
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esVacio(String)}
     */
    @Test
    void testEsVacio3() {
        assertTrue(ValidatorCommonsUtil.esVacio(""));
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esListaVacia(List)}
     */
    @Test
    void testEsListaVacia() {
        assertTrue(ValidatorCommonsUtil.esListaVacia(new ArrayList<>()));
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esListaVacia(List)}
     */
    @Test
    void testEsListaVacia2() {
        ArrayList<Object> valor = new ArrayList<>();
        valor.add("42");
        assertFalse(ValidatorCommonsUtil.esListaVacia(valor));
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#esListaVacia(List)}
     */
    @Test
    void testEsListaVacia3() {
        ArrayList<Object> valor = new ArrayList<>();
        valor.add("42");
        valor.add("42");
        assertFalse(ValidatorCommonsUtil.esListaVacia(valor));
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

    /**
     * Method under test: {@link ValidatorCommonsUtil#totalTiempo(long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTotalTiempo() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests that are time-sensitive.
        //   The assertions don't pass when run at an alternate date, time, and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   See https://diff.blue/R031 for details.

        ValidatorCommonsUtil.totalTiempo(1L);
    }

    @Test
    void totalTiempo() {
        assertTrue(ValidatorCommonsUtil.totalTiempo(145859654L) > 1L);
        assertFalse(ValidatorCommonsUtil.totalTiempo(145859654L) < 1L);
    }

    /**
     * Method under test: {@link ValidatorCommonsUtil#validaIgualdad(String, String)}
     */
    @Test
    void testValidaIgualdad() {
        assertFalse(ValidatorCommonsUtil.validaIgualdad("Valor A", "Valor B"));
        assertTrue(ValidatorCommonsUtil.validaIgualdad("foo", "foo"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad(null, "Valor B"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("", "Valor B"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("Valor A", null));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("Valor A", ""));
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
