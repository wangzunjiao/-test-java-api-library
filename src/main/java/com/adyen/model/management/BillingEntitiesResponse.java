/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.BillingEntity;
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
 * BillingEntitiesResponse
 */
@JsonPropertyOrder({
  BillingEntitiesResponse.JSON_PROPERTY_DATA
})

public class BillingEntitiesResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<BillingEntity> data = null;

  public BillingEntitiesResponse() { 
  }

  /**
   * List of legal entities that can be used for the billing of orders.
   *
   * @param data
   * @return the current {@code BillingEntitiesResponse} instance, allowing for method chaining
   */
  public BillingEntitiesResponse data(List<BillingEntity> data) {
    this.data = data;
    return this;
  }

  public BillingEntitiesResponse addDataItem(BillingEntity dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of legal entities that can be used for the billing of orders.
   * @return data
   */
  @ApiModelProperty(value = "List of legal entities that can be used for the billing of orders.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BillingEntity> getData() {
    return data;
  }

  /**
   * List of legal entities that can be used for the billing of orders.
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<BillingEntity> data) {
    this.data = data;
  }

  /**
   * Return true if this BillingEntitiesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingEntitiesResponse billingEntitiesResponse = (BillingEntitiesResponse) o;
    return Objects.equals(this.data, billingEntitiesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingEntitiesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of BillingEntitiesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingEntitiesResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to BillingEntitiesResponse
   */
  public static BillingEntitiesResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BillingEntitiesResponse.class);
  }
/**
  * Convert an instance of BillingEntitiesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
