/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Item;
import com.adyen.model.checkout.SubInputDetail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * InputDetail
 */
@JsonPropertyOrder({
  InputDetail.JSON_PROPERTY_CONFIGURATION,
  InputDetail.JSON_PROPERTY_DETAILS,
  InputDetail.JSON_PROPERTY_INPUT_DETAILS,
  InputDetail.JSON_PROPERTY_ITEM_SEARCH_URL,
  InputDetail.JSON_PROPERTY_ITEMS,
  InputDetail.JSON_PROPERTY_KEY,
  InputDetail.JSON_PROPERTY_OPTIONAL,
  InputDetail.JSON_PROPERTY_TYPE,
  InputDetail.JSON_PROPERTY_VALUE
})
//pojo

public class InputDetail {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private Map<String, String> configuration = null;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<SubInputDetail> details = null;

  public static final String JSON_PROPERTY_INPUT_DETAILS = "inputDetails";
  @Deprecated // deprecated 
  private List<SubInputDetail> inputDetails = null;

  public static final String JSON_PROPERTY_ITEM_SEARCH_URL = "itemSearchUrl";
  private String itemSearchUrl;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = null;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_OPTIONAL = "optional";
  private Boolean optional;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public InputDetail() { 
  }

  /**
   * Configuration parameters for the required input.
   *
   * @param configuration
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail configuration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public InputDetail putConfigurationItem(String key, String configurationItem) {
    if (this.configuration == null) {
      this.configuration = new HashMap<>();
    }
    this.configuration.put(key, configurationItem);
    return this;
  }

  /**
   * Configuration parameters for the required input.
   * @return configuration
   */
  @ApiModelProperty(value = "Configuration parameters for the required input.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getConfiguration() {
    return configuration;
  }

  /**
   * Configuration parameters for the required input.
   *
   * @param configuration
   */ 
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
  }

  /**
   * Input details can also be provided recursively.
   *
   * @param details
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail details(List<SubInputDetail> details) {
    this.details = details;
    return this;
  }

  public InputDetail addDetailsItem(SubInputDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Input details can also be provided recursively.
   * @return details
   */
  @ApiModelProperty(value = "Input details can also be provided recursively.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SubInputDetail> getDetails() {
    return details;
  }

  /**
   * Input details can also be provided recursively.
   *
   * @param details
   */ 
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<SubInputDetail> details) {
    this.details = details;
  }

  /**
   * Input details can also be provided recursively (deprecated).
   *
   * @param inputDetails
   * @return the current {@code InputDetail} instance, allowing for method chaining
   *
   * @deprecated 
   */
  @Deprecated
  public InputDetail inputDetails(List<SubInputDetail> inputDetails) {
    this.inputDetails = inputDetails;
    return this;
  }

  public InputDetail addInputDetailsItem(SubInputDetail inputDetailsItem) {
    if (this.inputDetails == null) {
      this.inputDetails = new ArrayList<>();
    }
    this.inputDetails.add(inputDetailsItem);
    return this;
  }

  /**
   * Input details can also be provided recursively (deprecated).
   * @return inputDetails
   *
   * @deprecated 
   */
  @Deprecated
  @ApiModelProperty(value = "Input details can also be provided recursively (deprecated).")
  @JsonProperty(JSON_PROPERTY_INPUT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SubInputDetail> getInputDetails() {
    return inputDetails;
  }

  /**
   * Input details can also be provided recursively (deprecated).
   *
   * @param inputDetails
   *
   * @deprecated 
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_INPUT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDetails(List<SubInputDetail> inputDetails) {
    this.inputDetails = inputDetails;
  }

  /**
   * In case of a select, the URL from which to query the items.
   *
   * @param itemSearchUrl
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail itemSearchUrl(String itemSearchUrl) {
    this.itemSearchUrl = itemSearchUrl;
    return this;
  }

  /**
   * In case of a select, the URL from which to query the items.
   * @return itemSearchUrl
   */
  @ApiModelProperty(value = "In case of a select, the URL from which to query the items.")
  @JsonProperty(JSON_PROPERTY_ITEM_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getItemSearchUrl() {
    return itemSearchUrl;
  }

  /**
   * In case of a select, the URL from which to query the items.
   *
   * @param itemSearchUrl
   */ 
  @JsonProperty(JSON_PROPERTY_ITEM_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemSearchUrl(String itemSearchUrl) {
    this.itemSearchUrl = itemSearchUrl;
  }

  /**
   * In case of a select, the items to choose from.
   *
   * @param items
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail items(List<Item> items) {
    this.items = items;
    return this;
  }

  public InputDetail addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * In case of a select, the items to choose from.
   * @return items
   */
  @ApiModelProperty(value = "In case of a select, the items to choose from.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Item> getItems() {
    return items;
  }

  /**
   * In case of a select, the items to choose from.
   *
   * @param items
   */ 
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<Item> items) {
    this.items = items;
  }

  /**
   * The value to provide in the result.
   *
   * @param key
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The value to provide in the result.
   * @return key
   */
  @ApiModelProperty(value = "The value to provide in the result.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  /**
   * The value to provide in the result.
   *
   * @param key
   */ 
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * True if this input value is optional.
   *
   * @param optional
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * True if this input value is optional.
   * @return optional
   */
  @ApiModelProperty(value = "True if this input value is optional.")
  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOptional() {
    return optional;
  }

  /**
   * True if this input value is optional.
   *
   * @param optional
   */ 
  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  /**
   * The type of the required input.
   *
   * @param type
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the required input.
   * @return type
   */
  @ApiModelProperty(value = "The type of the required input.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * The type of the required input.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The value can be pre-filled, if available.
   *
   * @param value
   * @return the current {@code InputDetail} instance, allowing for method chaining
   */
  public InputDetail value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value can be pre-filled, if available.
   * @return value
   */
  @ApiModelProperty(value = "The value can be pre-filled, if available.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  /**
   * The value can be pre-filled, if available.
   *
   * @param value
   */ 
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this InputDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputDetail inputDetail = (InputDetail) o;
    return Objects.equals(this.configuration, inputDetail.configuration) &&
        Objects.equals(this.details, inputDetail.details) &&
        Objects.equals(this.inputDetails, inputDetail.inputDetails) &&
        Objects.equals(this.itemSearchUrl, inputDetail.itemSearchUrl) &&
        Objects.equals(this.items, inputDetail.items) &&
        Objects.equals(this.key, inputDetail.key) &&
        Objects.equals(this.optional, inputDetail.optional) &&
        Objects.equals(this.type, inputDetail.type) &&
        Objects.equals(this.value, inputDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, details, inputDetails, itemSearchUrl, items, key, optional, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDetail {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    inputDetails: ").append(toIndentedString(inputDetails)).append("\n");
    sb.append("    itemSearchUrl: ").append(toIndentedString(itemSearchUrl)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of InputDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to InputDetail
   */
  public static InputDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InputDetail.class);
  }
/**
  * Convert an instance of InputDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
