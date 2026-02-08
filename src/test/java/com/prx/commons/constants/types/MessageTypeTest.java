package com.prx.commons.constants.types;

import com.prx.commons.constants.httpstatus.type.MessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class MessageTypeTest {

    @Test
    @DisplayName("DEFAULT_MESSAGE has a non-negative code and non-null status")
    void keys() {
        Assertions.assertNotEquals(-1, MessageType.DEFAULT_MESSAGE.getCode());
        Assertions.assertNotNull(MessageType.DEFAULT_MESSAGE.getStatus());
    }

}
