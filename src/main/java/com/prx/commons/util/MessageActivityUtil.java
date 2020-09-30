/*
 *  @(#)MessageActivityUtil.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

package com.prx.commons.util;

import com.prx.commons.pojo.MessageActivity;
import com.prx.commons.to.Response;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * MessageActivityUtil.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 29-09-2020
 */
public final class MessageActivityUtil {

    private MessageActivityUtil(){}

    /**
     *
     * @param messageActivity
     * @return
     */
    public static Response toResponse(MessageActivity messageActivity){
        Response response = new Response();
        toResponse(messageActivity, response);

        return response;
    }

    /**
     *
     * @param messageActivity
     * @param response
     * @return
     */
    public static void toResponse(MessageActivity messageActivity, Response response){
        messageActivity.getMessages().forEach((code, message)-> {
            response.setCode(code);
            response.setMessage(message);
        });

        response.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
    }
}
