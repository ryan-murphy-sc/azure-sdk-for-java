/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Parameters supplied to the CreateOrUpdate Namespace operation.
 */
@JsonFlatten
@SkipParentValidation
public class NamespaceCreateOrUpdateParameters extends Resource {
    /**
     * The name of the namespace.
     */
    @JsonProperty(value = "properties.name")
    private String namespaceCreateOrUpdateParametersName;

    /**
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Specifies the targeted region in which the namespace should be created.
     * It can be any of the following values: Australia EastAustralia
     * SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central
     * USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth
     * EuropeWest Europe.
     */
    @JsonProperty(value = "properties.region")
    private String region;

    /**
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /**
     * Status of the namespace. It can be any of these values:1 =
     * Created/Active2 = Creating3 = Suspended4 = Deleting.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /**
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt")
    private DateTime createdAt;

    /**
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt")
    private DateTime updatedAt;

    /**
     * Endpoint you can use to perform NotificationHub operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint")
    private String serviceBusEndpoint;

    /**
     * The Id of the Azure subscription associated with the namespace.
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * ScaleUnit where the namespace gets created.
     */
    @JsonProperty(value = "properties.scaleUnit")
    private String scaleUnit;

    /**
     * Whether or not the namespace is currently enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Whether or not the namespace is set as Critical.
     */
    @JsonProperty(value = "properties.critical")
    private Boolean critical;

    /**
     * Data center for the namespace.
     */
    @JsonProperty(value = "properties.dataCenter")
    private String dataCenter;

    /**
     * The namespace type. Possible values include: 'Messaging',
     * 'NotificationHub'.
     */
    @JsonProperty(value = "properties.namespaceType")
    private NamespaceType namespaceType;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the name of the namespace.
     *
     * @return the namespaceCreateOrUpdateParametersName value
     */
    public String namespaceCreateOrUpdateParametersName() {
        return this.namespaceCreateOrUpdateParametersName;
    }

    /**
     * Set the name of the namespace.
     *
     * @param namespaceCreateOrUpdateParametersName the namespaceCreateOrUpdateParametersName value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withNamespaceCreateOrUpdateParametersName(String namespaceCreateOrUpdateParametersName) {
        this.namespaceCreateOrUpdateParametersName = namespaceCreateOrUpdateParametersName;
        return this;
    }

    /**
     * Get provisioning state of the Namespace.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the Namespace.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia EastAustralia SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth EuropeWest Europe.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia EastAustralia SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth EuropeWest Europe.
     *
     * @param region the region value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get identifier for Azure Insights metrics.
     *
     * @return the metricId value
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting.
     *
     * @param status the status value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the time the namespace was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the time the namespace was created.
     *
     * @param createdAt the createdAt value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the time the namespace was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the time the namespace was updated.
     *
     * @param updatedAt the updatedAt value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get endpoint you can use to perform NotificationHub operations.
     *
     * @return the serviceBusEndpoint value
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Set endpoint you can use to perform NotificationHub operations.
     *
     * @param serviceBusEndpoint the serviceBusEndpoint value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withServiceBusEndpoint(String serviceBusEndpoint) {
        this.serviceBusEndpoint = serviceBusEndpoint;
        return this;
    }

    /**
     * Get the Id of the Azure subscription associated with the namespace.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the Id of the Azure subscription associated with the namespace.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get scaleUnit where the namespace gets created.
     *
     * @return the scaleUnit value
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set scaleUnit where the namespace gets created.
     *
     * @param scaleUnit the scaleUnit value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

    /**
     * Get whether or not the namespace is currently enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether or not the namespace is currently enabled.
     *
     * @param enabled the enabled value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get whether or not the namespace is set as Critical.
     *
     * @return the critical value
     */
    public Boolean critical() {
        return this.critical;
    }

    /**
     * Set whether or not the namespace is set as Critical.
     *
     * @param critical the critical value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withCritical(Boolean critical) {
        this.critical = critical;
        return this;
    }

    /**
     * Get data center for the namespace.
     *
     * @return the dataCenter value
     */
    public String dataCenter() {
        return this.dataCenter;
    }

    /**
     * Set data center for the namespace.
     *
     * @param dataCenter the dataCenter value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * Get the namespace type. Possible values include: 'Messaging', 'NotificationHub'.
     *
     * @return the namespaceType value
     */
    public NamespaceType namespaceType() {
        return this.namespaceType;
    }

    /**
     * Set the namespace type. Possible values include: 'Messaging', 'NotificationHub'.
     *
     * @param namespaceType the namespaceType value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

    /**
     * Get the sku of the created namespace.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku of the created namespace.
     *
     * @param sku the sku value to set
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
