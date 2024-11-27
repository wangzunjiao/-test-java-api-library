/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayaccount.AccountHolderDetails;
import com.adyen.model.marketpayaccount.AccountHolderStatus;
import com.adyen.model.marketpayaccount.ErrorFieldType;
import com.adyen.model.marketpayaccount.KYCVerificationResult;
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
 * CreateAccountHolderResponse
 */
@JsonPropertyOrder({
  CreateAccountHolderResponse.JSON_PROPERTY_ACCOUNT_CODE,
  CreateAccountHolderResponse.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  CreateAccountHolderResponse.JSON_PROPERTY_ACCOUNT_HOLDER_DETAILS,
  CreateAccountHolderResponse.JSON_PROPERTY_ACCOUNT_HOLDER_STATUS,
  CreateAccountHolderResponse.JSON_PROPERTY_DESCRIPTION,
  CreateAccountHolderResponse.JSON_PROPERTY_INVALID_FIELDS,
  CreateAccountHolderResponse.JSON_PROPERTY_LEGAL_ENTITY,
  CreateAccountHolderResponse.JSON_PROPERTY_PRIMARY_CURRENCY,
  CreateAccountHolderResponse.JSON_PROPERTY_PSP_REFERENCE,
  CreateAccountHolderResponse.JSON_PROPERTY_RESULT_CODE,
  CreateAccountHolderResponse.JSON_PROPERTY_VERIFICATION,
  CreateAccountHolderResponse.JSON_PROPERTY_VERIFICATION_PROFILE
})

public class CreateAccountHolderResponse {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_DETAILS = "accountHolderDetails";
  private AccountHolderDetails accountHolderDetails;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_STATUS = "accountHolderStatus";
  private AccountHolderStatus accountHolderStatus;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  /**
   * The type of legal entity of the new account holder.
   */
  public enum LegalEntityEnum {
    BUSINESS("Business"),
    
    INDIVIDUAL("Individual"),
    
    NONPROFIT("NonProfit"),
    
    PARTNERSHIP("Partnership"),
    
    PUBLICCOMPANY("PublicCompany");

    private String value;

    LegalEntityEnum(String value) {
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
    public static LegalEntityEnum fromValue(String value) {
      for (LegalEntityEnum b : LegalEntityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LEGAL_ENTITY = "legalEntity";
  private LegalEntityEnum legalEntity;

  public static final String JSON_PROPERTY_PRIMARY_CURRENCY = "primaryCurrency";
  private String primaryCurrency;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private String resultCode;

  public static final String JSON_PROPERTY_VERIFICATION = "verification";
  private KYCVerificationResult verification;

  public static final String JSON_PROPERTY_VERIFICATION_PROFILE = "verificationProfile";
  private String verificationProfile;

  public CreateAccountHolderResponse() { 
  }

  public CreateAccountHolderResponse accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The code of a new account created for the account holder.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The code of a new account created for the account holder.")
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


  public CreateAccountHolderResponse accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the new account holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(value = "The code of the new account holder.")
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


  public CreateAccountHolderResponse accountHolderDetails(AccountHolderDetails accountHolderDetails) {
    this.accountHolderDetails = accountHolderDetails;
    return this;
  }

   /**
   * Get accountHolderDetails
   * @return accountHolderDetails
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountHolderDetails getAccountHolderDetails() {
    return accountHolderDetails;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderDetails(AccountHolderDetails accountHolderDetails) {
    this.accountHolderDetails = accountHolderDetails;
  }


  public CreateAccountHolderResponse accountHolderStatus(AccountHolderStatus accountHolderStatus) {
    this.accountHolderStatus = accountHolderStatus;
    return this;
  }

   /**
   * Get accountHolderStatus
   * @return accountHolderStatus
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountHolderStatus getAccountHolderStatus() {
    return accountHolderStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderStatus(AccountHolderStatus accountHolderStatus) {
    this.accountHolderStatus = accountHolderStatus;
  }


  public CreateAccountHolderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the new account holder.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the new account holder.")
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


  public CreateAccountHolderResponse invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public CreateAccountHolderResponse addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * A list of fields that caused the &#x60;/createAccountHolder&#x60; request to fail.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "A list of fields that caused the `/createAccountHolder` request to fail.")
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


  public CreateAccountHolderResponse legalEntity(LegalEntityEnum legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

   /**
   * The type of legal entity of the new account holder.
   * @return legalEntity
  **/
  @ApiModelProperty(value = "The type of legal entity of the new account holder.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegalEntityEnum getLegalEntity() {
    return legalEntity;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntity(LegalEntityEnum legalEntity) {
    this.legalEntity = legalEntity;
  }


  public CreateAccountHolderResponse primaryCurrency(String primaryCurrency) {
    this.primaryCurrency = primaryCurrency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes), with which the prospective account holder primarily deals.
   * @return primaryCurrency
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes), with which the prospective account holder primarily deals.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryCurrency() {
    return primaryCurrency;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_PRIMARY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryCurrency(String primaryCurrency) {
    this.primaryCurrency = primaryCurrency;
  }


  public CreateAccountHolderResponse pspReference(String pspReference) {
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


  public CreateAccountHolderResponse resultCode(String resultCode) {
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


  public CreateAccountHolderResponse verification(KYCVerificationResult verification) {
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KYCVerificationResult getVerification() {
    return verification;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerification(KYCVerificationResult verification) {
    this.verification = verification;
  }


  public CreateAccountHolderResponse verificationProfile(String verificationProfile) {
    this.verificationProfile = verificationProfile;
    return this;
  }

   /**
   * The identifier of the profile that applies to this entity.
   * @return verificationProfile
  **/
  @ApiModelProperty(value = "The identifier of the profile that applies to this entity.")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerificationProfile() {
    return verificationProfile;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationProfile(String verificationProfile) {
    this.verificationProfile = verificationProfile;
  }


  /**
   * Return true if this CreateAccountHolderResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountHolderResponse createAccountHolderResponse = (CreateAccountHolderResponse) o;
    return Objects.equals(this.accountCode, createAccountHolderResponse.accountCode) &&
        Objects.equals(this.accountHolderCode, createAccountHolderResponse.accountHolderCode) &&
        Objects.equals(this.accountHolderDetails, createAccountHolderResponse.accountHolderDetails) &&
        Objects.equals(this.accountHolderStatus, createAccountHolderResponse.accountHolderStatus) &&
        Objects.equals(this.description, createAccountHolderResponse.description) &&
        Objects.equals(this.invalidFields, createAccountHolderResponse.invalidFields) &&
        Objects.equals(this.legalEntity, createAccountHolderResponse.legalEntity) &&
        Objects.equals(this.primaryCurrency, createAccountHolderResponse.primaryCurrency) &&
        Objects.equals(this.pspReference, createAccountHolderResponse.pspReference) &&
        Objects.equals(this.resultCode, createAccountHolderResponse.resultCode) &&
        Objects.equals(this.verification, createAccountHolderResponse.verification) &&
        Objects.equals(this.verificationProfile, createAccountHolderResponse.verificationProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, accountHolderCode, accountHolderDetails, accountHolderStatus, description, invalidFields, legalEntity, primaryCurrency, pspReference, resultCode, verification, verificationProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountHolderResponse {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    accountHolderDetails: ").append(toIndentedString(accountHolderDetails)).append("\n");
    sb.append("    accountHolderStatus: ").append(toIndentedString(accountHolderStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    verificationProfile: ").append(toIndentedString(verificationProfile)).append("\n");
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
   * Create an instance of CreateAccountHolderResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAccountHolderResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateAccountHolderResponse
   */
  public static CreateAccountHolderResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateAccountHolderResponse.class);
  }
/**
  * Convert an instance of CreateAccountHolderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

