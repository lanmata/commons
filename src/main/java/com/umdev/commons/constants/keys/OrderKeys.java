package com.umdev.commons.constants.keys;

public enum OrderKeys implements MessageKey {
    ORDER_PLACED,
    ORDER_CANCELLED,
    ORDER_COMPLETED,
    ORDER_NOT_FOUND;

    @Override
    public String key() {
        return name();
    }
}
