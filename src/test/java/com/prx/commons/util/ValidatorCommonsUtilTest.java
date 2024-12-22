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

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorCommonsUtilTest {

    @Test
    @DisplayName("esAlfabetico returns true for alphabetic string")
    void esAlfabeticoReturnsTrueForAlphabeticString() {
        assertTrue(ValidatorCommonsUtil.esAlfabetico("abcDEF"));
    }

    @Test
    @DisplayName("esAlfabetico returns false for numeric string")
    void esAlfabeticoReturnsFalseForNumericString() {
        assertFalse(ValidatorCommonsUtil.esAlfabetico("123456"));
    }

    @Test
    @DisplayName("esAlfabetico returns false for null value")
    void esAlfabeticoReturnsFalseForNullValue() {
        assertFalse(ValidatorCommonsUtil.esAlfabetico(null));
    }

    @Test
    @DisplayName("esNumerico returns true for integer value")
    void esNumericoReturnsTrueForIntegerValue() {
        assertTrue(ValidatorCommonsUtil.esNumerico(123));
    }

    @Test
    @DisplayName("esNumerico returns true for double value")
    void esNumericoReturnsTrueForDoubleValue() {
        assertTrue(ValidatorCommonsUtil.esNumerico(123.45));
    }

    @Test
    @DisplayName("esNumerico returns true for BigDecimal value")
    void esNumericoReturnsTrueForBigDecimalValue() {
        assertTrue(ValidatorCommonsUtil.esNumerico(BigDecimal.valueOf(123.45)));
    }

    @Test
    @DisplayName("esNumerico returns false for non-numeric string")
    void esNumericoReturnsFalseForNonNumericString() {
        assertFalse(ValidatorCommonsUtil.esNumerico("abc"));
    }

    @Test
    @DisplayName("esNulo returns true for null value")
    void esNuloReturnsTrueForNullValue() {
        assertTrue(ValidatorCommonsUtil.esNulo(null));
    }

    @Test
    @DisplayName("esNulo returns false for non-null value")
    void esNuloReturnsFalseForNonNullValue() {
        assertFalse(ValidatorCommonsUtil.esNulo("value"));
    }

    @Test
    @DisplayName("esVacio returns true for empty string")
    void esVacioReturnsTrueForEmptyString() {
        assertTrue(ValidatorCommonsUtil.esVacio(""));
    }

    @Test
    @DisplayName("esVacio returns false for non-empty string")
    void esVacioReturnsFalseForNonEmptyString() {
        assertFalse(ValidatorCommonsUtil.esVacio("value"));
    }

    @Test
    @DisplayName("esListaVacia returns true for empty list")
    void esListaVaciaReturnsTrueForEmptyList() {
        assertTrue(ValidatorCommonsUtil.esListaVacia(new ArrayList<>()));
    }

    @Test
    @DisplayName("esListaVacia returns false for non-empty list")
    void esListaVaciaReturnsFalseForNonEmptyList() {
        List<String> list = new ArrayList<>();
        list.add("value");
        assertFalse(ValidatorCommonsUtil.esListaVacia(list));
    }

    @Test
    @DisplayName("totalTiempo returns positive value for valid input")
    void totalTiempoReturnsPositiveValueForValidInput() {
        long startTime = System.currentTimeMillis() - 1000;
        assertTrue(ValidatorCommonsUtil.totalTiempo(startTime) > 0);
    }

    @Test
    @DisplayName("validaIgualdad returns true for equal strings")
    void validaIgualdadReturnsTrueForEqualStrings() {
        assertTrue(ValidatorCommonsUtil.validaIgualdad("value", "value"));
    }

    @Test
    @DisplayName("validaIgualdad returns false for different strings")
    void validaIgualdadReturnsFalseForDifferentStrings() {
        assertFalse(ValidatorCommonsUtil.validaIgualdad("value1", "value2"));
    }

    @Test
    @DisplayName("validaIgualdad returns false for null values")
    void validaIgualdadReturnsFalseForNullValues() {
        assertFalse(ValidatorCommonsUtil.validaIgualdad(null, "value"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("value", null));
        assertFalse(ValidatorCommonsUtil.validaIgualdad(null, null));
    }

    @Test
    @DisplayName("validaIgualdad returns false for empty strings")
    void validaIgualdadReturnsFalseForEmptyStrings() {
        assertFalse(ValidatorCommonsUtil.validaIgualdad("", "value"));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("value", ""));
        assertFalse(ValidatorCommonsUtil.validaIgualdad("", ""));
    }
}
