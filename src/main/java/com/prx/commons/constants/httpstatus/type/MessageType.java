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
package com.prx.commons.constants.httpstatus.type;

import java.io.Serializable;

/**
 * ErrorType.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 21-11-2020
 */
public interface MessageType extends Serializable {
    DefaultMessage DEFAULT_MESSAGE = DefaultMessage.EMPTY;

    /**
     * Retrieves the code associated with the implementing class.
     *
     * @return an integer representing the specific code of the object.
     */
    int getCode();

    /**
     * Converts and returns the error code as a string representation.
     *
     * @return A string representation of the error code.
     */
    String getCodeToString();

    /**
     * Retrieves the status as a string.
     *
     * @return the status associated with the object.
     */
    String getStatus();
}
