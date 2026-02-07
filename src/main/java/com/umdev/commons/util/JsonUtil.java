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
 * Utility class for handling JSON serialization and deserialization.
 * This class uses the Gson library for converting objects to JSON strings.
 * It is designed to provide a simple and reusable way to work with JSON
 * data in Java-based applications.
 *
 * This class cannot be instantiated, and all utility methods are implemented
 * as static methods.
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
     * Private constructor to prevent instantiation of the utility class.
     * This class is not meant to be instantiated and provides only static methods.
     *
     * @throws UnsupportedOperationException always when this constructor is invoked
     */
    private JsonUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Converts the given object into its JSON representation.
     *
     * @param objSource the object to be converted into a JSON string, must not be null
     * @return a JSON formatted string representing the given object
     */
    public static String toJson(Object objSource) {
        return GSON.toJson(objSource);
    }

}
