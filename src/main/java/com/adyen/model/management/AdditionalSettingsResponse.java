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
 * AdditionalSettingsResponse
 */
@JsonPropertyOrder({
  AdditionalSettingsResponse.JSON_PROPERTY_EXCLUDE_EVENT_CODES,
  AdditionalSettingsResponse.JSON_PROPERTY_INCLUDE_EVENT_CODES,
  AdditionalSettingsResponse.JSON_PROPERTY_PROPERTIES
})

public class AdditionalSettingsResponse {
  public static final String JSON_PROPERTY_EXCLUDE_EVENT_CODES = "excludeEventCodes";
  private List<String> excludeEventCodes = null;

  public static final String JSON_PROPERTY_INCLUDE_EVENT_CODES = "includeEventCodes";
  private List<String> includeEventCodes = null;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, Boolean> properties = null;

  public AdditionalSettingsResponse() { 
  }

  /**
   * Object containing list of event codes for which the notification will not be sent. 
   *
   * @param excludeEventCodes
   * @return the current {@code AdditionalSettingsResponse} instance, allowing for method chaining
   */
  public AdditionalSettingsResponse excludeEventCodes(List<String> excludeEventCodes) {
    this.excludeEventCodes = excludeEventCodes;
    return this;
  }

  public AdditionalSettingsResponse addExcludeEventCodesItem(String excludeEventCodesItem) {
    if (this.excludeEventCodes == null) {
      this.excludeEventCodes = new ArrayList<>();
    }
    this.excludeEventCodes.add(excludeEventCodesItem);
    return this;
  }

  /**
   * Object containing list of event codes for which the notification will not be sent. 
   * @return excludeEventCodes
   */
  @ApiModelProperty(value = "Object containing list of event codes for which the notification will not be sent. ")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludeEventCodes() {
    return excludeEventCodes;
  }

  /**
   * Object containing list of event codes for which the notification will not be sent. 
   *
   * @param excludeEventCodes
   */ 
  @JsonProperty(JSON_PROPERTY_EXCLUDE_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeEventCodes(List<String> excludeEventCodes) {
    this.excludeEventCodes = excludeEventCodes;
  }

  /**
   * Object containing list of event codes for which the notification will be sent. 
   *
   * @param includeEventCodes
   * @return the current {@code AdditionalSettingsResponse} instance, allowing for method chaining
   */
  public AdditionalSettingsResponse includeEventCodes(List<String> includeEventCodes) {
    this.includeEventCodes = includeEventCodes;
    return this;
  }

  public AdditionalSettingsResponse addIncludeEventCodesItem(String includeEventCodesItem) {
    if (this.includeEventCodes == null) {
      this.includeEventCodes = new ArrayList<>();
    }
    this.includeEventCodes.add(includeEventCodesItem);
    return this;
  }

  /**
   * Object containing list of event codes for which the notification will be sent. 
   * @return includeEventCodes
   */
  @ApiModelProperty(value = "Object containing list of event codes for which the notification will be sent. ")
  @JsonProperty(JSON_PROPERTY_INCLUDE_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncludeEventCodes() {
    return includeEventCodes;
  }

  /**
   * Object containing list of event codes for which the notification will be sent. 
   *
   * @param includeEventCodes
   */ 
  @JsonProperty(JSON_PROPERTY_INCLUDE_EVENT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeEventCodes(List<String> includeEventCodes) {
    this.includeEventCodes = includeEventCodes;
  }

  /**
   * Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, &#x60;captureDelayHours&#x60;: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.
   *
   * @param properties
   * @return the current {@code AdditionalSettingsResponse} instance, allowing for method chaining
   */
  public AdditionalSettingsResponse properties(Map<String, Boolean> properties) {
    this.properties = properties;
    return this;
  }

  public AdditionalSettingsResponse putPropertiesItem(String key, Boolean propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, &#x60;captureDelayHours&#x60;: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.
   * @return properties
   */
  @ApiModelProperty(value = "Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, `captureDelayHours`: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Boolean> getProperties() {
    return properties;
  }

  /**
   * Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, &#x60;captureDelayHours&#x60;: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.
   *
   * @param properties
   */ 
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Map<String, Boolean> properties) {
    this.properties = properties;
  }

  /**
   * Return true if this AdditionalSettingsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalSettingsResponse additionalSettingsResponse = (AdditionalSettingsResponse) o;
    return Objects.equals(this.excludeEventCodes, additionalSettingsResponse.excludeEventCodes) &&
        Objects.equals(this.includeEventCodes, additionalSettingsResponse.includeEventCodes) &&
        Objects.equals(this.properties, additionalSettingsResponse.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeEventCodes, includeEventCodes, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSettingsResponse {\n");
    sb.append("    excludeEventCodes: ").append(toIndentedString(excludeEventCodes)).append("\n");
    sb.append("    includeEventCodes: ").append(toIndentedString(includeEventCodes)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
   * Create an instance of AdditionalSettingsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalSettingsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalSettingsResponse
   */
  public static AdditionalSettingsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalSettingsResponse.class);
  }
/**
  * Convert an instance of AdditionalSettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
