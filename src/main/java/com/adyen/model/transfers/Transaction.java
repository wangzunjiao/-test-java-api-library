/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.Amount;
import com.adyen.model.transfers.PaymentInstrument;
import com.adyen.model.transfers.ResourceReference;
import com.adyen.model.transfers.TransferView;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Transaction
 */
@JsonPropertyOrder({
  Transaction.JSON_PROPERTY_ACCOUNT_HOLDER,
  Transaction.JSON_PROPERTY_AMOUNT,
  Transaction.JSON_PROPERTY_BALANCE_ACCOUNT,
  Transaction.JSON_PROPERTY_BALANCE_PLATFORM,
  Transaction.JSON_PROPERTY_BOOKING_DATE,
  Transaction.JSON_PROPERTY_CREATION_DATE,
  Transaction.JSON_PROPERTY_DESCRIPTION,
  Transaction.JSON_PROPERTY_ID,
  Transaction.JSON_PROPERTY_PAYMENT_INSTRUMENT,
  Transaction.JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY,
  Transaction.JSON_PROPERTY_STATUS,
  Transaction.JSON_PROPERTY_TRANSFER,
  Transaction.JSON_PROPERTY_VALUE_DATE
})

public class Transaction {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";
  private ResourceReference accountHolder;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BALANCE_ACCOUNT = "balanceAccount";
  private ResourceReference balanceAccount;

  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  public static final String JSON_PROPERTY_BOOKING_DATE = "bookingDate";
  private OffsetDateTime bookingDate;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT = "paymentInstrument";
  private PaymentInstrument paymentInstrument;

  public static final String JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  private String referenceForBeneficiary;

  /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   */
  public enum StatusEnum {
    BOOKED("booked"),
    
    PENDING("pending");

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

  public static final String JSON_PROPERTY_TRANSFER = "transfer";
  private TransferView transfer;

  public static final String JSON_PROPERTY_VALUE_DATE = "valueDate";
  private OffsetDateTime valueDate;

  public Transaction() { 
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction accountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * accountHolder
   * @return accountHolder
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceReference getAccountHolder() {
    return accountHolder;
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction amount(Amount amount) {
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
   * balanceAccount
   *
   * @param balanceAccount
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction balanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

  /**
   * balanceAccount
   * @return balanceAccount
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceReference getBalanceAccount() {
    return balanceAccount;
  }

  /**
   * balanceAccount
   *
   * @param balanceAccount
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
  }

  /**
   * The unique identifier of the balance platform.
   *
   * @param balancePlatform
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the balance platform.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalancePlatform() {
    return balancePlatform;
  }

  /**
   * The unique identifier of the balance platform.
   *
   * @param balancePlatform
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }

  /**
   * The date the transaction was booked into the balance account.
   *
   * @param bookingDate
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * The date the transaction was booked into the balance account.
   * @return bookingDate
   */
  @ApiModelProperty(required = true, value = "The date the transaction was booked into the balance account.")
  @JsonProperty(JSON_PROPERTY_BOOKING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getBookingDate() {
    return bookingDate;
  }

  /**
   * The date the transaction was booked into the balance account.
   *
   * @param bookingDate
   */ 
  @JsonProperty(JSON_PROPERTY_BOOKING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   *
   * @param creationDate
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   * @return creationDate
   */
  @ApiModelProperty(value = "The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   *
   * @param creationDate
   */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * The &#x60;description&#x60; from the &#x60;/transfers&#x60; request.
   *
   * @param description
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The &#x60;description&#x60; from the &#x60;/transfers&#x60; request.
   * @return description
   */
  @ApiModelProperty(value = "The `description` from the `/transfers` request.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * The &#x60;description&#x60; from the &#x60;/transfers&#x60; request.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The unique identifier of the transaction.
   *
   * @param id
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the transaction.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the transaction.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the transaction.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * paymentInstrument
   *
   * @param paymentInstrument
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction paymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

  /**
   * paymentInstrument
   * @return paymentInstrument
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  /**
   * paymentInstrument
   *
   * @param paymentInstrument
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  /**
   * The reference sent to or received from the counterparty.  * For outgoing funds, this is the [&#x60;referenceForBeneficiary&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [&#x60;/transfers&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.
   *
   * @param referenceForBeneficiary
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction referenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

  /**
   * The reference sent to or received from the counterparty.  * For outgoing funds, this is the [&#x60;referenceForBeneficiary&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [&#x60;/transfers&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.
   * @return referenceForBeneficiary
   */
  @ApiModelProperty(value = "The reference sent to or received from the counterparty.  * For outgoing funds, this is the [`referenceForBeneficiary`](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [`/transfers`](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }

  /**
   * The reference sent to or received from the counterparty.  * For outgoing funds, this is the [&#x60;referenceForBeneficiary&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [&#x60;/transfers&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.
   *
   * @param referenceForBeneficiary
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }

  /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   *
   * @param status
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * transfer
   *
   * @param transfer
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction transfer(TransferView transfer) {
    this.transfer = transfer;
    return this;
  }

  /**
   * transfer
   * @return transfer
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransferView getTransfer() {
    return transfer;
  }

  /**
   * transfer
   *
   * @param transfer
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransfer(TransferView transfer) {
    this.transfer = transfer;
  }

  /**
   * The date the transfer amount becomes available in the balance account.
   *
   * @param valueDate
   * @return the current {@code Transaction} instance, allowing for method chaining
   */
  public Transaction valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date the transfer amount becomes available in the balance account.
   * @return valueDate
   */
  @ApiModelProperty(required = true, value = "The date the transfer amount becomes available in the balance account.")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  /**
   * The date the transfer amount becomes available in the balance account.
   *
   * @param valueDate
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }

  /**
   * Return true if this Transaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.accountHolder, transaction.accountHolder) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.balanceAccount, transaction.balanceAccount) &&
        Objects.equals(this.balancePlatform, transaction.balancePlatform) &&
        Objects.equals(this.bookingDate, transaction.bookingDate) &&
        Objects.equals(this.creationDate, transaction.creationDate) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.paymentInstrument, transaction.paymentInstrument) &&
        Objects.equals(this.referenceForBeneficiary, transaction.referenceForBeneficiary) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.transfer, transaction.transfer) &&
        Objects.equals(this.valueDate, transaction.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, amount, balanceAccount, balancePlatform, bookingDate, creationDate, description, id, paymentInstrument, referenceForBeneficiary, status, transfer, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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
   * Create an instance of Transaction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Transaction
   * @throws JsonProcessingException if the JSON string is invalid with respect to Transaction
   */
  public static Transaction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Transaction.class);
  }
/**
  * Convert an instance of Transaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}