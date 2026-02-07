/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */
package com.prx.commons.exception;

import com.prx.commons.constants.httpstatus.type.MessageType;

/**
 * StandardException.
 *
 * @author Luis Antonio Mata
 * @version 1.0.3.20200904-01, 21-11-2020
 */
public class StandardException extends RuntimeException {

    private final MessageType messageType;
    private final String application;
    private static final String APP_NODEF = "NO-DEF";

    /**
     * Constructor.
     *
     * @param messageType {@link MessageType}
     */
    public StandardException(final MessageType messageType) {
        this(APP_NODEF, messageType);
    }

    /**
     * Constructor.
     *
     * @param messageType {@link MessageType}
     */
    public StandardException(final MessageType messageType, Throwable throwable) {
        this(APP_NODEF, messageType, throwable);
    }

    /**
     * Constructor
     *
     * @param app         {@link String}
     * @param messageType {@link MessageType}
     */
    public StandardException(final String app, final MessageType messageType) {
        super();
        this.messageType = messageType;
        this.application = app;
    }

    /**
     * Constructor
     *
     * @param app         {@link String}
     * @param messageType {@link MessageType}
     * @param throwable   {@link Throwable}
     */
    public StandardException(final String app, final MessageType messageType, Throwable throwable) {
        super(throwable);
        this.messageType = messageType;
        this.application = app;
    }

    /**
     * Retorna el c&oacute;digo de fallo.
     *
     * @return {@link int}
     */
    public int getCode() {
        return this.messageType.getCode();
    }

    /**
     * Retorna el mensaje de estado.
     *
     * @return {@link String}
     */
    public MessageType getStatus() {
        return this.messageType;
    }

    /**
     * Retorna el identificador de la aplicaci&oacute;n ejecutante.
     *
     * @return Objeto de tipo {@link String}.
     */
    public String getApp() {
        return this.application;
    }

}
