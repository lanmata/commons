/*
 *  @(#)HubRequest.java
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

package com.prx.commons.to.bridge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.DataValueMarket;
import com.prx.commons.to.Request;
import static com.prx.commons.util.JsonUtil.toJson;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * HubRequest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
    "dataValueMarkets"
})
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HubRequest extends Request {

    /**
     * Colecci&oacute;n de tipo {@link DataValueMarket}
     */
    @JsonProperty("dataValueMarkets")
    private List<DataValueMarket> dataValueMarkets;

    @Override
    public String toString() {
        return toJson(this);
    }

}
