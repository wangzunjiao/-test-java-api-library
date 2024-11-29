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
 * AncvDetails
 */
@JsonPropertyOrder({
  AncvDetails.JSON_PROPERTY_BENEFICIARY_ID,
  AncvDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  AncvDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  AncvDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  AncvDetails.JSON_PROPERTY_TYPE
})
//pojo

public class AncvDetails {
  public static final String JSON_PROPERTY_BENEFICIARY_ID = "beneficiaryId";
  private String beneficiaryId;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated // deprecated since Adyen Checkout API v49: Use `storedPaymentMethodId` instead.
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **ancv**
   */
  public enum TypeEnum {
    ANCV("ancv");

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

  public AncvDetails() { 
  }

  /**
   * ANCV account identification (email or account number)
   *
   * @param beneficiaryId
   * @return the current {@code AncvDetails} instance, allowing for method chaining
   */
  public AncvDetails beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * ANCV account identification (email or account number)
   * @return beneficiaryId
   */
  @ApiModelProperty(value = "ANCV account identification (email or account number)")
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  /**
   * ANCV account identification (email or account number)
   *
   * @param beneficiaryId
   */ 
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  /**
   * The checkout attempt identifier.
   *
   * @param checkoutAttemptId
   * @return the current {@code AncvDetails} instance, allowing for method chaining
   */
  public AncvDetails checkoutAttemptId(String checkoutAttemptId) {
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
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   *
   * @param recurringDetailReference
   * @return the current {@code AncvDetails} instance, allowing for method chaining
   *
   * @deprecated since Adyen Checkout API v49
   * Use &#x60;storedPaymentMethodId&#x60; instead.
   */
  @Deprecated
  public AncvDetails recurringDetailReference(String recurringDetailReference) {
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
   * @return the current {@code AncvDetails} instance, allowing for method chaining
   */
  public AncvDetails storedPaymentMethodId(String storedPaymentMethodId) {
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
   * **ancv**
   *
   * @param type
   * @return the current {@code AncvDetails} instance, allowing for method chaining
   */
  public AncvDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **ancv**
   * @return type
   */
  @ApiModelProperty(value = "**ancv**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **ancv**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this AncvDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AncvDetails ancvDetails = (AncvDetails) o;
    return Objects.equals(this.beneficiaryId, ancvDetails.beneficiaryId) &&
        Objects.equals(this.checkoutAttemptId, ancvDetails.checkoutAttemptId) &&
        Objects.equals(this.recurringDetailReference, ancvDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, ancvDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, ancvDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryId, checkoutAttemptId, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncvDetails {\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
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
   * Create an instance of AncvDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AncvDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to AncvDetails
   */
  public static AncvDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AncvDetails.class);
  }
/**
  * Convert an instance of AncvDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
