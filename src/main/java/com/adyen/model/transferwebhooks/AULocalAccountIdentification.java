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
 * AULocalAccountIdentification
 */
@JsonPropertyOrder({
  AULocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  AULocalAccountIdentification.JSON_PROPERTY_BSB_CODE,
  AULocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class AULocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_BSB_CODE = "bsbCode";
  private String bsbCode;

  /**
   * **auLocal**
   */
  public enum TypeEnum {
    AULOCAL("auLocal");

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

  public AULocalAccountIdentification() { 
  }

  /**
   * The bank account number, without separators or whitespace.
   *
   * @param accountNumber
   * @return the current {@code AULocalAccountIdentification} instance, allowing for method chaining
   */
  public AULocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The bank account number, without separators or whitespace.
   * @return accountNumber
   */
  @ApiModelProperty(required = true, value = "The bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * The bank account number, without separators or whitespace.
   *
   * @param accountNumber
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.
   *
   * @param bsbCode
   * @return the current {@code AULocalAccountIdentification} instance, allowing for method chaining
   */
  public AULocalAccountIdentification bsbCode(String bsbCode) {
    this.bsbCode = bsbCode;
    return this;
  }

  /**
   * The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.
   * @return bsbCode
   */
  @ApiModelProperty(required = true, value = "The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_BSB_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBsbCode() {
    return bsbCode;
  }

  /**
   * The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.
   *
   * @param bsbCode
   */ 
  @JsonProperty(JSON_PROPERTY_BSB_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBsbCode(String bsbCode) {
    this.bsbCode = bsbCode;
  }

  /**
   * **auLocal**
   *
   * @param type
   * @return the current {@code AULocalAccountIdentification} instance, allowing for method chaining
   */
  public AULocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **auLocal**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**auLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **auLocal**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this AULocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AULocalAccountIdentification auLocalAccountIdentification = (AULocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, auLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bsbCode, auLocalAccountIdentification.bsbCode) &&
        Objects.equals(this.type, auLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bsbCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AULocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bsbCode: ").append(toIndentedString(bsbCode)).append("\n");
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
   * Create an instance of AULocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AULocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to AULocalAccountIdentification
   */
  public static AULocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AULocalAccountIdentification.class);
  }
/**
  * Convert an instance of AULocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
