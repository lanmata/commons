/*
 *  @(#)User.java
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
package com.prx.commons.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * User.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public class User implements Serializable {
    
    private String id;
    private String alias;
    private String password;
    private String email;
    private boolean active;
    private Person person;
    private List<Role> roles;
    private List<Application> applications;

    /**
     * Default constructor.
     */
    public User() {
        //Default constructor.
    }

    public String getId() {
        return this.id;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return this.active;
    }

    public Person getPerson() {
        return this.person;
    }

    public List<Role> getRoles() {
        return this.roles;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', alias='" + alias + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", person=" + person +
                ", roles=" + roles +
                ", applications=" + applications +
                '}';
    }
}
