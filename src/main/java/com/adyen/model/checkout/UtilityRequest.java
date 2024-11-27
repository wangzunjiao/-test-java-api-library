/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * UtilityRequest
 */
@JsonPropertyOrder({
  UtilityRequest.JSON_PROPERTY_ORIGIN_DOMAINS
})

public class UtilityRequest {
  public static final String JSON_PROPERTY_ORIGIN_DOMAINS = "originDomains";
  private List<String> originDomains = new ArrayList<>();

  public UtilityRequest() { 
  }

  /**
   * The list of origin domains, for which origin keys are requested.
   *
   * @param originDomains
   * @return the current {@code UtilityRequest} instance, allowing for method chaining
   */
  public UtilityRequest originDomains(List<String> originDomains) {
    this.originDomains = originDomains;
    return this;
  }

  public UtilityRequest addOriginDomainsItem(String originDomainsItem) {
    this.originDomains.add(originDomainsItem);
    return this;
  }

  /**
   * The list of origin domains, for which origin keys are requested.
   * @return originDomains
   */
  @ApiModelProperty(required = true, value = "The list of origin domains, for which origin keys are requested.")
  @JsonProperty(JSON_PROPERTY_ORIGIN_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOriginDomains() {
    return originDomains;
  }

  /**
   * The list of origin domains, for which origin keys are requested.
   *
   * @param originDomains
   */ 
  @JsonProperty(JSON_PROPERTY_ORIGIN_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginDomains(List<String> originDomains) {
    this.originDomains = originDomains;
  }

  /**
   * Return true if this UtilityRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilityRequest utilityRequest = (UtilityRequest) o;
    return Objects.equals(this.originDomains, utilityRequest.originDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilityRequest {\n");
    sb.append("    originDomains: ").append(toIndentedString(originDomains)).append("\n");
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
   * Create an instance of UtilityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UtilityRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to UtilityRequest
   */
  public static UtilityRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UtilityRequest.class);
  }
/**
  * Convert an instance of UtilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
