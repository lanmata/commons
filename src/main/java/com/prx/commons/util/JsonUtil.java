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
package com.prx.commons.util;

import com.google.gson.Gson;

/**
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 * @since 2017-03-15
 */
public final class JsonUtil {

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

}
