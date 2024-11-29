/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payout.Address;
import com.adyen.model.payout.Amount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.FundSource;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
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
 * PayoutRequest
 */
@JsonPropertyOrder({
  PayoutRequest.JSON_PROPERTY_AMOUNT,
  PayoutRequest.JSON_PROPERTY_BILLING_ADDRESS,
  PayoutRequest.JSON_PROPERTY_CARD,
  PayoutRequest.JSON_PROPERTY_FRAUD_OFFSET,
  PayoutRequest.JSON_PROPERTY_FUND_SOURCE,
  PayoutRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  PayoutRequest.JSON_PROPERTY_RECURRING,
  PayoutRequest.JSON_PROPERTY_REFERENCE,
  PayoutRequest.JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE,
  PayoutRequest.JSON_PROPERTY_SHOPPER_EMAIL,
  PayoutRequest.JSON_PROPERTY_SHOPPER_INTERACTION,
  PayoutRequest.JSON_PROPERTY_SHOPPER_NAME,
  PayoutRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  PayoutRequest.JSON_PROPERTY_TELEPHONE_NUMBER
})
//pojo

public class PayoutRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_FRAUD_OFFSET = "fraudOffset";
  private Integer fraudOffset;

  public static final String JSON_PROPERTY_FUND_SOURCE = "fundSource";
  private FundSource fundSource;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Recurring recurring;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  private String selectedRecurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
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

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  public PayoutRequest() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest amount(Amount amount) {
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
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest billingAddress(Address billingAddress) {
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
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest card(Card card) {
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
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest fraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
    return this;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
   */
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFraudOffset() {
    return fraudOffset;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   */ 
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }

  /**
   * fundSource
   *
   * @param fundSource
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest fundSource(FundSource fundSource) {
    this.fundSource = fundSource;
    return this;
  }

  /**
   * fundSource
   * @return fundSource
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUND_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FundSource getFundSource() {
    return fundSource;
  }

  /**
   * fundSource
   *
   * @param fundSource
   */ 
  @JsonProperty(JSON_PROPERTY_FUND_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundSource(FundSource fundSource) {
    this.fundSource = fundSource;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * recurring
   *
   * @param recurring
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest recurring(Recurring recurring) {
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
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   *
   * @param reference
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   * @return reference
   */
  @ApiModelProperty(required = true, value = "The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   *
   * @param selectedRecurringDetailReference
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
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
   * The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations.
   *
   * @param shopperEmail
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations.
   * @return shopperEmail
   */
  @ApiModelProperty(value = "The shopper's email address. We recommend that you provide this data, as it is used in velocity fraud checks. > For 3D Secure 2 transactions, schemes require `shopperEmail` for all browser-based and mobile implementations.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations.
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   *
   * @param shopperInteraction
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
   */
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   *
   * @param shopperInteraction
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }

  /**
   * shopperName
   *
   * @param shopperName
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest shopperName(Name shopperName) {
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
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest shopperReference(String shopperReference) {
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
   * The shopper&#39;s telephone number.
   *
   * @param telephoneNumber
   * @return the current {@code PayoutRequest} instance, allowing for method chaining
   */
  public PayoutRequest telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * The shopper&#39;s telephone number.
   * @return telephoneNumber
   */
  @ApiModelProperty(value = "The shopper's telephone number.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * The shopper&#39;s telephone number.
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * Return true if this PayoutRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutRequest payoutRequest = (PayoutRequest) o;
    return Objects.equals(this.amount, payoutRequest.amount) &&
        Objects.equals(this.billingAddress, payoutRequest.billingAddress) &&
        Objects.equals(this.card, payoutRequest.card) &&
        Objects.equals(this.fraudOffset, payoutRequest.fraudOffset) &&
        Objects.equals(this.fundSource, payoutRequest.fundSource) &&
        Objects.equals(this.merchantAccount, payoutRequest.merchantAccount) &&
        Objects.equals(this.recurring, payoutRequest.recurring) &&
        Objects.equals(this.reference, payoutRequest.reference) &&
        Objects.equals(this.selectedRecurringDetailReference, payoutRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperEmail, payoutRequest.shopperEmail) &&
        Objects.equals(this.shopperInteraction, payoutRequest.shopperInteraction) &&
        Objects.equals(this.shopperName, payoutRequest.shopperName) &&
        Objects.equals(this.shopperReference, payoutRequest.shopperReference) &&
        Objects.equals(this.telephoneNumber, payoutRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billingAddress, card, fraudOffset, fundSource, merchantAccount, recurring, reference, selectedRecurringDetailReference, shopperEmail, shopperInteraction, shopperName, shopperReference, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    fundSource: ").append(toIndentedString(fundSource)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
   * Create an instance of PayoutRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayoutRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PayoutRequest
   */
  public static PayoutRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PayoutRequest.class);
  }
/**
  * Convert an instance of PayoutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
