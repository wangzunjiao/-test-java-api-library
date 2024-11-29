/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.Amount;
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
 * PermitRestriction
 */
@JsonPropertyOrder({
  PermitRestriction.JSON_PROPERTY_MAX_AMOUNT,
  PermitRestriction.JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT,
  PermitRestriction.JSON_PROPERTY_SINGLE_USE
})
//pojo

public class PermitRestriction {
  public static final String JSON_PROPERTY_MAX_AMOUNT = "maxAmount";
  private Amount maxAmount;

  public static final String JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT = "singleTransactionLimit";
  private Amount singleTransactionLimit;

  public static final String JSON_PROPERTY_SINGLE_USE = "singleUse";
  private Boolean singleUse;

  public PermitRestriction() { 
  }

  /**
   * maxAmount
   *
   * @param maxAmount
   * @return the current {@code PermitRestriction} instance, allowing for method chaining
   */
  public PermitRestriction maxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

  /**
   * maxAmount
   * @return maxAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getMaxAmount() {
    return maxAmount;
  }

  /**
   * maxAmount
   *
   * @param maxAmount
   */ 
  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
  }

  /**
   * singleTransactionLimit
   *
   * @param singleTransactionLimit
   * @return the current {@code PermitRestriction} instance, allowing for method chaining
   */
  public PermitRestriction singleTransactionLimit(Amount singleTransactionLimit) {
    this.singleTransactionLimit = singleTransactionLimit;
    return this;
  }

  /**
   * singleTransactionLimit
   * @return singleTransactionLimit
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getSingleTransactionLimit() {
    return singleTransactionLimit;
  }

  /**
   * singleTransactionLimit
   *
   * @param singleTransactionLimit
   */ 
  @JsonProperty(JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleTransactionLimit(Amount singleTransactionLimit) {
    this.singleTransactionLimit = singleTransactionLimit;
  }

  /**
   * Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.
   *
   * @param singleUse
   * @return the current {@code PermitRestriction} instance, allowing for method chaining
   */
  public PermitRestriction singleUse(Boolean singleUse) {
    this.singleUse = singleUse;
    return this;
  }

  /**
   * Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.
   * @return singleUse
   */
  @ApiModelProperty(value = "Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.")
  @JsonProperty(JSON_PROPERTY_SINGLE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSingleUse() {
    return singleUse;
  }

  /**
   * Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.
   *
   * @param singleUse
   */ 
  @JsonProperty(JSON_PROPERTY_SINGLE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleUse(Boolean singleUse) {
    this.singleUse = singleUse;
  }

  /**
   * Return true if this PermitRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermitRestriction permitRestriction = (PermitRestriction) o;
    return Objects.equals(this.maxAmount, permitRestriction.maxAmount) &&
        Objects.equals(this.singleTransactionLimit, permitRestriction.singleTransactionLimit) &&
        Objects.equals(this.singleUse, permitRestriction.singleUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmount, singleTransactionLimit, singleUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermitRestriction {\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    singleTransactionLimit: ").append(toIndentedString(singleTransactionLimit)).append("\n");
    sb.append("    singleUse: ").append(toIndentedString(singleUse)).append("\n");
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
   * Create an instance of PermitRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PermitRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to PermitRestriction
   */
  public static PermitRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PermitRestriction.class);
  }
/**
  * Convert an instance of PermitRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
