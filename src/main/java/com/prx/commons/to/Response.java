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
import com.prx.commons.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static com.prx.commons.util.DateUtil.PATTERN_DATE_TIME;

/**
 * Response.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'></a>Luis Antonio Mata</a>
 * @version 1.0.0, 29-09-2020
 */
@Getter
@Setter
@JsonNaming
@NoArgsConstructor
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

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
