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
package com.prx.commons.general.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * User.
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
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

    /**
     * Default constructor.
     */
    public User() {
        //Default constructor.
    }

    /**
     * Returns the user id.
     *
     * @return user UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the alias (username).
     *
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * Returns the user's password.
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Returns the user's email address.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns whether email notifications are enabled.
     *
     * @return notificationEmail flag
     */
    public Boolean getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Returns whether SMS notifications are enabled.
     *
     * @return notificationSms flag
     */
    public Boolean getNotificationSms() {
        return notificationSms;
    }

    /**
     * Returns whether the user has opted out of privacy markers.
     *
     * @return privacyOptOut flag
     */
    public Boolean getPrivacyOptOut() {
        return privacyOptOut;
    }

    /**
     * Returns whether the user is active.
     *
     * @return true if active
     */
    public boolean isActive() {
        return this.active;
    }

    /**
     * Returns the associated person details.
     *
     * @return {@link Person}
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * Returns the roles assigned to the user.
     *
     * @return list of {@link Role}
     */
    public List<Role> getRoles() {
        return this.roles;
    }

    /**
     * Returns the applications available to the user.
     *
     * @return list of {@link Application}
     */
    public List<Application> getApplications() {
        return applications;
    }

    /**
     * Sets the user id.
     *
     * @param id the UUID to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the alias.
     *
     * @param alias alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Sets the user's password.
     *
     * @param password password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the user's email.
     *
     * @param email email to set
     */
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

    /**
     * Sets whether the user is active.
     *
     * @param active active flag
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Sets the associated person details.
     *
     * @param person the person to associate
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Sets the roles assigned to the user.
     *
     * @param roles list of roles
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * Sets the applications accessible to the user.
     *
     * @param applications list of applications
     */
    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return string representation
     */
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
