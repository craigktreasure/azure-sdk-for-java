// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** photo. */
@Fluent
public final class MicrosoftGraphPhoto {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPhoto.class);

    /*
     * Camera manufacturer. Read-only.
     */
    @JsonProperty(value = "cameraMake")
    private String cameraMake;

    /*
     * Camera model. Read-only.
     */
    @JsonProperty(value = "cameraModel")
    private String cameraModel;

    /*
     * The denominator for the exposure time fraction from the camera.
     * Read-only.
     */
    @JsonProperty(value = "exposureDenominator")
    private Double exposureDenominator;

    /*
     * The numerator for the exposure time fraction from the camera. Read-only.
     */
    @JsonProperty(value = "exposureNumerator")
    private Double exposureNumerator;

    /*
     * The F-stop value from the camera. Read-only.
     */
    @JsonProperty(value = "fNumber")
    private Double fNumber;

    /*
     * The focal length from the camera. Read-only.
     */
    @JsonProperty(value = "focalLength")
    private Double focalLength;

    /*
     * The ISO value from the camera. Read-only.
     */
    @JsonProperty(value = "iso")
    private Integer iso;

    /*
     * The orientation value from the camera. Writable on OneDrive Personal.
     */
    @JsonProperty(value = "orientation")
    private Integer orientation;

    /*
     * Represents the date and time the photo was taken. Read-only.
     */
    @JsonProperty(value = "takenDateTime")
    private OffsetDateTime takenDateTime;

    /*
     * photo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the cameraMake property: Camera manufacturer. Read-only.
     *
     * @return the cameraMake value.
     */
    public String cameraMake() {
        return this.cameraMake;
    }

    /**
     * Set the cameraMake property: Camera manufacturer. Read-only.
     *
     * @param cameraMake the cameraMake value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withCameraMake(String cameraMake) {
        this.cameraMake = cameraMake;
        return this;
    }

    /**
     * Get the cameraModel property: Camera model. Read-only.
     *
     * @return the cameraModel value.
     */
    public String cameraModel() {
        return this.cameraModel;
    }

    /**
     * Set the cameraModel property: Camera model. Read-only.
     *
     * @param cameraModel the cameraModel value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
        return this;
    }

    /**
     * Get the exposureDenominator property: The denominator for the exposure time fraction from the camera. Read-only.
     *
     * @return the exposureDenominator value.
     */
    public Double exposureDenominator() {
        return this.exposureDenominator;
    }

    /**
     * Set the exposureDenominator property: The denominator for the exposure time fraction from the camera. Read-only.
     *
     * @param exposureDenominator the exposureDenominator value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withExposureDenominator(Double exposureDenominator) {
        this.exposureDenominator = exposureDenominator;
        return this;
    }

    /**
     * Get the exposureNumerator property: The numerator for the exposure time fraction from the camera. Read-only.
     *
     * @return the exposureNumerator value.
     */
    public Double exposureNumerator() {
        return this.exposureNumerator;
    }

    /**
     * Set the exposureNumerator property: The numerator for the exposure time fraction from the camera. Read-only.
     *
     * @param exposureNumerator the exposureNumerator value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withExposureNumerator(Double exposureNumerator) {
        this.exposureNumerator = exposureNumerator;
        return this;
    }

    /**
     * Get the fNumber property: The F-stop value from the camera. Read-only.
     *
     * @return the fNumber value.
     */
    public Double fNumber() {
        return this.fNumber;
    }

    /**
     * Set the fNumber property: The F-stop value from the camera. Read-only.
     *
     * @param fNumber the fNumber value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withFNumber(Double fNumber) {
        this.fNumber = fNumber;
        return this;
    }

    /**
     * Get the focalLength property: The focal length from the camera. Read-only.
     *
     * @return the focalLength value.
     */
    public Double focalLength() {
        return this.focalLength;
    }

    /**
     * Set the focalLength property: The focal length from the camera. Read-only.
     *
     * @param focalLength the focalLength value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withFocalLength(Double focalLength) {
        this.focalLength = focalLength;
        return this;
    }

    /**
     * Get the iso property: The ISO value from the camera. Read-only.
     *
     * @return the iso value.
     */
    public Integer iso() {
        return this.iso;
    }

    /**
     * Set the iso property: The ISO value from the camera. Read-only.
     *
     * @param iso the iso value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withIso(Integer iso) {
        this.iso = iso;
        return this;
    }

    /**
     * Get the orientation property: The orientation value from the camera. Writable on OneDrive Personal.
     *
     * @return the orientation value.
     */
    public Integer orientation() {
        return this.orientation;
    }

    /**
     * Set the orientation property: The orientation value from the camera. Writable on OneDrive Personal.
     *
     * @param orientation the orientation value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withOrientation(Integer orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Get the takenDateTime property: Represents the date and time the photo was taken. Read-only.
     *
     * @return the takenDateTime value.
     */
    public OffsetDateTime takenDateTime() {
        return this.takenDateTime;
    }

    /**
     * Set the takenDateTime property: Represents the date and time the photo was taken. Read-only.
     *
     * @param takenDateTime the takenDateTime value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withTakenDateTime(OffsetDateTime takenDateTime) {
        this.takenDateTime = takenDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: photo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: photo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPhoto object itself.
     */
    public MicrosoftGraphPhoto withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
