/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the OperationalInsightsManagementClientImpl class.
 */
public class OperationalInsightsManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The client API version. */
    private String apiVersion;

    /**
     * Gets The client API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** In a purge status request, this is the Id of the operation the status of which is returned. */
    private String purgeId;

    /**
     * Gets In a purge status request, this is the Id of the operation the status of which is returned.
     *
     * @return the purgeId value.
     */
    public String purgeId() {
        return this.purgeId;
    }

    /**
     * Sets In a purge status request, this is the Id of the operation the status of which is returned.
     *
     * @param purgeId the purgeId value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withPurgeId(String purgeId) {
        this.purgeId = purgeId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The StorageInsightsInner object to access its operations.
     */
    private StorageInsightsInner storageInsights;

    /**
     * Gets the StorageInsightsInner object to access its operations.
     * @return the StorageInsightsInner object.
     */
    public StorageInsightsInner storageInsights() {
        return this.storageInsights;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * The SavedSearchesInner object to access its operations.
     */
    private SavedSearchesInner savedSearches;

    /**
     * Gets the SavedSearchesInner object to access its operations.
     * @return the SavedSearchesInner object.
     */
    public SavedSearchesInner savedSearches() {
        return this.savedSearches;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public OperationalInsightsManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public OperationalInsightsManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public OperationalInsightsManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-03-20";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.storageInsights = new StorageInsightsInner(restClient().retrofit(), this);
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.savedSearches = new SavedSearchesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "OperationalInsightsManagementClient", "2015-03-20");
    }
}