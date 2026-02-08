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

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

/**
 * Utility class that provides validation methods for common data types and objects.
 * This class contains static methods for validating whether objects are alphabetic, numeric,
 * empty, or null, and also includes methods for various deprecated validations.
 * Instances of this class cannot be created.
 *
 * @author Luis Mata
 * @version 1.0, 19-Oct-2014 09:38:25 a.m.
 */
public final class Validator {

    private Validator() {
        throw new UnsupportedOperationException();
    }

    /**
     * Determines if the given object contains only alphabetic characters.
     * The method will return true if the object is not null, can be converted
     * to a string, and contains no numeric or non-alphabetic characters.
     *
     * @param object the object to evaluate, an instance of {@link Object}
     * @return true if the object contains only alphabetic characters, false otherwise
     * @author Luis Mata
     */
    public static boolean isAlphabet(final Object object) {
        boolean isValid = true;
        final String value;

        if (Objects.isNull(object)) {
            return false;
        }
        // avoid pattern-matching ternary for broader Java compatibility
        value = object instanceof String string ? string : object.toString();

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                return false;
            }
            if(!Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }

        return isValid;
    }

    /**
     * Determines if the given object is numeric. The method will return true if the object
     * is an instance of {@link Integer}, {@link Double}, {@link Long}, or {@link BigDecimal}.
     * Otherwise, it will return false.
     *
     * @param object the object to evaluate, an instance of {@link Object}
     * @return true if the object is numeric, false otherwise
     * @author Luis Mata
     */
    public static boolean isNumeric(final Object object) {
        return object instanceof Integer
                || object instanceof Double
                || object instanceof Long
                || object instanceof BigDecimal;
    }

    /**
     * Determines if the given string contains only numeric characters.
     * The method will return true if all characters in the string are digits.
     *
     * @param value the string to evaluate
     * @return true if the string is numeric, false otherwise
     */
    public static boolean isNumeric(final String value) {
        if(Objects.isNull(value)){
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether the provided object is null.
     *
     * @param objeto object to evaluate
     * @return {@code true} when the object is null; {@code false} otherwise
     * @author Luis Mata
     * @since 11
     * @deprecated
     */
    @Deprecated(since = "25")
    public static boolean esNulo(final Object objeto) {
        return objeto == null;
    }

    /**
     * Checks whether the provided string is null or empty.
     *
     * @param valor string to evaluate
     * @return {@code true} when the string is null or empty; {@code false} otherwise
     * @author Luis Mata
     * @since 11
     * @deprecated
     */
    @Deprecated(since = "25")
    public static boolean esVacio(final String valor) {
        return Objects.isNull(valor) || valor.isEmpty();
    }

    /**
     * Checks whether the provided list is empty.
     *
     * @param valor list to evaluate
     * @return {@code true} when the list is empty; {@code false} otherwise
     * @author Luis Mata
     * @since 11
     * @deprecated
     */
    @Deprecated(since = "25")
    public static boolean esListaVacia(final List<?> valor) {
        return valor.isEmpty();
    }

    /**
     * Returns the elapsed time in milliseconds between the given start time and the current system time.
     *
     * @param tiempoInicial start time in milliseconds
     * @return elapsed time in milliseconds
     * @author Luis Mata
     * @since 11
     * @deprecated
     */
    @Deprecated(since = "25")
    public static long totalTiempo(final long tiempoInicial) {
        return System.currentTimeMillis() - tiempoInicial;
    }

    /**
     * Validates whether two strings are equal and not empty/null.
     *
     * @param valorA {@link String}
     * @param valorB {@link String}
     * @return boolean
     */
    public static boolean validaIgualdad(final String valorA, final String valorB) {
        // Validate
        return !esVacio(valorA) && !esVacio(valorB) // not empty
                && valorA.equals(valorB);              // literal equality
    }

    /**
     * Determines if the provided object is empty or null.
     * For collections, iterators, and enumerations, the method checks if they contain any elements.
     * For arrays, it checks if the length is zero. For other object types, it evaluates to false.
     *
     * @param object the object to evaluate, which can be an instance of {@link Object},
     *               including Collections, Iterators, Enumerations, or arrays
     * @return true if the object is null or considered empty; false otherwise
     */
    public static boolean isEmpty(Object object) {
        if (Objects.isNull(object)) {
            return true;
        }

        if (object.getClass().isArray()) {
            return Array.getLength(object) == 0;
        }

        switch (object) {
            case Collection<?> collection -> {
                return collection.isEmpty();
            }
            case Enumeration<?> enumeration -> {
                return !enumeration.hasMoreElements();
            }
            case Iterator<?> iterator -> {
                return !iterator.hasNext();
            }
            default -> {
                return false;
            }
        }
    }

    /**
     * Determines if the given map is null or empty.
     *
     * @param map the map to evaluate, an instance of {@link Map}
     * @return true if the map is null or contains no entries; false otherwise
     */
    public static boolean isEmpty(final Map<?, ?> map) {
        return Objects.isNull(map) || map.isEmpty();
    }
}
