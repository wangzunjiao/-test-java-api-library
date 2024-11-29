/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

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
 * PermitResult
 */
@JsonPropertyOrder({
  PermitResult.JSON_PROPERTY_RESULT_KEY,
  PermitResult.JSON_PROPERTY_TOKEN
})
//pojo

public class PermitResult {
  public static final String JSON_PROPERTY_RESULT_KEY = "resultKey";
  private String resultKey;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public PermitResult() { 
  }

  /**
   * The key to link permit requests to permit results.
   *
   * @param resultKey
   * @return the current {@code PermitResult} instance, allowing for method chaining
   */
  public PermitResult resultKey(String resultKey) {
    this.resultKey = resultKey;
    return this;
  }

  /**
   * The key to link permit requests to permit results.
   * @return resultKey
   */
  @ApiModelProperty(value = "The key to link permit requests to permit results.")
  @JsonProperty(JSON_PROPERTY_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultKey() {
    return resultKey;
  }

  /**
   * The key to link permit requests to permit results.
   *
   * @param resultKey
   */ 
  @JsonProperty(JSON_PROPERTY_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultKey(String resultKey) {
    this.resultKey = resultKey;
  }

  /**
   * The permit token which is used to make payments by the partner company.
   *
   * @param token
   * @return the current {@code PermitResult} instance, allowing for method chaining
   */
  public PermitResult token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The permit token which is used to make payments by the partner company.
   * @return token
   */
  @ApiModelProperty(value = "The permit token which is used to make payments by the partner company.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }

  /**
   * The permit token which is used to make payments by the partner company.
   *
   * @param token
   */ 
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Return true if this PermitResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermitResult permitResult = (PermitResult) o;
    return Objects.equals(this.resultKey, permitResult.resultKey) &&
        Objects.equals(this.token, permitResult.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultKey, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermitResult {\n");
    sb.append("    resultKey: ").append(toIndentedString(resultKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
   * Create an instance of PermitResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PermitResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to PermitResult
   */
  public static PermitResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PermitResult.class);
  }
/**
  * Convert an instance of PermitResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
