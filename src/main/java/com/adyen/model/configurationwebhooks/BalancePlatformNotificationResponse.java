/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

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
 * BalancePlatformNotificationResponse
 */
@JsonPropertyOrder({
  BalancePlatformNotificationResponse.JSON_PROPERTY_NOTIFICATION_RESPONSE
})

public class BalancePlatformNotificationResponse {
  public static final String JSON_PROPERTY_NOTIFICATION_RESPONSE = "notificationResponse";
  private String notificationResponse;

  public BalancePlatformNotificationResponse() { 
  }

  /**
   * Respond with any **2xx** HTTP status code to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).
   *
   * @param notificationResponse
   * @return the current {@code BalancePlatformNotificationResponse} instance, allowing for method chaining
   */
  public BalancePlatformNotificationResponse notificationResponse(String notificationResponse) {
    this.notificationResponse = notificationResponse;
    return this;
  }

  /**
   * Respond with any **2xx** HTTP status code to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).
   * @return notificationResponse
   */
  @ApiModelProperty(value = "Respond with any **2xx** HTTP status code to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotificationResponse() {
    return notificationResponse;
  }

  /**
   * Respond with any **2xx** HTTP status code to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).
   *
   * @param notificationResponse
   */ 
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationResponse(String notificationResponse) {
    this.notificationResponse = notificationResponse;
  }

  /**
   * Return true if this BalancePlatformNotificationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePlatformNotificationResponse balancePlatformNotificationResponse = (BalancePlatformNotificationResponse) o;
    return Objects.equals(this.notificationResponse, balancePlatformNotificationResponse.notificationResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePlatformNotificationResponse {\n");
    sb.append("    notificationResponse: ").append(toIndentedString(notificationResponse)).append("\n");
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
   * Create an instance of BalancePlatformNotificationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalancePlatformNotificationResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalancePlatformNotificationResponse
   */
  public static BalancePlatformNotificationResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalancePlatformNotificationResponse.class);
  }
/**
  * Convert an instance of BalancePlatformNotificationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
