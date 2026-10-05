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
package com.umdc.commons.general.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.umdc.commons.util.DateUtil;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    private String emailAccount;
    private String displayName;
    private Boolean notificationEmail;
    private Boolean notificationSms;
    private Boolean privacyOptOut;
    private boolean active;
    private Person person;
    private List<Role> roles;
    private List<Application> applications;
    @NotNull
    private UUID applicationId;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdDate;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime lastUpdate;

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
     * Returns the user's email account.
     *
     * @return email account
     */
    public String getEmailAccount() {
        return emailAccount;
    }

    /**
     * Returns the user's display name.
     *
     * @return display name
     */
    public String getDisplayName() {
        return displayName;
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
     * Returns the identifier of the application this user account was registered under.
     *
     * @return application UUID
     */
    public UUID getApplicationId() {
        return applicationId;
    }

    /**
     * Returns the creation date of the user account.
     *
     * @return creation date
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Returns the last update date of the user account.
     *
     * @return last update date
     */
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
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
     * Sets the user's email account.
     *
     * @param emailAccount email account to set
     */
    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    /**
     * Sets the user's display name.
     *
     * @param displayName display name to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
     * Sets the identifier of the application this user account was registered under.
     *
     * @param applicationId application UUID
     */
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the creation date of the user account.
     *
     * @param createdDate creation date to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets the last update date of the user account.
     *
     * @param lastUpdate last update date to set
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
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
                ", emailAccount='" + emailAccount +
                ", displayName='" + displayName +
                ", notificationEmail=" + notificationEmail +
                ", notificationSms=" + notificationSms +
                ", privacyOptOut=" + privacyOptOut +
                ", active=" + active +
                ", person=" + person +
                ", roles=" + roles +
                ", applications=" + applications +
                ", applicationId=" + applicationId +
                ", createdDate=" + createdDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
