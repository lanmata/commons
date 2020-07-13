package com.prx.commons.util;

import com.google.gson.Gson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 * @since 2017-03-15
 */
public class JsonUtil implements Cloneable {

    private static final Gson GSON;

    static {
        GSON = new Gson();
    }

    /* Constructor privado para no permitir creacion de objeto por instancia */
    private JsonUtil() {
    }

    public static String toJson(Object objSource) {
        return GSON.toJson(objSource);
    }

    /* Sobre escritura de metodo clone para garantizar un solo objeto en ejecucion */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }

}
