/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.BankAccountDetails;
import com.adyen.model.balanceplatform.Card;
import com.adyen.model.balanceplatform.PaymentInstrumentAdditionalBankAccountIdentificationsInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentInstrument
 */
@JsonPropertyOrder({
  PaymentInstrument.JSON_PROPERTY_ADDITIONAL_BANK_ACCOUNT_IDENTIFICATIONS,
  PaymentInstrument.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  PaymentInstrument.JSON_PROPERTY_BANK_ACCOUNT,
  PaymentInstrument.JSON_PROPERTY_CARD,
  PaymentInstrument.JSON_PROPERTY_DESCRIPTION,
  PaymentInstrument.JSON_PROPERTY_ID,
  PaymentInstrument.JSON_PROPERTY_ISSUING_COUNTRY_CODE,
  PaymentInstrument.JSON_PROPERTY_PAYMENT_INSTRUMENT_GROUP_ID,
  PaymentInstrument.JSON_PROPERTY_REFERENCE,
  PaymentInstrument.JSON_PROPERTY_STATUS,
  PaymentInstrument.JSON_PROPERTY_STATUS_COMMENT,
  PaymentInstrument.JSON_PROPERTY_STATUS_REASON,
  PaymentInstrument.JSON_PROPERTY_TYPE
})
//pojo

public class PaymentInstrument {
  public static final String JSON_PROPERTY_ADDITIONAL_BANK_ACCOUNT_IDENTIFICATIONS = "additionalBankAccountIdentifications";
  @Deprecated // deprecated since Configuration API v2: Please use `bankAccount` object instead
  private List<PaymentInstrumentAdditionalBankAccountIdentificationsInner> additionalBankAccountIdentifications = null;

  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_BANK_ACCOUNT = "bankAccount";
  private BankAccountDetails bankAccount;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ISSUING_COUNTRY_CODE = "issuingCountryCode";
  private String issuingCountryCode;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_GROUP_ID = "paymentInstrumentGroupId";
  private String paymentInstrumentGroupId;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_STATUS_COMMENT = "statusComment";
  private String statusComment;

  /**
   * The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   */
  public enum StatusReasonEnum {
    ACCOUNTCLOSURE("accountClosure"),
    
    DAMAGED("damaged"),
    
    ENDOFLIFE("endOfLife"),
    
    EXPIRED("expired"),
    
    LOST("lost"),
    
    OTHER("other"),
    
    STOLEN("stolen"),
    
    SUSPECTEDFRAUD("suspectedFraud"),
    
    TRANSACTIONRULE("transactionRule");

    private String value;

    StatusReasonEnum(String value) {
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
    public static StatusReasonEnum fromValue(String value) {
      for (StatusReasonEnum b : StatusReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS_REASON = "statusReason";
  private StatusReasonEnum statusReason;

  /**
   * The type of payment instrument.  Possible values: **card**, **bankAccount**.
   */
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    CARD("card");

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

  public PaymentInstrument() { 
  }

  /**
   * Contains optional, additional business account details. Returned when you create a payment instrument with &#x60;type&#x60; **bankAccount**.
   *
   * @param additionalBankAccountIdentifications
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   *
   * @deprecated since Configuration API v2
   * Please use &#x60;bankAccount&#x60; object instead
   */
  @Deprecated
  public PaymentInstrument additionalBankAccountIdentifications(List<PaymentInstrumentAdditionalBankAccountIdentificationsInner> additionalBankAccountIdentifications) {
    this.additionalBankAccountIdentifications = additionalBankAccountIdentifications;
    return this;
  }

  public PaymentInstrument addAdditionalBankAccountIdentificationsItem(PaymentInstrumentAdditionalBankAccountIdentificationsInner additionalBankAccountIdentificationsItem) {
    if (this.additionalBankAccountIdentifications == null) {
      this.additionalBankAccountIdentifications = new ArrayList<>();
    }
    this.additionalBankAccountIdentifications.add(additionalBankAccountIdentificationsItem);
    return this;
  }

  /**
   * Contains optional, additional business account details. Returned when you create a payment instrument with &#x60;type&#x60; **bankAccount**.
   * @return additionalBankAccountIdentifications
   *
   * @deprecated since Configuration API v2
   * Please use &#x60;bankAccount&#x60; object instead
   */
  @Deprecated
  @ApiModelProperty(value = "Contains optional, additional business account details. Returned when you create a payment instrument with `type` **bankAccount**.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_BANK_ACCOUNT_IDENTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PaymentInstrumentAdditionalBankAccountIdentificationsInner> getAdditionalBankAccountIdentifications() {
    return additionalBankAccountIdentifications;
  }

  /**
   * Contains optional, additional business account details. Returned when you create a payment instrument with &#x60;type&#x60; **bankAccount**.
   *
   * @param additionalBankAccountIdentifications
   *
   * @deprecated since Configuration API v2
   * Please use &#x60;bankAccount&#x60; object instead
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_BANK_ACCOUNT_IDENTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalBankAccountIdentifications(List<PaymentInstrumentAdditionalBankAccountIdentificationsInner> additionalBankAccountIdentifications) {
    this.additionalBankAccountIdentifications = additionalBankAccountIdentifications;
  }

  /**
   * The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
   *
   * @param balanceAccountId
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

  /**
   * The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
   * @return balanceAccountId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalanceAccountId() {
    return balanceAccountId;
  }

  /**
   * The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
   *
   * @param balanceAccountId
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }

  /**
   * bankAccount
   *
   * @param bankAccount
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument bankAccount(BankAccountDetails bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * bankAccount
   * @return bankAccount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccountDetails getBankAccount() {
    return bankAccount;
  }

  /**
   * bankAccount
   *
   * @param bankAccount
   */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccount(BankAccountDetails bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * card
   *
   * @param card
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument card(Card card) {
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
   * Your description for the payment instrument, maximum 300 characters.
   *
   * @param description
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Your description for the payment instrument, maximum 300 characters.
   * @return description
   */
  @ApiModelProperty(value = "Your description for the payment instrument, maximum 300 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * Your description for the payment instrument, maximum 300 characters.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The unique identifier of the payment instrument.
   *
   * @param id
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the payment instrument.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the payment instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the payment instrument.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
   *
   * @param issuingCountryCode
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument issuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
    return this;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
   * @return issuingCountryCode
   */
  @ApiModelProperty(required = true, value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.")
  @JsonProperty(JSON_PROPERTY_ISSUING_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuingCountryCode() {
    return issuingCountryCode;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
   *
   * @param issuingCountryCode
   */ 
  @JsonProperty(JSON_PROPERTY_ISSUING_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
  }

  /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
   *
   * @param paymentInstrumentGroupId
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument paymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
    return this;
  }

  /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
   * @return paymentInstrumentGroupId
   */
  @ApiModelProperty(value = "The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentInstrumentGroupId() {
    return paymentInstrumentGroupId;
  }

  /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
   *
   * @param paymentInstrumentGroupId
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
  }

  /**
   * Your reference for the payment instrument, maximum 150 characters.
   *
   * @param reference
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the payment instrument, maximum 150 characters.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the payment instrument, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the payment instrument, maximum 150 characters.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   *
   * @param status
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   * @return status
   */
  @ApiModelProperty(value = "The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The status comment provides additional information for the statusReason of the payment instrument.
   *
   * @param statusComment
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument statusComment(String statusComment) {
    this.statusComment = statusComment;
    return this;
  }

  /**
   * The status comment provides additional information for the statusReason of the payment instrument.
   * @return statusComment
   */
  @ApiModelProperty(value = "The status comment provides additional information for the statusReason of the payment instrument.")
  @JsonProperty(JSON_PROPERTY_STATUS_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatusComment() {
    return statusComment;
  }

  /**
   * The status comment provides additional information for the statusReason of the payment instrument.
   *
   * @param statusComment
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusComment(String statusComment) {
    this.statusComment = statusComment;
  }

  /**
   * The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   *
   * @param statusReason
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument statusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   * @return statusReason
   */
  @ApiModelProperty(value = "The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change.")
  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusReasonEnum getStatusReason() {
    return statusReason;
  }

  /**
   * The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   *
   * @param statusReason
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * The type of payment instrument.  Possible values: **card**, **bankAccount**.
   *
   * @param type
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of payment instrument.  Possible values: **card**, **bankAccount**.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of payment instrument.  Possible values: **card**, **bankAccount**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of payment instrument.  Possible values: **card**, **bankAccount**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this PaymentInstrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrument paymentInstrument = (PaymentInstrument) o;
    return Objects.equals(this.additionalBankAccountIdentifications, paymentInstrument.additionalBankAccountIdentifications) &&
        Objects.equals(this.balanceAccountId, paymentInstrument.balanceAccountId) &&
        Objects.equals(this.bankAccount, paymentInstrument.bankAccount) &&
        Objects.equals(this.card, paymentInstrument.card) &&
        Objects.equals(this.description, paymentInstrument.description) &&
        Objects.equals(this.id, paymentInstrument.id) &&
        Objects.equals(this.issuingCountryCode, paymentInstrument.issuingCountryCode) &&
        Objects.equals(this.paymentInstrumentGroupId, paymentInstrument.paymentInstrumentGroupId) &&
        Objects.equals(this.reference, paymentInstrument.reference) &&
        Objects.equals(this.status, paymentInstrument.status) &&
        Objects.equals(this.statusComment, paymentInstrument.statusComment) &&
        Objects.equals(this.statusReason, paymentInstrument.statusReason) &&
        Objects.equals(this.type, paymentInstrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalBankAccountIdentifications, balanceAccountId, bankAccount, card, description, id, issuingCountryCode, paymentInstrumentGroupId, reference, status, statusComment, statusReason, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrument {\n");
    sb.append("    additionalBankAccountIdentifications: ").append(toIndentedString(additionalBankAccountIdentifications)).append("\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
    sb.append("    paymentInstrumentGroupId: ").append(toIndentedString(paymentInstrumentGroupId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusComment: ").append(toIndentedString(statusComment)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
   * Create an instance of PaymentInstrument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentInstrument
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentInstrument
   */
  public static PaymentInstrument fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentInstrument.class);
  }
/**
  * Convert an instance of PaymentInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
