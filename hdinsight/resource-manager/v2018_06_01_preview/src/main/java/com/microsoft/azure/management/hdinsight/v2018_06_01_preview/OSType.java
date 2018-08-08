/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OSType.
 */
public enum OSType {
    /** Enum value Windows. */
    WINDOWS("Windows"),

    /** Enum value Linux. */
    LINUX("Linux");

    /** The actual serialized value for a OSType instance. */
    private String value;

    OSType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OSType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OSType object, or null if unable to parse.
     */
    @JsonCreator
    public static OSType fromString(String value) {
        OSType[] items = OSType.values();
        for (OSType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
