/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.CapabilityProblemEntity;
import com.adyen.model.legalentitymanagement.VerificationError;
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
 * CapabilityProblem
 */
@JsonPropertyOrder({
  CapabilityProblem.JSON_PROPERTY_ENTITY,
  CapabilityProblem.JSON_PROPERTY_VERIFICATION_ERRORS
})

public class CapabilityProblem {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private CapabilityProblemEntity entity;

  public static final String JSON_PROPERTY_VERIFICATION_ERRORS = "verificationErrors";
  private List<VerificationError> verificationErrors = null;

  public CapabilityProblem() { 
  }

  /**
   * entity
   *
   * @param entity
   * @return the current {@code CapabilityProblem} instance, allowing for method chaining
   */
  public CapabilityProblem entity(CapabilityProblemEntity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * entity
   * @return entity
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CapabilityProblemEntity getEntity() {
    return entity;
  }

  /**
   * entity
   *
   * @param entity
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(CapabilityProblemEntity entity) {
    this.entity = entity;
  }

  /**
   * verificationErrors
   *
   * @param verificationErrors
   * @return the current {@code CapabilityProblem} instance, allowing for method chaining
   */
  public CapabilityProblem verificationErrors(List<VerificationError> verificationErrors) {
    this.verificationErrors = verificationErrors;
    return this;
  }

  public CapabilityProblem addVerificationErrorsItem(VerificationError verificationErrorsItem) {
    if (this.verificationErrors == null) {
      this.verificationErrors = new ArrayList<>();
    }
    this.verificationErrors.add(verificationErrorsItem);
    return this;
  }

  /**
   * verificationErrors
   * @return verificationErrors
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<VerificationError> getVerificationErrors() {
    return verificationErrors;
  }

  /**
   * verificationErrors
   *
   * @param verificationErrors
   */ 
  @JsonProperty(JSON_PROPERTY_VERIFICATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationErrors(List<VerificationError> verificationErrors) {
    this.verificationErrors = verificationErrors;
  }

  /**
   * Return true if this CapabilityProblem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilityProblem capabilityProblem = (CapabilityProblem) o;
    return Objects.equals(this.entity, capabilityProblem.entity) &&
        Objects.equals(this.verificationErrors, capabilityProblem.verificationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, verificationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilityProblem {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    verificationErrors: ").append(toIndentedString(verificationErrors)).append("\n");
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
   * Create an instance of CapabilityProblem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapabilityProblem
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapabilityProblem
   */
  public static CapabilityProblem fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapabilityProblem.class);
  }
/**
  * Convert an instance of CapabilityProblem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}