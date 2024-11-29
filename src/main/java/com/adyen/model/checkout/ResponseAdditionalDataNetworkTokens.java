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
 * ResponseAdditionalDataNetworkTokens
 */
@JsonPropertyOrder({
  ResponseAdditionalDataNetworkTokens.JSON_PROPERTY_NETWORK_TOKEN_AVAILABLE,
  ResponseAdditionalDataNetworkTokens.JSON_PROPERTY_NETWORK_TOKEN_BIN,
  ResponseAdditionalDataNetworkTokens.JSON_PROPERTY_NETWORK_TOKEN_TOKEN_SUMMARY
})
//pojo

public class ResponseAdditionalDataNetworkTokens {
  public static final String JSON_PROPERTY_NETWORK_TOKEN_AVAILABLE = "networkToken.available";
  private String networkTokenAvailable;

  public static final String JSON_PROPERTY_NETWORK_TOKEN_BIN = "networkToken.bin";
  private String networkTokenBin;

  public static final String JSON_PROPERTY_NETWORK_TOKEN_TOKEN_SUMMARY = "networkToken.tokenSummary";
  private String networkTokenTokenSummary;

  public ResponseAdditionalDataNetworkTokens() { 
  }

  /**
   * Indicates whether a network token is available for the specified card.
   *
   * @param networkTokenAvailable
   * @return the current {@code ResponseAdditionalDataNetworkTokens} instance, allowing for method chaining
   */
  public ResponseAdditionalDataNetworkTokens networkTokenAvailable(String networkTokenAvailable) {
    this.networkTokenAvailable = networkTokenAvailable;
    return this;
  }

  /**
   * Indicates whether a network token is available for the specified card.
   * @return networkTokenAvailable
   */
  @ApiModelProperty(value = "Indicates whether a network token is available for the specified card.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNetworkTokenAvailable() {
    return networkTokenAvailable;
  }

  /**
   * Indicates whether a network token is available for the specified card.
   *
   * @param networkTokenAvailable
   */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTokenAvailable(String networkTokenAvailable) {
    this.networkTokenAvailable = networkTokenAvailable;
  }

  /**
   * The Bank Identification Number of a tokenized card, which is the first six digits of a card number.
   *
   * @param networkTokenBin
   * @return the current {@code ResponseAdditionalDataNetworkTokens} instance, allowing for method chaining
   */
  public ResponseAdditionalDataNetworkTokens networkTokenBin(String networkTokenBin) {
    this.networkTokenBin = networkTokenBin;
    return this;
  }

  /**
   * The Bank Identification Number of a tokenized card, which is the first six digits of a card number.
   * @return networkTokenBin
   */
  @ApiModelProperty(value = "The Bank Identification Number of a tokenized card, which is the first six digits of a card number.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNetworkTokenBin() {
    return networkTokenBin;
  }

  /**
   * The Bank Identification Number of a tokenized card, which is the first six digits of a card number.
   *
   * @param networkTokenBin
   */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTokenBin(String networkTokenBin) {
    this.networkTokenBin = networkTokenBin;
  }

  /**
   * The last four digits of a network token.
   *
   * @param networkTokenTokenSummary
   * @return the current {@code ResponseAdditionalDataNetworkTokens} instance, allowing for method chaining
   */
  public ResponseAdditionalDataNetworkTokens networkTokenTokenSummary(String networkTokenTokenSummary) {
    this.networkTokenTokenSummary = networkTokenTokenSummary;
    return this;
  }

  /**
   * The last four digits of a network token.
   * @return networkTokenTokenSummary
   */
  @ApiModelProperty(value = "The last four digits of a network token.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_TOKEN_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNetworkTokenTokenSummary() {
    return networkTokenTokenSummary;
  }

  /**
   * The last four digits of a network token.
   *
   * @param networkTokenTokenSummary
   */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TOKEN_TOKEN_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTokenTokenSummary(String networkTokenTokenSummary) {
    this.networkTokenTokenSummary = networkTokenTokenSummary;
  }

  /**
   * Return true if this ResponseAdditionalDataNetworkTokens object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataNetworkTokens responseAdditionalDataNetworkTokens = (ResponseAdditionalDataNetworkTokens) o;
    return Objects.equals(this.networkTokenAvailable, responseAdditionalDataNetworkTokens.networkTokenAvailable) &&
        Objects.equals(this.networkTokenBin, responseAdditionalDataNetworkTokens.networkTokenBin) &&
        Objects.equals(this.networkTokenTokenSummary, responseAdditionalDataNetworkTokens.networkTokenTokenSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkTokenAvailable, networkTokenBin, networkTokenTokenSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataNetworkTokens {\n");
    sb.append("    networkTokenAvailable: ").append(toIndentedString(networkTokenAvailable)).append("\n");
    sb.append("    networkTokenBin: ").append(toIndentedString(networkTokenBin)).append("\n");
    sb.append("    networkTokenTokenSummary: ").append(toIndentedString(networkTokenTokenSummary)).append("\n");
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
   * Create an instance of ResponseAdditionalDataNetworkTokens given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseAdditionalDataNetworkTokens
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResponseAdditionalDataNetworkTokens
   */
  public static ResponseAdditionalDataNetworkTokens fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResponseAdditionalDataNetworkTokens.class);
  }
/**
  * Convert an instance of ResponseAdditionalDataNetworkTokens to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
