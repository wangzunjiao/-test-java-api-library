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
 * GenericIssuerPaymentMethodDetails
 */
@JsonPropertyOrder({
  GenericIssuerPaymentMethodDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  GenericIssuerPaymentMethodDetails.JSON_PROPERTY_ISSUER,
  GenericIssuerPaymentMethodDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  GenericIssuerPaymentMethodDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  GenericIssuerPaymentMethodDetails.JSON_PROPERTY_TYPE
})
//pojo

public class GenericIssuerPaymentMethodDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated // deprecated since Adyen Checkout API v49: Use `storedPaymentMethodId` instead.
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **genericissuer**
   */
  public enum TypeEnum {
    ONLINEBANKING_PL("onlineBanking_PL"),
    
    EPS("eps"),
    
    ONLINEBANKING_SK("onlineBanking_SK"),
    
    ONLINEBANKING_CZ("onlineBanking_CZ");

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

  public GenericIssuerPaymentMethodDetails() { 
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   * @return the current {@code GenericIssuerPaymentMethodDetails} instance, allowing for method chaining
   */
  public GenericIssuerPaymentMethodDetails checkoutAttemptId(String checkoutAttemptId) {
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
   * The issuer id of the shopper&#39;s selected bank.
   *
   * @param issuer
   * @return the current {@code GenericIssuerPaymentMethodDetails} instance, allowing for method chaining
   */
  public GenericIssuerPaymentMethodDetails issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The issuer id of the shopper&#39;s selected bank.
   * @return issuer
   */
  @ApiModelProperty(required = true, value = "The issuer id of the shopper's selected bank.")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuer() {
    return issuer;
  }

  /**
   * The issuer id of the shopper&#39;s selected bank.
   *
   * @param issuer
   */ 
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   * @return the current {@code GenericIssuerPaymentMethodDetails} instance, allowing for method chaining
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */
  @Deprecated
  public GenericIssuerPaymentMethodDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param storedPaymentMethodId
   * @return the current {@code GenericIssuerPaymentMethodDetails} instance, allowing for method chaining
   */
  public GenericIssuerPaymentMethodDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
   */
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }

  /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param storedPaymentMethodId
   */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }

  /**
   * **genericissuer**
   *
   * @param type
   * @return the current {@code GenericIssuerPaymentMethodDetails} instance, allowing for method chaining
   */
  public GenericIssuerPaymentMethodDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **genericissuer**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**genericissuer**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **genericissuer**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this GenericIssuerPaymentMethodDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericIssuerPaymentMethodDetails genericIssuerPaymentMethodDetails = (GenericIssuerPaymentMethodDetails) o;
    return Objects.equals(this.checkoutAttemptId, genericIssuerPaymentMethodDetails.checkoutAttemptId) &&
        Objects.equals(this.issuer, genericIssuerPaymentMethodDetails.issuer) &&
        Objects.equals(this.recurringDetailReference, genericIssuerPaymentMethodDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, genericIssuerPaymentMethodDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, genericIssuerPaymentMethodDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, issuer, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericIssuerPaymentMethodDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of GenericIssuerPaymentMethodDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenericIssuerPaymentMethodDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to GenericIssuerPaymentMethodDetails
   */
  public static GenericIssuerPaymentMethodDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GenericIssuerPaymentMethodDetails.class);
  }
/**
  * Convert an instance of GenericIssuerPaymentMethodDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
