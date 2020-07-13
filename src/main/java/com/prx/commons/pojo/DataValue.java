package com.prx.commons.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.prx.commons.enums.types.OperationType;
import static com.prx.commons.util.JsonUtil.toJson;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@JsonPropertyOrder({
    "id",
    "lastValue",
    "currencyPairExchange",
    "dateTime",
    "operationType",
    "amount"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataValue implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("lastValue")
    private BigDecimal lastValue;
    @JsonProperty("currencyPairExchange")
    private CurrencyPairExchange currencyPairExchange;
    @JsonProperty("dateTime")
    private LocalDateTime dateTime;
    @JsonProperty("operationType")
    private OperationType operationType;
    @JsonProperty("amount")
    private BigDecimal amount;
    
    @Override
    public String toString(){
        return toJson(this);
    }
}
