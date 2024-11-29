/*
 * Disputes API
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.disputes;

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
 * DefenseReasonsRequest
 */
@JsonPropertyOrder({
  DefenseReasonsRequest.JSON_PROPERTY_DISPUTE_PSP_REFERENCE,
  DefenseReasonsRequest.JSON_PROPERTY_MERCHANT_ACCOUNT_CODE
})
//pojo

public class DefenseReasonsRequest {
  public static final String JSON_PROPERTY_DISPUTE_PSP_REFERENCE = "disputePspReference";
  private String disputePspReference;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT_CODE = "merchantAccountCode";
  private String merchantAccountCode;

  public DefenseReasonsRequest() { 
  }

  /**
   * The PSP reference assigned to the dispute.
   *
   * @param disputePspReference
   * @return the current {@code DefenseReasonsRequest} instance, allowing for method chaining
   */
  public DefenseReasonsRequest disputePspReference(String disputePspReference) {
    this.disputePspReference = disputePspReference;
    return this;
  }

  /**
   * The PSP reference assigned to the dispute.
   * @return disputePspReference
   */
  @ApiModelProperty(required = true, value = "The PSP reference assigned to the dispute.")
  @JsonProperty(JSON_PROPERTY_DISPUTE_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisputePspReference() {
    return disputePspReference;
  }

  /**
   * The PSP reference assigned to the dispute.
   *
   * @param disputePspReference
   */ 
  @JsonProperty(JSON_PROPERTY_DISPUTE_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputePspReference(String disputePspReference) {
    this.disputePspReference = disputePspReference;
  }

  /**
   * The merchant account identifier, for which you want to process the dispute transaction.
   *
   * @param merchantAccountCode
   * @return the current {@code DefenseReasonsRequest} instance, allowing for method chaining
   */
  public DefenseReasonsRequest merchantAccountCode(String merchantAccountCode) {
    this.merchantAccountCode = merchantAccountCode;
    return this;
  }

  /**
   * The merchant account identifier, for which you want to process the dispute transaction.
   * @return merchantAccountCode
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier, for which you want to process the dispute transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccountCode() {
    return merchantAccountCode;
  }

  /**
   * The merchant account identifier, for which you want to process the dispute transaction.
   *
   * @param merchantAccountCode
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccountCode(String merchantAccountCode) {
    this.merchantAccountCode = merchantAccountCode;
  }

  /**
   * Return true if this DefenseReasonsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefenseReasonsRequest defenseReasonsRequest = (DefenseReasonsRequest) o;
    return Objects.equals(this.disputePspReference, defenseReasonsRequest.disputePspReference) &&
        Objects.equals(this.merchantAccountCode, defenseReasonsRequest.merchantAccountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputePspReference, merchantAccountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefenseReasonsRequest {\n");
    sb.append("    disputePspReference: ").append(toIndentedString(disputePspReference)).append("\n");
    sb.append("    merchantAccountCode: ").append(toIndentedString(merchantAccountCode)).append("\n");
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
   * Create an instance of DefenseReasonsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefenseReasonsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to DefenseReasonsRequest
   */
  public static DefenseReasonsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DefenseReasonsRequest.class);
  }
/**
  * Convert an instance of DefenseReasonsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
