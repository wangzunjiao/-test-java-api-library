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
 * TransferNotificationValidationFact
 */
@JsonPropertyOrder({
  TransferNotificationValidationFact.JSON_PROPERTY_RESULT,
  TransferNotificationValidationFact.JSON_PROPERTY_TYPE
})
//pojo

public class TransferNotificationValidationFact {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TransferNotificationValidationFact() { 
  }

  /**
   * The evaluation result of the validation fact.
   *
   * @param result
   * @return the current {@code TransferNotificationValidationFact} instance, allowing for method chaining
   */
  public TransferNotificationValidationFact result(String result) {
    this.result = result;
    return this;
  }

  /**
   * The evaluation result of the validation fact.
   * @return result
   */
  @ApiModelProperty(value = "The evaluation result of the validation fact.")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResult() {
    return result;
  }

  /**
   * The evaluation result of the validation fact.
   *
   * @param result
   */ 
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * The type of the validation fact.
   *
   * @param type
   * @return the current {@code TransferNotificationValidationFact} instance, allowing for method chaining
   */
  public TransferNotificationValidationFact type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the validation fact.
   * @return type
   */
  @ApiModelProperty(value = "The type of the validation fact.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * The type of the validation fact.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this TransferNotificationValidationFact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferNotificationValidationFact transferNotificationValidationFact = (TransferNotificationValidationFact) o;
    return Objects.equals(this.result, transferNotificationValidationFact.result) &&
        Objects.equals(this.type, transferNotificationValidationFact.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferNotificationValidationFact {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
   * Create an instance of TransferNotificationValidationFact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferNotificationValidationFact
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferNotificationValidationFact
   */
  public static TransferNotificationValidationFact fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferNotificationValidationFact.class);
  }
/**
  * Convert an instance of TransferNotificationValidationFact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
