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
 * TapToPay
 */
@JsonPropertyOrder({
  TapToPay.JSON_PROPERTY_MERCHANT_DISPLAY_NAME
})
//pojo

public class TapToPay {
  public static final String JSON_PROPERTY_MERCHANT_DISPLAY_NAME = "merchantDisplayName";
  private String merchantDisplayName;

  public TapToPay() { 
  }

  /**
   * The text shown on the screen during the Tap to Pay transaction.
   *
   * @param merchantDisplayName
   * @return the current {@code TapToPay} instance, allowing for method chaining
   */
  public TapToPay merchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
    return this;
  }

  /**
   * The text shown on the screen during the Tap to Pay transaction.
   * @return merchantDisplayName
   */
  @ApiModelProperty(value = "The text shown on the screen during the Tap to Pay transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantDisplayName() {
    return merchantDisplayName;
  }

  /**
   * The text shown on the screen during the Tap to Pay transaction.
   *
   * @param merchantDisplayName
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
  }

  /**
   * Return true if this TapToPay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapToPay tapToPay = (TapToPay) o;
    return Objects.equals(this.merchantDisplayName, tapToPay.merchantDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapToPay {\n");
    sb.append("    merchantDisplayName: ").append(toIndentedString(merchantDisplayName)).append("\n");
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
   * Create an instance of TapToPay given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TapToPay
   * @throws JsonProcessingException if the JSON string is invalid with respect to TapToPay
   */
  public static TapToPay fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TapToPay.class);
  }
/**
  * Convert an instance of TapToPay to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
