/*
 *  @(#)ClosingDataRequest.java
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

package com.prx.commons.to.grid;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.pojo.DataValueMarket;
import com.prx.commons.to.Request;

import java.util.List;

/**
 * ClosingDataRequest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 18-08-2019
 */
@JsonNaming
public class ClosingDataRequest extends Request {
    private List<DataValueMarket> dataValueMarketList;

    /**
     * Default constructor.
     */
    public ClosingDataRequest() {
        super();
    }

    public List<DataValueMarket> getDataValueMarketList() {
        return dataValueMarketList;
    }

    public void setDataValueMarketList(List<DataValueMarket> dataValueMarketList) {
        this.dataValueMarketList = dataValueMarketList;
    }

    @Override
    public String toString() {
        return "ClosingDataRequest{" +
                "dataValueMarketList=" + dataValueMarketList +
                '}';
    }
}
