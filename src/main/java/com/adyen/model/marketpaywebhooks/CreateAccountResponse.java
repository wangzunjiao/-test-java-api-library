/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.ErrorFieldType;
import com.adyen.model.marketpaywebhooks.PayoutScheduleResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CreateAccountResponse
 */
@JsonPropertyOrder({
  CreateAccountResponse.JSON_PROPERTY_ACCOUNT_CODE,
  CreateAccountResponse.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  CreateAccountResponse.JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D,
  CreateAccountResponse.JSON_PROPERTY_DESCRIPTION,
  CreateAccountResponse.JSON_PROPERTY_INVALID_FIELDS,
  CreateAccountResponse.JSON_PROPERTY_METADATA,
  CreateAccountResponse.JSON_PROPERTY_PAYOUT_METHOD_CODE,
  CreateAccountResponse.JSON_PROPERTY_PAYOUT_SCHEDULE,
  CreateAccountResponse.JSON_PROPERTY_PAYOUT_SPEED,
  CreateAccountResponse.JSON_PROPERTY_PSP_REFERENCE,
  CreateAccountResponse.JSON_PROPERTY_RESULT_CODE,
  CreateAccountResponse.JSON_PROPERTY_STATUS
})

public class CreateAccountResponse {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D = "bankAccountUUID";
  private String bankAccountUUID;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_PAYOUT_METHOD_CODE = "payoutMethodCode";
  private String payoutMethodCode;

  public static final String JSON_PROPERTY_PAYOUT_SCHEDULE = "payoutSchedule";
  private PayoutScheduleResponse payoutSchedule;

  /**
   * Speed with which payouts for this account are processed. Permitted values: &#x60;STANDARD&#x60;, &#x60;SAME_DAY&#x60;.
   */
  public enum PayoutSpeedEnum {
    INSTANT("INSTANT"),
    
    SAME_DAY("SAME_DAY"),
    
    STANDARD("STANDARD");

    private String value;

    PayoutSpeedEnum(String value) {
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
    public static PayoutSpeedEnum fromValue(String value) {
      for (PayoutSpeedEnum b : PayoutSpeedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYOUT_SPEED = "payoutSpeed";
  private PayoutSpeedEnum payoutSpeed;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private String resultCode;

  /**
   * The status of the account. &gt;Permitted values: &#x60;Active&#x60;.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

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

  public CreateAccountResponse() { 
  }

  public CreateAccountResponse accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The code of the new account.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The code of the new account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountCode() {
    return accountCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public CreateAccountResponse accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the account holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(value = "The code of the account holder.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public CreateAccountResponse bankAccountUUID(String bankAccountUUID) {
    this.bankAccountUUID = bankAccountUUID;
    return this;
  }

   /**
   * The bankAccountUUID of the bank account held by the account holder to couple the account with. Scheduled payouts in currencies matching the currency of this bank account will be sent to this bank account. Payouts in different currencies will be sent to a matching bank account of the account holder.
   * @return bankAccountUUID
  **/
  @ApiModelProperty(value = "The bankAccountUUID of the bank account held by the account holder to couple the account with. Scheduled payouts in currencies matching the currency of this bank account will be sent to this bank account. Payouts in different currencies will be sent to a matching bank account of the account holder.")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountUUID() {
    return bankAccountUUID;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountUUID(String bankAccountUUID) {
    this.bankAccountUUID = bankAccountUUID;
  }


  public CreateAccountResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the account.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the account.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateAccountResponse invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public CreateAccountResponse addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * A list of fields that caused the &#x60;/createAccount&#x60; request to fail.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "A list of fields that caused the `/createAccount` request to fail.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public CreateAccountResponse metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateAccountResponse putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of key and value pairs containing metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "A set of key and value pairs containing metadata.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CreateAccountResponse payoutMethodCode(String payoutMethodCode) {
    this.payoutMethodCode = payoutMethodCode;
    return this;
  }

   /**
   * The payout method code held by the account holder to couple the account with. Scheduled card payouts will be sent using this payout method code.
   * @return payoutMethodCode
  **/
  @ApiModelProperty(value = "The payout method code held by the account holder to couple the account with. Scheduled card payouts will be sent using this payout method code.")
  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayoutMethodCode() {
    return payoutMethodCode;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutMethodCode(String payoutMethodCode) {
    this.payoutMethodCode = payoutMethodCode;
  }


  public CreateAccountResponse payoutSchedule(PayoutScheduleResponse payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
    return this;
  }

   /**
   * Get payoutSchedule
   * @return payoutSchedule
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYOUT_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayoutScheduleResponse getPayoutSchedule() {
    return payoutSchedule;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutSchedule(PayoutScheduleResponse payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
  }


  public CreateAccountResponse payoutSpeed(PayoutSpeedEnum payoutSpeed) {
    this.payoutSpeed = payoutSpeed;
    return this;
  }

   /**
   * Speed with which payouts for this account are processed. Permitted values: &#x60;STANDARD&#x60;, &#x60;SAME_DAY&#x60;.
   * @return payoutSpeed
  **/
  @ApiModelProperty(value = "Speed with which payouts for this account are processed. Permitted values: `STANDARD`, `SAME_DAY`.")
  @JsonProperty(JSON_PROPERTY_PAYOUT_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayoutSpeedEnum getPayoutSpeed() {
    return payoutSpeed;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutSpeed(PayoutSpeedEnum payoutSpeed) {
    this.payoutSpeed = payoutSpeed;
  }


  public CreateAccountResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The reference of a request. Can be used to uniquely identify the request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The reference of a request. Can be used to uniquely identify the request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public CreateAccountResponse resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result code.
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result code.")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public CreateAccountResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the account. &gt;Permitted values: &#x60;Active&#x60;.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the account. >Permitted values: `Active`.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this CreateAccountResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountResponse createAccountResponse = (CreateAccountResponse) o;
    return Objects.equals(this.accountCode, createAccountResponse.accountCode) &&
        Objects.equals(this.accountHolderCode, createAccountResponse.accountHolderCode) &&
        Objects.equals(this.bankAccountUUID, createAccountResponse.bankAccountUUID) &&
        Objects.equals(this.description, createAccountResponse.description) &&
        Objects.equals(this.invalidFields, createAccountResponse.invalidFields) &&
        Objects.equals(this.metadata, createAccountResponse.metadata) &&
        Objects.equals(this.payoutMethodCode, createAccountResponse.payoutMethodCode) &&
        Objects.equals(this.payoutSchedule, createAccountResponse.payoutSchedule) &&
        Objects.equals(this.payoutSpeed, createAccountResponse.payoutSpeed) &&
        Objects.equals(this.pspReference, createAccountResponse.pspReference) &&
        Objects.equals(this.resultCode, createAccountResponse.resultCode) &&
        Objects.equals(this.status, createAccountResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, accountHolderCode, bankAccountUUID, description, invalidFields, metadata, payoutMethodCode, payoutSchedule, payoutSpeed, pspReference, resultCode, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountResponse {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    bankAccountUUID: ").append(toIndentedString(bankAccountUUID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    payoutMethodCode: ").append(toIndentedString(payoutMethodCode)).append("\n");
    sb.append("    payoutSchedule: ").append(toIndentedString(payoutSchedule)).append("\n");
    sb.append("    payoutSpeed: ").append(toIndentedString(payoutSpeed)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of CreateAccountResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAccountResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateAccountResponse
   */
  public static CreateAccountResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateAccountResponse.class);
  }
/**
  * Convert an instance of CreateAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

