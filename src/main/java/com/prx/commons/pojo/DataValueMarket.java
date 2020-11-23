/*
 *  @(#)DataValueMarket.java
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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DataValueMarket.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
@JsonPropertyOrder({
        "bid",
        "ask",
        "last",
        "low",
        "high",
        "open",
        "close",
        "volume",
        "dateTime",
        "instrumentId",
        "market"
})
@Getter
@Setter
@NoArgsConstructor
public class DataValueMarket implements Serializable {

    private Double bid;
    private Double ask;
    private Double last;
    private Double low;
    private Double high;
    private Double open;
    private Double close;
    private Double volume;
    private LocalDateTime dateTime;
    private Long instrumentId;
    private Long marketId;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }

}

