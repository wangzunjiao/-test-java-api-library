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
 * OnboardingLink
 */
@JsonPropertyOrder({
  OnboardingLink.JSON_PROPERTY_URL
})

public class OnboardingLink {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public OnboardingLink() { 
  }

  /**
   * The URL of the hosted onboarding page where you need to redirect your user. This URL expires after 4 minutes and can only be used once.  If the link expires, you need to create a new link.
   *
   * @param url
   * @return the current {@code OnboardingLink} instance, allowing for method chaining
   */
  public OnboardingLink url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the hosted onboarding page where you need to redirect your user. This URL expires after 4 minutes and can only be used once.  If the link expires, you need to create a new link.
   * @return url
   */
  @ApiModelProperty(value = "The URL of the hosted onboarding page where you need to redirect your user. This URL expires after 4 minutes and can only be used once.  If the link expires, you need to create a new link.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  /**
   * The URL of the hosted onboarding page where you need to redirect your user. This URL expires after 4 minutes and can only be used once.  If the link expires, you need to create a new link.
   *
   * @param url
   */ 
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Return true if this OnboardingLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingLink onboardingLink = (OnboardingLink) o;
    return Objects.equals(this.url, onboardingLink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingLink {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Create an instance of OnboardingLink given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingLink
   * @throws JsonProcessingException if the JSON string is invalid with respect to OnboardingLink
   */
  public static OnboardingLink fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, OnboardingLink.class);
  }
/**
  * Convert an instance of OnboardingLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
