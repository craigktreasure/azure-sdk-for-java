// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphSensitivity. */
public final class MicrosoftGraphSensitivity extends ExpandableStringEnum<MicrosoftGraphSensitivity> {
    /** Static value normal for MicrosoftGraphSensitivity. */
    public static final MicrosoftGraphSensitivity NORMAL = fromString("normal");

    /** Static value personal for MicrosoftGraphSensitivity. */
    public static final MicrosoftGraphSensitivity PERSONAL = fromString("personal");

    /** Static value private for MicrosoftGraphSensitivity. */
    public static final MicrosoftGraphSensitivity PRIVATE = fromString("private");

    /** Static value confidential for MicrosoftGraphSensitivity. */
    public static final MicrosoftGraphSensitivity CONFIDENTIAL = fromString("confidential");

    /**
     * Creates or finds a MicrosoftGraphSensitivity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphSensitivity.
     */
    @JsonCreator
    public static MicrosoftGraphSensitivity fromString(String name) {
        return fromString(name, MicrosoftGraphSensitivity.class);
    }

    /** @return known MicrosoftGraphSensitivity values. */
    public static Collection<MicrosoftGraphSensitivity> values() {
        return values(MicrosoftGraphSensitivity.class);
    }
}
