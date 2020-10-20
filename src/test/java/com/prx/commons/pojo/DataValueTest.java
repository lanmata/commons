/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */
package com.prx.commons.pojo;

import com.prx.commons.enums.types.OperationType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * DataValueTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class DataValueTest {

    @Test
    void gettersAndSetters(){
        final var dataValue = new DataValue();

        dataValue.setId(1L);
        dataValue.setAmount(BigDecimal.valueOf(2525.36D));
        dataValue.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        dataValue.setLastValue(BigDecimal.valueOf(5825.36D));
        dataValue.setOperationType(OperationType.BUY);
        dataValue.setCurrencyPairExchange(new CurrencyPairExchange());

        assertAll("Test Getters And Setters",
            () -> assertNotNull(dataValue.getId()),
            () -> assertNotNull(dataValue.getAmount()),
            () -> assertNotNull(dataValue.getDateTime()),
            () -> assertNotNull(dataValue.getLastValue()),
            () -> assertNotNull(dataValue.getOperationType()),
            () -> assertNotNull(dataValue.getCurrencyPairExchange()),
            () -> assertNotNull(dataValue.toString()),
            () -> assertNotEquals(1, dataValue.hashCode()),
            () -> assertNotEquals(new DataValue(), dataValue)
                 );
    }

}