package com.prx.commons.to.mc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.pojo.Exchange;
import com.prx.commons.to.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "exchange"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeResponse extends Response {

    @JsonProperty("exchange")
    private Exchange exchange;

    @Override
    public String toString() {
        return String.format("%s{%s, exchange: %s}", this.getClass().getSimpleName(), super.toString(), exchange.toString());
    }

}
