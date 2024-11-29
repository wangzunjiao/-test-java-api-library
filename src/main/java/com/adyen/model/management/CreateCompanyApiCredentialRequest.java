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
 * CreateCompanyApiCredentialRequest
 */
@JsonPropertyOrder({
  CreateCompanyApiCredentialRequest.JSON_PROPERTY_ALLOWED_ORIGINS,
  CreateCompanyApiCredentialRequest.JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS,
  CreateCompanyApiCredentialRequest.JSON_PROPERTY_DESCRIPTION,
  CreateCompanyApiCredentialRequest.JSON_PROPERTY_ROLES
})
//pojo

public class CreateCompanyApiCredentialRequest {
  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowedOrigins";
  private List<String> allowedOrigins = null;

  public static final String JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  private List<String> associatedMerchantAccounts = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public CreateCompanyApiCredentialRequest() { 
  }

  /**
   * List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.
   *
   * @param allowedOrigins
   * @return the current {@code CreateCompanyApiCredentialRequest} instance, allowing for method chaining
   */
  public CreateCompanyApiCredentialRequest allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CreateCompanyApiCredentialRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

  /**
   * List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.
   * @return allowedOrigins
   */
  @ApiModelProperty(value = "List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }

  /**
   * List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.
   *
   * @param allowedOrigins
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  /**
   * List of merchant accounts that the API credential has access to.
   *
   * @param associatedMerchantAccounts
   * @return the current {@code CreateCompanyApiCredentialRequest} instance, allowing for method chaining
   */
  public CreateCompanyApiCredentialRequest associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CreateCompanyApiCredentialRequest addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

  /**
   * List of merchant accounts that the API credential has access to.
   * @return associatedMerchantAccounts
   */
  @ApiModelProperty(value = "List of merchant accounts that the API credential has access to.")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }

  /**
   * List of merchant accounts that the API credential has access to.
   *
   * @param associatedMerchantAccounts
   */ 
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }

  /**
   * Description of the API credential.
   *
   * @param description
   * @return the current {@code CreateCompanyApiCredentialRequest} instance, allowing for method chaining
   */
  public CreateCompanyApiCredentialRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the API credential.
   * @return description
   */
  @ApiModelProperty(value = "Description of the API credential.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * Description of the API credential.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to &#39;ws@Company.&lt;CompanyName&gt;&#39; can be assigned to other API credentials.
   *
   * @param roles
   * @return the current {@code CreateCompanyApiCredentialRequest} instance, allowing for method chaining
   */
  public CreateCompanyApiCredentialRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CreateCompanyApiCredentialRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to &#39;ws@Company.&lt;CompanyName&gt;&#39; can be assigned to other API credentials.
   * @return roles
   */
  @ApiModelProperty(value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to 'ws@Company.<CompanyName>' can be assigned to other API credentials.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRoles() {
    return roles;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to &#39;ws@Company.&lt;CompanyName&gt;&#39; can be assigned to other API credentials.
   *
   * @param roles
   */ 
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * Return true if this CreateCompanyApiCredentialRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyApiCredentialRequest createCompanyApiCredentialRequest = (CreateCompanyApiCredentialRequest) o;
    return Objects.equals(this.allowedOrigins, createCompanyApiCredentialRequest.allowedOrigins) &&
        Objects.equals(this.associatedMerchantAccounts, createCompanyApiCredentialRequest.associatedMerchantAccounts) &&
        Objects.equals(this.description, createCompanyApiCredentialRequest.description) &&
        Objects.equals(this.roles, createCompanyApiCredentialRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOrigins, associatedMerchantAccounts, description, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyApiCredentialRequest {\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
   * Create an instance of CreateCompanyApiCredentialRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCompanyApiCredentialRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateCompanyApiCredentialRequest
   */
  public static CreateCompanyApiCredentialRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateCompanyApiCredentialRequest.class);
  }
/**
  * Convert an instance of CreateCompanyApiCredentialRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
