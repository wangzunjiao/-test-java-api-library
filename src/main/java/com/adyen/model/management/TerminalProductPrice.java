/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * TerminalProductPrice
 */
@JsonPropertyOrder({
  TerminalProductPrice.JSON_PROPERTY_CURRENCY,
  TerminalProductPrice.JSON_PROPERTY_VALUE
})
//pojo

public class TerminalProductPrice {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public TerminalProductPrice() { 
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   *
   * @param currency
   * @return the current {@code TerminalProductPrice} instance, allowing for method chaining
   */
  public TerminalProductPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   * @return currency
   */
  @ApiModelProperty(value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The price of the item.
   *
   * @param value
   * @return the current {@code TerminalProductPrice} instance, allowing for method chaining
   */
  public TerminalProductPrice value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The price of the item.
   * @return value
   */
  @ApiModelProperty(value = "The price of the item.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }

  /**
   * The price of the item.
   *
   * @param value
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Return true if this TerminalProductPrice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalProductPrice terminalProductPrice = (TerminalProductPrice) o;
    return Objects.equals(this.currency, terminalProductPrice.currency) &&
        Objects.equals(this.value, terminalProductPrice.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalProductPrice {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
   * Create an instance of TerminalProductPrice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalProductPrice
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalProductPrice
   */
  public static TerminalProductPrice fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalProductPrice.class);
  }
/**
  * Convert an instance of TerminalProductPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
