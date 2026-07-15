/*
 * @(#)RoleFeature.java
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

import java.io.Serializable;

/**
 * RoleFeature.
 *
 * Represents the assignment of a {@link Feature} to a {@link Role}, with its own
 * activation flag independent of the role's or feature's own active status.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public class RoleFeature implements Serializable {
    private Role role;
    private Feature feature;
    private Boolean active;

    /** Default constructor. */
    public RoleFeature() {
        // Default constructor.
    }

    /**
     * Returns the role side of this assignment.
     *
     * @return {@link Role}
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * Returns the feature side of this assignment.
     *
     * @return {@link Feature}
     */
    public Feature getFeature() {
        return this.feature;
    }

    /**
     * Returns whether this role-feature assignment is active.
     *
     * @return active flag
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the role side of this assignment.
     *
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Sets the feature side of this assignment.
     *
     * @param feature the feature to set
     */
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    /**
     * Sets whether this role-feature assignment is active.
     *
     * @param active active flag
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Returns a string representation of the role-feature assignment.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "RoleFeature{" +
                "role=" + role +
                ", feature=" + feature +
                ", active=" + active +
                '}';
    }
}
