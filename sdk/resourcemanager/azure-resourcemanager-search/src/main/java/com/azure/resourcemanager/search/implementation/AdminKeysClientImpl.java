// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.search.fluent.AdminKeysClient;
import com.azure.resourcemanager.search.fluent.models.AdminKeyResultInner;
import com.azure.resourcemanager.search.models.AdminKeyKind;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AdminKeysClient. */
public final class AdminKeysClientImpl implements AdminKeysClient {
    private final ClientLogger logger = new ClientLogger(AdminKeysClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AdminKeysService service;

    /** The service client containing this operation class. */
    private final SearchManagementClientImpl client;

    /**
     * Initializes an instance of AdminKeysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AdminKeysClientImpl(SearchManagementClientImpl client) {
        this.service =
            RestProxy.create(AdminKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchManagementClientAdminKeys to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SearchManagementClie")
    private interface AdminKeysService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search"
                + "/searchServices/{searchServiceName}/listAdminKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdminKeyResultInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("searchServiceName") String searchServiceName,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search"
                + "/searchServices/{searchServiceName}/regenerateAdminKey/{keyKind}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdminKeyResultInner>> regenerate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("searchServiceName") String searchServiceName,
            @PathParam("keyKind") AdminKeyKind keyKind,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AdminKeyResultInner>> getWithResponseAsync(
        String resourceGroupName, String searchServiceName, UUID clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            searchServiceName,
                            clientRequestId,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdminKeyResultInner>> getWithResponseAsync(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                searchServiceName,
                clientRequestId,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AdminKeyResultInner> getAsync(
        String resourceGroupName, String searchServiceName, UUID clientRequestId) {
        return getWithResponseAsync(resourceGroupName, searchServiceName, clientRequestId)
            .flatMap(
                (Response<AdminKeyResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AdminKeyResultInner> getAsync(String resourceGroupName, String searchServiceName) {
        final UUID clientRequestId = null;
        return getWithResponseAsync(resourceGroupName, searchServiceName, clientRequestId)
            .flatMap(
                (Response<AdminKeyResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdminKeyResultInner get(String resourceGroupName, String searchServiceName) {
        final UUID clientRequestId = null;
        return getAsync(resourceGroupName, searchServiceName, clientRequestId).block();
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdminKeyResultInner> getWithResponse(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context) {
        return getWithResponseAsync(resourceGroupName, searchServiceName, clientRequestId, context).block();
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AdminKeyResultInner>> regenerateWithResponseAsync(
        String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, UUID clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (keyKind == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyKind is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regenerate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            searchServiceName,
                            keyKind,
                            clientRequestId,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdminKeyResultInner>> regenerateWithResponseAsync(
        String resourceGroupName,
        String searchServiceName,
        AdminKeyKind keyKind,
        UUID clientRequestId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (keyKind == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyKind is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regenerate(
                this.client.getEndpoint(),
                resourceGroupName,
                searchServiceName,
                keyKind,
                clientRequestId,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AdminKeyResultInner> regenerateAsync(
        String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, UUID clientRequestId) {
        return regenerateWithResponseAsync(resourceGroupName, searchServiceName, keyKind, clientRequestId)
            .flatMap(
                (Response<AdminKeyResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AdminKeyResultInner> regenerateAsync(
        String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        final UUID clientRequestId = null;
        return regenerateWithResponseAsync(resourceGroupName, searchServiceName, keyKind, clientRequestId)
            .flatMap(
                (Response<AdminKeyResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdminKeyResultInner regenerate(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        final UUID clientRequestId = null;
        return regenerateAsync(resourceGroupName, searchServiceName, keyKind, clientRequestId).block();
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdminKeyResultInner> regenerateWithResponse(
        String resourceGroupName,
        String searchServiceName,
        AdminKeyKind keyKind,
        UUID clientRequestId,
        Context context) {
        return regenerateWithResponseAsync(resourceGroupName, searchServiceName, keyKind, clientRequestId, context)
            .block();
    }
}
