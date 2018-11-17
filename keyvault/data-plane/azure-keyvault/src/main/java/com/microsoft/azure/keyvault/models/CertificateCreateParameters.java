/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate create parameters.
 */
public class CertificateCreateParameters {
    /**
     * The management policy for the certificate.
     */
    @JsonProperty(value = "policy")
    private CertificatePolicy certificatePolicy;

    /**
     * The attributes of the certificate (optional).
     */
    @JsonProperty(value = "attributes")
    private CertificateAttributes certificateAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the certificatePolicy value.
     *
     * @return the certificatePolicy value
     */
    public CertificatePolicy certificatePolicy() {
        return this.certificatePolicy;
    }

    /**
     * Set the certificatePolicy value.
     *
     * @param certificatePolicy the certificatePolicy value to set
     * @return the CertificateCreateParameters object itself.
     */
    public CertificateCreateParameters withCertificatePolicy(CertificatePolicy certificatePolicy) {
        this.certificatePolicy = certificatePolicy;
        return this;
    }

    /**
     * Get the certificateAttributes value.
     *
     * @return the certificateAttributes value
     */
    public CertificateAttributes certificateAttributes() {
        return this.certificateAttributes;
    }

    /**
     * Set the certificateAttributes value.
     *
     * @param certificateAttributes the certificateAttributes value to set
     * @return the CertificateCreateParameters object itself.
     */
    public CertificateCreateParameters withCertificateAttributes(CertificateAttributes certificateAttributes) {
        this.certificateAttributes = certificateAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the CertificateCreateParameters object itself.
     */
    public CertificateCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
