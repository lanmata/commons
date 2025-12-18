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
package com.umdev.commons.util;

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
     * Determina si el valor de un objeto dado es nulo. En caso de true, el
     * valor contenido en el objeto de es tipo nulo. En caso de false el valor
     * contenido en el objeto de no es tipo nulo.
     *
     * @param objeto Objeto a evaluar, Objeto de tipo {@link Object}
     * @return boolean, Objeto de tipo {@link boolean}
     * @author Luis Mata
     * @since 11
     * @deprecated
     */
    @Deprecated(since = "25")
    public static boolean esNulo(final Object objeto) {
        return objeto == null;
    }

    /**
     * @param valor Objeto de tipo String a evaluar, Objeto de tipo {@link Object}
     * @return boolean, Objeto de tipo {@link boolean}
     * @author Luis Mata
     * @since 11
     * @deprecated Determina si el valor de un objeto de tipo String es <b>vac&iacute;o</b>. En caso de true,el valor contenido en
     * el objeto de es vacio. En caso de false el valor content en el objeto de no es vac&iacute;o.
     */
    @Deprecated(since = "25")
    public static boolean esVacio(final String valor) {
        return Objects.isNull(valor) || valor.isEmpty();
    }

    /**
     * @param valor Objeto de tipo {@link List}
     * @return boolean, Objeto de tipo {@link boolean}
     * @author Luis Mata
     * @since 11
     * @deprecated Determina si el valor de un objeto de tipo List es <b>vac&iacute;o</b>. En caso de true,el valor contenido en el
     * objeto de es vac&iacute;o. En caso de false el valor contenido en el objeto de no es vac&iacute;o.
     */
    @Deprecated(since = "25")
    public static boolean esListaVacia(final List<?> valor) {
        return valor.isEmpty();
    }

    /**
     * @param tiempoInicial Objeto de tipo {@link long}
     * @return long Objeto de tipo {@link long}
     * @author Luis Mata
     * @since 11
     * @deprecated Calcula la duraci&oacute;n del tiempo utilizado en base al par&aacute;metro tInicio y el tiempo actual.
     */
    @Deprecated(since = "25")
    public static long totalTiempo(final long tiempoInicial) {
        return System.currentTimeMillis() - tiempoInicial;
    }

    /**
     * Valida la correspondencia inequ&iacute;voca del valorA y valorB
     *
     * @param valorA {@link String}
     * @param valorB {@link String}
     * @return boolean
     */
    public static boolean validaIgualdad(final String valorA, final String valorB) {
        //Valida
        return !esVacio(valorA) && !esVacio(valorB) //que no sea vacío
                && valorA.equals(valorB);              //la igualdad literal
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
                return iterator.hasNext();
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
