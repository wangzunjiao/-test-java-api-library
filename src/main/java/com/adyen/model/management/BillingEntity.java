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
import com.adyen.model.management.Address;
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
 * BillingEntity
 */
@JsonPropertyOrder({
  BillingEntity.JSON_PROPERTY_ADDRESS,
  BillingEntity.JSON_PROPERTY_EMAIL,
  BillingEntity.JSON_PROPERTY_ID,
  BillingEntity.JSON_PROPERTY_NAME,
  BillingEntity.JSON_PROPERTY_TAX_ID
})

public class BillingEntity {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public BillingEntity() { 
  }

  /**
   * address
   *
   * @param address
   * @return the current {@code BillingEntity} instance, allowing for method chaining
   */
  public BillingEntity address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * address
   * @return address
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getAddress() {
    return address;
  }

  /**
   * address
   *
   * @param address
   */ 
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * The email address of the billing entity.
   *
   * @param email
   * @return the current {@code BillingEntity} instance, allowing for method chaining
   */
  public BillingEntity email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the billing entity.
   * @return email
   */
  @ApiModelProperty(value = "The email address of the billing entity.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  /**
   * The email address of the billing entity.
   *
   * @param email
   */ 
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The unique identifier of the billing entity, for use as &#x60;billingEntityId&#x60; when creating an order.
   *
   * @param id
   * @return the current {@code BillingEntity} instance, allowing for method chaining
   */
  public BillingEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the billing entity, for use as &#x60;billingEntityId&#x60; when creating an order.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the billing entity, for use as `billingEntityId` when creating an order.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the billing entity, for use as &#x60;billingEntityId&#x60; when creating an order.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The unique name of the billing entity.
   *
   * @param name
   * @return the current {@code BillingEntity} instance, allowing for method chaining
   */
  public BillingEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the billing entity.
   * @return name
   */
  @ApiModelProperty(value = "The unique name of the billing entity.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * The unique name of the billing entity.
   *
   * @param name
   */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The tax number of the billing entity.
   *
   * @param taxId
   * @return the current {@code BillingEntity} instance, allowing for method chaining
   */
  public BillingEntity taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * The tax number of the billing entity.
   * @return taxId
   */
  @ApiModelProperty(value = "The tax number of the billing entity.")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaxId() {
    return taxId;
  }

  /**
   * The tax number of the billing entity.
   *
   * @param taxId
   */ 
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  /**
   * Return true if this BillingEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingEntity billingEntity = (BillingEntity) o;
    return Objects.equals(this.address, billingEntity.address) &&
        Objects.equals(this.email, billingEntity.email) &&
        Objects.equals(this.id, billingEntity.id) &&
        Objects.equals(this.name, billingEntity.name) &&
        Objects.equals(this.taxId, billingEntity.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, id, name, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingEntity {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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
   * Create an instance of BillingEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingEntity
   * @throws JsonProcessingException if the JSON string is invalid with respect to BillingEntity
   */
  public static BillingEntity fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BillingEntity.class);
  }
/**
  * Convert an instance of BillingEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}