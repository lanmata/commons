package com.prx.commons.constants.httpstatus.type;

/**
 * DefaultMessage.
 * <p>
 * Enum representing a default or empty HTTP message type.
 * Implements MessageType for standardized access to code and message.
 * </p>
 */
public enum DefaultMessage implements MessageType {

    EMPTY(0, "");

    private final int code;
    private final String codeToString;
    private final String status;

    DefaultMessage(int code, String status) {
        this.code = code;
        this.codeToString = String.valueOf(code);
        this.status = status;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getCodeToString() {
        return codeToString;
    }

}
