/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.PoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Policies.
 */
public interface Policies extends SupportsCreating<CdnWebApplicationFirewallPolicy.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<CdnWebApplicationFirewallPolicy>, SupportsListingByResourceGroup<CdnWebApplicationFirewallPolicy>, HasInner<PoliciesInner> {
}
