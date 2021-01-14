// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CellOutputType. */
public final class CellOutputType extends ExpandableStringEnum<CellOutputType> {
    /** Static value execute_result for CellOutputType. */
    public static final CellOutputType EXECUTE_RESULT = fromString("execute_result");

    /** Static value display_data for CellOutputType. */
    public static final CellOutputType DISPLAY_DATA = fromString("display_data");

    /** Static value stream for CellOutputType. */
    public static final CellOutputType STREAM = fromString("stream");

    /** Static value error for CellOutputType. */
    public static final CellOutputType ERROR = fromString("error");

    /**
     * Creates or finds a CellOutputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CellOutputType.
     */
    @JsonCreator
    public static CellOutputType fromString(String name) {
        return fromString(name, CellOutputType.class);
    }

    /** @return known CellOutputType values. */
    public static Collection<CellOutputType> values() {
        return values(CellOutputType.class);
    }
}
