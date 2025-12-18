/*
 *  @(#)Messenger.java
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
package com.umdev.commons.message.pojo;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.umdev.commons.general.pojo.User;

import java.io.Serializable;

/**
 * Messenger.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
@JsonNaming
public class Messenger implements Serializable {

    private String alias;
    private String name;
    private Integer messengerServiceId;
    private User user;

    /**
     * Default constructor.
     */
    public Messenger() {
        //Default constructor.
    }

    public String getAlias() {
        return this.alias;
    }

    public String getName() {
        return this.name;
    }

    public Integer getMessengerServiceId() {
        return this.messengerServiceId;
    }

    public User getUser() {
        return this.user;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessengerServiceId(Integer messengerServiceId) {
        this.messengerServiceId = messengerServiceId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Messenger{" +
                "alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                ", messengerServiceId=" + messengerServiceId +
                ", user=" + user +
                '}';
    }
}
