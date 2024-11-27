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
import com.adyen.model.management.AllowedOrigin;
import com.adyen.model.management.ApiCredentialLinks;
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
 * CreateApiCredentialResponse
 */
@JsonPropertyOrder({
  CreateApiCredentialResponse.JSON_PROPERTY_LINKS,
  CreateApiCredentialResponse.JSON_PROPERTY_ACTIVE,
  CreateApiCredentialResponse.JSON_PROPERTY_ALLOWED_IP_ADDRESSES,
  CreateApiCredentialResponse.JSON_PROPERTY_ALLOWED_ORIGINS,
  CreateApiCredentialResponse.JSON_PROPERTY_API_KEY,
  CreateApiCredentialResponse.JSON_PROPERTY_CLIENT_KEY,
  CreateApiCredentialResponse.JSON_PROPERTY_DESCRIPTION,
  CreateApiCredentialResponse.JSON_PROPERTY_ID,
  CreateApiCredentialResponse.JSON_PROPERTY_PASSWORD,
  CreateApiCredentialResponse.JSON_PROPERTY_ROLES,
  CreateApiCredentialResponse.JSON_PROPERTY_USERNAME
})

public class CreateApiCredentialResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private ApiCredentialLinks links;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ALLOWED_IP_ADDRESSES = "allowedIpAddresses";
  private List<String> allowedIpAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowedOrigins";
  private List<AllowedOrigin> allowedOrigins = null;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_CLIENT_KEY = "clientKey";
  private String clientKey;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = new ArrayList<>();

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CreateApiCredentialResponse() { 
  }

  /**
   * links
   *
   * @param links
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse links(ApiCredentialLinks links) {
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
  public ApiCredentialLinks getLinks() {
    return links;
  }

  /**
   * links
   *
   * @param links
   */ 
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(ApiCredentialLinks links) {
    this.links = links;
  }

  /**
   * Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.
   *
   * @param active
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.
   * @return active
   */
  @ApiModelProperty(required = true, value = "Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }

  /**
   * Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.
   *
   * @param active
   */ 
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.
   *
   * @param allowedIpAddresses
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse allowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public CreateApiCredentialResponse addAllowedIpAddressesItem(String allowedIpAddressesItem) {
    this.allowedIpAddresses.add(allowedIpAddressesItem);
    return this;
  }

  /**
   * List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.
   * @return allowedIpAddresses
   */
  @ApiModelProperty(required = true, value = "List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }

  /**
   * List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.
   *
   * @param allowedIpAddresses
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
  }

  /**
   * List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.
   *
   * @param allowedOrigins
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse allowedOrigins(List<AllowedOrigin> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CreateApiCredentialResponse addAllowedOriginsItem(AllowedOrigin allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

  /**
   * List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.
   * @return allowedOrigins
   */
  @ApiModelProperty(value = "List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AllowedOrigin> getAllowedOrigins() {
    return allowedOrigins;
  }

  /**
   * List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.
   *
   * @param allowedOrigins
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrigins(List<AllowedOrigin> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  /**
   * The API key for the API credential that was created.
   *
   * @param apiKey
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key for the API credential that was created.
   * @return apiKey
   */
  @ApiModelProperty(required = true, value = "The API key for the API credential that was created.")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiKey() {
    return apiKey;
  }

  /**
   * The API key for the API credential that was created.
   *
   * @param apiKey
   */ 
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.
   *
   * @param clientKey
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

  /**
   * Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.
   * @return clientKey
   */
  @ApiModelProperty(required = true, value = "Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.")
  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientKey() {
    return clientKey;
  }

  /**
   * Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.
   *
   * @param clientKey
   */ 
  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  /**
   * Description of the API credential.
   *
   * @param description
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse description(String description) {
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
   * Unique identifier of the API credential.
   *
   * @param id
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the API credential.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Unique identifier of the API credential.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * Unique identifier of the API credential.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The password for the API credential that was created.
   *
   * @param password
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for the API credential that was created.
   * @return password
   */
  @ApiModelProperty(required = true, value = "The password for the API credential that was created.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }

  /**
   * The password for the API credential that was created.
   *
   * @param password
   */ 
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.
   *
   * @param roles
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CreateApiCredentialResponse addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.
   * @return roles
   */
  @ApiModelProperty(required = true, value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRoles() {
    return roles;
  }

  /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.
   *
   * @param roles
   */ 
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.
   *
   * @param username
   * @return the current {@code CreateApiCredentialResponse} instance, allowing for method chaining
   */
  public CreateApiCredentialResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.
   * @return username
   */
  @ApiModelProperty(required = true, value = "The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }

  /**
   * The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.
   *
   * @param username
   */ 
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Return true if this CreateApiCredentialResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiCredentialResponse createApiCredentialResponse = (CreateApiCredentialResponse) o;
    return Objects.equals(this.links, createApiCredentialResponse.links) &&
        Objects.equals(this.active, createApiCredentialResponse.active) &&
        Objects.equals(this.allowedIpAddresses, createApiCredentialResponse.allowedIpAddresses) &&
        Objects.equals(this.allowedOrigins, createApiCredentialResponse.allowedOrigins) &&
        Objects.equals(this.apiKey, createApiCredentialResponse.apiKey) &&
        Objects.equals(this.clientKey, createApiCredentialResponse.clientKey) &&
        Objects.equals(this.description, createApiCredentialResponse.description) &&
        Objects.equals(this.id, createApiCredentialResponse.id) &&
        Objects.equals(this.password, createApiCredentialResponse.password) &&
        Objects.equals(this.roles, createApiCredentialResponse.roles) &&
        Objects.equals(this.username, createApiCredentialResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, active, allowedIpAddresses, allowedOrigins, apiKey, clientKey, description, id, password, roles, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiCredentialResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    allowedIpAddresses: ").append(toIndentedString(allowedIpAddresses)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
   * Create an instance of CreateApiCredentialResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateApiCredentialResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateApiCredentialResponse
   */
  public static CreateApiCredentialResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateApiCredentialResponse.class);
  }
/**
  * Convert an instance of CreateApiCredentialResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
