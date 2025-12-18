/*
 *  @(#)PrinterUtil.java
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

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * PrinterUtil.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 29-09-2019
 */
@Service
public final class PrinterUtil {

    @Value("${log.debug}")
    private boolean isDebug;

    /**
     * Default constructor.
     */
    public PrinterUtil() {
        // Default constructor.
    }

    /**
     * Imprime la traza si dentro de los par&aacute;metros de configuraci&oacute;n esta en modo debug
     *
     * @param object Objeto de tipo {@link Object}
     * @param logger Objeto de tipo {@link Logger}
     */
    public void print(Object object, Logger logger){
        if(isDebug){
            logger.info(object);
        }
    }

    /**
     * Imprime la traza si el par&aacute;metro {@code enable} es {@code true}
     *
     * @param object Objeto de tipo {@link Object}
     * @param logger Objeto de tipo {@link Logger}
     * @param enable Objeto de tipo {@link boolean}
     */
    public void print(Object object, Logger logger, boolean enable){
        if(enable){
            logger.info(object);
        }
    }
}
