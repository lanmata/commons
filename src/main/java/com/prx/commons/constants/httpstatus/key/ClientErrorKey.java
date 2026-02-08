package com.prx.commons.constants.httpstatus.key;

import com.prx.commons.constants.httpstatus.type.MessageType;

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
    BAD_REQUEST(400, "The request was malformed or contained invalid syntax."),
    UNAUTHORIZED(401, "Authentication is required to access the resource."),
    PAYMENT_REQUIRED(402, "Payment is required to access the resource."),
    FORBIDDEN(403, "The request is not authorized. The client does not have access to the content."),
    NOT_FOUND(404, "The requested resource was not found."),
    METHOD_NOT_ALLOWED(405, "The request method is not allowed for the resource."),
    NOT_ACCEPTABLE(406, "The requested resource is not acceptable according to the provided headers."),
    CONFLICT(409, "There is a conflict with the current state of the resource."),
    GONE(410, "The requested resource is no longer available and will not be available again."),
    LENGTH_REQUIRED(411, "The request does not meet the minimum length requirement."),
    UNSUPPORTED_MEDIA_TYPE(415, "The media type of the request is not supported by the server.");

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
