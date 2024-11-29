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
 * UpiIntentDetails
 */
@JsonPropertyOrder({
  UpiIntentDetails.JSON_PROPERTY_APP_ID,
  UpiIntentDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  UpiIntentDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  UpiIntentDetails.JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE,
  UpiIntentDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  UpiIntentDetails.JSON_PROPERTY_TYPE
})
//pojo

public class UpiIntentDetails {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated // deprecated since Adyen Checkout API v49: Use `storedPaymentMethodId` instead.
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  private String shopperNotificationReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **upi_intent**
   */
  public enum TypeEnum {
    UPI_INTENT("upi_intent");

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

  public UpiIntentDetails() { 
  }

  /**
   * TPAP (Third Party Application) Id that is being used to make the UPI payment
   *
   * @param appId
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   */
  public UpiIntentDetails appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * TPAP (Third Party Application) Id that is being used to make the UPI payment
   * @return appId
   */
  @ApiModelProperty(value = "TPAP (Third Party Application) Id that is being used to make the UPI payment")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppId() {
    return appId;
  }

  /**
   * TPAP (Third Party Application) Id that is being used to make the UPI payment
   *
   * @param appId
   */ 
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   */
  public UpiIntentDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

  /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
   */
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */
  @Deprecated
  public UpiIntentDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only.
   *
   * @param shopperNotificationReference
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   */
  public UpiIntentDetails shopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

  /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only.
   * @return shopperNotificationReference
   */
  @ApiModelProperty(value = "The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used for recurring payment only.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }

  /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only.
   *
   * @param shopperNotificationReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param storedPaymentMethodId
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   */
  public UpiIntentDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
   */
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param storedPaymentMethodId
   */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }

  /**
   * **upi_intent**
   *
   * @param type
   * @return the current {@code UpiIntentDetails} instance, allowing for method chaining
   */
  public UpiIntentDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **upi_intent**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**upi_intent**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **upi_intent**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this UpiIntentDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpiIntentDetails upiIntentDetails = (UpiIntentDetails) o;
    return Objects.equals(this.appId, upiIntentDetails.appId) &&
        Objects.equals(this.checkoutAttemptId, upiIntentDetails.checkoutAttemptId) &&
        Objects.equals(this.recurringDetailReference, upiIntentDetails.recurringDetailReference) &&
        Objects.equals(this.shopperNotificationReference, upiIntentDetails.shopperNotificationReference) &&
        Objects.equals(this.storedPaymentMethodId, upiIntentDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, upiIntentDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, checkoutAttemptId, recurringDetailReference, shopperNotificationReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpiIntentDetails {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of UpiIntentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpiIntentDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpiIntentDetails
   */
  public static UpiIntentDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpiIntentDetails.class);
  }
/**
  * Convert an instance of UpiIntentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
