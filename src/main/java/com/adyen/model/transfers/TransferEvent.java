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

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.Amount;
import com.adyen.model.transfers.AmountAdjustment;
import com.adyen.model.transfers.BalanceMutation;
import com.adyen.model.transfers.ExternalReason;
import com.adyen.model.transfers.Modification;
import com.adyen.model.transfers.TransferEventTrackingData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransferEvent
 */
@JsonPropertyOrder({
  TransferEvent.JSON_PROPERTY_AMOUNT,
  TransferEvent.JSON_PROPERTY_AMOUNT_ADJUSTMENTS,
  TransferEvent.JSON_PROPERTY_ARN,
  TransferEvent.JSON_PROPERTY_BOOKING_DATE,
  TransferEvent.JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME,
  TransferEvent.JSON_PROPERTY_EXTERNAL_REASON,
  TransferEvent.JSON_PROPERTY_ID,
  TransferEvent.JSON_PROPERTY_MODIFICATION,
  TransferEvent.JSON_PROPERTY_MUTATIONS,
  TransferEvent.JSON_PROPERTY_ORIGINAL_AMOUNT,
  TransferEvent.JSON_PROPERTY_REASON,
  TransferEvent.JSON_PROPERTY_STATUS,
  TransferEvent.JSON_PROPERTY_TRACKING_DATA,
  TransferEvent.JSON_PROPERTY_TRANSACTION_ID,
  TransferEvent.JSON_PROPERTY_TYPE,
  TransferEvent.JSON_PROPERTY_UPDATE_DATE,
  TransferEvent.JSON_PROPERTY_VALUE_DATE
})
//pojo

public class TransferEvent {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_AMOUNT_ADJUSTMENTS = "amountAdjustments";
  private List<AmountAdjustment> amountAdjustments = null;

  public static final String JSON_PROPERTY_ARN = "arn";
  private String arn;

  public static final String JSON_PROPERTY_BOOKING_DATE = "bookingDate";
  private OffsetDateTime bookingDate;

  public static final String JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME = "estimatedArrivalTime";
  private OffsetDateTime estimatedArrivalTime;

  public static final String JSON_PROPERTY_EXTERNAL_REASON = "externalReason";
  private ExternalReason externalReason;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFICATION = "modification";
  private Modification modification;

  public static final String JSON_PROPERTY_MUTATIONS = "mutations";
  private List<BalanceMutation> mutations = null;

  public static final String JSON_PROPERTY_ORIGINAL_AMOUNT = "originalAmount";
  private Amount originalAmount;

  /**
   * The reason for the transfer status.
   */
  public enum ReasonEnum {
    ACCOUNTHIERARCHYNOTACTIVE("accountHierarchyNotActive"),
    
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    BALANCEACCOUNTTEMPORARILYBLOCKEDBYTRANSACTIONRULE("balanceAccountTemporarilyBlockedByTransactionRule"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    DECLINED("declined"),
    
    DECLINEDBYTRANSACTIONRULE("declinedByTransactionRule"),
    
    DIRECTDEBITNOTSUPPORTED("directDebitNotSupported"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    PENDINGAPPROVAL("pendingApproval"),
    
    PENDINGEXECUTION("pendingExecution"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    REFUSEDBYCUSTOMER("refusedByCustomer"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    SCAFAILED("scaFailed"),
    
    TRANSFERINSTRUMENTDOESNOTEXIST("transferInstrumentDoesNotExist"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  /**
   * The status of the transfer event.
   */
  public enum StatusEnum {
    APPROVALPENDING("approvalPending"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALREVERSALPENDING("atmWithdrawalReversalPending"),
    
    ATMWITHDRAWALREVERSED("atmWithdrawalReversed"),
    
    AUTHADJUSTMENTAUTHORISED("authAdjustmentAuthorised"),
    
    AUTHADJUSTMENTERROR("authAdjustmentError"),
    
    AUTHADJUSTMENTREFUSED("authAdjustmentRefused"),
    
    AUTHORISED("authorised"),
    
    BANKTRANSFER("bankTransfer"),
    
    BANKTRANSFERPENDING("bankTransferPending"),
    
    BOOKED("booked"),
    
    BOOKINGPENDING("bookingPending"),
    
    CANCELLED("cancelled"),
    
    CAPTUREPENDING("capturePending"),
    
    CAPTUREREVERSALPENDING("captureReversalPending"),
    
    CAPTUREREVERSED("captureReversed"),
    
    CAPTURED("captured"),
    
    CAPTUREDEXTERNALLY("capturedExternally"),
    
    CHARGEBACK("chargeback"),
    
    CHARGEBACKEXTERNALLY("chargebackExternally"),
    
    CHARGEBACKPENDING("chargebackPending"),
    
    CHARGEBACKREVERSALPENDING("chargebackReversalPending"),
    
    CHARGEBACKREVERSED("chargebackReversed"),
    
    CREDITED("credited"),
    
    DEPOSITCORRECTION("depositCorrection"),
    
    DEPOSITCORRECTIONPENDING("depositCorrectionPending"),
    
    DISPUTE("dispute"),
    
    DISPUTECLOSED("disputeClosed"),
    
    DISPUTEEXPIRED("disputeExpired"),
    
    DISPUTENEEDSREVIEW("disputeNeedsReview"),
    
    ERROR("error"),
    
    EXPIRED("expired"),
    
    FAILED("failed"),
    
    FEE("fee"),
    
    FEEPENDING("feePending"),
    
    INTERNALTRANSFER("internalTransfer"),
    
    INTERNALTRANSFERPENDING("internalTransferPending"),
    
    INVOICEDEDUCTION("invoiceDeduction"),
    
    INVOICEDEDUCTIONPENDING("invoiceDeductionPending"),
    
    MANUALCORRECTIONPENDING("manualCorrectionPending"),
    
    MANUALLYCORRECTED("manuallyCorrected"),
    
    MATCHEDSTATEMENT("matchedStatement"),
    
    MATCHEDSTATEMENTPENDING("matchedStatementPending"),
    
    MERCHANTPAYIN("merchantPayin"),
    
    MERCHANTPAYINPENDING("merchantPayinPending"),
    
    MERCHANTPAYINREVERSED("merchantPayinReversed"),
    
    MERCHANTPAYINREVERSEDPENDING("merchantPayinReversedPending"),
    
    MISCCOST("miscCost"),
    
    MISCCOSTPENDING("miscCostPending"),
    
    PAYMENTCOST("paymentCost"),
    
    PAYMENTCOSTPENDING("paymentCostPending"),
    
    PENDINGAPPROVAL("pendingApproval"),
    
    PENDINGEXECUTION("pendingExecution"),
    
    RECEIVED("received"),
    
    REFUNDPENDING("refundPending"),
    
    REFUNDREVERSALPENDING("refundReversalPending"),
    
    REFUNDREVERSED("refundReversed"),
    
    REFUNDED("refunded"),
    
    REFUNDEDEXTERNALLY("refundedExternally"),
    
    REFUSED("refused"),
    
    REJECTED("rejected"),
    
    RESERVEADJUSTMENT("reserveAdjustment"),
    
    RESERVEADJUSTMENTPENDING("reserveAdjustmentPending"),
    
    RETURNED("returned"),
    
    SECONDCHARGEBACK("secondChargeback"),
    
    SECONDCHARGEBACKPENDING("secondChargebackPending"),
    
    UNDEFINED("undefined");

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

  public static final String JSON_PROPERTY_TRACKING_DATA = "trackingData";
  private TransferEventTrackingData trackingData;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;

  /**
   * The type of the transfer event. Possible values: **accounting**, **tracking**.
   */
  public enum TypeEnum {
    ACCOUNTING("accounting"),
    
    TRACKING("tracking");

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

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  private OffsetDateTime updateDate;

  public static final String JSON_PROPERTY_VALUE_DATE = "valueDate";
  private OffsetDateTime valueDate;

  public TransferEvent() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent amount(Amount amount) {
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
   * The amount adjustments in this transfer.
   *
   * @param amountAdjustments
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent amountAdjustments(List<AmountAdjustment> amountAdjustments) {
    this.amountAdjustments = amountAdjustments;
    return this;
  }

  public TransferEvent addAmountAdjustmentsItem(AmountAdjustment amountAdjustmentsItem) {
    if (this.amountAdjustments == null) {
      this.amountAdjustments = new ArrayList<>();
    }
    this.amountAdjustments.add(amountAdjustmentsItem);
    return this;
  }

  /**
   * The amount adjustments in this transfer.
   * @return amountAdjustments
   */
  @ApiModelProperty(value = "The amount adjustments in this transfer.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AmountAdjustment> getAmountAdjustments() {
    return amountAdjustments;
  }

  /**
   * The amount adjustments in this transfer.
   *
   * @param amountAdjustments
   */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountAdjustments(List<AmountAdjustment> amountAdjustments) {
    this.amountAdjustments = amountAdjustments;
  }

  /**
   * Scheme unique arn identifier useful for tracing captures, chargebacks, refunds, etc.
   *
   * @param arn
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Scheme unique arn identifier useful for tracing captures, chargebacks, refunds, etc.
   * @return arn
   */
  @ApiModelProperty(value = "Scheme unique arn identifier useful for tracing captures, chargebacks, refunds, etc.")
  @JsonProperty(JSON_PROPERTY_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArn() {
    return arn;
  }

  /**
   * Scheme unique arn identifier useful for tracing captures, chargebacks, refunds, etc.
   *
   * @param arn
   */ 
  @JsonProperty(JSON_PROPERTY_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArn(String arn) {
    this.arn = arn;
  }

  /**
   * The date when the transfer request was sent.
   *
   * @param bookingDate
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * The date when the transfer request was sent.
   * @return bookingDate
   */
  @ApiModelProperty(value = "The date when the transfer request was sent.")
  @JsonProperty(JSON_PROPERTY_BOOKING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getBookingDate() {
    return bookingDate;
  }

  /**
   * The date when the transfer request was sent.
   *
   * @param bookingDate
   */ 
  @JsonProperty(JSON_PROPERTY_BOOKING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  /**
   * The estimated time when the beneficiary should have access to the funds.
   *
   * @param estimatedArrivalTime
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent estimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

  /**
   * The estimated time when the beneficiary should have access to the funds.
   * @return estimatedArrivalTime
   */
  @ApiModelProperty(value = "The estimated time when the beneficiary should have access to the funds.")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }

  /**
   * The estimated time when the beneficiary should have access to the funds.
   *
   * @param estimatedArrivalTime
   */ 
  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }

  /**
   * externalReason
   *
   * @param externalReason
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent externalReason(ExternalReason externalReason) {
    this.externalReason = externalReason;
    return this;
  }

  /**
   * externalReason
   * @return externalReason
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExternalReason getExternalReason() {
    return externalReason;
  }

  /**
   * externalReason
   *
   * @param externalReason
   */ 
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalReason(ExternalReason externalReason) {
    this.externalReason = externalReason;
  }

  /**
   * The unique identifier of the transfer event.
   *
   * @param id
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the transfer event.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the transfer event.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the transfer event.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * modification
   *
   * @param modification
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent modification(Modification modification) {
    this.modification = modification;
    return this;
  }

  /**
   * modification
   * @return modification
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Modification getModification() {
    return modification;
  }

  /**
   * modification
   *
   * @param modification
   */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModification(Modification modification) {
    this.modification = modification;
  }

  /**
   * The list of balance mutations per event.
   *
   * @param mutations
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent mutations(List<BalanceMutation> mutations) {
    this.mutations = mutations;
    return this;
  }

  public TransferEvent addMutationsItem(BalanceMutation mutationsItem) {
    if (this.mutations == null) {
      this.mutations = new ArrayList<>();
    }
    this.mutations.add(mutationsItem);
    return this;
  }

  /**
   * The list of balance mutations per event.
   * @return mutations
   */
  @ApiModelProperty(value = "The list of balance mutations per event.")
  @JsonProperty(JSON_PROPERTY_MUTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BalanceMutation> getMutations() {
    return mutations;
  }

  /**
   * The list of balance mutations per event.
   *
   * @param mutations
   */ 
  @JsonProperty(JSON_PROPERTY_MUTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutations(List<BalanceMutation> mutations) {
    this.mutations = mutations;
  }

  /**
   * originalAmount
   *
   * @param originalAmount
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * originalAmount
   * @return originalAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getOriginalAmount() {
    return originalAmount;
  }

  /**
   * originalAmount
   *
   * @param originalAmount
   */ 
  @JsonProperty(JSON_PROPERTY_ORIGINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }

  /**
   * The reason for the transfer status.
   *
   * @param reason
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the transfer status.
   * @return reason
   */
  @ApiModelProperty(value = "The reason for the transfer status.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReasonEnum getReason() {
    return reason;
  }

  /**
   * The reason for the transfer status.
   *
   * @param reason
   */ 
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  /**
   * The status of the transfer event.
   *
   * @param status
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the transfer event.
   * @return status
   */
  @ApiModelProperty(value = "The status of the transfer event.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the transfer event.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * trackingData
   *
   * @param trackingData
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent trackingData(TransferEventTrackingData trackingData) {
    this.trackingData = trackingData;
    return this;
  }

  /**
   * trackingData
   * @return trackingData
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACKING_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransferEventTrackingData getTrackingData() {
    return trackingData;
  }

  /**
   * trackingData
   *
   * @param trackingData
   */ 
  @JsonProperty(JSON_PROPERTY_TRACKING_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingData(TransferEventTrackingData trackingData) {
    this.trackingData = trackingData;
  }

  /**
   * The id of the transaction that is related to this accounting event. Only sent for events of type **accounting** where the balance changes.
   *
   * @param transactionId
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the transaction that is related to this accounting event. Only sent for events of type **accounting** where the balance changes.
   * @return transactionId
   */
  @ApiModelProperty(value = "The id of the transaction that is related to this accounting event. Only sent for events of type **accounting** where the balance changes.")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransactionId() {
    return transactionId;
  }

  /**
   * The id of the transaction that is related to this accounting event. Only sent for events of type **accounting** where the balance changes.
   *
   * @param transactionId
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * The type of the transfer event. Possible values: **accounting**, **tracking**.
   *
   * @param type
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transfer event. Possible values: **accounting**, **tracking**.
   * @return type
   */
  @ApiModelProperty(value = "The type of the transfer event. Possible values: **accounting**, **tracking**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of the transfer event. Possible values: **accounting**, **tracking**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The date when the tracking status was updated.
   *
   * @param updateDate
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * The date when the tracking status was updated.
   * @return updateDate
   */
  @ApiModelProperty(value = "The date when the tracking status was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  /**
   * The date when the tracking status was updated.
   *
   * @param updateDate
   */ 
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  /**
   * The date when the funds are expected to be deducted from or credited to the balance account. This date can be in either the past or future.
   *
   * @param valueDate
   * @return the current {@code TransferEvent} instance, allowing for method chaining
   */
  public TransferEvent valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date when the funds are expected to be deducted from or credited to the balance account. This date can be in either the past or future.
   * @return valueDate
   */
  @ApiModelProperty(value = "The date when the funds are expected to be deducted from or credited to the balance account. This date can be in either the past or future.")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  /**
   * The date when the funds are expected to be deducted from or credited to the balance account. This date can be in either the past or future.
   *
   * @param valueDate
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }

  /**
   * Return true if this TransferEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferEvent transferEvent = (TransferEvent) o;
    return Objects.equals(this.amount, transferEvent.amount) &&
        Objects.equals(this.amountAdjustments, transferEvent.amountAdjustments) &&
        Objects.equals(this.arn, transferEvent.arn) &&
        Objects.equals(this.bookingDate, transferEvent.bookingDate) &&
        Objects.equals(this.estimatedArrivalTime, transferEvent.estimatedArrivalTime) &&
        Objects.equals(this.externalReason, transferEvent.externalReason) &&
        Objects.equals(this.id, transferEvent.id) &&
        Objects.equals(this.modification, transferEvent.modification) &&
        Objects.equals(this.mutations, transferEvent.mutations) &&
        Objects.equals(this.originalAmount, transferEvent.originalAmount) &&
        Objects.equals(this.reason, transferEvent.reason) &&
        Objects.equals(this.status, transferEvent.status) &&
        Objects.equals(this.trackingData, transferEvent.trackingData) &&
        Objects.equals(this.transactionId, transferEvent.transactionId) &&
        Objects.equals(this.type, transferEvent.type) &&
        Objects.equals(this.updateDate, transferEvent.updateDate) &&
        Objects.equals(this.valueDate, transferEvent.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountAdjustments, arn, bookingDate, estimatedArrivalTime, externalReason, id, modification, mutations, originalAmount, reason, status, trackingData, transactionId, type, updateDate, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferEvent {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountAdjustments: ").append(toIndentedString(amountAdjustments)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    estimatedArrivalTime: ").append(toIndentedString(estimatedArrivalTime)).append("\n");
    sb.append("    externalReason: ").append(toIndentedString(externalReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modification: ").append(toIndentedString(modification)).append("\n");
    sb.append("    mutations: ").append(toIndentedString(mutations)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingData: ").append(toIndentedString(trackingData)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
   * Create an instance of TransferEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferEvent
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferEvent
   */
  public static TransferEvent fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferEvent.class);
  }
/**
  * Convert an instance of TransferEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
