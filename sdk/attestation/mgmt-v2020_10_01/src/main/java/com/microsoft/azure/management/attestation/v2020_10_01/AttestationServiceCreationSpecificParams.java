/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Client supplied parameters used to create a new attestation service
 * instance.
 */
public class AttestationServiceCreationSpecificParams {
    /**
     * JSON Web Key Set defining a set of X.509 Certificates that will
     * represent the parent certificate for the signing certificate used for
     * policy operations.
     */
    @JsonProperty(value = "policySigningCertificates")
    private JSONWebKeySet policySigningCertificates;

    /**
     * Get jSON Web Key Set defining a set of X.509 Certificates that will represent the parent certificate for the signing certificate used for policy operations.
     *
     * @return the policySigningCertificates value
     */
    public JSONWebKeySet policySigningCertificates() {
        return this.policySigningCertificates;
    }

    /**
     * Set jSON Web Key Set defining a set of X.509 Certificates that will represent the parent certificate for the signing certificate used for policy operations.
     *
     * @param policySigningCertificates the policySigningCertificates value to set
     * @return the AttestationServiceCreationSpecificParams object itself.
     */
    public AttestationServiceCreationSpecificParams withPolicySigningCertificates(JSONWebKeySet policySigningCertificates) {
        this.policySigningCertificates = policySigningCertificates;
        return this;
    }

}
