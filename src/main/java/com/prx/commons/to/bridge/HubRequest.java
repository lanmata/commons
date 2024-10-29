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

import java.util.List;

/**
 * HubRequest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
        "dataValueMarkets"
})
public class HubRequest extends Request {

    /**
     * Colecci&oacute;n de tipo {@link DataValueMarket}
     */
    @JsonProperty("dataValueMarkets")
    private List<DataValueMarket> dataValueMarkets;

    /**
     * Default constructor.
     */
    public HubRequest() {
        super();
    }

    public List<DataValueMarket> getDataValueMarkets() {
        return dataValueMarkets;
    }

    public void setDataValueMarkets(List<DataValueMarket> dataValueMarkets) {
        this.dataValueMarkets = dataValueMarkets;
    }

    @Override
    public String toString() {
        return "HubRequest{" +
                "dataValueMarkets=" + dataValueMarkets +
                '}';
    }
}
