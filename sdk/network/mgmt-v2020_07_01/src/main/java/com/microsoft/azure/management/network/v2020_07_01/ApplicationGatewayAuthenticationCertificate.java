/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Authentication certificates of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayAuthenticationCertificate extends SubResource {
    /**
     * Certificate public data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * The provisioning state of the authentication certificate resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the authentication certificate that is unique within an
     * Application Gateway.
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
     * Get certificate public data.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set certificate public data.
     *
     * @param data the data value to set
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the provisioning state of the authentication certificate resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the authentication certificate that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the authentication certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withName(String name) {
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
