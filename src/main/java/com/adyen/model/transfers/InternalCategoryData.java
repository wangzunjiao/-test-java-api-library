/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * InternalCategoryData
 */
@JsonPropertyOrder({
  InternalCategoryData.JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE,
  InternalCategoryData.JSON_PROPERTY_MODIFICATION_PSP_REFERENCE,
  InternalCategoryData.JSON_PROPERTY_TYPE
})
//pojo

public class InternalCategoryData {
  public static final String JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE = "modificationMerchantReference";
  private String modificationMerchantReference;

  public static final String JSON_PROPERTY_MODIFICATION_PSP_REFERENCE = "modificationPspReference";
  private String modificationPspReference;

  /**
   * **internal**
   */
  public enum TypeEnum {
    INTERNAL("internal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public InternalCategoryData() { 
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   *
   * @param modificationMerchantReference
   * @return the current {@code InternalCategoryData} instance, allowing for method chaining
   */
  public InternalCategoryData modificationMerchantReference(String modificationMerchantReference) {
    this.modificationMerchantReference = modificationMerchantReference;
    return this;
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   * @return modificationMerchantReference
   */
  @ApiModelProperty(value = "The capture's merchant reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModificationMerchantReference() {
    return modificationMerchantReference;
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   *
   * @param modificationMerchantReference
   */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationMerchantReference(String modificationMerchantReference) {
    this.modificationMerchantReference = modificationMerchantReference;
  }

  /**
   * The capture reference included in the transfer.
   *
   * @param modificationPspReference
   * @return the current {@code InternalCategoryData} instance, allowing for method chaining
   */
  public InternalCategoryData modificationPspReference(String modificationPspReference) {
    this.modificationPspReference = modificationPspReference;
    return this;
  }

  /**
   * The capture reference included in the transfer.
   * @return modificationPspReference
   */
  @ApiModelProperty(value = "The capture reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModificationPspReference() {
    return modificationPspReference;
  }

  /**
   * The capture reference included in the transfer.
   *
   * @param modificationPspReference
   */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationPspReference(String modificationPspReference) {
    this.modificationPspReference = modificationPspReference;
  }

  /**
   * **internal**
   *
   * @param type
   * @return the current {@code InternalCategoryData} instance, allowing for method chaining
   */
  public InternalCategoryData type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **internal**
   * @return type
   */
  @ApiModelProperty(value = "**internal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **internal**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this InternalCategoryData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalCategoryData internalCategoryData = (InternalCategoryData) o;
    return Objects.equals(this.modificationMerchantReference, internalCategoryData.modificationMerchantReference) &&
        Objects.equals(this.modificationPspReference, internalCategoryData.modificationPspReference) &&
        Objects.equals(this.type, internalCategoryData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modificationMerchantReference, modificationPspReference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalCategoryData {\n");
    sb.append("    modificationMerchantReference: ").append(toIndentedString(modificationMerchantReference)).append("\n");
    sb.append("    modificationPspReference: ").append(toIndentedString(modificationPspReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of InternalCategoryData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InternalCategoryData
   * @throws JsonProcessingException if the JSON string is invalid with respect to InternalCategoryData
   */
  public static InternalCategoryData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InternalCategoryData.class);
  }
/**
  * Convert an instance of InternalCategoryData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
