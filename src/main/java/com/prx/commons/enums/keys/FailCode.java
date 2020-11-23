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
package com.prx.commons.enums.keys;

import com.prx.commons.enums.types.MessageType;

/**
 * FailCode. Define el estada para excepciones y manejo de errores durante la ejecuc&oacute;n
 *
 * @author Luis Antonio Mata
 * @version 1.0.3.20200904-01, 21-11-2020
 */
public enum FailCode implements MessageType {
    BAD_REQUEST(400, "La solicitud no fue comprendida por el servidor, sintaxis incorrecta."),
    UNAUTHORIZED(401, "La solicitud requiere información de autenticación de usuario."),
    FORBIDDEN(403, "Solicitud no autorizada. El cliente no tiene accesos a el contenido.");

    private final int code;
    private final String status;

    /**
     * Constructor.
     * @param code {@link int}
     * @param status {@link String}
     */
    FailCode(final int code, final String status) {
        this.code = code;
        this.status = status;
    }

    /**
     * Retorna c&oacute;digo de fallo.
     * @return {@link int}
     */
    @Override public int getCode() {
        return code;
    }

    /**
     * Retorna mensaje de estado.
     * @return {@link String}
     */
    @Override public String getStatus() {
        return status;
    }

}
