/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.RecurringDetail;
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
 * RecurringDetailWrapper
 */
@JsonPropertyOrder({
  RecurringDetailWrapper.JSON_PROPERTY_RECURRING_DETAIL
})
//pojo

public class RecurringDetailWrapper {
  public static final String JSON_PROPERTY_RECURRING_DETAIL = "RecurringDetail";
  private RecurringDetail recurringDetail;

  public RecurringDetailWrapper() { 
  }

  /**
   * recurringDetail
   *
   * @param recurringDetail
   * @return the current {@code RecurringDetailWrapper} instance, allowing for method chaining
   */
  public RecurringDetailWrapper recurringDetail(RecurringDetail recurringDetail) {
    this.recurringDetail = recurringDetail;
    return this;
  }

  /**
   * recurringDetail
   * @return recurringDetail
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurringDetail getRecurringDetail() {
    return recurringDetail;
  }

  /**
   * recurringDetail
   *
   * @param recurringDetail
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetail(RecurringDetail recurringDetail) {
    this.recurringDetail = recurringDetail;
  }

  /**
   * Return true if this RecurringDetailWrapper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetailWrapper recurringDetailWrapper = (RecurringDetailWrapper) o;
    return Objects.equals(this.recurringDetail, recurringDetailWrapper.recurringDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetailWrapper {\n");
    sb.append("    recurringDetail: ").append(toIndentedString(recurringDetail)).append("\n");
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
   * Create an instance of RecurringDetailWrapper given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecurringDetailWrapper
   * @throws JsonProcessingException if the JSON string is invalid with respect to RecurringDetailWrapper
   */
  public static RecurringDetailWrapper fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RecurringDetailWrapper.class);
  }
/**
  * Convert an instance of RecurringDetailWrapper to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
