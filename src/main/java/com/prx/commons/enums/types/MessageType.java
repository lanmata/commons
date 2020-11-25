/*
 * @(#)ErrorType.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.prx.commons.enums.types;

import java.io.Serializable;

/**
 * ErrorType.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
public interface MessageType extends Serializable {
    /**
     * Retorna el identificador del error generado.
     *
     * @return Objeto de tipo {@link int}.
     */
    int getCode();

    /**
     * Retorna el status del error.
     *
     * @return Objeto de tipo {@link String}.
     */
    String getStatus();
}
