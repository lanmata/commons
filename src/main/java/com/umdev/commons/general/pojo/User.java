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
package com.umdev.commons.general.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/// User.
///
/// @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
/// @version 1.0.3, 29-09-2020
public class User implements Serializable {

    private UUID id;
    @NotBlank
    private String alias;
    private String password;
    @Email
    private String email;
    private Boolean notificationEmail;
    private Boolean notificationSms;
    private Boolean privacyOptOut;
    private boolean active;
    private Person person;
    private List<Role> roles;
    private List<Application> applications;

    /// Default constructor.
    public User() {
        //Default constructor.
    }

    /// @return the id of the user.
    public UUID getId() {
        return this.id;
    }

    /// @return the alias of the user.
    public String getAlias() {
        return this.alias;
    }

    /// @return the password of the user.
    public String getPassword() {
        return this.password;
    }

    /// @return the email of the user.
    public String getEmail() {
        return email;
    }

    public Boolean getNotificationEmail() {
        return notificationEmail;
    }

    public Boolean getNotificationSms() {
        return notificationSms;
    }

    public Boolean getPrivacyOptOut() {
        return privacyOptOut;
    }

    /// @return the active status of the user.
    public boolean isActive() {
        return this.active;
    }

    /// @return the person of the user.
    public Person getPerson() {
        return this.person;
    }

    /// @return the roles of the user.
    public List<Role> getRoles() {
        return this.roles;
    }

    /// @return the applications of the user.
    public List<Application> getApplications() {
        return applications;
    }

    /// @param id of the user.
    public void setId(UUID id) {
        this.id = id;
    }

    /// @param alias of the user.
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /// @param password of the user.
    public void setPassword(String password) {
        this.password = password;
    }

    /// @param email of the user.
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotificationEmail(Boolean notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public void setNotificationSms(Boolean notificationSms) {
        this.notificationSms = notificationSms;
    }

    public void setPrivacyOptOut(Boolean privacyOptOut) {
        this.privacyOptOut = privacyOptOut;
    }

    /// @param active status of the user.
    public void setActive(boolean active) {
        this.active = active;
    }

    /// @param person of the user.
    public void setPerson(Person person) {
        this.person = person;
    }

    /// @param roles of the user.
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /// @param applications of the user.
    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    /// @return the string representation of the user.
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', alias='" + alias +
                ", password='" + password +
                ", email='" + email +
                ", notificationEmail=" + notificationEmail +
                ", notificationSms=" + notificationSms +
                ", privacyOptOut=" + privacyOptOut +
                ", active=" + active +
                ", person=" + person +
                ", roles=" + roles +
                ", applications=" + applications +
                '}';
    }
}
