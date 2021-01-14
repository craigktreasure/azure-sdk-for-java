// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.fluent.models.RelayNamespaceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of RelayNamespace. */
public interface RelayNamespace {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: SKU of the namespace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateEnum provisioningState();

    /**
     * Gets the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    String serviceBusEndpoint();

    /**
     * Gets the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    String metricId();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.relay.fluent.models.RelayNamespaceInner object.
     *
     * @return the inner object.
     */
    RelayNamespaceInner innerModel();

    /** The entirety of the RelayNamespace definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The RelayNamespace definition stages. */
    interface DefinitionStages {
        /** The first stage of the RelayNamespace definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the RelayNamespace definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the RelayNamespace definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the RelayNamespace definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RelayNamespace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RelayNamespace create(Context context);
        }
        /** The stage of the RelayNamespace definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the RelayNamespace definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the namespace..
             *
             * @param sku SKU of the namespace.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }
    /**
     * Begins update for the RelayNamespace resource.
     *
     * @return the stage of resource update.
     */
    RelayNamespace.Update update();

    /** The template for RelayNamespace update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RelayNamespace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RelayNamespace apply(Context context);
    }
    /** The RelayNamespace update stages. */
    interface UpdateStages {
        /** The stage of the RelayNamespace update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the RelayNamespace update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the namespace..
             *
             * @param sku SKU of the namespace.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RelayNamespace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RelayNamespace refresh(Context context);
}
