/*
 *  @(#)Exchange.java
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "id", "name", "description", "currencySource", "currencyTarget", "active"
})
@Setter
@Getter
@NoArgsConstructor
public class Exchange implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("headquarters")
    private String headquarters;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("instruments")
    private List<Instrument> instruments;

    @Override
    public String toString() {
        return toJson(this);
    }
}
