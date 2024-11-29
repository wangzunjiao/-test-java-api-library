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

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.TestOutput;
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
 * TestWebhookResponse
 */
@JsonPropertyOrder({
  TestWebhookResponse.JSON_PROPERTY_DATA
})
//pojo

public class TestWebhookResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TestOutput> data = null;

  public TestWebhookResponse() { 
  }

  /**
   * List with test results. Each test webhook we send has a list element with the result.
   *
   * @param data
   * @return the current {@code TestWebhookResponse} instance, allowing for method chaining
   */
  public TestWebhookResponse data(List<TestOutput> data) {
    this.data = data;
    return this;
  }

  public TestWebhookResponse addDataItem(TestOutput dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List with test results. Each test webhook we send has a list element with the result.
   * @return data
   */
  @ApiModelProperty(value = "List with test results. Each test webhook we send has a list element with the result.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TestOutput> getData() {
    return data;
  }

  /**
   * List with test results. Each test webhook we send has a list element with the result.
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TestOutput> data) {
    this.data = data;
  }

  /**
   * Return true if this TestWebhookResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestWebhookResponse testWebhookResponse = (TestWebhookResponse) o;
    return Objects.equals(this.data, testWebhookResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestWebhookResponse {\n");
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
   * Create an instance of TestWebhookResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestWebhookResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to TestWebhookResponse
   */
  public static TestWebhookResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TestWebhookResponse.class);
  }
/**
  * Convert an instance of TestWebhookResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
