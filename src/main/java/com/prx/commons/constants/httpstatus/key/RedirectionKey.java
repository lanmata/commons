package com.prx.commons.constants.httpstatus.key;

import com.prx.commons.constants.httpstatus.type.MessageType;

/**
 * RedirectionKey.
 * <p>
 * Enum representing HTTP redirection status codes (3xx) and their descriptions.
 * Implements MessageType for standardized access to code and message.
 * </p>
 */
public enum RedirectionKey implements MessageType {
    MULTIPLE_CHOICES(300, "There are multiple options for the requested resource."),
    MOVED_PERMANENTLY(301, "The resource has been moved permanently."),
    FOUND(302, "The resource has been found at a different temporary location."),
    SEE_OTHER(303, "The resource can be found under a different URI."),
    NOT_MODIFIED(304, "The resource has not been modified since the last request.");

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
