// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FilterMode. */
public final class FilterMode extends ExpandableStringEnum<FilterMode> {
    /** Static value Exclude for FilterMode. */
    public static final FilterMode EXCLUDE = fromString("Exclude");

    /** Static value Include for FilterMode. */
    public static final FilterMode INCLUDE = fromString("Include");

    /**
     * Creates or finds a FilterMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FilterMode.
     */
    @JsonCreator
    public static FilterMode fromString(String name) {
        return fromString(name, FilterMode.class);
    }

    /** @return known FilterMode values. */
    public static Collection<FilterMode> values() {
        return values(FilterMode.class);
    }
}
