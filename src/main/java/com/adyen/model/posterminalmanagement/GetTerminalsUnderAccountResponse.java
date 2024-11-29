/*
 * POS Terminal Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.posterminalmanagement.MerchantAccount;
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
 * GetTerminalsUnderAccountResponse
 */
@JsonPropertyOrder({
  GetTerminalsUnderAccountResponse.JSON_PROPERTY_COMPANY_ACCOUNT,
  GetTerminalsUnderAccountResponse.JSON_PROPERTY_INVENTORY_TERMINALS,
  GetTerminalsUnderAccountResponse.JSON_PROPERTY_MERCHANT_ACCOUNTS
})
//pojo

public class GetTerminalsUnderAccountResponse {
  public static final String JSON_PROPERTY_COMPANY_ACCOUNT = "companyAccount";
  private String companyAccount;

  public static final String JSON_PROPERTY_INVENTORY_TERMINALS = "inventoryTerminals";
  private List<String> inventoryTerminals = null;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNTS = "merchantAccounts";
  private List<MerchantAccount> merchantAccounts = null;

  public GetTerminalsUnderAccountResponse() { 
  }

  /**
   * Your company account.
   *
   * @param companyAccount
   * @return the current {@code GetTerminalsUnderAccountResponse} instance, allowing for method chaining
   */
  public GetTerminalsUnderAccountResponse companyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
    return this;
  }

  /**
   * Your company account.
   * @return companyAccount
   */
  @ApiModelProperty(required = true, value = "Your company account.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompanyAccount() {
    return companyAccount;
  }

  /**
   * Your company account.
   *
   * @param companyAccount
   */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }

  /**
   * Array that returns a list of all terminals that are in the inventory of the company account.
   *
   * @param inventoryTerminals
   * @return the current {@code GetTerminalsUnderAccountResponse} instance, allowing for method chaining
   */
  public GetTerminalsUnderAccountResponse inventoryTerminals(List<String> inventoryTerminals) {
    this.inventoryTerminals = inventoryTerminals;
    return this;
  }

  public GetTerminalsUnderAccountResponse addInventoryTerminalsItem(String inventoryTerminalsItem) {
    if (this.inventoryTerminals == null) {
      this.inventoryTerminals = new ArrayList<>();
    }
    this.inventoryTerminals.add(inventoryTerminalsItem);
    return this;
  }

  /**
   * Array that returns a list of all terminals that are in the inventory of the company account.
   * @return inventoryTerminals
   */
  @ApiModelProperty(value = "Array that returns a list of all terminals that are in the inventory of the company account.")
  @JsonProperty(JSON_PROPERTY_INVENTORY_TERMINALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getInventoryTerminals() {
    return inventoryTerminals;
  }

  /**
   * Array that returns a list of all terminals that are in the inventory of the company account.
   *
   * @param inventoryTerminals
   */ 
  @JsonProperty(JSON_PROPERTY_INVENTORY_TERMINALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventoryTerminals(List<String> inventoryTerminals) {
    this.inventoryTerminals = inventoryTerminals;
  }

  /**
   * Array that returns a list of all merchant accounts belonging to the company account.
   *
   * @param merchantAccounts
   * @return the current {@code GetTerminalsUnderAccountResponse} instance, allowing for method chaining
   */
  public GetTerminalsUnderAccountResponse merchantAccounts(List<MerchantAccount> merchantAccounts) {
    this.merchantAccounts = merchantAccounts;
    return this;
  }

  public GetTerminalsUnderAccountResponse addMerchantAccountsItem(MerchantAccount merchantAccountsItem) {
    if (this.merchantAccounts == null) {
      this.merchantAccounts = new ArrayList<>();
    }
    this.merchantAccounts.add(merchantAccountsItem);
    return this;
  }

  /**
   * Array that returns a list of all merchant accounts belonging to the company account.
   * @return merchantAccounts
   */
  @ApiModelProperty(value = "Array that returns a list of all merchant accounts belonging to the company account.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MerchantAccount> getMerchantAccounts() {
    return merchantAccounts;
  }

  /**
   * Array that returns a list of all merchant accounts belonging to the company account.
   *
   * @param merchantAccounts
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccounts(List<MerchantAccount> merchantAccounts) {
    this.merchantAccounts = merchantAccounts;
  }

  /**
   * Return true if this GetTerminalsUnderAccountResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTerminalsUnderAccountResponse getTerminalsUnderAccountResponse = (GetTerminalsUnderAccountResponse) o;
    return Objects.equals(this.companyAccount, getTerminalsUnderAccountResponse.companyAccount) &&
        Objects.equals(this.inventoryTerminals, getTerminalsUnderAccountResponse.inventoryTerminals) &&
        Objects.equals(this.merchantAccounts, getTerminalsUnderAccountResponse.merchantAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAccount, inventoryTerminals, merchantAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTerminalsUnderAccountResponse {\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    inventoryTerminals: ").append(toIndentedString(inventoryTerminals)).append("\n");
    sb.append("    merchantAccounts: ").append(toIndentedString(merchantAccounts)).append("\n");
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
   * Create an instance of GetTerminalsUnderAccountResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTerminalsUnderAccountResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetTerminalsUnderAccountResponse
   */
  public static GetTerminalsUnderAccountResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetTerminalsUnderAccountResponse.class);
  }
/**
  * Convert an instance of GetTerminalsUnderAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
