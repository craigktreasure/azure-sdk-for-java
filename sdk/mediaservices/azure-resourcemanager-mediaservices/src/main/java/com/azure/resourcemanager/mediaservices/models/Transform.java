// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.TransformInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Transform. */
public interface Transform {
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
     * Gets the created property: The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ'
     * format.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the description property: An optional verbose description of the Transform.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the lastModified property: The UTC date and time when the Transform was last updated, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the outputs property: An array of one or more TransformOutputs that the Transform should generate.
     *
     * @return the outputs value.
     */
    List<TransformOutput> outputs();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.TransformInner object.
     *
     * @return the inner object.
     */
    TransformInner innerModel();

    /** The entirety of the Transform definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Transform definition stages. */
    interface DefinitionStages {
        /** The first stage of the Transform definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Transform definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @return the next definition stage.
             */
            WithCreate withExistingMediaService(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the Transform definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription, DefinitionStages.WithOutputs {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Transform create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Transform create(Context context);
        }
        /** The stage of the Transform definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: An optional verbose description of the Transform..
             *
             * @param description An optional verbose description of the Transform.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Transform definition allowing to specify outputs. */
        interface WithOutputs {
            /**
             * Specifies the outputs property: An array of one or more TransformOutputs that the Transform should
             * generate..
             *
             * @param outputs An array of one or more TransformOutputs that the Transform should generate.
             * @return the next definition stage.
             */
            WithCreate withOutputs(List<TransformOutput> outputs);
        }
    }
    /**
     * Begins update for the Transform resource.
     *
     * @return the stage of resource update.
     */
    Transform.Update update();

    /** The template for Transform update. */
    interface Update extends UpdateStages.WithDescription, UpdateStages.WithOutputs {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Transform apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Transform apply(Context context);
    }
    /** The Transform update stages. */
    interface UpdateStages {
        /** The stage of the Transform update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: An optional verbose description of the Transform..
             *
             * @param description An optional verbose description of the Transform.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Transform update allowing to specify outputs. */
        interface WithOutputs {
            /**
             * Specifies the outputs property: An array of one or more TransformOutputs that the Transform should
             * generate..
             *
             * @param outputs An array of one or more TransformOutputs that the Transform should generate.
             * @return the next definition stage.
             */
            Update withOutputs(List<TransformOutput> outputs);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Transform refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Transform refresh(Context context);
}
