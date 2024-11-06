/*
 *  @(#)TicketSubscriberTO.java
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

/**
 * TicketSubscriberTO.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 18-08-2019
 */
@JsonNaming
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TicketSubscriberTO implements Serializable {
    private String event;
    private String channel;
    private String chanId;
    private String symbol;
    private String pair;
    private String msg;
    private String code;
    private String version;
    private String serverId;
    private PlatformTO platform;

    /**
     * Default constructor.
     */
    public TicketSubscriberTO() {
        // Default constructor.
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChanId() {
        return chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public PlatformTO getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformTO platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "TicketSubscriberTO{" +
                "event='" + event + '\'' +
                ", channel='" + channel + '\'' +
                ", chanId='" + chanId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", pair='" + pair + '\'' +
                ", msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", version='" + version + '\'' +
                ", serverId='" + serverId + '\'' +
                ", platform=" + platform +
                '}';
    }
}
