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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BulkAddress
 */
@JsonPropertyOrder({
  BulkAddress.JSON_PROPERTY_CITY,
  BulkAddress.JSON_PROPERTY_COMPANY,
  BulkAddress.JSON_PROPERTY_COUNTRY,
  BulkAddress.JSON_PROPERTY_EMAIL,
  BulkAddress.JSON_PROPERTY_HOUSE_NUMBER_OR_NAME,
  BulkAddress.JSON_PROPERTY_MOBILE,
  BulkAddress.JSON_PROPERTY_POSTAL_CODE,
  BulkAddress.JSON_PROPERTY_STATE_OR_PROVINCE,
  BulkAddress.JSON_PROPERTY_STREET
})
//pojo

public class BulkAddress {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
  private String houseNumberOrName;

  public static final String JSON_PROPERTY_MOBILE = "mobile";
  private String mobile;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "stateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public BulkAddress() { 
  }

  /**
   * The name of the city.
   *
   * @param city
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The name of the city.
   * @return city
   */
  @ApiModelProperty(value = "The name of the city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }

  /**
   * The name of the city.
   *
   * @param city
   */ 
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The name of the company.
   *
   * @param company
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The name of the company.
   * @return company
   */
  @ApiModelProperty(value = "The name of the company.")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompany() {
    return company;
  }

  /**
   * The name of the company.
   *
   * @param company
   */ 
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
   *
   * @param country
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
   * @return country
   */
  @ApiModelProperty(required = true, value = "The two-character ISO-3166-1 alpha-2 country code. For example, **US**.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
   *
   * @param country
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The email address.
   *
   * @param email
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address.
   * @return email
   */
  @ApiModelProperty(value = "The email address.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  /**
   * The email address.
   *
   * @param email
   */ 
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The house number or name.
   *
   * @param houseNumberOrName
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

  /**
   * The house number or name.
   * @return houseNumberOrName
   */
  @ApiModelProperty(value = "The house number or name.")
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }

  /**
   * The house number or name.
   *
   * @param houseNumberOrName
   */ 
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }

  /**
   * The full telephone number.
   *
   * @param mobile
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * The full telephone number.
   * @return mobile
   */
  @ApiModelProperty(value = "The full telephone number.")
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMobile() {
    return mobile;
  }

  /**
   * The full telephone number.
   *
   * @param mobile
   */ 
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   *
   * @param postalCode
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   * @return postalCode
   */
  @ApiModelProperty(value = "The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   *
   * @param postalCode
   */ 
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
   *
   * @param stateOrProvince
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
   * @return stateOrProvince
   */
  @ApiModelProperty(value = "The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  /**
   * The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
   *
   * @param stateOrProvince
   */ 
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  /**
   * The streetname of the house.
   *
   * @param street
   * @return the current {@code BulkAddress} instance, allowing for method chaining
   */
  public BulkAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * The streetname of the house.
   * @return street
   */
  @ApiModelProperty(value = "The streetname of the house.")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStreet() {
    return street;
  }

  /**
   * The streetname of the house.
   *
   * @param street
   */ 
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Return true if this BulkAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkAddress bulkAddress = (BulkAddress) o;
    return Objects.equals(this.city, bulkAddress.city) &&
        Objects.equals(this.company, bulkAddress.company) &&
        Objects.equals(this.country, bulkAddress.country) &&
        Objects.equals(this.email, bulkAddress.email) &&
        Objects.equals(this.houseNumberOrName, bulkAddress.houseNumberOrName) &&
        Objects.equals(this.mobile, bulkAddress.mobile) &&
        Objects.equals(this.postalCode, bulkAddress.postalCode) &&
        Objects.equals(this.stateOrProvince, bulkAddress.stateOrProvince) &&
        Objects.equals(this.street, bulkAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, company, country, email, houseNumberOrName, mobile, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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
   * Create an instance of BulkAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkAddress
   * @throws JsonProcessingException if the JSON string is invalid with respect to BulkAddress
   */
  public static BulkAddress fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BulkAddress.class);
  }
/**
  * Convert an instance of BulkAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
