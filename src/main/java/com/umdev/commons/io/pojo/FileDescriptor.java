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

package com.umdev.commons.io.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    ///  Default constructor.
    public FileDescriptor() {
        //Default constructor.
    }

    ///  @return the name of the file
    public String getName() {
        return this.name;
    }

    ///  @return the size descriptor of the file
    public SizeDescriptor getSizeDescriptor() {
        return this.sizeDescriptor;
    }

    ///  @return the type of the file
    public String getType() {
        return this.type;
    }

    ///  @return the path of the file
    public String getPath() {
        return this.path;
    }

    ///  @param name the name of the file
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    ///  @param sizeDescriptor the size descriptor of the file
    @JsonProperty("sizeDescriptor")
    public void setSizeDescriptor(SizeDescriptor sizeDescriptor) {
        this.sizeDescriptor = sizeDescriptor;
    }

    ///  @param type the type of the file
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    ///  @param path the path of the file
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    ///  @return the string representation of the file descriptor
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
