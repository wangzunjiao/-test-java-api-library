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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Amount;
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
 * CheckoutOrderResponse
 */
@JsonPropertyOrder({
  CheckoutOrderResponse.JSON_PROPERTY_AMOUNT,
  CheckoutOrderResponse.JSON_PROPERTY_EXPIRES_AT,
  CheckoutOrderResponse.JSON_PROPERTY_ORDER_DATA,
  CheckoutOrderResponse.JSON_PROPERTY_PSP_REFERENCE,
  CheckoutOrderResponse.JSON_PROPERTY_REFERENCE,
  CheckoutOrderResponse.JSON_PROPERTY_REMAINING_AMOUNT
})

public class CheckoutOrderResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
  private String expiresAt;

  public static final String JSON_PROPERTY_ORDER_DATA = "orderData";
  private String orderData;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_REMAINING_AMOUNT = "remainingAmount";
  private Amount remainingAmount;

  public CheckoutOrderResponse() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getAmount() {
    return amount;
  }

  /**
   * amount
   *
   * @param amount
   */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The expiry date for the order.
   *
   * @param expiresAt
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date for the order.
   * @return expiresAt
   */
  @ApiModelProperty(value = "The expiry date for the order.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * The expiry date for the order.
   *
   * @param expiresAt
   */ 
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The encrypted order data.
   *
   * @param orderData
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse orderData(String orderData) {
    this.orderData = orderData;
    return this;
  }

  /**
   * The encrypted order data.
   * @return orderData
   */
  @ApiModelProperty(value = "The encrypted order data.")
  @JsonProperty(JSON_PROPERTY_ORDER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrderData() {
    return orderData;
  }

  /**
   * The encrypted order data.
   *
   * @param orderData
   */ 
  @JsonProperty(JSON_PROPERTY_ORDER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderData(String orderData) {
    this.orderData = orderData;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   *
   * @param pspReference
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   * @return pspReference
   */
  @ApiModelProperty(required = true, value = "The `pspReference` that belongs to the order.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspReference() {
    return pspReference;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   *
   * @param pspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }

  /**
   * The merchant reference for the order.
   *
   * @param reference
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The merchant reference for the order.
   * @return reference
   */
  @ApiModelProperty(value = "The merchant reference for the order.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * The merchant reference for the order.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * remainingAmount
   *
   * @param remainingAmount
   * @return the current {@code CheckoutOrderResponse} instance, allowing for method chaining
   */
  public CheckoutOrderResponse remainingAmount(Amount remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

  /**
   * remainingAmount
   * @return remainingAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMAINING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getRemainingAmount() {
    return remainingAmount;
  }

  /**
   * remainingAmount
   *
   * @param remainingAmount
   */ 
  @JsonProperty(JSON_PROPERTY_REMAINING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingAmount(Amount remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  /**
   * Return true if this CheckoutOrderResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderResponse checkoutOrderResponse = (CheckoutOrderResponse) o;
    return Objects.equals(this.amount, checkoutOrderResponse.amount) &&
        Objects.equals(this.expiresAt, checkoutOrderResponse.expiresAt) &&
        Objects.equals(this.orderData, checkoutOrderResponse.orderData) &&
        Objects.equals(this.pspReference, checkoutOrderResponse.pspReference) &&
        Objects.equals(this.reference, checkoutOrderResponse.reference) &&
        Objects.equals(this.remainingAmount, checkoutOrderResponse.remainingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, expiresAt, orderData, pspReference, reference, remainingAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    orderData: ").append(toIndentedString(orderData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
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
   * Create an instance of CheckoutOrderResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutOrderResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutOrderResponse
   */
  public static CheckoutOrderResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutOrderResponse.class);
  }
/**
  * Convert an instance of CheckoutOrderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
