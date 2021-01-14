/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * IP configuration of an application gateway. Currently 1 public and 1 private
 * IP configuration is allowed.
 */
@JsonFlatten
public class ApplicationGatewayIPConfiguration extends SubResource {
    /**
     * Reference to the subnet resource. A subnet from where application
     * gateway gets its private address.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * The provisioning state of the application gateway IP configuration
     * resource. Possible values include: 'Succeeded', 'Updating', 'Deleting',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the IP configuration that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get reference to the subnet resource. A subnet from where application gateway gets its private address.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set reference to the subnet resource. A subnet from where application gateway gets its private address.
     *
     * @param subnet the subnet value to set
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioning state of the application gateway IP configuration resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the IP configuration that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the IP configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
