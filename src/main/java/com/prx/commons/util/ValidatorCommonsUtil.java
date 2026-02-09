/*
 *  @(#)ValidatorCommons.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prx.commons.util;

import java.math.BigDecimal;
import java.util.List;

/**
 * Utility class for validation helpers. Provides methods to determine:
 * - field types (alphabetic, numeric)
 * - time duration calculation
 * - null / empty checks for strings and lists
 *
 * <p>This class is final and provides only static utility methods.
 *
 * @author Luis Mata
 * @version 1.0, 19-Oct-2014 09:38:25 a.m.
 */
public final class ValidatorCommonsUtil {

    private ValidatorCommonsUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Determines whether the provided object contains only alphabetic characters.
     * <p>
     * Behavior:
     * - Returns {@code false} if {@code object} is {@code null}.
     * - If {@code object} is a {@link String}, its characters are evaluated.
     * - Otherwise {@code object.toString()} is used.
     * <p>
     * Only Unicode letters are considered alphabetic.
     *
     * @param object object to evaluate
     * @return {@code true} when the value is alphabetic, {@code false} otherwise
     * @author Luis Mata
     */
    public static boolean esAlfabetico(final Object object) {
        if (object == null) {
            return false;
        }
        boolean esValido = true;
        final String valor;

        if (esNulo(object)){
            esValido = false;
        }else {
            valor = object instanceof String ? (String) object : object.toString();
            for (int i = 0; i < valor.length(); i++) {
                if (!Character.isLetter(valor.charAt(i))) {
                    esValido = false;
                    break;
                }
            }
        }

        return esValido;
    }

    /**
     * Determines whether the provided object is a numeric type.
     * <p>
     * Note: {@link String} values are intentionally treated as non-numeric by this overload.
     *
     * @param object object to evaluate
     * @return {@code true} when the object is an instance of Integer, Double, Long or BigDecimal
     * @author Luis Mata
     */
    public static boolean esNumerico(final Object object) {
        // Strings should not be considered numeric by the Object overload
        if (object instanceof String) {
            return false;
        }
        return object instanceof Integer
                   || object instanceof Double
                   || object instanceof Long
                   || object instanceof BigDecimal;
    }

    /**
     * Determines whether the provided string contains only digit characters.
     * <p>
     * Returns {@code false} if {@code valor} is {@code null} or empty.
     *
     * @param valor string to evaluate
     * @return {@code true} when the string contains only digits and is not empty
     */
    public static boolean esNumerico(final String valor) {
        if (valor == null || valor.isEmpty()) {
            return false;
        }
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks whether the provided object reference is {@code null}.
     *
     * @param objeto object to evaluate
     * @return {@code true} when the object is {@code null}; {@code false} otherwise
     *
     * @author Luis Mata
     */
    public static boolean esNulo(final Object objeto) {
        return objeto == null;
    }

    /**
     * Checks whether the provided string is empty.
     * <p>
     * Note: this method calls {@link String#isEmpty()} and will throw NPE if the argument is {@code null}.
     *
     * @param valor string to evaluate (must not be {@code null})
     * @return {@code true} when the string is empty; {@code false} otherwise
     *
     * @author Luis Mata
     */
    public static boolean esVacio(final String valor) {
        return valor.isEmpty();
    }

    /**
     * Checks whether the provided list is empty.
     *
     * @param valor list to evaluate (must not be {@code null})
     * @return {@code true} when the list is empty; {@code false} otherwise
     *
     * @author Luis Mata
     */
    public static boolean esListaVacia(final List<?> valor) {
        return valor.isEmpty();
    }

    /**
     * Returns the elapsed time in milliseconds between the given start time and the current system time.
     *
     * @param tiempoInicial start time in milliseconds
     * @return elapsed time in milliseconds
     *
     * @author Luis Mata
     */
    public static long totalTiempo(final long tiempoInicial) {
        return System.currentTimeMillis() - tiempoInicial;
    }

    /**
     * Validates that both strings are non-null, non-empty, and equal.
     *
     * @param valorA first string
     * @param valorB second string
     * @return {@code true} when both strings are non-null, non-empty and equal; {@code false} otherwise
     */
    public static boolean validaIgualdad(final String valorA, final String valorB) {
        // Validate
        return !esNulo(valorA) && !esNulo(valorB) // non-null
                   && !esVacio(valorA) && !esVacio(valorB) // not empty
                   && valorA.equals(valorB);              // literal equality
    }

}
