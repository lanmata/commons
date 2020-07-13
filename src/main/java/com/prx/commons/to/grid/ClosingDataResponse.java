package com.prx.commons.to.grid;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prx.commons.to.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-08-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
        "list"
})
@EqualsAndHashCode(callSuper = true)
public class ClosingDataResponse extends Response {
    private List<DataValueMarketTo> list;
}
