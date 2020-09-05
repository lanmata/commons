package com.prx.commons.util;

import com.prx.commons.pojo.MessageActivity;
import com.prx.commons.to.Response;

import static java.time.LocalDateTime.now;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-11-27
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

        response.setDateTime(now().toString());
    }
}
