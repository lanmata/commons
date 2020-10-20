/*
 *  @(#)TicketSubscriberTOTest.java
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

package com.prx.commons.to.client;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * TicketSubscriberTOTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 30-09-2020
 */
class TicketSubscriberTOTest {

    @Test
    void testGettersAndSetters() {
        final var ticketSubscriberTO = new TicketSubscriberTO();
        final var platformTO = new PlatformTO();

        platformTO.setStatus(1);
        ticketSubscriberTO.setChanId("ABC14548");
        ticketSubscriberTO.setChannel("AC2258");
        ticketSubscriberTO.setCode("OK200");
        ticketSubscriberTO.setEvent("evt22589");
        ticketSubscriberTO.setMsg("Mensaje");
        ticketSubscriberTO.setPair("USDCLP");
        ticketSubscriberTO.setPlatform(platformTO);
        ticketSubscriberTO.setServerId("AB73777");
        ticketSubscriberTO.setSymbol("USCCLP");
        ticketSubscriberTO.setVersion("1125");

        assertAll("GettersAndSetters",
            () -> assertNotNull(ticketSubscriberTO.getChanId()),
            () -> assertNotNull(ticketSubscriberTO.getChannel()),
            () -> assertNotNull(ticketSubscriberTO.getCode()),
            () -> assertNotNull(ticketSubscriberTO.getEvent()),
            () -> assertNotNull(ticketSubscriberTO.getMsg()),
            () -> assertNotNull(ticketSubscriberTO.getPair()),
            () -> assertNotNull(ticketSubscriberTO.getPlatform()),
            () -> assertNotNull(ticketSubscriberTO.getServerId()),
            () -> assertNotNull(ticketSubscriberTO.getSymbol()),
            () -> assertNotNull(ticketSubscriberTO.getVersion()),
            () -> assertNotNull(ticketSubscriberTO.toString()),
            () -> assertNotEquals(1, ticketSubscriberTO.hashCode()),
            () -> assertNotEquals(new TicketSubscriberTO(), ticketSubscriberTO)
                 );
    }

}