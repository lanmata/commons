package com.prx.commons.general.pojo;

import java.util.UUID;

/// Represents a type of service with an ID, name, description, and active status.
///
/// @version 1.0.0, 20-10-2020
public class ServiceType {
    private UUID id;
    private String name;
    private String description;
    private boolean active;

    /// Default constructor.
    public ServiceType() {
        // Default constructor
    }

    /// Gets the unique identifier of the service type.
    ///
    /// @return the unique identifier of the service type
    public UUID getId() {
        return id;
    }

    /// Sets the unique identifier of the service type.
    ///
    /// @param id the unique identifier of the service type
    public void setId(UUID id) {
        this.id = id;
    }

    /// Gets the name of the service type.
    ///
    /// @return the name of the service type
    public String getName() {
        return name;
    }

    /// Sets the name of the service type.
    ///
    /// @param name the name of the service type
    public void setName(String name) {
        this.name = name;
    }

    /// Gets the description of the service type.
    ///
    /// @return the description of the service type
    public String getDescription() {
        return description;
    }

    /// Sets the description of the service type.
    ///
    /// @param description the description of the service type
    public void setDescription(String description) {
        this.description = description;
    }

    /// Checks if the service type is active.
    ///
    /// @return true if the service type is active, false otherwise
    public boolean isActive() {
        return active;
    }

    /// Sets the active status of the service type.
    ///
    /// @param active the active status of the service type
    public void setActive(boolean active) {
        this.active = active;
    }

    /// Returns a string representation of the service type.
    @Override
    public String toString() {
        return "ServiceType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
