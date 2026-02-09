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
    INTERNAL_SERVER_ERROR(500, "Internal server error."),
    NOT_IMPLEMENTED(501, "The server does not recognize the method or lacks the ability to fulfill it."),
    BAD_GATEWAY(502, "The server received an invalid response from an upstream server."),
    SERVICE_UNAVAILABLE(503, "The server is currently unavailable."),
    GATEWAY_TIMEOUT(504, "The server did not receive a timely response from another server."),
    HTTP_VERSION_NOT_SUPPORTED(505, "The HTTP version is not supported by the server.");

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
