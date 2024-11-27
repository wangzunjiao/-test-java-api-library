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
 * RiskScores
 */
@JsonPropertyOrder({
  RiskScores.JSON_PROPERTY_MASTERCARD,
  RiskScores.JSON_PROPERTY_VISA
})

public class RiskScores {
  public static final String JSON_PROPERTY_MASTERCARD = "mastercard";
  private Integer mastercard;

  public static final String JSON_PROPERTY_VISA = "visa";
  private Integer visa;

  public RiskScores() { 
  }

  /**
   * Transaction risk score provided by Mastercard. Values provided by Mastercard range between 0 (lowest risk) to 998 (highest risk).
   *
   * @param mastercard
   * @return the current {@code RiskScores} instance, allowing for method chaining
   */
  public RiskScores mastercard(Integer mastercard) {
    this.mastercard = mastercard;
    return this;
  }

  /**
   * Transaction risk score provided by Mastercard. Values provided by Mastercard range between 0 (lowest risk) to 998 (highest risk).
   * @return mastercard
   */
  @ApiModelProperty(value = "Transaction risk score provided by Mastercard. Values provided by Mastercard range between 0 (lowest risk) to 998 (highest risk).")
  @JsonProperty(JSON_PROPERTY_MASTERCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMastercard() {
    return mastercard;
  }

  /**
   * Transaction risk score provided by Mastercard. Values provided by Mastercard range between 0 (lowest risk) to 998 (highest risk).
   *
   * @param mastercard
   */ 
  @JsonProperty(JSON_PROPERTY_MASTERCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMastercard(Integer mastercard) {
    this.mastercard = mastercard;
  }

  /**
   * Transaction risk score provided by Visa. Values provided by Visa range between 01 (lowest risk) to 99 (highest risk).
   *
   * @param visa
   * @return the current {@code RiskScores} instance, allowing for method chaining
   */
  public RiskScores visa(Integer visa) {
    this.visa = visa;
    return this;
  }

  /**
   * Transaction risk score provided by Visa. Values provided by Visa range between 01 (lowest risk) to 99 (highest risk).
   * @return visa
   */
  @ApiModelProperty(value = "Transaction risk score provided by Visa. Values provided by Visa range between 01 (lowest risk) to 99 (highest risk).")
  @JsonProperty(JSON_PROPERTY_VISA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getVisa() {
    return visa;
  }

  /**
   * Transaction risk score provided by Visa. Values provided by Visa range between 01 (lowest risk) to 99 (highest risk).
   *
   * @param visa
   */ 
  @JsonProperty(JSON_PROPERTY_VISA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisa(Integer visa) {
    this.visa = visa;
  }

  /**
   * Return true if this RiskScores object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScores riskScores = (RiskScores) o;
    return Objects.equals(this.mastercard, riskScores.mastercard) &&
        Objects.equals(this.visa, riskScores.visa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mastercard, visa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScores {\n");
    sb.append("    mastercard: ").append(toIndentedString(mastercard)).append("\n");
    sb.append("    visa: ").append(toIndentedString(visa)).append("\n");
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
   * Create an instance of RiskScores given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RiskScores
   * @throws JsonProcessingException if the JSON string is invalid with respect to RiskScores
   */
  public static RiskScores fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RiskScores.class);
  }
/**
  * Convert an instance of RiskScores to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}