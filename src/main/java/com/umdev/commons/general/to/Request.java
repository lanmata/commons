/*
 *  @(#)Request.java
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

package com.umdev.commons.general.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.umdev.commons.util.DateUtil;

import java.time.LocalDateTime;

/**
 * Request.
 *
 * @author &lt;a href='mailto:luis.antonio.mata@gmail.com'&gt;Luis Antonio Mata&lt;/a&gt;
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class Request {

    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime dateTime;
    private String appName;
    private String appToken;

    /**
     * Default constructor.
     */
    public Request() {
        //Default constructor.
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    @Override
    public String toString() {
        return "Request{" +
                "dateTime=" + dateTime +
                ", appName='" + appName + '\'' +
                ", appToken='" + appToken + '\'' +
                '}';
    }
}
