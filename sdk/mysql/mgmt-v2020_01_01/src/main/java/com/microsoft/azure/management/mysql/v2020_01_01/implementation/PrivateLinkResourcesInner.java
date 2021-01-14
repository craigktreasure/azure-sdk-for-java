/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateLinkResources.
 */
public class PrivateLinkResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private MySQLManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesInner(Retrofit retrofit, MySQLManagementClientImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResources listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/servers/{serverName}/privateLinkResources")
        Observable<Response<ResponseBody>> listByServer(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResources get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/servers/{serverName}/privateLinkResources/{groupName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("groupName") String groupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResources listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PrivateLinkResourceInner&gt; object if successful.
     */
    public PagedList<PrivateLinkResourceInner> listByServer(final String resourceGroupName, final String serverName) {
        ServiceResponse<Page<PrivateLinkResourceInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName).toBlocking().single();
        return new PagedList<PrivateLinkResourceInner>(response.body()) {
            @Override
            public Page<PrivateLinkResourceInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateLinkResourceInner>> listByServerAsync(final String resourceGroupName, final String serverName, final ListOperationCallback<PrivateLinkResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName),
            new Func1<String, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<Page<PrivateLinkResourceInner>> listByServerAsync(final String resourceGroupName, final String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName)
            .map(new Func1<ServiceResponse<Page<PrivateLinkResourceInner>>, Page<PrivateLinkResourceInner>>() {
                @Override
                public Page<PrivateLinkResourceInner> call(ServiceResponse<Page<PrivateLinkResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName) {
        return listByServerSinglePageAsync(resourceGroupName, serverName)
            .concatMap(new Func1<ServiceResponse<Page<PrivateLinkResourceInner>>, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(ServiceResponse<Page<PrivateLinkResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the private link resources for MySQL server.
     *
    ServiceResponse<PageImpl1<PrivateLinkResourceInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl1<PrivateLinkResourceInner>> * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PrivateLinkResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.listByServer(resourceGroupName, serverName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<PrivateLinkResourceInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PrivateLinkResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<PrivateLinkResourceInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<PrivateLinkResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<PrivateLinkResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a private link resource for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceInner object if successful.
     */
    public PrivateLinkResourceInner get(String resourceGroupName, String serverName, String groupName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, groupName).toBlocking().single().body();
    }

    /**
     * Gets a private link resource for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param groupName The name of the private link resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceInner> getAsync(String resourceGroupName, String serverName, String groupName, final ServiceCallback<PrivateLinkResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, groupName), serviceCallback);
    }

    /**
     * Gets a private link resource for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<PrivateLinkResourceInner> getAsync(String resourceGroupName, String serverName, String groupName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, groupName).map(new Func1<ServiceResponse<PrivateLinkResourceInner>, PrivateLinkResourceInner>() {
            @Override
            public PrivateLinkResourceInner call(ServiceResponse<PrivateLinkResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a private link resource for MySQL server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String groupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(resourceGroupName, serverName, groupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PrivateLinkResourceInner&gt; object if successful.
     */
    public PagedList<PrivateLinkResourceInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<PrivateLinkResourceInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PrivateLinkResourceInner>(response.body()) {
            @Override
            public Page<PrivateLinkResourceInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateLinkResourceInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<PrivateLinkResourceInner>> serviceFuture, final ListOperationCallback<PrivateLinkResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<Page<PrivateLinkResourceInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PrivateLinkResourceInner>>, Page<PrivateLinkResourceInner>>() {
                @Override
                public Page<PrivateLinkResourceInner> call(ServiceResponse<Page<PrivateLinkResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the private link resources for MySQL server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PrivateLinkResourceInner>>, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(ServiceResponse<Page<PrivateLinkResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the private link resources for MySQL server.
     *
    ServiceResponse<PageImpl1<PrivateLinkResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PrivateLinkResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<PrivateLinkResourceInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PrivateLinkResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<PrivateLinkResourceInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<PrivateLinkResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<PrivateLinkResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
