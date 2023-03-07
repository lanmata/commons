/*
 *  @(#)ExchangeResponse.java
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

package com.prx.commons.to.mc;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.pojo.Exchange;
import com.prx.commons.to.Response;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class ExchangeResponse extends Response {

    private Exchange exchange;

    /**
     * Default constructor.
     */
    public ExchangeResponse() {
        super();
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "ExchangeResponse{" +
                "exchange=" + exchange +
                '}';
    }
}
