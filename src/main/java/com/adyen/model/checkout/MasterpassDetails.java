/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * MasterpassDetails
 */
@JsonPropertyOrder({
  MasterpassDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  MasterpassDetails.JSON_PROPERTY_FUNDING_SOURCE,
  MasterpassDetails.JSON_PROPERTY_MASTERPASS_TRANSACTION_ID,
  MasterpassDetails.JSON_PROPERTY_TYPE
})
//pojo

public class MasterpassDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  public enum FundingSourceEnum {
    CREDIT("credit"),
    
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
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
    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FUNDING_SOURCE = "fundingSource";
  private FundingSourceEnum fundingSource;

  public static final String JSON_PROPERTY_MASTERPASS_TRANSACTION_ID = "masterpassTransactionId";
  private String masterpassTransactionId;

  /**
   * **masterpass**
   */
  public enum TypeEnum {
    MASTERPASS("masterpass");

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

  public MasterpassDetails() { 
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   * @return the current {@code MasterpassDetails} instance, allowing for method chaining
   */
  public MasterpassDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

  /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
   */
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   *
   * @param fundingSource
   * @return the current {@code MasterpassDetails} instance, allowing for method chaining
   */
  public MasterpassDetails fundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
   */
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   *
   * @param fundingSource
   */ 
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }

  /**
   * The Masterpass transaction ID.
   *
   * @param masterpassTransactionId
   * @return the current {@code MasterpassDetails} instance, allowing for method chaining
   */
  public MasterpassDetails masterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
    return this;
  }

  /**
   * The Masterpass transaction ID.
   * @return masterpassTransactionId
   */
  @ApiModelProperty(required = true, value = "The Masterpass transaction ID.")
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMasterpassTransactionId() {
    return masterpassTransactionId;
  }

  /**
   * The Masterpass transaction ID.
   *
   * @param masterpassTransactionId
   */ 
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
  }

  /**
   * **masterpass**
   *
   * @param type
   * @return the current {@code MasterpassDetails} instance, allowing for method chaining
   */
  public MasterpassDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **masterpass**
   * @return type
   */
  @ApiModelProperty(value = "**masterpass**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **masterpass**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this MasterpassDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterpassDetails masterpassDetails = (MasterpassDetails) o;
    return Objects.equals(this.checkoutAttemptId, masterpassDetails.checkoutAttemptId) &&
        Objects.equals(this.fundingSource, masterpassDetails.fundingSource) &&
        Objects.equals(this.masterpassTransactionId, masterpassDetails.masterpassTransactionId) &&
        Objects.equals(this.type, masterpassDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, fundingSource, masterpassTransactionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterpassDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    masterpassTransactionId: ").append(toIndentedString(masterpassTransactionId)).append("\n");
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
   * Create an instance of MasterpassDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MasterpassDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to MasterpassDetails
   */
  public static MasterpassDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MasterpassDetails.class);
  }
/**
  * Convert an instance of MasterpassDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
