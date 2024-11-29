/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.MerchantAcquirerPair;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * MerchantsRestriction
 */
@JsonPropertyOrder({
  MerchantsRestriction.JSON_PROPERTY_OPERATION,
  MerchantsRestriction.JSON_PROPERTY_VALUE
})
//pojo

public class MerchantsRestriction {
  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<MerchantAcquirerPair> value = null;

  public MerchantsRestriction() { 
  }

  /**
   * Defines how the condition must be evaluated.
   *
   * @param operation
   * @return the current {@code MerchantsRestriction} instance, allowing for method chaining
   */
  public MerchantsRestriction operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Defines how the condition must be evaluated.
   * @return operation
   */
  @ApiModelProperty(required = true, value = "Defines how the condition must be evaluated.")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }

  /**
   * Defines how the condition must be evaluated.
   *
   * @param operation
   */ 
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * List of merchant ID and acquirer ID pairs.
   *
   * @param value
   * @return the current {@code MerchantsRestriction} instance, allowing for method chaining
   */
  public MerchantsRestriction value(List<MerchantAcquirerPair> value) {
    this.value = value;
    return this;
  }

  public MerchantsRestriction addValueItem(MerchantAcquirerPair valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * List of merchant ID and acquirer ID pairs.
   * @return value
   */
  @ApiModelProperty(value = "List of merchant ID and acquirer ID pairs.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MerchantAcquirerPair> getValue() {
    return value;
  }

  /**
   * List of merchant ID and acquirer ID pairs.
   *
   * @param value
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(List<MerchantAcquirerPair> value) {
    this.value = value;
  }

  /**
   * Return true if this MerchantsRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantsRestriction merchantsRestriction = (MerchantsRestriction) o;
    return Objects.equals(this.operation, merchantsRestriction.operation) &&
        Objects.equals(this.value, merchantsRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantsRestriction {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of MerchantsRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MerchantsRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to MerchantsRestriction
   */
  public static MerchantsRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MerchantsRestriction.class);
  }
/**
  * Convert an instance of MerchantsRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
