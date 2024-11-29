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
 * OwnerEntity
 */
@JsonPropertyOrder({
  OwnerEntity.JSON_PROPERTY_ID,
  OwnerEntity.JSON_PROPERTY_TYPE
})
//pojo

public class OwnerEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public OwnerEntity() { 
  }

  /**
   * Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id).
   *
   * @param id
   * @return the current {@code OwnerEntity} instance, allowing for method chaining
   */
  public OwnerEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id).
   * @return id
   */
  @ApiModelProperty(required = true, value = "Unique identifier of the resource that owns the document. For `type` **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For `type` **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id).")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id).
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**.
   *
   * @param type
   * @return the current {@code OwnerEntity} instance, allowing for method chaining
   */
  public OwnerEntity type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this OwnerEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerEntity ownerEntity = (OwnerEntity) o;
    return Objects.equals(this.id, ownerEntity.id) &&
        Objects.equals(this.type, ownerEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
   * Create an instance of OwnerEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OwnerEntity
   * @throws JsonProcessingException if the JSON string is invalid with respect to OwnerEntity
   */
  public static OwnerEntity fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, OwnerEntity.class);
  }
/**
  * Convert an instance of OwnerEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
