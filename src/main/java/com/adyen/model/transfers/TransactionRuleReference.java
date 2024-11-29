/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * TransactionRuleReference
 */
@JsonPropertyOrder({
  TransactionRuleReference.JSON_PROPERTY_DESCRIPTION,
  TransactionRuleReference.JSON_PROPERTY_ID,
  TransactionRuleReference.JSON_PROPERTY_OUTCOME_TYPE,
  TransactionRuleReference.JSON_PROPERTY_REFERENCE,
  TransactionRuleReference.JSON_PROPERTY_SCORE
})
//pojo

public class TransactionRuleReference {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OUTCOME_TYPE = "outcomeType";
  private String outcomeType;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Integer score;

  public TransactionRuleReference() { 
  }

  /**
   * The description of the resource.
   *
   * @param description
   * @return the current {@code TransactionRuleReference} instance, allowing for method chaining
   */
  public TransactionRuleReference description(String description) {
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
   * @return the current {@code TransactionRuleReference} instance, allowing for method chaining
   */
  public TransactionRuleReference id(String id) {
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
   * The outcome type of the rule.
   *
   * @param outcomeType
   * @return the current {@code TransactionRuleReference} instance, allowing for method chaining
   */
  public TransactionRuleReference outcomeType(String outcomeType) {
    this.outcomeType = outcomeType;
    return this;
  }

  /**
   * The outcome type of the rule.
   * @return outcomeType
   */
  @ApiModelProperty(value = "The outcome type of the rule.")
  @JsonProperty(JSON_PROPERTY_OUTCOME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOutcomeType() {
    return outcomeType;
  }

  /**
   * The outcome type of the rule.
   *
   * @param outcomeType
   */ 
  @JsonProperty(JSON_PROPERTY_OUTCOME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutcomeType(String outcomeType) {
    this.outcomeType = outcomeType;
  }

  /**
   * The reference for the resource.
   *
   * @param reference
   * @return the current {@code TransactionRuleReference} instance, allowing for method chaining
   */
  public TransactionRuleReference reference(String reference) {
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
   * The score of the rule in case it&#39;s a scoreBased rule.
   *
   * @param score
   * @return the current {@code TransactionRuleReference} instance, allowing for method chaining
   */
  public TransactionRuleReference score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * The score of the rule in case it&#39;s a scoreBased rule.
   * @return score
   */
  @ApiModelProperty(value = "The score of the rule in case it's a scoreBased rule.")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getScore() {
    return score;
  }

  /**
   * The score of the rule in case it&#39;s a scoreBased rule.
   *
   * @param score
   */ 
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Integer score) {
    this.score = score;
  }

  /**
   * Return true if this TransactionRuleReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleReference transactionRuleReference = (TransactionRuleReference) o;
    return Objects.equals(this.description, transactionRuleReference.description) &&
        Objects.equals(this.id, transactionRuleReference.id) &&
        Objects.equals(this.outcomeType, transactionRuleReference.outcomeType) &&
        Objects.equals(this.reference, transactionRuleReference.reference) &&
        Objects.equals(this.score, transactionRuleReference.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, outcomeType, reference, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleReference {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outcomeType: ").append(toIndentedString(outcomeType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
   * Create an instance of TransactionRuleReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRuleReference
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionRuleReference
   */
  public static TransactionRuleReference fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionRuleReference.class);
  }
/**
  * Convert an instance of TransactionRuleReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
