package com.prx.commons.util;

import com.prx.commons.constants.httpstatus.key.ClientErrorKey;
import com.prx.commons.constants.httpstatus.key.SuccessKey;
import com.prx.commons.constants.httpstatus.type.MessageType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpStatusUtilExtraTest {

    @Test
    @DisplayName("getMessageType returns SuccessKey for 200")
    void success200() {
        MessageType mt = HttpStatusUtil.getMessageType(HttpStatusUtil.OK);
        assertEquals(SuccessKey.OK.getCode(), mt.getCode());
        assertNotNull(mt.getStatus());
    }

    @Test
    @DisplayName("getMessageType returns ClientErrorKey for 404")
    void client404() {
        MessageType mt = HttpStatusUtil.getMessageType(HttpStatusUtil.NOT_FOUND);
        assertEquals(ClientErrorKey.NOT_FOUND.getCode(), mt.getCode());
        assertNotNull(mt.getStatus());
    }

    @Test
    @DisplayName("getMessageType returns DEFAULT_MESSAGE for unknown code")
    void unknown() {
        MessageType mt = HttpStatusUtil.getMessageType(999);
        assertEquals(MessageType.DEFAULT_MESSAGE.getCode(), mt.getCode());
    }
}

