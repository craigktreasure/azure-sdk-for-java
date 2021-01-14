// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure Synapse nested object which contains a flow with data movements and transformations. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DataFlow.class)
@JsonTypeName("DataFlow")
@JsonSubTypes({@JsonSubTypes.Type(name = "MappingDataFlow", value = MappingDataFlow.class)})
@Fluent
public class DataFlow {
    /*
     * The description of the data flow.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of tags that can be used for describing the data flow.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /*
     * The folder that this data flow is in. If not specified, Data flow will
     * appear at the root level.
     */
    @JsonProperty(value = "folder")
    private DataFlowFolder folder;

    /**
     * Get the description property: The description of the data flow.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the data flow.
     *
     * @param description the description value to set.
     * @return the DataFlow object itself.
     */
    public DataFlow setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the data flow.
     *
     * @return the annotations value.
     */
    public List<Object> getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the data flow.
     *
     * @param annotations the annotations value to set.
     * @return the DataFlow object itself.
     */
    public DataFlow setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the folder property: The folder that this data flow is in. If not specified, Data flow will appear at the
     * root level.
     *
     * @return the folder value.
     */
    public DataFlowFolder getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this data flow is in. If not specified, Data flow will appear at the
     * root level.
     *
     * @param folder the folder value to set.
     * @return the DataFlow object itself.
     */
    public DataFlow setFolder(DataFlowFolder folder) {
        this.folder = folder;
        return this;
    }
}
