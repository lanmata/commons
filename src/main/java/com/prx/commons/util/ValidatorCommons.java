/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prx.commons.util;

import java.util.List;

/**
 * Clase para propositos utilitarios de validacion. Permite determinar: - Tipos
 * de campos. - Duracion de tiempo. - Nulidad o no de objetos.
 *
 * @author Luis Mata
 * @version 1.0
 * @since 19-Oct-2014 09:38:25 a.m.
 */
public class ValidatorCommons {

    private ValidatorCommons() {
    }

    /**
     * Determina si el valor de un objeto dado es alfabetico. En caso de true,
     * el valor contenido en el objeto de es tipo alfabetico. En caso de false
     * el valor contenido en el objeto de no es tipo alfabetico.
     *
     * @param object Objeto a evaluar
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esAlfabetico(Object object) {
        boolean esValido = true;
        String valor = object.toString();

        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                esValido = false;
            }
        }

        return esValido;
    }

    /**
     * Determina si el valor de un objeto dado es numerico. En caso de true, el
     * valor contenido en el objeto de es tipo numerico. En caso de false el
     * valor contenido en el objeto de no es tipo numerico.
     *
     * @param object Objeto a evaluar
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esNumerico(Object object) {
        boolean esValido = false;
        String valor;

        validarCampor:
        if (object instanceof Integer) {
            esValido = true;
            break validarCampor;
        } else if (object instanceof Double) {
            esValido = true;
            break validarCampor;
        } else if (object instanceof Long) {
            esValido = true;
            break validarCampor;
        } else if (object instanceof String) {
            valor = object.toString();
            for (int i = 0; i < valor.length(); i++) {
                if (Character.isDigit(valor.charAt(i))) {
                    esValido = true;
                }
            }
        }

        return esValido;
    }

    public static boolean esNumerico(String valor) {
        return false;
    }

    /**
     * Determina si el valor de un objeto dado es nulo. En caso de true, el
     * valor contenido en el objeto de es tipo nulo. En caso de false el valor
     * contenido en el objeto de no es tipo nulo.
     *
     * @param objeto Objeto a evaluar
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esNulo(Object objeto) {
        return objeto == null;
    }

    /**
     * Determina si el valor de un objeto dado es <b>no nulo</b>. En caso de
     * true,el valor contenido en el objeto de no es tipo nulo. En caso de false
     * el valor contenido en el objeto de es tipo nulo.
     *
     * @param objeto Objeto a evaluar
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esNoNulo(Object objeto) {
        return (!esNulo(objeto));
    }

    /**
     * Determina si el valor de un objeto de tipo String es <b>vacio</b>. En
     * caso de true,el valor contenido en el objeto de es vacio. En caso de
     * false el valor contenido en el objeto de no es vacio.
     *
     * @param valor Objeto de tipo String a evaluar
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esVacio(String valor) {
        return valor.isEmpty();
    }

    /**
     * Determina si el valor de un objeto de tipo List es <b>vacio</b>. En caso
     * de true,el valor contenido en el objeto de es vacio. En caso de false el
     * valor contenido en el objeto de no es vacio.
     *
     * @param valor
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esVacio(List valor) {
        return valor.isEmpty();
    }

    /**
     * Calcula la duracion del tiempo utilizado en base al parametro tInicio y
     * el tiempo actual.
     *
     * @param tInicio
     * @return long
     *
     * @author Luis Mata
     */
    public static long totalTiempo(long tInicio) {
        return (System.currentTimeMillis() - tInicio);
    }

    /**
     * Determina si el valor contenido en el parametro recibido cumple las
     * reglas definidas para la correcta formacion de un correo electronico.
     *
     * @param valor
     * @return boolean
     *
     * @author Luis Mata
     */
    public static boolean esEmail(String valor) {
        String expresion = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
        boolean valido = false;

        if (valor.matches(expresion)) {
            valido = true;
        }

        return valido;
    }

    /**
     * Valida la correspondencia inequivoca del valorA y valorB
     *
     * @param valorA
     * @param valorB
     * @return boolean
     */
    public static boolean validaIgualdad(final String valorA, final String valorB) {
        //Valida
        return (esNoNulo(valorA) && esNoNulo(valorB)) //la NO nulidad
                || (!esVacio(valorA) && !esVacio(valorB)) //que no sea vacio
                || (valorA.equals(valorB));              //la igualdad literal
    }
}
