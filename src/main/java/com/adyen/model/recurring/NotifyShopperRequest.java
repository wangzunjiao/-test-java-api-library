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
 * NotifyShopperRequest
 */
@JsonPropertyOrder({
  NotifyShopperRequest.JSON_PROPERTY_AMOUNT,
  NotifyShopperRequest.JSON_PROPERTY_BILLING_DATE,
  NotifyShopperRequest.JSON_PROPERTY_BILLING_SEQUENCE_NUMBER,
  NotifyShopperRequest.JSON_PROPERTY_DISPLAYED_REFERENCE,
  NotifyShopperRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  NotifyShopperRequest.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  NotifyShopperRequest.JSON_PROPERTY_REFERENCE,
  NotifyShopperRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  NotifyShopperRequest.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID
})
//pojo

public class NotifyShopperRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BILLING_DATE = "billingDate";
  private String billingDate;

  public static final String JSON_PROPERTY_BILLING_SEQUENCE_NUMBER = "billingSequenceNumber";
  private String billingSequenceNumber;

  public static final String JSON_PROPERTY_DISPLAYED_REFERENCE = "displayedReference";
  private String displayedReference;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public NotifyShopperRequest() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
   */
  @ApiModelProperty(required = true, value = "")
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
   * Date on which the subscription amount will be debited from the shopper. In YYYY-MM-DD format
   *
   * @param billingDate
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest billingDate(String billingDate) {
    this.billingDate = billingDate;
    return this;
  }

  /**
   * Date on which the subscription amount will be debited from the shopper. In YYYY-MM-DD format
   * @return billingDate
   */
  @ApiModelProperty(value = "Date on which the subscription amount will be debited from the shopper. In YYYY-MM-DD format")
  @JsonProperty(JSON_PROPERTY_BILLING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingDate() {
    return billingDate;
  }

  /**
   * Date on which the subscription amount will be debited from the shopper. In YYYY-MM-DD format
   *
   * @param billingDate
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingDate(String billingDate) {
    this.billingDate = billingDate;
  }

  /**
   * Sequence of the debit. Depends on Frequency and Billing Attempts Rule.
   *
   * @param billingSequenceNumber
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest billingSequenceNumber(String billingSequenceNumber) {
    this.billingSequenceNumber = billingSequenceNumber;
    return this;
  }

  /**
   * Sequence of the debit. Depends on Frequency and Billing Attempts Rule.
   * @return billingSequenceNumber
   */
  @ApiModelProperty(value = "Sequence of the debit. Depends on Frequency and Billing Attempts Rule.")
  @JsonProperty(JSON_PROPERTY_BILLING_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingSequenceNumber() {
    return billingSequenceNumber;
  }

  /**
   * Sequence of the debit. Depends on Frequency and Billing Attempts Rule.
   *
   * @param billingSequenceNumber
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingSequenceNumber(String billingSequenceNumber) {
    this.billingSequenceNumber = billingSequenceNumber;
  }

  /**
   * Reference of Pre-debit notification that is displayed to the shopper. Optional field. Maps to reference if missing
   *
   * @param displayedReference
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest displayedReference(String displayedReference) {
    this.displayedReference = displayedReference;
    return this;
  }

  /**
   * Reference of Pre-debit notification that is displayed to the shopper. Optional field. Maps to reference if missing
   * @return displayedReference
   */
  @ApiModelProperty(value = "Reference of Pre-debit notification that is displayed to the shopper. Optional field. Maps to reference if missing")
  @JsonProperty(JSON_PROPERTY_DISPLAYED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayedReference() {
    return displayedReference;
  }

  /**
   * Reference of Pre-debit notification that is displayed to the shopper. Optional field. Maps to reference if missing
   *
   * @param displayedReference
   */ 
  @JsonProperty(JSON_PROPERTY_DISPLAYED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayedReference(String displayedReference) {
    this.displayedReference = displayedReference;
  }

  /**
   * The merchant account identifier with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier with which you want to process the transaction.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier with which you want to process the transaction.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   */
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
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * Pre-debit notification reference sent by the merchant. This is a mandatory field
   *
   * @param reference
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Pre-debit notification reference sent by the merchant. This is a mandatory field
   * @return reference
   */
  @ApiModelProperty(required = true, value = "Pre-debit notification reference sent by the merchant. This is a mandatory field")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Pre-debit notification reference sent by the merchant. This is a mandatory field
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment.
   *
   * @param shopperReference
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment.
   * @return shopperReference
   */
  @ApiModelProperty(required = true, value = "The ID that uniquely identifies the shopper.  This `shopperReference` must be the same as the `shopperReference` used in the initial payment.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment.
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param storedPaymentMethodId
   * @return the current {@code NotifyShopperRequest} instance, allowing for method chaining
   */
  public NotifyShopperRequest storedPaymentMethodId(String storedPaymentMethodId) {
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
   * Return true if this NotifyShopperRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyShopperRequest notifyShopperRequest = (NotifyShopperRequest) o;
    return Objects.equals(this.amount, notifyShopperRequest.amount) &&
        Objects.equals(this.billingDate, notifyShopperRequest.billingDate) &&
        Objects.equals(this.billingSequenceNumber, notifyShopperRequest.billingSequenceNumber) &&
        Objects.equals(this.displayedReference, notifyShopperRequest.displayedReference) &&
        Objects.equals(this.merchantAccount, notifyShopperRequest.merchantAccount) &&
        Objects.equals(this.recurringDetailReference, notifyShopperRequest.recurringDetailReference) &&
        Objects.equals(this.reference, notifyShopperRequest.reference) &&
        Objects.equals(this.shopperReference, notifyShopperRequest.shopperReference) &&
        Objects.equals(this.storedPaymentMethodId, notifyShopperRequest.storedPaymentMethodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billingDate, billingSequenceNumber, displayedReference, merchantAccount, recurringDetailReference, reference, shopperReference, storedPaymentMethodId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyShopperRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingDate: ").append(toIndentedString(billingDate)).append("\n");
    sb.append("    billingSequenceNumber: ").append(toIndentedString(billingSequenceNumber)).append("\n");
    sb.append("    displayedReference: ").append(toIndentedString(displayedReference)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of NotifyShopperRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotifyShopperRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to NotifyShopperRequest
   */
  public static NotifyShopperRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NotifyShopperRequest.class);
  }
/**
  * Convert an instance of NotifyShopperRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
