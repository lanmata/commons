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

/**
 * Describes a size value together with its unit key.
 *
 * Contains a {@link SizeKey} and a numeric size value.
 */
@JsonNaming
public class SizeDescriptor {

    private SizeKey sizeKey;
    private double size;

    /**
     * Creates a SizeDescriptor with the given key and size.
     *
     * @param sizeKey the unit key (e.g., BYTE, KB)
     * @param size the numeric size value
     */
    public SizeDescriptor(SizeKey sizeKey, double size) {
        this.sizeKey = sizeKey;
        this.size = size;
    }

    /** Default constructor. */
    public SizeDescriptor() {
        //Default constructor.
    }

    /**
     * Gets the size key.
     *
     * @return the {@link SizeKey}
     */
    public SizeKey getSizeKey() {
        return this.sizeKey;
    }

    /**
     * Gets the numeric size.
     *
     * @return numeric size value
     */
    public double getSize() {
        return this.size;
    }

    /**
     * Sets the size key.
     *
     * @param sizeKey the size key to set
     */
    public void setSizeKey(SizeKey sizeKey) {
        this.sizeKey = sizeKey;
    }

    /**
     * Sets the numeric size value.
     *
     * @param size the numeric size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Returns a string representation of this descriptor.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "SizeDescriptor{" +
                "sizeKey=" + sizeKey +
                ", size=" + size +
                '}';
    }
}
