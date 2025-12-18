package com.umdev.commons.constants.httpstatus.key;

import com.umdev.commons.constants.httpstatus.type.MessageType;

/**
 * ClientErrorKey.
 * <p>
 * Enum representing HTTP client error status codes (4xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 *
 * @author Luis Antonio Mata
 */
public enum ClientErrorKey implements MessageType {
    BAD_REQUEST(400, "La solicitud no fue comprendida por el servidor, sintaxis incorrecta."),
    UNAUTHORIZED(401, "La solicitud requiere información de autenticación de usuario."),
    PAYMENT_REQUIRED(402, "Pago requerido para acceder al recurso."),
    FORBIDDEN(403, "Solicitud no autorizada. El cliente no tiene acceso al contenido."),
    NOT_FOUND(404, "El recurso solicitado no fue encontrado."),
    METHOD_NOT_ALLOWED(405, "El método de solicitud no está permitido para el recurso."),
    NOT_ACCEPTABLE(406, "El recurso solicitado no es aceptable según los encabezados enviados."),
    CONFLICT(409, "Conflicto con el estado actual del recurso."),
    GONE(410, "El recurso solicitado ya no está disponible y no lo estará nuevamente."),
    LENGTH_REQUIRED(411, "Longitud no cumple con la longitud minima requerida"),
    UNSUPPORTED_MEDIA_TYPE(415, "El tipo de medio de la solicitud no es compatible con el servidor.");

    private final int code;
    private final String status;
    private final String codeToString;

    ClientErrorKey(final int code, final String status) {
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
