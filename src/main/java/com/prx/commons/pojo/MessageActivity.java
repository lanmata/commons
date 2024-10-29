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

import com.prx.commons.to.Response;

import java.io.Serializable;

/**
 * Se utiliza para describir las acciones o ejecuciones realizadas y el resultado de ellas para informar a los componentes
 * que lo requieran
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-11-27
 */
public class MessageActivity <T> extends Response implements Serializable {

    /**
     * Objeto respuesta esperado
     */
    private transient T objectResponse;

    /**
     * Default constructor.
     */
    public MessageActivity() {
        super();
    }

    public T getObjectResponse() {
        return this.objectResponse;
    }

    public void setObjectResponse(T objectResponse) {
        this.objectResponse = objectResponse;
    }

    @Override
    public String toString() {
        return "MessageActivity{" +
                "objectResponse=" + objectResponse +
                '}';
    }
}
