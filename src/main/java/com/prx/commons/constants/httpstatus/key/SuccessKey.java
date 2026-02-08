package com.prx.commons.constants.httpstatus.key;

import com.prx.commons.constants.httpstatus.type.MessageType;

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
    OK(200, "The request was successful."),
    CREATED(201, "The resource was created successfully."),
    ACCEPTED(202, "The request has been accepted for processing."),
    NO_CONTENT(204, "The request completed successfully with no content.");

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
