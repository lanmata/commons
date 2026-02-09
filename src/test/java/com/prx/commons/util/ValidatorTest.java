package com.prx.commons.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Validator}.
 */
class ValidatorTest {

    @Test
    @DisplayName("isNumeric returns true for numeric types")
    void testIsNumericWithValidNumbers() {
        assertTrue(Validator.isNumeric(123));
        assertTrue(Validator.isNumeric(123.45));
        assertTrue(Validator.isNumeric(123L));
    }

    @Test
    @DisplayName("isNumeric handles invalid inputs and strings")
    void testIsNumericWithInvalidInputs() {
        assertTrue(Validator.isNumeric("123"));
        assertFalse(Validator.isNumeric(null));
        assertFalse(Validator.isNumeric(new Object()));
    }

    @Test
    @DisplayName("esNulo returns true for null values")
    void testEsNulo() {
        assertTrue(Validator.esNulo(null));
        assertFalse(Validator.esNulo("Not Null"));
    }

    @Test
    @DisplayName("esVacio detects empty strings and null")
    void testEsVacio() {
        assertTrue(Validator.esVacio(null));
        assertTrue(Validator.esVacio(""));
        assertFalse(Validator.esVacio("Not Empty"));
    }

    @Test
    @DisplayName("esListaVacia detects empty lists")
    void testEsListaVacia() {
        assertTrue(Validator.esListaVacia(Collections.emptyList()));
        assertFalse(Validator.esListaVacia(Collections.singletonList("Item")));
    }

    @Test
    @DisplayName("totalTiempo returns elapsed time since start")
    void testTotalTiempo() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(10); // Simulate some delay
        assertTrue(Validator.totalTiempo(startTime) >= 10);
    }

    @Test
    @DisplayName("validaIgualdad compares strings for equality")
    void testValidaIgualdad() {
        assertTrue(Validator.validaIgualdad("test", "test"));
        assertFalse(Validator.validaIgualdad("test", "TEST"));
        assertFalse(Validator.validaIgualdad(null, "test"));
        assertFalse(Validator.validaIgualdad("test", null));
    }

    @Test
    @DisplayName("isEmpty returns true for null")
    void testIsEmptyWithNull() {
        assertTrue(Validator.isEmpty(null));
    }

    @Test
    @DisplayName("isEmpty returns true for empty collections")
    void testIsEmptyWithEmptyCollection() {
        assertTrue(Validator.isEmpty(Collections.emptyList()));
    }

    @Test
    @DisplayName("isEmpty returns false for non-empty collections")
    void testIsEmptyWithNonEmptyCollection() {
        assertFalse(Validator.isEmpty(Collections.singletonList("item")));
    }

    @Test
    @DisplayName("isEmpty returns true for empty arrays")
    void testIsEmptyWithEmptyArray() {
        assertTrue(Validator.isEmpty(new int[]{}));
    }

    @Test
    @DisplayName("isEmpty returns false for non-empty arrays")
    void testIsEmptyWithNonEmptyArray() {
        assertFalse(Validator.isEmpty(new int[]{1}));
    }

    @Test
    @DisplayName("isEmpty returns true for empty maps")
    void testIsEmptyWithEmptyMap() {
        assertTrue(Validator.isEmpty(Collections.emptyMap()));
    }

    @Test
    @DisplayName("isEmpty returns false for non-empty maps")
    void testIsEmptyWithNonEmptyMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        assertFalse(Validator.isEmpty(map));
    }

    @Test
    @DisplayName("isAlphabet returns false for null")
    void testIsAlphabetWithNull() {
        assertFalse(Validator.isAlphabet(null));
    }

    @Test
    @DisplayName("isAlphabet returns true for empty string")
    void testIsAlphabetWithEmptyString() {
        assertTrue(Validator.isAlphabet(""));
    }

    @Test
    @DisplayName("isAlphabet returns true for letters only")
    void testIsAlphabetWithOnlyLetters() {
        assertTrue(Validator.isAlphabet("abcXYZ"));
    }

    @Test
    @DisplayName("isAlphabet returns false for numeric characters")
    void testIsAlphabetWithNumbers() {
        assertFalse(Validator.isAlphabet("abc123"));
    }

    @Test
    @DisplayName("isAlphabet returns false for special characters")
    void testIsAlphabetWithSpecialCharacters() {
        assertFalse(Validator.isAlphabet("abc!@#"));
    }

    @Test
    @DisplayName("isAlphabet returns false for strings with spaces")
    void testIsAlphabetWithSpaces() {
        assertFalse(Validator.isAlphabet("abc xyz"));
    }

    @Test
    @DisplayName("isAlphabet supports Unicode letters")
    void testIsAlphabetWithUnicodeCharacters() {
        assertTrue(Validator.isAlphabet("áéíóúüñ"));
    }
}
