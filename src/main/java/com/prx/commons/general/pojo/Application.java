package com.prx.commons.general.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/// Represents an application with its details.
public class Application implements Serializable {

    private UUID id;
    private String name;
    private String description;
    private Boolean active;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
    private UUID serviceTypeId;
    private List<User> userList;
    private List<Role> roleList;

    /// Default constructor.
    public Application() {
        // Default constructor
    }

    /// Gets the unique identifier of the application.
    ///
    /// @return the unique identifier of the application
    public UUID getId() {
        return id;
    }

    /// Sets the unique identifier of the application.
    ///
    /// @param id the unique identifier to set
    public void setId(UUID id) {
        this.id = id;
    }

    /// Gets the name of the application.
    ///
    /// @return the name of the application
    public String getName() {
        return name;
    }

    /// Sets the name of the application.
    ///
    /// @param name the name to set
    public void setName(String name) {
        this.name = name;
    }

    /// Gets the description of the application.
    ///
    /// @return the description of the application
    public String getDescription() {
        return description;
    }

    /// Sets the description of the application.
    ///
    /// @param description the description to set
    public void setDescription(String description) {
        this.description = description;
    }

    /// Gets the active status of the application.
    ///
    /// @return the active status of the application
    public Boolean getActive() {
        return active;
    }

    /// Sets the active status of the application.
    ///
    /// @param active the active status to set
    public void setActive(Boolean active) {
        this.active = active;
    }

    /// Gets the creation date of the application.
    ///
    /// @return the creation date of the application
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /// Sets the creation date of the application.
    ///
    /// @param createdDate the creation date to set
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /// Gets the last update date of the application.
    ///
    /// @return the last update date of the application
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    /// Sets the last update date of the application.
    ///
    /// @param lastUpdate the last update date to set
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /// Gets the service type identifier associated with the application.
    ///
    /// @return the service type identifier
    public UUID getServiceTypeId() {
        return serviceTypeId;
    }

    /// Sets the service type identifier associated with the application.
    ///
    /// @param serviceTypeId the service type identifier to set
    public void setServiceTypeId(UUID serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /// Gets the list of users associated with the application.
    ///
    /// @return the list of users
    public List<User> getUserList() {
        return userList;
    }

    /// Sets the list of users associated with the application.
    ///
    /// @param userList the list of users to set
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    /// Gets the list of roles associated with the application.
    ///
    /// @return the list of roles
    public List<Role> getRoleList() {
        return roleList;
    }

    /// Sets the list of roles associated with the application.
    ///
    /// @param roleList the list of users to set
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", lastUpdate=" + lastUpdate +
                ", serviceTypeId=" + serviceTypeId +
                ", userList=" + userList +
                ", roleList=" + roleList +
                '}';
    }
}
