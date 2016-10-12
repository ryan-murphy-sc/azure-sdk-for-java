/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.List;

/**
 * The ArmErrorResponseExtendedErrorInfo model.
 */
public class ArmErrorResponseExtendedErrorInfo {
    /**
     * The details property.
     */
    private List<ArmErrorResponseErrorDetail> details;

    /**
     * The innerError property.
     */
    private Object innerError;

    /**
     * The code property.
     */
    private String code;

    /**
     * The message property.
     */
    private String message;

    /**
     * The target property.
     */
    private String target;

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<ArmErrorResponseErrorDetail> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ArmErrorResponseExtendedErrorInfo object itself.
     */
    public ArmErrorResponseExtendedErrorInfo withDetails(List<ArmErrorResponseErrorDetail> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public Object innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError value.
     *
     * @param innerError the innerError value to set
     * @return the ArmErrorResponseExtendedErrorInfo object itself.
     */
    public ArmErrorResponseExtendedErrorInfo withInnerError(Object innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ArmErrorResponseExtendedErrorInfo object itself.
     */
    public ArmErrorResponseExtendedErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ArmErrorResponseExtendedErrorInfo object itself.
     */
    public ArmErrorResponseExtendedErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the ArmErrorResponseExtendedErrorInfo object itself.
     */
    public ArmErrorResponseExtendedErrorInfo withTarget(String target) {
        this.target = target;
        return this;
    }

}
