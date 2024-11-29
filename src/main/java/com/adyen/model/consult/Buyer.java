/*
 * Payment API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.consult;

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
 * Buyer
 */
@JsonPropertyOrder({
  Buyer.JSON_PROPERTY_REFERENCE_BUYER_ID
})
//pojo

public class Buyer {
  public static final String JSON_PROPERTY_REFERENCE_BUYER_ID = "referenceBuyerId";
  private String referenceBuyerId;

  public Buyer() { 
  }

  /**
   * The unique ID to identify the buyer.
   *
   * @param referenceBuyerId
   * @return the current {@code Buyer} instance, allowing for method chaining
   */
  public Buyer referenceBuyerId(String referenceBuyerId) {
    this.referenceBuyerId = referenceBuyerId;
    return this;
  }

  /**
   * The unique ID to identify the buyer.
   * @return referenceBuyerId
   */
  @ApiModelProperty(value = "The unique ID to identify the buyer.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_BUYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReferenceBuyerId() {
    return referenceBuyerId;
  }

  /**
   * The unique ID to identify the buyer.
   *
   * @param referenceBuyerId
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE_BUYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceBuyerId(String referenceBuyerId) {
    this.referenceBuyerId = referenceBuyerId;
  }

  /**
   * Return true if this Buyer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buyer buyer = (Buyer) o;
    return Objects.equals(this.referenceBuyerId, buyer.referenceBuyerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceBuyerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buyer {\n");
    sb.append("    referenceBuyerId: ").append(toIndentedString(referenceBuyerId)).append("\n");
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
   * Create an instance of Buyer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Buyer
   * @throws JsonProcessingException if the JSON string is invalid with respect to Buyer
   */
  public static Buyer fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Buyer.class);
  }
/**
  * Convert an instance of Buyer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}