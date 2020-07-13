package com.prx.commons.util;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrinterUtil {
    @Value("${log.debug}")
    private Boolean isDebug;

    /**
     * Imprime la traza si dentro de los parametros de configuracion esta en modo debug
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
     * Imprime la traza si el parametro {@code enable} es {@code true}
     *
     * @param object Objeto de tipo {@link Object}
     * @param logger Objeto de tipo {@link Logger}
     * @param enable Objeto de tipo {@link Boolean}
     */
    public void print(Object object, Logger logger, Boolean enable){
        if(enable){
            logger.info(object);
        }
    }
}
