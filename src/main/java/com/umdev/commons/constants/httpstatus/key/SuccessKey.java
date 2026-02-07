package com.umdev.commons.constants.httpstatus.key;

import com.umdev.commons.constants.httpstatus.type.MessageType;

/**
 * SuccessKey.
 * <p>
 * Enum representing HTTP success status codes (2xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 *
 * @author Luis Antonio Mata
 */
public enum SuccessKey implements MessageType {
    OK(200, "La solicitud ha tenido éxito."),
    CREATED(201, "El recurso ha sido creado correctamente."),
    ACCEPTED(202, "La solicitud ha sido aceptada para procesamiento."),
    NO_CONTENT(204, "La solicitud se ha completado sin contenido.");

    private final int code;
    private final String status;
    private final String codeToString;

    SuccessKey(final int code, final String status) {
        this.code = code;
        this.codeToString = String.valueOf(code);
        this.status = status;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getCodeToString() {
        return codeToString;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
