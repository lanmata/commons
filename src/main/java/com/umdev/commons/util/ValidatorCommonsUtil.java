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

import java.math.BigDecimal;
import java.util.List;

/**
 * Clase para prop&oacute;sitos utilitarios de validaci&oacute;n. Permite determinar: - Tipos de campos. -
 * Duraci&oacute;n de tiempo. - Nulidad o no de objetos.
 *
 * @author Luis Mata
 * @version 1.0, 19-Oct-2014 09:38:25 a.m.
 */
public final class ValidatorCommonsUtil {

    private ValidatorCommonsUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Determina si el valor de un objeto dado es alfab&eacute;tico. En caso de true, el valor contenido en el objeto de
     * es tipo alfab&eacute;tico. En caso de false el valor contenido en el objeto de no es tipo alfab&eacute;tico.
     *
     * @param object Objeto a evaluar, objeto de tipo {@link Object}
     *
     * @return boolean Objeto de tipo {@link boolean}
     *
     * @author Luis Mata
     */
    public static boolean esAlfabetico(final Object object) {
        boolean esValido = true;
        final String valor;

        if (esNulo(object)){
            esValido = false;
        }else {
            valor = object instanceof String ? (String) object : object.toString();
            for (int i = 0; i < valor.length(); i++) {
                if (Character.isDigit(valor.charAt(i))) {
                    esValido = false;
                    break;
                }
            }
        }

        return esValido;
    }

    /**
     * Determina si el valor de un objeto dado es num&eacute;rico. En caso de true, el valor contenido en el objeto de
     * es tipo num&eacute;rico. En caso de false el valor contenido en el objeto de no es tipo num&eacute;rico.
     *
     * @param object Objeto a evaluar, objeto de tipo {@link Object}
     *
     * @return boolean Objeto de tipo {@link Object}
     *
     * @author Luis Mata
     */
    public static boolean esNumerico(final Object object) {
        return object instanceof Integer
                   || object instanceof Double
                   || object instanceof Long
                   || object instanceof BigDecimal;
    }

    /**
     * Determina si el valor de un objeto dado es num&eacute;rico. En caso de true, el valor contenido en el objeto de
     * es tipo num&eacute;rico. En caso de false el valor contenido en el objeto de no es tipo num&eacute;rico.
     *
     * @param valor {@link String}
     *
     * @return boolean Objeto de tipo {@link boolean}
     */
    public static boolean esNumerico(final String valor) {
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
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
     *
     * @author Luis Mata
     */
    public static boolean esNulo(final Object objeto) {
        return objeto == null;
    }

    /**
     * Determina si el valor de un objeto de tipo String es <b>vac&iacute;o</b>. En caso de true,el valor contenido en
     * el objeto de es vacio. En caso de false el valor contenido en el objeto de no es vac&iacute;o.
     *
     * @param valor Objeto de tipo String a evaluar, Objeto de tipo {@link Object}
     *
     * @return boolean, Objeto de tipo {@link boolean}
     *
     * @author Luis Mata
     */
    public static boolean esVacio(final String valor) {
        return valor.isEmpty();
    }

    /**
     * Determina si el valor de un objeto de tipo List es <b>vac&iacute;o</b>. En caso de true,el valor contenido en el
     * objeto de es vac&iacute;o. En caso de false el valor contenido en el objeto de no es vac&iacute;o.
     *
     * @param valor Objeto de tipo {@link List}
     *
     * @return boolean, Objeto de tipo {@link boolean}
     *
     * @author Luis Mata
     */
    public static boolean esListaVacia(final List<?> valor) {
        return valor.isEmpty();
    }

    /**
     * Calcula la duraci&oacute;n del tiempo utilizado en base al par&aacute;metro tInicio y el tiempo actual.
     *
     * @param tiempoInicial Objeto de tipo {@link long}
     *
     * @return long Objeto de tipo {@link long}
     *
     * @author Luis Mata
     */
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
        return !esNulo(valorA) && !esNulo(valorB) //la NO nulidad
                   && !esVacio(valorA) && !esVacio(valorB) //que no sea vacío
                   && valorA.equals(valorB);              //la igualdad literal
    }
}
