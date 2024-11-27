/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * TerminalReassignmentRequest
 */
@JsonPropertyOrder({
  TerminalReassignmentRequest.JSON_PROPERTY_COMPANY_ID,
  TerminalReassignmentRequest.JSON_PROPERTY_INVENTORY,
  TerminalReassignmentRequest.JSON_PROPERTY_MERCHANT_ID,
  TerminalReassignmentRequest.JSON_PROPERTY_STORE_ID
})

public class TerminalReassignmentRequest {
  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private String companyId;

  public static final String JSON_PROPERTY_INVENTORY = "inventory";
  private Boolean inventory;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public TerminalReassignmentRequest() { 
  }

  /**
   * The unique identifier of the company account to which the terminal is reassigned.
   *
   * @param companyId
   * @return the current {@code TerminalReassignmentRequest} instance, allowing for method chaining
   */
  public TerminalReassignmentRequest companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The unique identifier of the company account to which the terminal is reassigned.
   * @return companyId
   */
  @ApiModelProperty(value = "The unique identifier of the company account to which the terminal is reassigned.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompanyId() {
    return companyId;
  }

  /**
   * The unique identifier of the company account to which the terminal is reassigned.
   *
   * @param companyId
   */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  /**
   * Must be specified when reassigning terminals to a merchant account:  - If set to **true**, reassigns terminals to the inventory of the merchant account and the terminals cannot process transactions.  - If set to **false**, reassigns terminals directly to the merchant account and the terminals can process transactions.
   *
   * @param inventory
   * @return the current {@code TerminalReassignmentRequest} instance, allowing for method chaining
   */
  public TerminalReassignmentRequest inventory(Boolean inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Must be specified when reassigning terminals to a merchant account:  - If set to **true**, reassigns terminals to the inventory of the merchant account and the terminals cannot process transactions.  - If set to **false**, reassigns terminals directly to the merchant account and the terminals can process transactions.
   * @return inventory
   */
  @ApiModelProperty(value = "Must be specified when reassigning terminals to a merchant account:  - If set to **true**, reassigns terminals to the inventory of the merchant account and the terminals cannot process transactions.  - If set to **false**, reassigns terminals directly to the merchant account and the terminals can process transactions.")
  @JsonProperty(JSON_PROPERTY_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInventory() {
    return inventory;
  }

  /**
   * Must be specified when reassigning terminals to a merchant account:  - If set to **true**, reassigns terminals to the inventory of the merchant account and the terminals cannot process transactions.  - If set to **false**, reassigns terminals directly to the merchant account and the terminals can process transactions.
   *
   * @param inventory
   */ 
  @JsonProperty(JSON_PROPERTY_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventory(Boolean inventory) {
    this.inventory = inventory;
  }

  /**
   * The unique identifier of the merchant account to which the terminal is reassigned. When reassigning terminals to a merchant account, you must specify the &#x60;inventory&#x60; field.
   *
   * @param merchantId
   * @return the current {@code TerminalReassignmentRequest} instance, allowing for method chaining
   */
  public TerminalReassignmentRequest merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The unique identifier of the merchant account to which the terminal is reassigned. When reassigning terminals to a merchant account, you must specify the &#x60;inventory&#x60; field.
   * @return merchantId
   */
  @ApiModelProperty(value = "The unique identifier of the merchant account to which the terminal is reassigned. When reassigning terminals to a merchant account, you must specify the `inventory` field.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantId() {
    return merchantId;
  }

  /**
   * The unique identifier of the merchant account to which the terminal is reassigned. When reassigning terminals to a merchant account, you must specify the &#x60;inventory&#x60; field.
   *
   * @param merchantId
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * The unique identifier of the store to which the terminal is reassigned.
   *
   * @param storeId
   * @return the current {@code TerminalReassignmentRequest} instance, allowing for method chaining
   */
  public TerminalReassignmentRequest storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * The unique identifier of the store to which the terminal is reassigned.
   * @return storeId
   */
  @ApiModelProperty(value = "The unique identifier of the store to which the terminal is reassigned.")
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoreId() {
    return storeId;
  }

  /**
   * The unique identifier of the store to which the terminal is reassigned.
   *
   * @param storeId
   */ 
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   * Return true if this TerminalReassignmentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalReassignmentRequest terminalReassignmentRequest = (TerminalReassignmentRequest) o;
    return Objects.equals(this.companyId, terminalReassignmentRequest.companyId) &&
        Objects.equals(this.inventory, terminalReassignmentRequest.inventory) &&
        Objects.equals(this.merchantId, terminalReassignmentRequest.merchantId) &&
        Objects.equals(this.storeId, terminalReassignmentRequest.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, inventory, merchantId, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalReassignmentRequest {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
   * Create an instance of TerminalReassignmentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalReassignmentRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalReassignmentRequest
   */
  public static TerminalReassignmentRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalReassignmentRequest.class);
  }
/**
  * Convert an instance of TerminalReassignmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}