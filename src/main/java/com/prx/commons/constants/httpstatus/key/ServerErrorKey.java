package com.prx.commons.constants.httpstatus.key;

import com.prx.commons.constants.httpstatus.type.MessageType;

/**
 * ServerErrorKey.
 * <p>
 * Enum representing HTTP server error status codes (5xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 *
 * @author Luis Antonio Mata
 */
public enum ServerErrorKey implements MessageType {
    INTERNAL_SERVER_ERROR(500, "Error interno del servidor."),
    NOT_IMPLEMENTED(501, "El servidor no reconoce el método o no tiene la capacidad de cumplirlo."),
    BAD_GATEWAY(502, "El servidor recibió una respuesta inválida del servidor ascendente."),
    SERVICE_UNAVAILABLE(503, "El servidor no está disponible actualmente."),
    GATEWAY_TIMEOUT(504, "El servidor no recibió una respuesta a tiempo de otro servidor."),
    HTTP_VERSION_NOT_SUPPORTED(505, "La versión HTTP no es soportada por el servidor.");

    private final int code;
    private final String status;
    private final String codeToString;

    ServerErrorKey(final int code, final String status) {
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
