/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

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
 * CALocalAccountIdentification
 */
@JsonPropertyOrder({
  CALocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  CALocalAccountIdentification.JSON_PROPERTY_ACCOUNT_TYPE,
  CALocalAccountIdentification.JSON_PROPERTY_INSTITUTION_NUMBER,
  CALocalAccountIdentification.JSON_PROPERTY_TRANSIT_NUMBER,
  CALocalAccountIdentification.JSON_PROPERTY_TYPE
})
//pojo

public class CALocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   */
  public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountTypeEnum accountType;

  public static final String JSON_PROPERTY_INSTITUTION_NUMBER = "institutionNumber";
  private String institutionNumber;

  public static final String JSON_PROPERTY_TRANSIT_NUMBER = "transitNumber";
  private String transitNumber;

  /**
   * **caLocal**
   */
  public enum TypeEnum {
    CALOCAL("caLocal");

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

  public CALocalAccountIdentification() { 
  }

  /**
   * The 5- to 12-digit bank account number, without separators or whitespace.
   *
   * @param accountNumber
   * @return the current {@code CALocalAccountIdentification} instance, allowing for method chaining
   */
  public CALocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The 5- to 12-digit bank account number, without separators or whitespace.
   * @return accountNumber
   */
  @ApiModelProperty(required = true, value = "The 5- to 12-digit bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * The 5- to 12-digit bank account number, without separators or whitespace.
   *
   * @param accountNumber
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   *
   * @param accountType
   * @return the current {@code CALocalAccountIdentification} instance, allowing for method chaining
   */
  public CALocalAccountIdentification accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   * @return accountType
   */
  @ApiModelProperty(value = "The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   *
   * @param accountType
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * The 3-digit institution number, without separators or whitespace.
   *
   * @param institutionNumber
   * @return the current {@code CALocalAccountIdentification} instance, allowing for method chaining
   */
  public CALocalAccountIdentification institutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
    return this;
  }

  /**
   * The 3-digit institution number, without separators or whitespace.
   * @return institutionNumber
   */
  @ApiModelProperty(required = true, value = "The 3-digit institution number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstitutionNumber() {
    return institutionNumber;
  }

  /**
   * The 3-digit institution number, without separators or whitespace.
   *
   * @param institutionNumber
   */ 
  @JsonProperty(JSON_PROPERTY_INSTITUTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
  }

  /**
   * The 5-digit transit number, without separators or whitespace.
   *
   * @param transitNumber
   * @return the current {@code CALocalAccountIdentification} instance, allowing for method chaining
   */
  public CALocalAccountIdentification transitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
    return this;
  }

  /**
   * The 5-digit transit number, without separators or whitespace.
   * @return transitNumber
   */
  @ApiModelProperty(required = true, value = "The 5-digit transit number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_TRANSIT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransitNumber() {
    return transitNumber;
  }

  /**
   * The 5-digit transit number, without separators or whitespace.
   *
   * @param transitNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSIT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
  }

  /**
   * **caLocal**
   *
   * @param type
   * @return the current {@code CALocalAccountIdentification} instance, allowing for method chaining
   */
  public CALocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **caLocal**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**caLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **caLocal**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this CALocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CALocalAccountIdentification caLocalAccountIdentification = (CALocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, caLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.accountType, caLocalAccountIdentification.accountType) &&
        Objects.equals(this.institutionNumber, caLocalAccountIdentification.institutionNumber) &&
        Objects.equals(this.transitNumber, caLocalAccountIdentification.transitNumber) &&
        Objects.equals(this.type, caLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, institutionNumber, transitNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CALocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    institutionNumber: ").append(toIndentedString(institutionNumber)).append("\n");
    sb.append("    transitNumber: ").append(toIndentedString(transitNumber)).append("\n");
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
   * Create an instance of CALocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CALocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to CALocalAccountIdentification
   */
  public static CALocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CALocalAccountIdentification.class);
  }
/**
  * Convert an instance of CALocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
