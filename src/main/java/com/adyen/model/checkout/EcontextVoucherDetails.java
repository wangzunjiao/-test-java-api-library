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
 * EcontextVoucherDetails
 */
@JsonPropertyOrder({
  EcontextVoucherDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  EcontextVoucherDetails.JSON_PROPERTY_FIRST_NAME,
  EcontextVoucherDetails.JSON_PROPERTY_LAST_NAME,
  EcontextVoucherDetails.JSON_PROPERTY_SHOPPER_EMAIL,
  EcontextVoucherDetails.JSON_PROPERTY_TELEPHONE_NUMBER,
  EcontextVoucherDetails.JSON_PROPERTY_TYPE
})
//pojo

public class EcontextVoucherDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  /**
   * **econtextvoucher**
   */
  public enum TypeEnum {
    ECONTEXT_SEVEN_ELEVEN("econtext_seven_eleven"),
    
    ECONTEXT_ONLINE("econtext_online"),
    
    ECONTEXT("econtext"),
    
    ECONTEXT_STORES("econtext_stores"),
    
    ECONTEXT_ATM("econtext_atm");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public EcontextVoucherDetails() { 
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

  /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
   */
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }

  /**
   * The shopper&#39;s first name.
   *
   * @param firstName
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The shopper&#39;s first name.
   * @return firstName
   */
  @ApiModelProperty(required = true, value = "The shopper's first name.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstName() {
    return firstName;
  }

  /**
   * The shopper&#39;s first name.
   *
   * @param firstName
   */ 
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The shopper&#39;s last name.
   *
   * @param lastName
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The shopper&#39;s last name.
   * @return lastName
   */
  @ApiModelProperty(required = true, value = "The shopper's last name.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastName() {
    return lastName;
  }

  /**
   * The shopper&#39;s last name.
   *
   * @param lastName
   */ 
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The shopper&#39;s email.
   *
   * @param shopperEmail
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * The shopper&#39;s email.
   * @return shopperEmail
   */
  @ApiModelProperty(required = true, value = "The shopper's email.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * The shopper&#39;s email.
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * The shopper&#39;s contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.
   *
   * @param telephoneNumber
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * The shopper&#39;s contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.
   * @return telephoneNumber
   */
  @ApiModelProperty(required = true, value = "The shopper's contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * The shopper&#39;s contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * **econtextvoucher**
   *
   * @param type
   * @return the current {@code EcontextVoucherDetails} instance, allowing for method chaining
   */
  public EcontextVoucherDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **econtextvoucher**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**econtextvoucher**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **econtextvoucher**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this EcontextVoucherDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcontextVoucherDetails econtextVoucherDetails = (EcontextVoucherDetails) o;
    return Objects.equals(this.checkoutAttemptId, econtextVoucherDetails.checkoutAttemptId) &&
        Objects.equals(this.firstName, econtextVoucherDetails.firstName) &&
        Objects.equals(this.lastName, econtextVoucherDetails.lastName) &&
        Objects.equals(this.shopperEmail, econtextVoucherDetails.shopperEmail) &&
        Objects.equals(this.telephoneNumber, econtextVoucherDetails.telephoneNumber) &&
        Objects.equals(this.type, econtextVoucherDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, firstName, lastName, shopperEmail, telephoneNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcontextVoucherDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of EcontextVoucherDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EcontextVoucherDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to EcontextVoucherDetails
   */
  public static EcontextVoucherDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, EcontextVoucherDetails.class);
  }
/**
  * Convert an instance of EcontextVoucherDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
