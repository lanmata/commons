package com.prx.commons.util;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Validator}.
 */
class ValidatorTest {

    @Test
    void testIsNumericWithValidNumbers() {
        assertTrue(Validator.isNumeric(123));
        assertTrue(Validator.isNumeric(123.45));
        assertTrue(Validator.isNumeric(123L));
    }

    @Test
    void testIsNumericWithInvalidInputs() {
        assertTrue(Validator.isNumeric("123"));
        assertFalse(Validator.isNumeric(null));
        assertFalse(Validator.isNumeric(new Object()));
    }

    @Test
    void testEsNulo() {
        assertTrue(Validator.esNulo(null));
        assertFalse(Validator.esNulo("Not Null"));
    }

    @Test
    void testEsVacio() {
        assertTrue(Validator.esVacio(null));
        assertTrue(Validator.esVacio(""));
        assertFalse(Validator.esVacio("Not Empty"));
    }

    @Test
    void testEsListaVacia() {
        assertTrue(Validator.esListaVacia(Collections.emptyList()));
        assertFalse(Validator.esListaVacia(Collections.singletonList("Item")));
    }

    @Test
    void testTotalTiempo() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(10); // Simulate some delay
        assertTrue(Validator.totalTiempo(startTime) >= 10);
    }

    @Test
    void testValidaIgualdad() {
        assertTrue(Validator.validaIgualdad("test", "test"));
        assertFalse(Validator.validaIgualdad("test", "TEST"));
        assertFalse(Validator.validaIgualdad(null, "test"));
        assertFalse(Validator.validaIgualdad("test", null));
    }

    @Test
    void testIsEmptyWithNull() {
        assertTrue(Validator.isEmpty(null));
    }

    @Test
    void testIsEmptyWithEmptyCollection() {
        assertTrue(Validator.isEmpty(Collections.emptyList()));
    }

    @Test
    void testIsEmptyWithNonEmptyCollection() {
        assertFalse(Validator.isEmpty(Collections.singletonList("item")));
    }

    @Test
    void testIsEmptyWithEmptyArray() {
        assertTrue(Validator.isEmpty(new int[]{}));
    }

    @Test
    void testIsEmptyWithNonEmptyArray() {
        assertFalse(Validator.isEmpty(new int[]{1}));
    }

    @Test
    void testIsEmptyWithEmptyMap() {
        assertTrue(Validator.isEmpty(Collections.emptyMap()));
    }

    @Test
    void testIsEmptyWithNonEmptyMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        assertFalse(Validator.isEmpty(map));
    }

    @Test
    void testIsAlphabetWithNull() {
        assertFalse(Validator.isAlphabet(null));
    }

    @Test
    void testIsAlphabetWithEmptyString() {
        assertTrue(Validator.isAlphabet(""));
    }

    @Test
    void testIsAlphabetWithOnlyLetters() {
        assertTrue(Validator.isAlphabet("abcXYZ"));
    }

    @Test
    void testIsAlphabetWithNumbers() {
        assertFalse(Validator.isAlphabet("abc123"));
    }

    @Test
    void testIsAlphabetWithSpecialCharacters() {
        assertFalse(Validator.isAlphabet("abc!@#"));
    }

    @Test
    void testIsAlphabetWithSpaces() {
        assertFalse(Validator.isAlphabet("abc xyz"));
    }

    @Test
    void testIsAlphabetWithUnicodeCharacters() {
        assertTrue(Validator.isAlphabet("áéíóúüñ"));
    }
}
