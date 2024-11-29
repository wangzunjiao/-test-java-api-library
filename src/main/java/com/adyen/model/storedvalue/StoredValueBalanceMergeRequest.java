/*
 * Adyen Stored Value API
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.storedvalue.Amount;
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
 * StoredValueBalanceMergeRequest
 */
@JsonPropertyOrder({
  StoredValueBalanceMergeRequest.JSON_PROPERTY_AMOUNT,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_PAYMENT_METHOD,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_REFERENCE,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_SHOPPER_INTERACTION,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_SOURCE_PAYMENT_METHOD,
  StoredValueBalanceMergeRequest.JSON_PROPERTY_STORE
})
//pojo

public class StoredValueBalanceMergeRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private Map<String, String> paymentMethod = new HashMap<>();

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

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

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_SOURCE_PAYMENT_METHOD = "sourcePaymentMethod";
  private Map<String, String> sourcePaymentMethod = new HashMap<>();

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public StoredValueBalanceMergeRequest() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest amount(Amount amount) {
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
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest merchantAccount(String merchantAccount) {
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
   * The collection that contains the type of the payment method and its specific information if available
   *
   * @param paymentMethod
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest paymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public StoredValueBalanceMergeRequest putPaymentMethodItem(String key, String paymentMethodItem) {
    this.paymentMethod.put(key, paymentMethodItem);
    return this;
  }

  /**
   * The collection that contains the type of the payment method and its specific information if available
   * @return paymentMethod
   */
  @ApiModelProperty(required = true, value = "The collection that contains the type of the payment method and its specific information if available")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * The collection that contains the type of the payment method and its specific information if available
   *
   * @param paymentMethod
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * recurringDetailReference
   *
   * @param recurringDetailReference
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * recurringDetailReference
   * @return recurringDetailReference
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }

  /**
   * recurringDetailReference
   *
   * @param recurringDetailReference
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   *
   * @param reference
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest reference(String reference) {
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
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   *
   * @param shopperInteraction
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
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
   * shopperReference
   *
   * @param shopperReference
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * shopperReference
   * @return shopperReference
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * shopperReference
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method
   *
   * @param sourcePaymentMethod
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest sourcePaymentMethod(Map<String, String> sourcePaymentMethod) {
    this.sourcePaymentMethod = sourcePaymentMethod;
    return this;
  }

  public StoredValueBalanceMergeRequest putSourcePaymentMethodItem(String key, String sourcePaymentMethodItem) {
    this.sourcePaymentMethod.put(key, sourcePaymentMethodItem);
    return this;
  }

  /**
   * The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method
   * @return sourcePaymentMethod
   */
  @ApiModelProperty(required = true, value = "The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method")
  @JsonProperty(JSON_PROPERTY_SOURCE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getSourcePaymentMethod() {
    return sourcePaymentMethod;
  }

  /**
   * The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method
   *
   * @param sourcePaymentMethod
   */ 
  @JsonProperty(JSON_PROPERTY_SOURCE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourcePaymentMethod(Map<String, String> sourcePaymentMethod) {
    this.sourcePaymentMethod = sourcePaymentMethod;
  }

  /**
   * The physical store, for which this payment is processed.
   *
   * @param store
   * @return the current {@code StoredValueBalanceMergeRequest} instance, allowing for method chaining
   */
  public StoredValueBalanceMergeRequest store(String store) {
    this.store = store;
    return this;
  }

  /**
   * The physical store, for which this payment is processed.
   * @return store
   */
  @ApiModelProperty(value = "The physical store, for which this payment is processed.")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStore() {
    return store;
  }

  /**
   * The physical store, for which this payment is processed.
   *
   * @param store
   */ 
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }

  /**
   * Return true if this StoredValueBalanceMergeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueBalanceMergeRequest storedValueBalanceMergeRequest = (StoredValueBalanceMergeRequest) o;
    return Objects.equals(this.amount, storedValueBalanceMergeRequest.amount) &&
        Objects.equals(this.merchantAccount, storedValueBalanceMergeRequest.merchantAccount) &&
        Objects.equals(this.paymentMethod, storedValueBalanceMergeRequest.paymentMethod) &&
        Objects.equals(this.recurringDetailReference, storedValueBalanceMergeRequest.recurringDetailReference) &&
        Objects.equals(this.reference, storedValueBalanceMergeRequest.reference) &&
        Objects.equals(this.shopperInteraction, storedValueBalanceMergeRequest.shopperInteraction) &&
        Objects.equals(this.shopperReference, storedValueBalanceMergeRequest.shopperReference) &&
        Objects.equals(this.sourcePaymentMethod, storedValueBalanceMergeRequest.sourcePaymentMethod) &&
        Objects.equals(this.store, storedValueBalanceMergeRequest.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, merchantAccount, paymentMethod, recurringDetailReference, reference, shopperInteraction, shopperReference, sourcePaymentMethod, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueBalanceMergeRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    sourcePaymentMethod: ").append(toIndentedString(sourcePaymentMethod)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
   * Create an instance of StoredValueBalanceMergeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueBalanceMergeRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueBalanceMergeRequest
   */
  public static StoredValueBalanceMergeRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueBalanceMergeRequest.class);
  }
/**
  * Convert an instance of StoredValueBalanceMergeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
