/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Represents an Azure SQL Database geo backup.
 */
@JsonFlatten
public class GeoBackupInner extends SubResource {
    /**
     * Gets the edition of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /**
     * Gets the current service level objective name for the database.
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /**
     * Gets the elastic pool name for the database.
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /**
     * Gets the last available backup date.
     */
    @JsonProperty(value = "properties.lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastAvailableBackupDate;

    /**
     * Get the edition value.
     *
     * @return the edition value
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the serviceLevelObjective value.
     *
     * @return the serviceLevelObjective value
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elasticPoolName value.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the lastAvailableBackupDate value.
     *
     * @return the lastAvailableBackupDate value
     */
    public DateTime lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }

}
