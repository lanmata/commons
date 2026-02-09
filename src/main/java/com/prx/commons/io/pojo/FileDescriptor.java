/*
 *  @(#)FileDescriptor.java
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

package com.prx.commons.io.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Represents basic file metadata used by IO operations and JSON serialization.
 *
 * Contains file name, size descriptor, MIME/type, and path information.
 */
@JsonPropertyOrder({"name", "sizeDescriptor", "type", "path"
})
public class FileDescriptor {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sizeDescriptor")
    private SizeDescriptor sizeDescriptor;
    @JsonProperty("type")
    private String type;
    @JsonProperty("path")
    private String path;

    /** Default constructor. */
    public FileDescriptor() {
        // Default constructor.
    }

    /**
     * Returns the file name.
     *
     * @return file name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the size descriptor of the file.
     *
     * @return {@link SizeDescriptor}
     */
    public SizeDescriptor getSizeDescriptor() {
        return this.sizeDescriptor;
    }

    /**
     * Returns the file type or MIME type.
     *
     * @return file type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Returns the file path.
     *
     * @return file path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Sets the file name.
     *
     * @param name the name to set
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the size descriptor.
     *
     * @param sizeDescriptor the size descriptor to set
     */
    @JsonProperty("sizeDescriptor")
    public void setSizeDescriptor(SizeDescriptor sizeDescriptor) {
        this.sizeDescriptor = sizeDescriptor;
    }

    /**
     * Sets the file type.
     *
     * @param type the file type to set
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the file path.
     *
     * @param path the path to set
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Returns a string representation of the file descriptor.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "FileDescriptor{" +
                "name='" + name + '\'' +
                ", sizeDescriptor=" + sizeDescriptor +
                ", type='" + type + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
