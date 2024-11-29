/*
 * Transaction webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transactionwebhooks;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transactionwebhooks.Transaction;
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
 * TransactionNotificationRequestV4
 */
@JsonPropertyOrder({
  TransactionNotificationRequestV4.JSON_PROPERTY_DATA,
  TransactionNotificationRequestV4.JSON_PROPERTY_ENVIRONMENT,
  TransactionNotificationRequestV4.JSON_PROPERTY_TYPE
})
//pojo

public class TransactionNotificationRequestV4 {
  public static final String JSON_PROPERTY_DATA = "data";
  private Transaction data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of the webhook.
   */
  public enum TypeEnum {
    BALANCEPLATFORM_TRANSACTION_CREATED("balancePlatform.transaction.created");

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

  public TransactionNotificationRequestV4() { 
  }

  /**
   * data
   *
   * @param data
   * @return the current {@code TransactionNotificationRequestV4} instance, allowing for method chaining
   */
  public TransactionNotificationRequestV4 data(Transaction data) {
    this.data = data;
    return this;
  }

  /**
   * data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Transaction getData() {
    return data;
  }

  /**
   * data
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Transaction data) {
    this.data = data;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   *
   * @param environment
   * @return the current {@code TransactionNotificationRequestV4} instance, allowing for method chaining
   */
  public TransactionNotificationRequestV4 environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
   */
  @ApiModelProperty(required = true, value = "The environment from which the webhook originated.  Possible values: **test**, **live**.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironment() {
    return environment;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   *
   * @param environment
   */ 
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Type of the webhook.
   *
   * @param type
   * @return the current {@code TransactionNotificationRequestV4} instance, allowing for method chaining
   */
  public TransactionNotificationRequestV4 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the webhook.
   * @return type
   */
  @ApiModelProperty(value = "Type of the webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Type of the webhook.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this TransactionNotificationRequestV4 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionNotificationRequestV4 transactionNotificationRequestV4 = (TransactionNotificationRequestV4) o;
    return Objects.equals(this.data, transactionNotificationRequestV4.data) &&
        Objects.equals(this.environment, transactionNotificationRequestV4.environment) &&
        Objects.equals(this.type, transactionNotificationRequestV4.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionNotificationRequestV4 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
   * Create an instance of TransactionNotificationRequestV4 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionNotificationRequestV4
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionNotificationRequestV4
   */
  public static TransactionNotificationRequestV4 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionNotificationRequestV4.class);
  }
/**
  * Convert an instance of TransactionNotificationRequestV4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
