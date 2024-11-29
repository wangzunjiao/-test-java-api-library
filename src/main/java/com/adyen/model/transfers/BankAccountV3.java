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
import com.adyen.model.transfers.BankAccountV3AccountIdentification;
import com.adyen.model.transfers.PartyIdentification;
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
 * BankAccountV3
 */
@JsonPropertyOrder({
  BankAccountV3.JSON_PROPERTY_ACCOUNT_HOLDER,
  BankAccountV3.JSON_PROPERTY_ACCOUNT_IDENTIFICATION
})
//pojo

public class BankAccountV3 {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";
  private PartyIdentification accountHolder;

  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFICATION = "accountIdentification";
  private BankAccountV3AccountIdentification accountIdentification;

  public BankAccountV3() { 
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   * @return the current {@code BankAccountV3} instance, allowing for method chaining
   */
  public BankAccountV3 accountHolder(PartyIdentification accountHolder) {
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
  public PartyIdentification getAccountHolder() {
    return accountHolder;
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(PartyIdentification accountHolder) {
    this.accountHolder = accountHolder;
  }

  /**
   * accountIdentification
   *
   * @param accountIdentification
   * @return the current {@code BankAccountV3} instance, allowing for method chaining
   */
  public BankAccountV3 accountIdentification(BankAccountV3AccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

  /**
   * accountIdentification
   * @return accountIdentification
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccountV3AccountIdentification getAccountIdentification() {
    return accountIdentification;
  }

  /**
   * accountIdentification
   *
   * @param accountIdentification
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountIdentification(BankAccountV3AccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  /**
   * Return true if this BankAccountV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountV3 bankAccountV3 = (BankAccountV3) o;
    return Objects.equals(this.accountHolder, bankAccountV3.accountHolder) &&
        Objects.equals(this.accountIdentification, bankAccountV3.accountIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, accountIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountV3 {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
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
   * Create an instance of BankAccountV3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BankAccountV3
   * @throws JsonProcessingException if the JSON string is invalid with respect to BankAccountV3
   */
  public static BankAccountV3 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BankAccountV3.class);
  }
/**
  * Convert an instance of BankAccountV3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
