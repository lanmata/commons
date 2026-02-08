package com.prx.commons.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class ValidatorCommonsUtilTest {

    @Test
    void testEsAlfabetico() {
        assertFalse(ValidatorCommonsUtil.esAlfabetico(null));
        assertTrue(ValidatorCommonsUtil.esAlfabetico("abc"));
        assertFalse(ValidatorCommonsUtil.esAlfabetico("abc123"));
        assertFalse(ValidatorCommonsUtil.esAlfabetico("abc!@#"));
    }

    @Test
    void testEsNumericoObject() {
        assertTrue(ValidatorCommonsUtil.esNumerico(123));
        assertTrue(ValidatorCommonsUtil.esNumerico(123L));
        assertTrue(ValidatorCommonsUtil.esNumerico(123.0));
        assertTrue(ValidatorCommonsUtil.esNumerico(new BigDecimal("123")));
        // force the Object overload by casting to Object
        assertFalse(ValidatorCommonsUtil.esNumerico((Object) "123"));
    }

    @Test
    void testEsNumericoString() {
        assertTrue(ValidatorCommonsUtil.esNumerico("123456"));
        assertFalse(ValidatorCommonsUtil.esNumerico("12a34"));
        assertFalse(ValidatorCommonsUtil.esNumerico(""));
    }

    @Test
    void testEsNuloEsVacioEsListaVacia() {
        assertTrue(ValidatorCommonsUtil.esNulo(null));
        assertFalse(ValidatorCommonsUtil.esNulo("x"));

        assertTrue(ValidatorCommonsUtil.esVacio(""));
        assertFalse(ValidatorCommonsUtil.esVacio("x"));

        List<String> empty = Collections.emptyList();
        List<String> nonEmpty = List.of("a");
        assertTrue(ValidatorCommonsUtil.esListaVacia(empty));
        assertFalse(ValidatorCommonsUtil.esListaVacia(nonEmpty));
    }

    @Test
    void testTotalTiempoAndValidaIgualdad() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(5);
        assertTrue(ValidatorCommonsUtil.totalTiempo(start) >= 0);

        assertTrue(ValidatorCommonsUtil.validaIgualdad("a", "a"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("a", "b"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad(null, "a"));
    }
}
