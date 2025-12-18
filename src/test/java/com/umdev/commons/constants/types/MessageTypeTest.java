package com.umdev.commons.constants.types;

import com.umdev.commons.constants.httpstatus.type.MessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MessageTypeTest {

    @Test
    void keys() {
        Assertions.assertNotEquals(-1, MessageType.DEFAULT_MESSAGE.getCode());
        Assertions.assertNotNull(MessageType.DEFAULT_MESSAGE.getStatus());
    }

}
