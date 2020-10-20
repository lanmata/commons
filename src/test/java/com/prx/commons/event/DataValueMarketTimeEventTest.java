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

package com.prx.commons.event;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * DataValueMarketTimeEventTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class DataValueMarketTimeEventTest {

    @Test
    void callTest(){
        final var dataValueMarketTimeEvent = new DataValueMarketTimeEvent(new Object(), new ArrayList<>());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getDataValueMarkets());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getSource());
        Assertions.assertNotNull(dataValueMarketTimeEvent.getDataValueMarkets());
        Assertions.assertNotEquals(1, dataValueMarketTimeEvent.getTimestamp());
    }

}