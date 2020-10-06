/*
 *  @(#)VendorExtensionImpl.java
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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import springfox.documentation.service.VendorExtension;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 6/9/2020
 */
@AllArgsConstructor
@NoArgsConstructor
public class VendorExtensionImpl implements VendorExtension<Object> {

    private String name;
    private String value;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Object getValue() {
        return value;
    }

}
