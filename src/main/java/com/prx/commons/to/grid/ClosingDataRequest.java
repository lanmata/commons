package com.prx.commons.to.grid;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.pojo.DataValueMarket;
import com.prx.commons.to.Request;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-08-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ClosingDataRequest extends Request {
    @ApiModelProperty(
            name = "list",
            value = "Lista de objetos de tipo {@link DataValueMarket}"
    )
    private List<DataValueMarket> dataValueMarketList;

    @Override
    public String toString(){
        return toJson(this);
    }
}
