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
 * CZLocalAccountIdentification
 */
@JsonPropertyOrder({
  CZLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  CZLocalAccountIdentification.JSON_PROPERTY_BANK_CODE,
  CZLocalAccountIdentification.JSON_PROPERTY_TYPE
})
//pojo

public class CZLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_BANK_CODE = "bankCode";
  private String bankCode;

  /**
   * **czLocal**
   */
  public enum TypeEnum {
    CZLOCAL("czLocal");

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

  public CZLocalAccountIdentification() { 
  }

  /**
   * The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized)
   *
   * @param accountNumber
   * @return the current {@code CZLocalAccountIdentification} instance, allowing for method chaining
   */
  public CZLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized)
   * @return accountNumber
   */
  @ApiModelProperty(required = true, value = "The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized)")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized)
   *
   * @param accountNumber
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The 4-digit bank code (Kód banky), without separators or whitespace.
   *
   * @param bankCode
   * @return the current {@code CZLocalAccountIdentification} instance, allowing for method chaining
   */
  public CZLocalAccountIdentification bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * The 4-digit bank code (Kód banky), without separators or whitespace.
   * @return bankCode
   */
  @ApiModelProperty(required = true, value = "The 4-digit bank code (Kód banky), without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBankCode() {
    return bankCode;
  }

  /**
   * The 4-digit bank code (Kód banky), without separators or whitespace.
   *
   * @param bankCode
   */ 
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  /**
   * **czLocal**
   *
   * @param type
   * @return the current {@code CZLocalAccountIdentification} instance, allowing for method chaining
   */
  public CZLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **czLocal**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**czLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **czLocal**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this CZLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CZLocalAccountIdentification czLocalAccountIdentification = (CZLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, czLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bankCode, czLocalAccountIdentification.bankCode) &&
        Objects.equals(this.type, czLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CZLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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
   * Create an instance of CZLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CZLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to CZLocalAccountIdentification
   */
  public static CZLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CZLocalAccountIdentification.class);
  }
/**
  * Convert an instance of CZLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
