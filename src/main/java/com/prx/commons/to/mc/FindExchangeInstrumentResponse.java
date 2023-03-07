/*
 *  @(#)FindExchangeInstrumentResponse.java
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
import com.prx.commons.pojo.ExchangeInstrument;
import com.prx.commons.to.Response;

import java.util.List;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 06-07-2019
 */
@JsonNaming
public class FindExchangeInstrumentResponse extends Response {

    private List<ExchangeInstrument> list;

    /**
     * Default constructor.
     */
    public FindExchangeInstrumentResponse() {
        super();
    }

    public List<ExchangeInstrument> getList() {
        return list;
    }

    public void setList(List<ExchangeInstrument> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "FindExchangeInstrumentResponse{" +
                "list=" + list +
                '}';
    }
}
