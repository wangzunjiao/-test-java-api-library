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
 * ResourceReference
 */
@JsonPropertyOrder({
  ResourceReference.JSON_PROPERTY_DESCRIPTION,
  ResourceReference.JSON_PROPERTY_ID,
  ResourceReference.JSON_PROPERTY_REFERENCE
})
//pojo

public class ResourceReference {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public ResourceReference() { 
  }

  /**
   * The description of the resource.
   *
   * @param description
   * @return the current {@code ResourceReference} instance, allowing for method chaining
   */
  public ResourceReference description(String description) {
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
   * @return the current {@code ResourceReference} instance, allowing for method chaining
   */
  public ResourceReference id(String id) {
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
   * @return the current {@code ResourceReference} instance, allowing for method chaining
   */
  public ResourceReference reference(String reference) {
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
   * Return true if this ResourceReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceReference resourceReference = (ResourceReference) o;
    return Objects.equals(this.description, resourceReference.description) &&
        Objects.equals(this.id, resourceReference.id) &&
        Objects.equals(this.reference, resourceReference.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceReference {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
   * Create an instance of ResourceReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceReference
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResourceReference
   */
  public static ResourceReference fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResourceReference.class);
  }
/**
  * Convert an instance of ResourceReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
