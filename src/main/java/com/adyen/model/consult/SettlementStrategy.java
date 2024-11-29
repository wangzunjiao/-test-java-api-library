/*
 * Payment API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.consult;

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
 * SettlementStrategy
 */
@JsonPropertyOrder({
  SettlementStrategy.JSON_PROPERTY_SETTLEMENT_CURRENCY
})
//pojo

public class SettlementStrategy {
  public static final String JSON_PROPERTY_SETTLEMENT_CURRENCY = "settlementCurrency";
  private String settlementCurrency;

  public SettlementStrategy() { 
  }

  /**
   * The ISO currency code of the currency that the merchant wants to settle against. This field is required if the merchant signed up for multiple settlement currencies. Otherwise, the error code,SETTLE_CONTRACT_NOT_MATCH, will be returned.
   *
   * @param settlementCurrency
   * @return the current {@code SettlementStrategy} instance, allowing for method chaining
   */
  public SettlementStrategy settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

  /**
   * The ISO currency code of the currency that the merchant wants to settle against. This field is required if the merchant signed up for multiple settlement currencies. Otherwise, the error code,SETTLE_CONTRACT_NOT_MATCH, will be returned.
   * @return settlementCurrency
   */
  @ApiModelProperty(value = "The ISO currency code of the currency that the merchant wants to settle against. This field is required if the merchant signed up for multiple settlement currencies. Otherwise, the error code,SETTLE_CONTRACT_NOT_MATCH, will be returned.")
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  /**
   * The ISO currency code of the currency that the merchant wants to settle against. This field is required if the merchant signed up for multiple settlement currencies. Otherwise, the error code,SETTLE_CONTRACT_NOT_MATCH, will be returned.
   *
   * @param settlementCurrency
   */ 
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  /**
   * Return true if this SettlementStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementStrategy settlementStrategy = (SettlementStrategy) o;
    return Objects.equals(this.settlementCurrency, settlementStrategy.settlementCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementStrategy {\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
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
   * Create an instance of SettlementStrategy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SettlementStrategy
   * @throws JsonProcessingException if the JSON string is invalid with respect to SettlementStrategy
   */
  public static SettlementStrategy fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SettlementStrategy.class);
  }
/**
  * Convert an instance of SettlementStrategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
