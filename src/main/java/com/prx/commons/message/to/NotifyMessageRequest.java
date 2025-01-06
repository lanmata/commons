/*
 *  @(#)NotifyMessageRequest.java
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

package com.prx.commons.message.to;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.prx.commons.general.to.Request;

import java.util.List;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class NotifyMessageRequest extends Request {

    private String message;
    private List<String> listDestiny;
    private Boolean critical;

    /**
     * Default constructor.
     */
    public NotifyMessageRequest() {
        super();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getListDestiny() {
        return listDestiny;
    }

    public void setListDestiny(List<String> listDestiny) {
        this.listDestiny = listDestiny;
    }

    public Boolean getCritical() {
        return critical;
    }

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }

    @Override
    public String toString() {
        return "NotifyMessageRequest{" +
                "message='" + message + '\'' +
                ", listDestiny=" + listDestiny +
                ", critical=" + critical +
                '}';
    }
}
