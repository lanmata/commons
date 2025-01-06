/*
 *  @(#)InfoTicker.java
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.constants.keys.ParityKey;

import java.io.Serializable;

@JsonNaming
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoTicker extends DataValueMarket implements Serializable {

    private ParityKey parityKey;

    /**
     * Default constructor.
     */
    public InfoTicker() {
        super();
    }

    public ParityKey getParityKey() {
        return this.parityKey;
    }

    public void setParityKey(ParityKey parityKey) {
        this.parityKey = parityKey;
    }

    @Override
    public String toString() {
        return "InfoTicker{" +
                "parityKey=" + parityKey +
                '}';
    }
}
