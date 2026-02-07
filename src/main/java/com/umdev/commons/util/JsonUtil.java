/*
 *  @(#)JsonUtil.java
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
package com.umdev.commons.util;

import com.google.gson.Gson;

/**
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
public final class JsonUtil {

    private static final Gson GSON;

    static {
        GSON = new Gson();
    }

    /**
     * Constructor privado para no permitir creaci&oacute;n de objeto por instancia
     */
    private JsonUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Recibe un objeto de tipo {@link Object} para convertir en un objeto de tipo {@link String} con un contenido en
     * formato JSON.
     *
     * @param objSource Objeto de tipo {@link Object}
     * @return Objeto de tipo {@link String}
     */
    public static String toJson(Object objSource) {
        return GSON.toJson(objSource);
    }

}
