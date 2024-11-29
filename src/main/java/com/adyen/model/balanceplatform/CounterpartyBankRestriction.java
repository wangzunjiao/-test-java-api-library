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
import com.adyen.model.balanceplatform.BankIdentification;
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
 * CounterpartyBankRestriction
 */
@JsonPropertyOrder({
  CounterpartyBankRestriction.JSON_PROPERTY_OPERATION,
  CounterpartyBankRestriction.JSON_PROPERTY_VALUE
})
//pojo

public class CounterpartyBankRestriction {
  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<BankIdentification> value = null;

  public CounterpartyBankRestriction() { 
  }

  /**
   * Defines how the condition must be evaluated.
   *
   * @param operation
   * @return the current {@code CounterpartyBankRestriction} instance, allowing for method chaining
   */
  public CounterpartyBankRestriction operation(String operation) {
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
   * List of counterparty Bank Institutions and the operation.
   *
   * @param value
   * @return the current {@code CounterpartyBankRestriction} instance, allowing for method chaining
   */
  public CounterpartyBankRestriction value(List<BankIdentification> value) {
    this.value = value;
    return this;
  }

  public CounterpartyBankRestriction addValueItem(BankIdentification valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * List of counterparty Bank Institutions and the operation.
   * @return value
   */
  @ApiModelProperty(value = "List of counterparty Bank Institutions and the operation.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BankIdentification> getValue() {
    return value;
  }

  /**
   * List of counterparty Bank Institutions and the operation.
   *
   * @param value
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(List<BankIdentification> value) {
    this.value = value;
  }

  /**
   * Return true if this CounterpartyBankRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyBankRestriction counterpartyBankRestriction = (CounterpartyBankRestriction) o;
    return Objects.equals(this.operation, counterpartyBankRestriction.operation) &&
        Objects.equals(this.value, counterpartyBankRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyBankRestriction {\n");
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
   * Create an instance of CounterpartyBankRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CounterpartyBankRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to CounterpartyBankRestriction
   */
  public static CounterpartyBankRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CounterpartyBankRestriction.class);
  }
/**
  * Convert an instance of CounterpartyBankRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
