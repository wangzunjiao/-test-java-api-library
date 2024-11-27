/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.Address;
import com.adyen.model.payment.Card;
import com.adyen.model.payment.Name;
import com.adyen.model.payment.SubMerchant;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * FundDestination
 */
@JsonPropertyOrder({
  FundDestination.JSON_PROPERTY_I_B_A_N,
  FundDestination.JSON_PROPERTY_ADDITIONAL_DATA,
  FundDestination.JSON_PROPERTY_BILLING_ADDRESS,
  FundDestination.JSON_PROPERTY_CARD,
  FundDestination.JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE,
  FundDestination.JSON_PROPERTY_SHOPPER_EMAIL,
  FundDestination.JSON_PROPERTY_SHOPPER_NAME,
  FundDestination.JSON_PROPERTY_SHOPPER_REFERENCE,
  FundDestination.JSON_PROPERTY_SUB_MERCHANT,
  FundDestination.JSON_PROPERTY_TELEPHONE_NUMBER,
  FundDestination.JSON_PROPERTY_WALLET_PURPOSE
})

public class FundDestination {
  public static final String JSON_PROPERTY_I_B_A_N = "IBAN";
  private String IBAN;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  private String selectedRecurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_SUB_MERCHANT = "subMerchant";
  private SubMerchant subMerchant;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  public static final String JSON_PROPERTY_WALLET_PURPOSE = "walletPurpose";
  private String walletPurpose;

  public FundDestination() { 
  }

  /**
   * Bank Account Number of the recipient
   *
   * @param IBAN
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

  /**
   * Bank Account Number of the recipient
   * @return IBAN
   */
  @ApiModelProperty(value = "Bank Account Number of the recipient")
  @JsonProperty(JSON_PROPERTY_I_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIBAN() {
    return IBAN;
  }

  /**
   * Bank Account Number of the recipient
   *
   * @param IBAN
   */ 
  @JsonProperty(JSON_PROPERTY_I_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  /**
   * a map of name/value pairs for passing in additional/industry-specific data
   *
   * @param additionalData
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public FundDestination putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * a map of name/value pairs for passing in additional/industry-specific data
   * @return additionalData
   */
  @ApiModelProperty(value = "a map of name/value pairs for passing in additional/industry-specific data")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * a map of name/value pairs for passing in additional/industry-specific data
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * billingAddress
   * @return billingAddress
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getBillingAddress() {
    return billingAddress;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * card
   *
   * @param card
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * card
   * @return card
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Card getCard() {
    return card;
  }

  /**
   * card
   *
   * @param card
   */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   *
   * @param selectedRecurringDetailReference
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   * @return selectedRecurringDetailReference
   */
  @ApiModelProperty(value = "The `recurringDetailReference` you want to use for this payment. The value `LATEST` can be used to select the most recently stored recurring detail.")
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   *
   * @param selectedRecurringDetailReference
   */ 
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }

  /**
   * the email address of the person
   *
   * @param shopperEmail
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * the email address of the person
   * @return shopperEmail
   */
  @ApiModelProperty(value = "the email address of the person")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * the email address of the person
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * shopperName
   *
   * @param shopperName
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination shopperName(Name shopperName) {
    this.shopperName = shopperName;
    return this;
  }

  /**
   * shopperName
   * @return shopperName
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Name getShopperName() {
    return shopperName;
  }

  /**
   * shopperName
   *
   * @param shopperName
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   *
   * @param shopperReference
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   * @return shopperReference
   */
  @ApiModelProperty(value = "Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * subMerchant
   *
   * @param subMerchant
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination subMerchant(SubMerchant subMerchant) {
    this.subMerchant = subMerchant;
    return this;
  }

  /**
   * subMerchant
   * @return subMerchant
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubMerchant getSubMerchant() {
    return subMerchant;
  }

  /**
   * subMerchant
   *
   * @param subMerchant
   */ 
  @JsonProperty(JSON_PROPERTY_SUB_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubMerchant(SubMerchant subMerchant) {
    this.subMerchant = subMerchant;
  }

  /**
   * the telephone number of the person
   *
   * @param telephoneNumber
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * the telephone number of the person
   * @return telephoneNumber
   */
  @ApiModelProperty(value = "the telephone number of the person")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * the telephone number of the person
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * The purpose of a digital wallet transaction.
   *
   * @param walletPurpose
   * @return the current {@code FundDestination} instance, allowing for method chaining
   */
  public FundDestination walletPurpose(String walletPurpose) {
    this.walletPurpose = walletPurpose;
    return this;
  }

  /**
   * The purpose of a digital wallet transaction.
   * @return walletPurpose
   */
  @ApiModelProperty(value = "The purpose of a digital wallet transaction.")
  @JsonProperty(JSON_PROPERTY_WALLET_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWalletPurpose() {
    return walletPurpose;
  }

  /**
   * The purpose of a digital wallet transaction.
   *
   * @param walletPurpose
   */ 
  @JsonProperty(JSON_PROPERTY_WALLET_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalletPurpose(String walletPurpose) {
    this.walletPurpose = walletPurpose;
  }

  /**
   * Return true if this FundDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundDestination fundDestination = (FundDestination) o;
    return Objects.equals(this.IBAN, fundDestination.IBAN) &&
        Objects.equals(this.additionalData, fundDestination.additionalData) &&
        Objects.equals(this.billingAddress, fundDestination.billingAddress) &&
        Objects.equals(this.card, fundDestination.card) &&
        Objects.equals(this.selectedRecurringDetailReference, fundDestination.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperEmail, fundDestination.shopperEmail) &&
        Objects.equals(this.shopperName, fundDestination.shopperName) &&
        Objects.equals(this.shopperReference, fundDestination.shopperReference) &&
        Objects.equals(this.subMerchant, fundDestination.subMerchant) &&
        Objects.equals(this.telephoneNumber, fundDestination.telephoneNumber) &&
        Objects.equals(this.walletPurpose, fundDestination.walletPurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IBAN, additionalData, billingAddress, card, selectedRecurringDetailReference, shopperEmail, shopperName, shopperReference, subMerchant, telephoneNumber, walletPurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundDestination {\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    subMerchant: ").append(toIndentedString(subMerchant)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    walletPurpose: ").append(toIndentedString(walletPurpose)).append("\n");
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
   * Create an instance of FundDestination given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FundDestination
   * @throws JsonProcessingException if the JSON string is invalid with respect to FundDestination
   */
  public static FundDestination fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, FundDestination.class);
  }
/**
  * Convert an instance of FundDestination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}