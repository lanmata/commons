package com.prx.commons.to.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
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

    public String toString(){
        return toJson(this);
    }

}
