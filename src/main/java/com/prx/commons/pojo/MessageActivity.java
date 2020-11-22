/*
 *  @(#)MessageActivity.java
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

package com.prx.commons.pojo;

import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Se utiliza para describir las acciones o ejecuciones realizadas y el resultado de ellas para informar a los componentes
 * que lo requieran
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-11-27
 */
@Setter
@Getter
@NoArgsConstructor
public class MessageActivity <T> implements Serializable {

    /**
     * Campo compuesto por clave-valor, donde la clave es el c&oacute;digo y valor es el mensaje que se informa
     */
    private Map<Integer, String> messages = new ConcurrentHashMap<>();
    /**
     * Objeto respuesta esperado
     */
    private transient T objectResponse;

    public String toString(){
        return JsonUtil.toJson(this);
    }
}
