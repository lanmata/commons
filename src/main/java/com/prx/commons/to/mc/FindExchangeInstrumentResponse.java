package com.prx.commons.to.mc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.ExchangeInstrument;
import com.prx.commons.to.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @since 2019-07-06
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
        "list"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindExchangeInstrumentResponse extends Response {
    @JsonProperty("list")
    private List<ExchangeInstrument> list;

    @Override
    public String toString(){
        return toJson(this);
    }
}
