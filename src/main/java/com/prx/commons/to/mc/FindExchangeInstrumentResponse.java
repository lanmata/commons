package com.prx.commons.to.mc;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FindExchangeInstrumentResponse extends Response {
    private List<ExchangeInstrument> list;

    @Override
    public String toString(){
        return toJson(this);
    }
}
