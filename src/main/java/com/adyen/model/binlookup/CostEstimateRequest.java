/*
 * Adyen BinLookup API
 *
 * The version of the OpenAPI document: 54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.binlookup.Amount;
import com.adyen.model.binlookup.CostEstimateAssumptions;
import com.adyen.model.binlookup.MerchantDetails;
import com.adyen.model.binlookup.Recurring;
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
 * CostEstimateRequest
 */
@JsonPropertyOrder({
  CostEstimateRequest.JSON_PROPERTY_AMOUNT,
  CostEstimateRequest.JSON_PROPERTY_ASSUMPTIONS,
  CostEstimateRequest.JSON_PROPERTY_CARD_NUMBER,
  CostEstimateRequest.JSON_PROPERTY_ENCRYPTED_CARD_NUMBER,
  CostEstimateRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  CostEstimateRequest.JSON_PROPERTY_MERCHANT_DETAILS,
  CostEstimateRequest.JSON_PROPERTY_RECURRING,
  CostEstimateRequest.JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE,
  CostEstimateRequest.JSON_PROPERTY_SHOPPER_INTERACTION,
  CostEstimateRequest.JSON_PROPERTY_SHOPPER_REFERENCE
})

public class CostEstimateRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_ASSUMPTIONS = "assumptions";
  private CostEstimateAssumptions assumptions;

  public static final String JSON_PROPERTY_CARD_NUMBER = "cardNumber";
  private String cardNumber;

  public static final String JSON_PROPERTY_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  private String encryptedCardNumber;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_MERCHANT_DETAILS = "merchantDetails";
  private MerchantDetails merchantDetails;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Recurring recurring;

  public static final String JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  private String selectedRecurringDetailReference;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   */
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    CONTAUTH("ContAuth"),
    
    MOTO("Moto"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
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
    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SHOPPER_INTERACTION = "shopperInteraction";
  private ShopperInteractionEnum shopperInteraction;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public CostEstimateRequest() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest amount(Amount amount) {
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
   * assumptions
   *
   * @param assumptions
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest assumptions(CostEstimateAssumptions assumptions) {
    this.assumptions = assumptions;
    return this;
  }

  /**
   * assumptions
   * @return assumptions
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSUMPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostEstimateAssumptions getAssumptions() {
    return assumptions;
  }

  /**
   * assumptions
   *
   * @param assumptions
   */ 
  @JsonProperty(JSON_PROPERTY_ASSUMPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssumptions(CostEstimateAssumptions assumptions) {
    this.assumptions = assumptions;
  }

  /**
   * The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   *
   * @param cardNumber
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   * @return cardNumber
   */
  @ApiModelProperty(value = "The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  > Either the `cardNumber` or `encryptedCardNumber` field must be provided in a payment request.")
  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardNumber() {
    return cardNumber;
  }

  /**
   * The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   *
   * @param cardNumber
   */ 
  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   * Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the &#x60;encryptedCardNumber&#x60; field.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   *
   * @param encryptedCardNumber
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest encryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

  /**
   * Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the &#x60;encryptedCardNumber&#x60; field.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   * @return encryptedCardNumber
   */
  @ApiModelProperty(value = "Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the `encryptedCardNumber` field.  > Either the `cardNumber` or `encryptedCardNumber` field must be provided in a payment request.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }

  /**
   * Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the &#x60;encryptedCardNumber&#x60; field.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   *
   * @param encryptedCardNumber
   */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   *
   * @param merchantAccount
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier you want to process the (transaction) request with.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * merchantDetails
   *
   * @param merchantDetails
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * merchantDetails
   * @return merchantDetails
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MerchantDetails getMerchantDetails() {
    return merchantDetails;
  }

  /**
   * merchantDetails
   *
   * @param merchantDetails
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  /**
   * recurring
   *
   * @param recurring
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * recurring
   * @return recurring
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Recurring getRecurring() {
    return recurring;
  }

  /**
   * recurring
   *
   * @param recurring
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this cost estimate. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   *
   * @param selectedRecurringDetailReference
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this cost estimate. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   * @return selectedRecurringDetailReference
   */
  @ApiModelProperty(value = "The `recurringDetailReference` you want to use for this cost estimate. The value `LATEST` can be used to select the most recently stored recurring detail.")
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this cost estimate. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   *
   * @param selectedRecurringDetailReference
   */ 
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   *
   * @param shopperInteraction
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
   */
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   *
   * @param shopperInteraction
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   *
   * @param shopperReference
   * @return the current {@code CostEstimateRequest} instance, allowing for method chaining
   */
  public CostEstimateRequest shopperReference(String shopperReference) {
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
   * Return true if this CostEstimateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimateRequest costEstimateRequest = (CostEstimateRequest) o;
    return Objects.equals(this.amount, costEstimateRequest.amount) &&
        Objects.equals(this.assumptions, costEstimateRequest.assumptions) &&
        Objects.equals(this.cardNumber, costEstimateRequest.cardNumber) &&
        Objects.equals(this.encryptedCardNumber, costEstimateRequest.encryptedCardNumber) &&
        Objects.equals(this.merchantAccount, costEstimateRequest.merchantAccount) &&
        Objects.equals(this.merchantDetails, costEstimateRequest.merchantDetails) &&
        Objects.equals(this.recurring, costEstimateRequest.recurring) &&
        Objects.equals(this.selectedRecurringDetailReference, costEstimateRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperInteraction, costEstimateRequest.shopperInteraction) &&
        Objects.equals(this.shopperReference, costEstimateRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, assumptions, cardNumber, encryptedCardNumber, merchantAccount, merchantDetails, recurring, selectedRecurringDetailReference, shopperInteraction, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assumptions: ").append(toIndentedString(assumptions)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
   * Create an instance of CostEstimateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CostEstimateRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CostEstimateRequest
   */
  public static CostEstimateRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CostEstimateRequest.class);
  }
/**
  * Convert an instance of CostEstimateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}