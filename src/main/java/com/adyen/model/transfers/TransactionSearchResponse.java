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
import com.adyen.model.transfers.Links;
import com.adyen.model.transfers.Transaction;
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
 * TransactionSearchResponse
 */
@JsonPropertyOrder({
  TransactionSearchResponse.JSON_PROPERTY_LINKS,
  TransactionSearchResponse.JSON_PROPERTY_DATA
})
//pojo

public class TransactionSearchResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private Links links;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<Transaction> data = null;

  public TransactionSearchResponse() { 
  }

  /**
   * links
   *
   * @param links
   * @return the current {@code TransactionSearchResponse} instance, allowing for method chaining
   */
  public TransactionSearchResponse links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * links
   * @return links
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Links getLinks() {
    return links;
  }

  /**
   * links
   *
   * @param links
   */ 
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   * Contains the transactions that match the query parameters.
   *
   * @param data
   * @return the current {@code TransactionSearchResponse} instance, allowing for method chaining
   */
  public TransactionSearchResponse data(List<Transaction> data) {
    this.data = data;
    return this;
  }

  public TransactionSearchResponse addDataItem(Transaction dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Contains the transactions that match the query parameters.
   * @return data
   */
  @ApiModelProperty(value = "Contains the transactions that match the query parameters.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Transaction> getData() {
    return data;
  }

  /**
   * Contains the transactions that match the query parameters.
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<Transaction> data) {
    this.data = data;
  }

  /**
   * Return true if this TransactionSearchResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSearchResponse transactionSearchResponse = (TransactionSearchResponse) o;
    return Objects.equals(this.links, transactionSearchResponse.links) &&
        Objects.equals(this.data, transactionSearchResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSearchResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
   * Create an instance of TransactionSearchResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionSearchResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionSearchResponse
   */
  public static TransactionSearchResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionSearchResponse.class);
  }
/**
  * Convert an instance of TransactionSearchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
