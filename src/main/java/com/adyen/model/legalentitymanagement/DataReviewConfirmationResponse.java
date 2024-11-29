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
 * DataReviewConfirmationResponse
 */
@JsonPropertyOrder({
  DataReviewConfirmationResponse.JSON_PROPERTY_DATA_REVIEWED_AT
})
//pojo

public class DataReviewConfirmationResponse {
  public static final String JSON_PROPERTY_DATA_REVIEWED_AT = "dataReviewedAt";
  private String dataReviewedAt;

  public DataReviewConfirmationResponse() { 
  }

  /**
   * Date when data review was confirmed.
   *
   * @param dataReviewedAt
   * @return the current {@code DataReviewConfirmationResponse} instance, allowing for method chaining
   */
  public DataReviewConfirmationResponse dataReviewedAt(String dataReviewedAt) {
    this.dataReviewedAt = dataReviewedAt;
    return this;
  }

  /**
   * Date when data review was confirmed.
   * @return dataReviewedAt
   */
  @ApiModelProperty(value = "Date when data review was confirmed.")
  @JsonProperty(JSON_PROPERTY_DATA_REVIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataReviewedAt() {
    return dataReviewedAt;
  }

  /**
   * Date when data review was confirmed.
   *
   * @param dataReviewedAt
   */ 
  @JsonProperty(JSON_PROPERTY_DATA_REVIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataReviewedAt(String dataReviewedAt) {
    this.dataReviewedAt = dataReviewedAt;
  }

  /**
   * Return true if this DataReviewConfirmationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataReviewConfirmationResponse dataReviewConfirmationResponse = (DataReviewConfirmationResponse) o;
    return Objects.equals(this.dataReviewedAt, dataReviewConfirmationResponse.dataReviewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataReviewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataReviewConfirmationResponse {\n");
    sb.append("    dataReviewedAt: ").append(toIndentedString(dataReviewedAt)).append("\n");
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
   * Create an instance of DataReviewConfirmationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataReviewConfirmationResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to DataReviewConfirmationResponse
   */
  public static DataReviewConfirmationResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DataReviewConfirmationResponse.class);
  }
/**
  * Convert an instance of DataReviewConfirmationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
