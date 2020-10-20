/*
 *  @(#)SizeKey.java
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
package com.prx.commons.enums.keys;

public enum SizeKey {
    BYTES("b"), KILOBYTES("kb"), MEGABYTES("mb"), GIGABYTES("gb"), TERABYTES("tb"), PETABYTES("pb"), EXABYTES(
        "eb"), ZETABYTES("zb"), YOTABYTES("yb");

    private final String type;

    SizeKey(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
