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
 * PaymentInstrument
 */
@JsonPropertyOrder({
  PaymentInstrument.JSON_PROPERTY_DESCRIPTION,
  PaymentInstrument.JSON_PROPERTY_ID,
  PaymentInstrument.JSON_PROPERTY_REFERENCE,
  PaymentInstrument.JSON_PROPERTY_TOKEN_TYPE
})

public class PaymentInstrument {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "tokenType";
  private String tokenType;

  public PaymentInstrument() { 
  }

  /**
   * The description of the resource.
   *
   * @param description
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the resource.
   * @return description
   */
  @ApiModelProperty(value = "The description of the resource.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * The description of the resource.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The unique identifier of the resource.
   *
   * @param id
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the resource.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the resource.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The reference for the resource.
   *
   * @param reference
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The reference for the resource.
   * @return reference
   */
  @ApiModelProperty(value = "The reference for the resource.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * The reference for the resource.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The type of wallet that the network token is associated with.
   *
   * @param tokenType
   * @return the current {@code PaymentInstrument} instance, allowing for method chaining
   */
  public PaymentInstrument tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * The type of wallet that the network token is associated with.
   * @return tokenType
   */
  @ApiModelProperty(value = "The type of wallet that the network token is associated with.")
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenType() {
    return tokenType;
  }

  /**
   * The type of wallet that the network token is associated with.
   *
   * @param tokenType
   */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Return true if this PaymentInstrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrument paymentInstrument = (PaymentInstrument) o;
    return Objects.equals(this.description, paymentInstrument.description) &&
        Objects.equals(this.id, paymentInstrument.id) &&
        Objects.equals(this.reference, paymentInstrument.reference) &&
        Objects.equals(this.tokenType, paymentInstrument.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, reference, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrument {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
   * Create an instance of PaymentInstrument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentInstrument
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentInstrument
   */
  public static PaymentInstrument fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentInstrument.class);
  }
/**
  * Convert an instance of PaymentInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
