// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB storedProcedure. */
@JsonFlatten
@Fluent
public class SqlStoredProcedureCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlStoredProcedureCreateUpdateParameters.class);

    /*
     * The standard JSON format of a storedProcedure
     */
    @JsonProperty(value = "properties.resource", required = true)
    private SqlStoredProcedureResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options")
    private CreateUpdateOptions options;

    /**
     * Get the resource property: The standard JSON format of a storedProcedure.
     *
     * @return the resource value.
     */
    public SqlStoredProcedureResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a storedProcedure.
     *
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withResource(SqlStoredProcedureResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlStoredProcedureCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlStoredProcedureCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model SqlStoredProcedureCreateUpdateParameters"));
        } else {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
