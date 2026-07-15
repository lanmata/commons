package com.umdc.commons.constants.keys;

public enum UserKeys implements MessageKey {
    USER_CREATED,
    USER_UPDATED,
    USER_DELETED,
    USER_NOT_FOUND;

    @Override
    public String key() {
        return name();
    }
}
