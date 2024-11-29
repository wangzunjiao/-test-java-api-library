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
 * ApplePaySessionResponse
 */
@JsonPropertyOrder({
  ApplePaySessionResponse.JSON_PROPERTY_DATA
})
//pojo

public class ApplePaySessionResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public ApplePaySessionResponse() { 
  }

  /**
   * Base64 encoded data you need to [complete the Apple Pay merchant validation](https://docs.adyen.com/payment-methods/apple-pay/api-only?tab&#x3D;adyen-certificate-validation_1#complete-apple-pay-session-validation).
   *
   * @param data
   * @return the current {@code ApplePaySessionResponse} instance, allowing for method chaining
   */
  public ApplePaySessionResponse data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Base64 encoded data you need to [complete the Apple Pay merchant validation](https://docs.adyen.com/payment-methods/apple-pay/api-only?tab&#x3D;adyen-certificate-validation_1#complete-apple-pay-session-validation).
   * @return data
   */
  @ApiModelProperty(required = true, value = "Base64 encoded data you need to [complete the Apple Pay merchant validation](https://docs.adyen.com/payment-methods/apple-pay/api-only?tab=adyen-certificate-validation_1#complete-apple-pay-session-validation).")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getData() {
    return data;
  }

  /**
   * Base64 encoded data you need to [complete the Apple Pay merchant validation](https://docs.adyen.com/payment-methods/apple-pay/api-only?tab&#x3D;adyen-certificate-validation_1#complete-apple-pay-session-validation).
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Return true if this ApplePaySessionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaySessionResponse applePaySessionResponse = (ApplePaySessionResponse) o;
    return Objects.equals(this.data, applePaySessionResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaySessionResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of ApplePaySessionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplePaySessionResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to ApplePaySessionResponse
   */
  public static ApplePaySessionResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ApplePaySessionResponse.class);
  }
/**
  * Convert an instance of ApplePaySessionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
