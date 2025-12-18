package com.umdev.commons.constants.httpstatus.key;

import com.umdev.commons.constants.httpstatus.type.MessageType;

/**
 * RedirectionKey.
 * <p>
 * Enum representing HTTP redirection status codes (3xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 */
public enum RedirectionKey implements MessageType {
    MULTIPLE_CHOICES(300, "Hay múltiples opciones para el recurso solicitado."),
    MOVED_PERMANENTLY(301, "El recurso ha sido movido permanentemente."),
    FOUND(302, "El recurso ha sido encontrado en otra ubicación temporalmente."),
    SEE_OTHER(303, "El recurso ha sido encontrado."),
    NOT_MODIFIED(304, "El recurso no ha sido modificado desde la última solicitud.");

    private final int code;
    private final String status;
    private final String codeToString;

    RedirectionKey(final int code, final String status) {
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
