/*
 *  @(#)Instrument.java
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

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@Setter
@Getter
@JsonNaming
@NoArgsConstructor
public class Instrument implements Serializable {

    private Long id;
    private String name;
    private String description;
    private LocalCoin coinSource;
    private LocalCoin coinTarget;
    private Boolean active;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
