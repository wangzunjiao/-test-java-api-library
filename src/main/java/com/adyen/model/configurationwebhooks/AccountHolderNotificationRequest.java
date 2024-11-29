/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.AccountHolderNotificationData;
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
 * AccountHolderNotificationRequest
 */
@JsonPropertyOrder({
  AccountHolderNotificationRequest.JSON_PROPERTY_DATA,
  AccountHolderNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  AccountHolderNotificationRequest.JSON_PROPERTY_TYPE
})
//pojo

public class AccountHolderNotificationRequest {
  public static final String JSON_PROPERTY_DATA = "data";
  private AccountHolderNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of webhook.
   */
  public enum TypeEnum {
    UPDATED("balancePlatform.accountHolder.updated"),
    
    CREATED("balancePlatform.accountHolder.created");

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

  public AccountHolderNotificationRequest() { 
  }

  /**
   * data
   *
   * @param data
   * @return the current {@code AccountHolderNotificationRequest} instance, allowing for method chaining
   */
  public AccountHolderNotificationRequest data(AccountHolderNotificationData data) {
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
  public AccountHolderNotificationData getData() {
    return data;
  }

  /**
   * data
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(AccountHolderNotificationData data) {
    this.data = data;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   *
   * @param environment
   * @return the current {@code AccountHolderNotificationRequest} instance, allowing for method chaining
   */
  public AccountHolderNotificationRequest environment(String environment) {
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
   * Type of webhook.
   *
   * @param type
   * @return the current {@code AccountHolderNotificationRequest} instance, allowing for method chaining
   */
  public AccountHolderNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of webhook.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Type of webhook.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this AccountHolderNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderNotificationRequest accountHolderNotificationRequest = (AccountHolderNotificationRequest) o;
    return Objects.equals(this.data, accountHolderNotificationRequest.data) &&
        Objects.equals(this.environment, accountHolderNotificationRequest.environment) &&
        Objects.equals(this.type, accountHolderNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderNotificationRequest {\n");
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
   * Create an instance of AccountHolderNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountHolderNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountHolderNotificationRequest
   */
  public static AccountHolderNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountHolderNotificationRequest.class);
  }
/**
  * Convert an instance of AccountHolderNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
