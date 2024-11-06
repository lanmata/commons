/*
 *  @(#)Response.java
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

package com.prx.commons.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;

import static com.prx.commons.util.DateUtil.PATTERN_DATE_TIME;

/**
 * Response.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'></a>Luis Antonio Mata</a>
 * @version 1.0.0, 29-09-2020
 */
@JsonNaming
public class Response {

    /**
     * Fecha y hora de emisi&oacute;n.
     */
    @JsonFormat(pattern = PATTERN_DATE_TIME)
    private LocalDateTime dateTime;
    /**
     * C&oacute;digo de respuesta.
     */
    private Integer code;
    /**
     * Mensaje de respuesta.
     */
    private String message;

    /**
     * Default constructor.
     */
    public Response() {
        //Default constructor.
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "dateTime=" + dateTime +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
