package com.prx.commons.to.mc;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.pojo.Exchange;
import com.prx.commons.to.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ExchangeResponse extends Response {

    private Exchange exchange;

    @Override
    public String toString() {
        return toJson(this);
    }

}
