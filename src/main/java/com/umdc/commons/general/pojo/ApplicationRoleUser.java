/*
 * @(#)ApplicationRoleUser.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */

package com.umdc.commons.general.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.umdc.commons.util.DateUtil;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * ApplicationRoleUser.
 *
 * Represents the assignment of a {@link Role} to a {@link User} within a specific
 * {@link Application}.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class ApplicationRoleUser implements Serializable {
    private UUID id;
    private User user;
    private Role role;
    private Application application;
    private Boolean active;
    private String profileImageRef;
    private UUID creatorId;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE_TIME)
    private LocalDateTime createdDate;

    /** Default constructor. */
    public ApplicationRoleUser() {
        // Default constructor.
    }

    /**
     * Returns the assignment identifier.
     *
     * @return assignment UUID
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the user this assignment belongs to.
     *
     * @return {@link User}
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Returns the role assigned to the user.
     *
     * @return {@link Role}
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * Returns the application this assignment is scoped to.
     *
     * @return {@link Application}
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * Returns whether this assignment is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Returns the reference to the profile image for this assignment.
     *
     * @return profile image reference
     */
    public String getProfileImageRef() {
        return this.profileImageRef;
    }

    /**
     * Returns the identifier of the user who created this assignment.
     *
     * @return creator user UUID, or null for assignments that predate creator tracking
     */
    public UUID getCreatorId() {
        return this.creatorId;
    }

    /**
     * Returns the creation date of this assignment.
     *
     * @return creation date
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Sets the assignment identifier.
     *
     * @param id assignment UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets the user this assignment belongs to.
     *
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Sets the role assigned to the user.
     *
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Sets the application this assignment is scoped to.
     *
     * @param application the application to set
     */
    public void setApplication(Application application) {
        this.application = application;
    }

    /**
     * Sets whether this assignment is active.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Sets the reference to the profile image for this assignment.
     *
     * @param profileImageRef profile image reference to set
     */
    public void setProfileImageRef(String profileImageRef) {
        this.profileImageRef = profileImageRef;
    }

    /**
     * Sets the identifier of the user who created this assignment.
     *
     * @param creatorId creator user UUID
     */
    public void setCreatorId(UUID creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * Sets the creation date of this assignment.
     *
     * @param createdDate creation date to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Returns a string representation of the assignment.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "ApplicationRoleUser{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                ", application=" + application +
                ", active=" + active +
                ", profileImageRef='" + profileImageRef + '\'' +
                ", creatorId=" + creatorId +
                ", createdDate=" + createdDate +
                '}';
    }
}
