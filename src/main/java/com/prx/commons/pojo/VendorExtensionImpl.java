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
