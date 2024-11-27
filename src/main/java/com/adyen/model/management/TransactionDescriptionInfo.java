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
 * TransactionDescriptionInfo
 */
@JsonPropertyOrder({
  TransactionDescriptionInfo.JSON_PROPERTY_DOING_BUSINESS_AS_NAME,
  TransactionDescriptionInfo.JSON_PROPERTY_TYPE
})

public class TransactionDescriptionInfo {
  public static final String JSON_PROPERTY_DOING_BUSINESS_AS_NAME = "doingBusinessAsName";
  private String doingBusinessAsName;

  /**
   * The type of transaction description you want to use: - **fixed**: The transaction description set in this request is used for all payments with this payment method. - **append**: The transaction description set in this request is used as a base for all payments with this payment method. The [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is appended to this base description. Note that if the combined length exceeds 22 characters, banks may truncate the string. - **dynamic**: Only the [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is used for payments with this payment method.
   */
  public enum TypeEnum {
    APPEND("append"),
    
    DYNAMIC("dynamic"),
    
    FIXED("fixed");

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

  public TransactionDescriptionInfo() { 
  }

  /**
   * The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**.
   *
   * @param doingBusinessAsName
   * @return the current {@code TransactionDescriptionInfo} instance, allowing for method chaining
   */
  public TransactionDescriptionInfo doingBusinessAsName(String doingBusinessAsName) {
    this.doingBusinessAsName = doingBusinessAsName;
    return this;
  }

  /**
   * The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**.
   * @return doingBusinessAsName
   */
  @ApiModelProperty(value = "The text to be shown on the shopper's bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , ' _ - ? + * /_**.")
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDoingBusinessAsName() {
    return doingBusinessAsName;
  }

  /**
   * The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**.
   *
   * @param doingBusinessAsName
   */ 
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoingBusinessAsName(String doingBusinessAsName) {
    this.doingBusinessAsName = doingBusinessAsName;
  }

  /**
   * The type of transaction description you want to use: - **fixed**: The transaction description set in this request is used for all payments with this payment method. - **append**: The transaction description set in this request is used as a base for all payments with this payment method. The [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is appended to this base description. Note that if the combined length exceeds 22 characters, banks may truncate the string. - **dynamic**: Only the [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is used for payments with this payment method.
   *
   * @param type
   * @return the current {@code TransactionDescriptionInfo} instance, allowing for method chaining
   */
  public TransactionDescriptionInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of transaction description you want to use: - **fixed**: The transaction description set in this request is used for all payments with this payment method. - **append**: The transaction description set in this request is used as a base for all payments with this payment method. The [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is appended to this base description. Note that if the combined length exceeds 22 characters, banks may truncate the string. - **dynamic**: Only the [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is used for payments with this payment method.
   * @return type
   */
  @ApiModelProperty(value = "The type of transaction description you want to use: - **fixed**: The transaction description set in this request is used for all payments with this payment method. - **append**: The transaction description set in this request is used as a base for all payments with this payment method. The [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is appended to this base description. Note that if the combined length exceeds 22 characters, banks may truncate the string. - **dynamic**: Only the [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is used for payments with this payment method.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of transaction description you want to use: - **fixed**: The transaction description set in this request is used for all payments with this payment method. - **append**: The transaction description set in this request is used as a base for all payments with this payment method. The [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is appended to this base description. Note that if the combined length exceeds 22 characters, banks may truncate the string. - **dynamic**: Only the [transaction description set in the request to process the payment](https://docs.adyen.com/api-explorer/Checkout/70/post/sessions#request-shopperStatement) is used for payments with this payment method.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this TransactionDescriptionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDescriptionInfo transactionDescriptionInfo = (TransactionDescriptionInfo) o;
    return Objects.equals(this.doingBusinessAsName, transactionDescriptionInfo.doingBusinessAsName) &&
        Objects.equals(this.type, transactionDescriptionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doingBusinessAsName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDescriptionInfo {\n");
    sb.append("    doingBusinessAsName: ").append(toIndentedString(doingBusinessAsName)).append("\n");
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
   * Create an instance of TransactionDescriptionInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionDescriptionInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionDescriptionInfo
   */
  public static TransactionDescriptionInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionDescriptionInfo.class);
  }
/**
  * Convert an instance of TransactionDescriptionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
