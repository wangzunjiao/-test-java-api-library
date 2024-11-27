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
 * AdditionalDataWallets
 */
@JsonPropertyOrder({
  AdditionalDataWallets.JSON_PROPERTY_ANDROIDPAY_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_MASTERPASS_TRANSACTION_ID,
  AdditionalDataWallets.JSON_PROPERTY_PAYMENT_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_PAYWITHGOOGLE_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_SAMSUNGPAY_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_VISACHECKOUT_CALL_ID
})

public class AdditionalDataWallets {
  public static final String JSON_PROPERTY_ANDROIDPAY_TOKEN = "androidpay.token";
  private String androidpayToken;

  public static final String JSON_PROPERTY_MASTERPASS_TRANSACTION_ID = "masterpass.transactionId";
  private String masterpassTransactionId;

  public static final String JSON_PROPERTY_PAYMENT_TOKEN = "payment.token";
  private String paymentToken;

  public static final String JSON_PROPERTY_PAYWITHGOOGLE_TOKEN = "paywithgoogle.token";
  private String paywithgoogleToken;

  public static final String JSON_PROPERTY_SAMSUNGPAY_TOKEN = "samsungpay.token";
  private String samsungpayToken;

  public static final String JSON_PROPERTY_VISACHECKOUT_CALL_ID = "visacheckout.callId";
  private String visacheckoutCallId;

  public AdditionalDataWallets() { 
  }

  /**
   * The Android Pay token retrieved from the SDK.
   *
   * @param androidpayToken
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets androidpayToken(String androidpayToken) {
    this.androidpayToken = androidpayToken;
    return this;
  }

  /**
   * The Android Pay token retrieved from the SDK.
   * @return androidpayToken
   */
  @ApiModelProperty(value = "The Android Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_ANDROIDPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAndroidpayToken() {
    return androidpayToken;
  }

  /**
   * The Android Pay token retrieved from the SDK.
   *
   * @param androidpayToken
   */ 
  @JsonProperty(JSON_PROPERTY_ANDROIDPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidpayToken(String androidpayToken) {
    this.androidpayToken = androidpayToken;
  }

  /**
   * The Mastercard Masterpass Transaction ID retrieved from the SDK.
   *
   * @param masterpassTransactionId
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets masterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
    return this;
  }

  /**
   * The Mastercard Masterpass Transaction ID retrieved from the SDK.
   * @return masterpassTransactionId
   */
  @ApiModelProperty(value = "The Mastercard Masterpass Transaction ID retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMasterpassTransactionId() {
    return masterpassTransactionId;
  }

  /**
   * The Mastercard Masterpass Transaction ID retrieved from the SDK.
   *
   * @param masterpassTransactionId
   */ 
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
  }

  /**
   * The Apple Pay token retrieved from the SDK.
   *
   * @param paymentToken
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets paymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * The Apple Pay token retrieved from the SDK.
   * @return paymentToken
   */
  @ApiModelProperty(value = "The Apple Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentToken() {
    return paymentToken;
  }

  /**
   * The Apple Pay token retrieved from the SDK.
   *
   * @param paymentToken
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }

  /**
   * The Google Pay token retrieved from the SDK.
   *
   * @param paywithgoogleToken
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets paywithgoogleToken(String paywithgoogleToken) {
    this.paywithgoogleToken = paywithgoogleToken;
    return this;
  }

  /**
   * The Google Pay token retrieved from the SDK.
   * @return paywithgoogleToken
   */
  @ApiModelProperty(value = "The Google Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_PAYWITHGOOGLE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaywithgoogleToken() {
    return paywithgoogleToken;
  }

  /**
   * The Google Pay token retrieved from the SDK.
   *
   * @param paywithgoogleToken
   */ 
  @JsonProperty(JSON_PROPERTY_PAYWITHGOOGLE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaywithgoogleToken(String paywithgoogleToken) {
    this.paywithgoogleToken = paywithgoogleToken;
  }

  /**
   * The Samsung Pay token retrieved from the SDK.
   *
   * @param samsungpayToken
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets samsungpayToken(String samsungpayToken) {
    this.samsungpayToken = samsungpayToken;
    return this;
  }

  /**
   * The Samsung Pay token retrieved from the SDK.
   * @return samsungpayToken
   */
  @ApiModelProperty(value = "The Samsung Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_SAMSUNGPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSamsungpayToken() {
    return samsungpayToken;
  }

  /**
   * The Samsung Pay token retrieved from the SDK.
   *
   * @param samsungpayToken
   */ 
  @JsonProperty(JSON_PROPERTY_SAMSUNGPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSamsungpayToken(String samsungpayToken) {
    this.samsungpayToken = samsungpayToken;
  }

  /**
   * The Visa Checkout Call ID retrieved from the SDK.
   *
   * @param visacheckoutCallId
   * @return the current {@code AdditionalDataWallets} instance, allowing for method chaining
   */
  public AdditionalDataWallets visacheckoutCallId(String visacheckoutCallId) {
    this.visacheckoutCallId = visacheckoutCallId;
    return this;
  }

  /**
   * The Visa Checkout Call ID retrieved from the SDK.
   * @return visacheckoutCallId
   */
  @ApiModelProperty(value = "The Visa Checkout Call ID retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_VISACHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVisacheckoutCallId() {
    return visacheckoutCallId;
  }

  /**
   * The Visa Checkout Call ID retrieved from the SDK.
   *
   * @param visacheckoutCallId
   */ 
  @JsonProperty(JSON_PROPERTY_VISACHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisacheckoutCallId(String visacheckoutCallId) {
    this.visacheckoutCallId = visacheckoutCallId;
  }

  /**
   * Return true if this AdditionalDataWallets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataWallets additionalDataWallets = (AdditionalDataWallets) o;
    return Objects.equals(this.androidpayToken, additionalDataWallets.androidpayToken) &&
        Objects.equals(this.masterpassTransactionId, additionalDataWallets.masterpassTransactionId) &&
        Objects.equals(this.paymentToken, additionalDataWallets.paymentToken) &&
        Objects.equals(this.paywithgoogleToken, additionalDataWallets.paywithgoogleToken) &&
        Objects.equals(this.samsungpayToken, additionalDataWallets.samsungpayToken) &&
        Objects.equals(this.visacheckoutCallId, additionalDataWallets.visacheckoutCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidpayToken, masterpassTransactionId, paymentToken, paywithgoogleToken, samsungpayToken, visacheckoutCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataWallets {\n");
    sb.append("    androidpayToken: ").append(toIndentedString(androidpayToken)).append("\n");
    sb.append("    masterpassTransactionId: ").append(toIndentedString(masterpassTransactionId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paywithgoogleToken: ").append(toIndentedString(paywithgoogleToken)).append("\n");
    sb.append("    samsungpayToken: ").append(toIndentedString(samsungpayToken)).append("\n");
    sb.append("    visacheckoutCallId: ").append(toIndentedString(visacheckoutCallId)).append("\n");
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
   * Create an instance of AdditionalDataWallets given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataWallets
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataWallets
   */
  public static AdditionalDataWallets fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataWallets.class);
  }
/**
  * Convert an instance of AdditionalDataWallets to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
