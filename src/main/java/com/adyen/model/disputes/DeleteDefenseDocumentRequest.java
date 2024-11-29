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
 * DeleteDefenseDocumentRequest
 */
@JsonPropertyOrder({
  DeleteDefenseDocumentRequest.JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE,
  DeleteDefenseDocumentRequest.JSON_PROPERTY_DISPUTE_PSP_REFERENCE,
  DeleteDefenseDocumentRequest.JSON_PROPERTY_MERCHANT_ACCOUNT_CODE
})
//pojo

public class DeleteDefenseDocumentRequest {
  public static final String JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE = "defenseDocumentType";
  private String defenseDocumentType;

  public static final String JSON_PROPERTY_DISPUTE_PSP_REFERENCE = "disputePspReference";
  private String disputePspReference;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT_CODE = "merchantAccountCode";
  private String merchantAccountCode;

  public DeleteDefenseDocumentRequest() { 
  }

  /**
   * The document type code of the defense document.
   *
   * @param defenseDocumentType
   * @return the current {@code DeleteDefenseDocumentRequest} instance, allowing for method chaining
   */
  public DeleteDefenseDocumentRequest defenseDocumentType(String defenseDocumentType) {
    this.defenseDocumentType = defenseDocumentType;
    return this;
  }

  /**
   * The document type code of the defense document.
   * @return defenseDocumentType
   */
  @ApiModelProperty(required = true, value = "The document type code of the defense document.")
  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefenseDocumentType() {
    return defenseDocumentType;
  }

  /**
   * The document type code of the defense document.
   *
   * @param defenseDocumentType
   */ 
  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefenseDocumentType(String defenseDocumentType) {
    this.defenseDocumentType = defenseDocumentType;
  }

  /**
   * The PSP reference assigned to the dispute.
   *
   * @param disputePspReference
   * @return the current {@code DeleteDefenseDocumentRequest} instance, allowing for method chaining
   */
  public DeleteDefenseDocumentRequest disputePspReference(String disputePspReference) {
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
   * @return the current {@code DeleteDefenseDocumentRequest} instance, allowing for method chaining
   */
  public DeleteDefenseDocumentRequest merchantAccountCode(String merchantAccountCode) {
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
   * Return true if this DeleteDefenseDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDefenseDocumentRequest deleteDefenseDocumentRequest = (DeleteDefenseDocumentRequest) o;
    return Objects.equals(this.defenseDocumentType, deleteDefenseDocumentRequest.defenseDocumentType) &&
        Objects.equals(this.disputePspReference, deleteDefenseDocumentRequest.disputePspReference) &&
        Objects.equals(this.merchantAccountCode, deleteDefenseDocumentRequest.merchantAccountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defenseDocumentType, disputePspReference, merchantAccountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDefenseDocumentRequest {\n");
    sb.append("    defenseDocumentType: ").append(toIndentedString(defenseDocumentType)).append("\n");
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
   * Create an instance of DeleteDefenseDocumentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteDefenseDocumentRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to DeleteDefenseDocumentRequest
   */
  public static DeleteDefenseDocumentRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DeleteDefenseDocumentRequest.class);
  }
/**
  * Convert an instance of DeleteDefenseDocumentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
