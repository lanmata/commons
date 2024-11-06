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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TicketSubscriberTOTest.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.0, 30-09-2020
 */
class TicketSubscriberTOTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link TicketSubscriberTO}
     *   <li>{@link TicketSubscriberTO#setChanId(String)}
     *   <li>{@link TicketSubscriberTO#setChannel(String)}
     *   <li>{@link TicketSubscriberTO#setCode(String)}
     *   <li>{@link TicketSubscriberTO#setEvent(String)}
     *   <li>{@link TicketSubscriberTO#setMsg(String)}
     *   <li>{@link TicketSubscriberTO#setPair(String)}
     *   <li>{@link TicketSubscriberTO#setPlatform(PlatformTO)}
     *   <li>{@link TicketSubscriberTO#setServerId(String)}
     *   <li>{@link TicketSubscriberTO#setSymbol(String)}
     *   <li>{@link TicketSubscriberTO#setVersion(String)}
     *   <li>{@link TicketSubscriberTO#toString()}
     *   <li>{@link TicketSubscriberTO#getChanId()}
     *   <li>{@link TicketSubscriberTO#getChannel()}
     *   <li>{@link TicketSubscriberTO#getCode()}
     *   <li>{@link TicketSubscriberTO#getEvent()}
     *   <li>{@link TicketSubscriberTO#getMsg()}
     *   <li>{@link TicketSubscriberTO#getPair()}
     *   <li>{@link TicketSubscriberTO#getPlatform()}
     *   <li>{@link TicketSubscriberTO#getServerId()}
     *   <li>{@link TicketSubscriberTO#getSymbol()}
     *   <li>{@link TicketSubscriberTO#getVersion()}
     * </ul>
     */
    @Test
    void testConstructor() {
        TicketSubscriberTO actualTicketSubscriberTO = new TicketSubscriberTO();
        actualTicketSubscriberTO.setChanId("42");
        actualTicketSubscriberTO.setChannel("Channel");
        actualTicketSubscriberTO.setCode("Code");
        actualTicketSubscriberTO.setEvent("Event");
        actualTicketSubscriberTO.setMsg("Msg");
        actualTicketSubscriberTO.setPair("Pair");
        PlatformTO platform = new PlatformTO();
        platform.setStatus(1);
        actualTicketSubscriberTO.setPlatform(platform);
        actualTicketSubscriberTO.setServerId("42");
        actualTicketSubscriberTO.setSymbol("Symbol");
        actualTicketSubscriberTO.setVersion("1.0.2");
        String actualToStringResult = actualTicketSubscriberTO.toString();
        assertEquals("42", actualTicketSubscriberTO.getChanId());
        assertEquals("Channel", actualTicketSubscriberTO.getChannel());
        assertEquals("Code", actualTicketSubscriberTO.getCode());
        assertEquals("Event", actualTicketSubscriberTO.getEvent());
        assertEquals("Msg", actualTicketSubscriberTO.getMsg());
        assertEquals("Pair", actualTicketSubscriberTO.getPair());
        assertSame(platform, actualTicketSubscriberTO.getPlatform());
        assertEquals("42", actualTicketSubscriberTO.getServerId());
        assertEquals("Symbol", actualTicketSubscriberTO.getSymbol());
        assertEquals("1.0.2", actualTicketSubscriberTO.getVersion());
        assertEquals(
                "TicketSubscriberTO{event='Event', channel='Channel', chanId='42', symbol='Symbol', pair='Pair',"
                        + " msg='Msg', code='Code', version='1.0.2', serverId='42', platform=PlatformTO{status=1}}",
                actualToStringResult);
    }

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

        Assertions.assertAll("GettersAndSetters",
                () -> Assertions.assertNotNull(ticketSubscriberTO.getChanId()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getChannel()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getCode()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getEvent()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getMsg()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getPair()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getPlatform()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getServerId()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getSymbol()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.getVersion()),
                () -> Assertions.assertNotNull(ticketSubscriberTO.toString()),
                () -> Assertions.assertNotEquals(1, ticketSubscriberTO.hashCode()),
                () -> Assertions.assertNotEquals(new TicketSubscriberTO(), ticketSubscriberTO)
        );
    }

}
