package com.prx.commons.to.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@NoArgsConstructor
@JsonPropertyOrder({
        "event",
        "channel",
        "chanId",
        "symbol",
        "pair",
        "msg",
        "code",
        "version",
        "serverId",
        "platform"
})
public class TicketSubscriberTO implements Serializable {
    @JsonProperty("event")
    private String event;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("chanId")
    private String chanId;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("pair")
    private String pair;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("code")
    private String code;
    @JsonProperty("version")
    private String version;
    @JsonProperty("serverId")
    private String serverId;
    @JsonProperty("platform")
    private PlatformTO platform;

    public String toString(){
        return toJson(this);
    }

}
