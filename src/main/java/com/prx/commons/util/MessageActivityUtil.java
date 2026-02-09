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

import com.prx.commons.message.to.MessageActivity;
import com.prx.commons.general.to.Response;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Utility to create a {@link Response} from a {@link MessageActivity} instance.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata</a>
 * @version 1.0.0, 29-09-2020
 */
public final class MessageActivityUtil {

    private MessageActivityUtil(){throw new UnsupportedOperationException();}

    /**
     * Creates a {@link Response} based on the provided {@link MessageActivity}.
     *
     * @param messageActivity source message activity
     * @return newly created {@link Response}
     */
    public static Response toResponse(MessageActivity<?> messageActivity){
        Response response = new Response();
        toResponse(messageActivity, response);

        return response;
    }

    /**
     * Populates the given {@link Response} instance using values from {@link MessageActivity}.
     *
     * @param messageActivity source message activity
     * @param response response to populate
     */
    public static void toResponse(MessageActivity<?> messageActivity, Response response){
        response.setMessage(messageActivity.getMessage());
        response.setCode(messageActivity.getCode());
        response.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
    }
}
