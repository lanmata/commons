/*
 *  @(#)DataValueMarketTO.java
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

/**
 * DataValueMarketTo.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 18-08-2019
 */
@JsonNaming
public class DataValueMarketTO extends DataValueMarket {
    private String market;
    private String instrument;

    /**
     * Default constructor.
     */
    public DataValueMarketTO() {
        super();
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "DataValueMarketTO{" +
                "market='" + market + '\'' +
                ", instrument='" + instrument + '\'' +
                '}';
    }
}
