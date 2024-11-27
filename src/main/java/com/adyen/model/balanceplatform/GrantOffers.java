/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.GrantOffer;
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
 * GrantOffers
 */
@JsonPropertyOrder({
  GrantOffers.JSON_PROPERTY_GRANT_OFFERS
})

public class GrantOffers {
  public static final String JSON_PROPERTY_GRANT_OFFERS = "grantOffers";
  private List<GrantOffer> grantOffers = new ArrayList<>();

  public GrantOffers() { 
  }

  /**
   * A list of available grant offers.
   *
   * @param grantOffers
   * @return the current {@code GrantOffers} instance, allowing for method chaining
   */
  public GrantOffers grantOffers(List<GrantOffer> grantOffers) {
    this.grantOffers = grantOffers;
    return this;
  }

  public GrantOffers addGrantOffersItem(GrantOffer grantOffersItem) {
    this.grantOffers.add(grantOffersItem);
    return this;
  }

  /**
   * A list of available grant offers.
   * @return grantOffers
   */
  @ApiModelProperty(required = true, value = "A list of available grant offers.")
  @JsonProperty(JSON_PROPERTY_GRANT_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GrantOffer> getGrantOffers() {
    return grantOffers;
  }

  /**
   * A list of available grant offers.
   *
   * @param grantOffers
   */ 
  @JsonProperty(JSON_PROPERTY_GRANT_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantOffers(List<GrantOffer> grantOffers) {
    this.grantOffers = grantOffers;
  }

  /**
   * Return true if this GrantOffers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantOffers grantOffers = (GrantOffers) o;
    return Objects.equals(this.grantOffers, grantOffers.grantOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantOffers {\n");
    sb.append("    grantOffers: ").append(toIndentedString(grantOffers)).append("\n");
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
   * Create an instance of GrantOffers given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GrantOffers
   * @throws JsonProcessingException if the JSON string is invalid with respect to GrantOffers
   */
  public static GrantOffers fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GrantOffers.class);
  }
/**
  * Convert an instance of GrantOffers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
