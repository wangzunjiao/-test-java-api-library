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
import com.adyen.model.management.Name;
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
 * CreateCompanyUserRequest
 */
@JsonPropertyOrder({
  CreateCompanyUserRequest.JSON_PROPERTY_ACCOUNT_GROUPS,
  CreateCompanyUserRequest.JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS,
  CreateCompanyUserRequest.JSON_PROPERTY_EMAIL,
  CreateCompanyUserRequest.JSON_PROPERTY_LOGIN_METHOD,
  CreateCompanyUserRequest.JSON_PROPERTY_NAME,
  CreateCompanyUserRequest.JSON_PROPERTY_ROLES,
  CreateCompanyUserRequest.JSON_PROPERTY_TIME_ZONE_CODE,
  CreateCompanyUserRequest.JSON_PROPERTY_USERNAME
})
//pojo

public class CreateCompanyUserRequest {
  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups = null;

  public static final String JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  private List<String> associatedMerchantAccounts = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_LOGIN_METHOD = "loginMethod";
  private String loginMethod;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public static final String JSON_PROPERTY_TIME_ZONE_CODE = "timeZoneCode";
  private String timeZoneCode;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CreateCompanyUserRequest() { 
  }

  /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   *
   * @param accountGroups
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public CreateCompanyUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

  /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
   */
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountGroups() {
    return accountGroups;
  }

  /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   *
   * @param accountGroups
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }

  /**
   * The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
   *
   * @param associatedMerchantAccounts
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CreateCompanyUserRequest addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

  /**
   * The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
   * @return associatedMerchantAccounts
   */
  @ApiModelProperty(value = "The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }

  /**
   * The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
   *
   * @param associatedMerchantAccounts
   */ 
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }

  /**
   * The email address of the user.
   *
   * @param email
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user.
   * @return email
   */
  @ApiModelProperty(required = true, value = "The email address of the user.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  /**
   * The email address of the user.
   *
   * @param email
   */ 
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The requested login method for the user. To use SSO, you must already have SSO configured with Adyen before creating the user.  Possible values: **Username &amp; account**, **Email**, or **SSO** 
   *
   * @param loginMethod
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest loginMethod(String loginMethod) {
    this.loginMethod = loginMethod;
    return this;
  }

  /**
   * The requested login method for the user. To use SSO, you must already have SSO configured with Adyen before creating the user.  Possible values: **Username &amp; account**, **Email**, or **SSO** 
   * @return loginMethod
   */
  @ApiModelProperty(value = "The requested login method for the user. To use SSO, you must already have SSO configured with Adyen before creating the user.  Possible values: **Username & account**, **Email**, or **SSO** ")
  @JsonProperty(JSON_PROPERTY_LOGIN_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLoginMethod() {
    return loginMethod;
  }

  /**
   * The requested login method for the user. To use SSO, you must already have SSO configured with Adyen before creating the user.  Possible values: **Username &amp; account**, **Email**, or **SSO** 
   *
   * @param loginMethod
   */ 
  @JsonProperty(JSON_PROPERTY_LOGIN_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginMethod(String loginMethod) {
    this.loginMethod = loginMethod;
  }

  /**
   * name
   *
   * @param name
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Name getName() {
    return name;
  }

  /**
   * name
   *
   * @param name
   */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }

  /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   *
   * @param roles
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CreateCompanyUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
   */
  @ApiModelProperty(value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRoles() {
    return roles;
  }

  /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   *
   * @param roles
   */ 
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   *
   * @param timeZoneCode
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

  /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
   */
  @ApiModelProperty(value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeZoneCode() {
    return timeZoneCode;
  }

  /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   *
   * @param timeZoneCode
   */ 
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }

  /**
   * The user&#39;s email address that will be their username. Must be the same as the one in the &#x60;email&#x60; field.
   *
   * @param username
   * @return the current {@code CreateCompanyUserRequest} instance, allowing for method chaining
   */
  public CreateCompanyUserRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The user&#39;s email address that will be their username. Must be the same as the one in the &#x60;email&#x60; field.
   * @return username
   */
  @ApiModelProperty(required = true, value = "The user's email address that will be their username. Must be the same as the one in the `email` field.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }

  /**
   * The user&#39;s email address that will be their username. Must be the same as the one in the &#x60;email&#x60; field.
   *
   * @param username
   */ 
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Return true if this CreateCompanyUserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyUserRequest createCompanyUserRequest = (CreateCompanyUserRequest) o;
    return Objects.equals(this.accountGroups, createCompanyUserRequest.accountGroups) &&
        Objects.equals(this.associatedMerchantAccounts, createCompanyUserRequest.associatedMerchantAccounts) &&
        Objects.equals(this.email, createCompanyUserRequest.email) &&
        Objects.equals(this.loginMethod, createCompanyUserRequest.loginMethod) &&
        Objects.equals(this.name, createCompanyUserRequest.name) &&
        Objects.equals(this.roles, createCompanyUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, createCompanyUserRequest.timeZoneCode) &&
        Objects.equals(this.username, createCompanyUserRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, associatedMerchantAccounts, email, loginMethod, name, roles, timeZoneCode, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    loginMethod: ").append(toIndentedString(loginMethod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
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
   * Create an instance of CreateCompanyUserRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCompanyUserRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateCompanyUserRequest
   */
  public static CreateCompanyUserRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateCompanyUserRequest.class);
  }
/**
  * Convert an instance of CreateCompanyUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
