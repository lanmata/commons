/*
 *  @(#)FileUtil.java
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

import com.prx.commons.constants.keys.SizeKey;
import com.prx.commons.io.pojo.SizeDescriptor;

/**
 * Clase utilitaria para gesti&oacute;n de archivos
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
public final class FileUtil {

    private static final long MIN_RESULT = 8L;
    private static final int ONE_VALUE = 1;
    private static final long BYTE_SIZE = 1024L;

    private FileUtil(){throw new UnsupportedOperationException();}

    /**
     * Retorna el peso de un archivo
     *
     * @param ordinalSize Objeto de tipo {@link int}
     * @param size Objeto de tipo {@link long}
     * @return Objeto de tipo {@link SizeDescriptor}
     */
    public static SizeDescriptor getSizeDescriptor(int ordinalSize, long size){
        long result = size / BYTE_SIZE;

        if(result > MIN_RESULT){
            return getSizeDescriptor(ordinalSize + ONE_VALUE, result);
        }else {
            return new SizeDescriptor(SizeKey.values()[ordinalSize], size);
        }
    }
}
