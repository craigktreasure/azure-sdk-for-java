// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.fluent.models.ViewInner;

/** Resource collection API of Views. */
public interface Views {
    /**
     * Lists all views by tenant and object.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing views.
     */
    PagedIterable<View> list();

    /**
     * Lists all views by tenant and object.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing views.
     */
    PagedIterable<View> list(Context context);

    /**
     * Lists all views at the given scope.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing views.
     */
    PagedIterable<View> listByScope(String scope);

    /**
     * Lists all views at the given scope.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing views.
     */
    PagedIterable<View> listByScope(String scope, Context context);

    /**
     * Gets the view by view name.
     *
     * @param viewName View name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view by view name.
     */
    View get(String viewName);

    /**
     * Gets the view by view name.
     *
     * @param viewName View name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view by view name.
     */
    Response<View> getWithResponse(String viewName, Context context);

    /**
     * The operation to create or update a view. Update operation requires latest eTag to be set in the request. You may
     * obtain the latest eTag by performing a get operation. Create operation does not require eTag.
     *
     * @param viewName View name.
     * @param parameters Parameters supplied to the CreateOrUpdate View operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return states and configurations of Cost Analysis.
     */
    View createOrUpdate(String viewName, ViewInner parameters);

    /**
     * The operation to create or update a view. Update operation requires latest eTag to be set in the request. You may
     * obtain the latest eTag by performing a get operation. Create operation does not require eTag.
     *
     * @param viewName View name.
     * @param parameters Parameters supplied to the CreateOrUpdate View operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return states and configurations of Cost Analysis.
     */
    Response<View> createOrUpdateWithResponse(String viewName, ViewInner parameters, Context context);

    /**
     * The operation to delete a view.
     *
     * @param viewName View name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String viewName);

    /**
     * The operation to delete a view.
     *
     * @param viewName View name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String viewName, Context context);

    /**
     * Gets the view for the defined scope by view name.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @param viewName View name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view for the defined scope by view name.
     */
    View getByScope(String scope, String viewName);

    /**
     * Gets the view for the defined scope by view name.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @param viewName View name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view for the defined scope by view name.
     */
    Response<View> getByScopeWithResponse(String scope, String viewName, Context context);

    /**
     * The operation to delete a view.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @param viewName View name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByScope(String scope, String viewName);

    /**
     * The operation to delete a view.
     *
     * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}' for
     *     subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     *     EnrollmentAccount scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management
     *     Group scope, 'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     *     External Billing Account scope and
     *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
     *     Subscription scope.
     * @param viewName View name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByScopeWithResponse(String scope, String viewName, Context context);

    /**
     * Gets the view for the defined scope by view name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view for the defined scope by view name.
     */
    View getById(String id);

    /**
     * Gets the view for the defined scope by view name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view for the defined scope by view name.
     */
    Response<View> getByIdWithResponse(String id, Context context);

    /**
     * The operation to delete a view.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a view.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new View resource.
     *
     * @param name resource name.
     * @return the first stage of the new View definition.
     */
    View.DefinitionStages.Blank define(String name);
}
