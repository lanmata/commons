/*
 *  @(#)SizeDescriptor.java
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

package com.prx.commons.io.pojo;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.constants.keys.SizeKey;

@JsonNaming
public class SizeDescriptor {

    private SizeKey sizeKey;
    private double size;

    /**
     *
     * @param sizeKey
     * @param size
     */
    public SizeDescriptor(SizeKey sizeKey, double size) {
        this.sizeKey = sizeKey;
        this.size = size;
    }

    /**
     * Default constructor.
     */
    public SizeDescriptor() {
        //Default constructor.
    }

    public SizeKey getSizeKey() {
        return this.sizeKey;
    }

    public double getSize() {
        return this.size;
    }

    public void setSizeKey(SizeKey sizeKey) {
        this.sizeKey = sizeKey;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SizeDescriptor{" +
                "sizeKey=" + sizeKey +
                ", size=" + size +
                '}';
    }
}
