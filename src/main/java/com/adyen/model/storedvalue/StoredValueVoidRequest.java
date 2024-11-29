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
 * StoredValueVoidRequest
 */
@JsonPropertyOrder({
  StoredValueVoidRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoredValueVoidRequest.JSON_PROPERTY_ORIGINAL_REFERENCE,
  StoredValueVoidRequest.JSON_PROPERTY_REFERENCE,
  StoredValueVoidRequest.JSON_PROPERTY_STORE,
  StoredValueVoidRequest.JSON_PROPERTY_TENDER_REFERENCE,
  StoredValueVoidRequest.JSON_PROPERTY_UNIQUE_TERMINAL_ID
})
//pojo

public class StoredValueVoidRequest {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_ORIGINAL_REFERENCE = "originalReference";
  private String originalReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public static final String JSON_PROPERTY_TENDER_REFERENCE = "tenderReference";
  private String tenderReference;

  public static final String JSON_PROPERTY_UNIQUE_TERMINAL_ID = "uniqueTerminalId";
  private String uniqueTerminalId;

  public StoredValueVoidRequest() { 
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest merchantAccount(String merchantAccount) {
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
   * The original pspReference of the payment to modify.
   *
   * @param originalReference
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

  /**
   * The original pspReference of the payment to modify.
   * @return originalReference
   */
  @ApiModelProperty(required = true, value = "The original pspReference of the payment to modify.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginalReference() {
    return originalReference;
  }

  /**
   * The original pspReference of the payment to modify.
   *
   * @param originalReference
   */ 
  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }

  /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   *
   * @param reference
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The physical store, for which this payment is processed.
   *
   * @param store
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest store(String store) {
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
   * The reference of the tender.
   *
   * @param tenderReference
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest tenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
    return this;
  }

  /**
   * The reference of the tender.
   * @return tenderReference
   */
  @ApiModelProperty(value = "The reference of the tender.")
  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenderReference() {
    return tenderReference;
  }

  /**
   * The reference of the tender.
   *
   * @param tenderReference
   */ 
  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
  }

  /**
   * The unique ID of a POS terminal.
   *
   * @param uniqueTerminalId
   * @return the current {@code StoredValueVoidRequest} instance, allowing for method chaining
   */
  public StoredValueVoidRequest uniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
    return this;
  }

  /**
   * The unique ID of a POS terminal.
   * @return uniqueTerminalId
   */
  @ApiModelProperty(value = "The unique ID of a POS terminal.")
  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUniqueTerminalId() {
    return uniqueTerminalId;
  }

  /**
   * The unique ID of a POS terminal.
   *
   * @param uniqueTerminalId
   */ 
  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
  }

  /**
   * Return true if this StoredValueVoidRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueVoidRequest storedValueVoidRequest = (StoredValueVoidRequest) o;
    return Objects.equals(this.merchantAccount, storedValueVoidRequest.merchantAccount) &&
        Objects.equals(this.originalReference, storedValueVoidRequest.originalReference) &&
        Objects.equals(this.reference, storedValueVoidRequest.reference) &&
        Objects.equals(this.store, storedValueVoidRequest.store) &&
        Objects.equals(this.tenderReference, storedValueVoidRequest.tenderReference) &&
        Objects.equals(this.uniqueTerminalId, storedValueVoidRequest.uniqueTerminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, originalReference, reference, store, tenderReference, uniqueTerminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueVoidRequest {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    tenderReference: ").append(toIndentedString(tenderReference)).append("\n");
    sb.append("    uniqueTerminalId: ").append(toIndentedString(uniqueTerminalId)).append("\n");
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
   * Create an instance of StoredValueVoidRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueVoidRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueVoidRequest
   */
  public static StoredValueVoidRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueVoidRequest.class);
  }
/**
  * Convert an instance of StoredValueVoidRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
