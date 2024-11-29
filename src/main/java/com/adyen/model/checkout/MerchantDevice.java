/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * MerchantDevice
 */
@JsonPropertyOrder({
  MerchantDevice.JSON_PROPERTY_OS,
  MerchantDevice.JSON_PROPERTY_OS_VERSION,
  MerchantDevice.JSON_PROPERTY_REFERENCE
})
//pojo

public class MerchantDevice {
  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public MerchantDevice() { 
  }

  /**
   * Operating system running on the merchant device.
   *
   * @param os
   * @return the current {@code MerchantDevice} instance, allowing for method chaining
   */
  public MerchantDevice os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operating system running on the merchant device.
   * @return os
   */
  @ApiModelProperty(value = "Operating system running on the merchant device.")
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOs() {
    return os;
  }

  /**
   * Operating system running on the merchant device.
   *
   * @param os
   */ 
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * Version of the operating system on the merchant device.
   *
   * @param osVersion
   * @return the current {@code MerchantDevice} instance, allowing for method chaining
   */
  public MerchantDevice osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Version of the operating system on the merchant device.
   * @return osVersion
   */
  @ApiModelProperty(value = "Version of the operating system on the merchant device.")
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsVersion() {
    return osVersion;
  }

  /**
   * Version of the operating system on the merchant device.
   *
   * @param osVersion
   */ 
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * Merchant device reference.
   *
   * @param reference
   * @return the current {@code MerchantDevice} instance, allowing for method chaining
   */
  public MerchantDevice reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Merchant device reference.
   * @return reference
   */
  @ApiModelProperty(value = "Merchant device reference.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Merchant device reference.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Return true if this MerchantDevice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantDevice merchantDevice = (MerchantDevice) o;
    return Objects.equals(this.os, merchantDevice.os) &&
        Objects.equals(this.osVersion, merchantDevice.osVersion) &&
        Objects.equals(this.reference, merchantDevice.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(os, osVersion, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantDevice {\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of MerchantDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MerchantDevice
   * @throws JsonProcessingException if the JSON string is invalid with respect to MerchantDevice
   */
  public static MerchantDevice fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MerchantDevice.class);
  }
/**
  * Convert an instance of MerchantDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
