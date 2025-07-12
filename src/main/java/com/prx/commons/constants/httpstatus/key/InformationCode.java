package com.prx.commons.constants.httpstatus.key;

import com.prx.commons.constants.httpstatus.type.MessageType;

/**
 * InformationCode.
 * <p>
 * Enum representing HTTP informational status codes (1xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 */
public enum InformationCode implements MessageType {
    CONTINUE(100, "La solicitud ha sido recibida y el proceso puede continuar."),
    SWITCHING_PROTOCOLS(101, "El servidor acepta cambiar de protocolo."),
    PROCESSING(102, "El servidor ha recibido y está procesando la solicitud.");

    private final int code;
    private final String status;
    private final String codeToString;

    InformationCode(final int code, final String status) {
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
