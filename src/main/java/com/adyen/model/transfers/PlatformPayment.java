/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * PlatformPayment
 */
@JsonPropertyOrder({
  PlatformPayment.JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE,
  PlatformPayment.JSON_PROPERTY_MODIFICATION_PSP_REFERENCE,
  PlatformPayment.JSON_PROPERTY_PAYMENT_MERCHANT_REFERENCE,
  PlatformPayment.JSON_PROPERTY_PLATFORM_PAYMENT_TYPE,
  PlatformPayment.JSON_PROPERTY_PSP_PAYMENT_REFERENCE,
  PlatformPayment.JSON_PROPERTY_TYPE
})

public class PlatformPayment {
  public static final String JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE = "modificationMerchantReference";
  private String modificationMerchantReference;

  public static final String JSON_PROPERTY_MODIFICATION_PSP_REFERENCE = "modificationPspReference";
  private String modificationPspReference;

  public static final String JSON_PROPERTY_PAYMENT_MERCHANT_REFERENCE = "paymentMerchantReference";
  private String paymentMerchantReference;

  /**
   * The type of the related split.
   */
  public enum PlatformPaymentTypeEnum {
    ACQUIRINGFEES("AcquiringFees"),
    
    ADYENCOMMISSION("AdyenCommission"),
    
    ADYENFEES("AdyenFees"),
    
    ADYENMARKUP("AdyenMarkup"),
    
    BALANCEACCOUNT("BalanceAccount"),
    
    COMMISSION("Commission"),
    
    DEFAULT("Default"),
    
    INTERCHANGE("Interchange"),
    
    PAYMENTFEE("PaymentFee"),
    
    REMAINDER("Remainder"),
    
    SCHEMEFEE("SchemeFee"),
    
    SURCHARGE("Surcharge"),
    
    TIP("Tip"),
    
    TOPUP("TopUp"),
    
    VAT("VAT");

    private String value;

    PlatformPaymentTypeEnum(String value) {
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
    public static PlatformPaymentTypeEnum fromValue(String value) {
      for (PlatformPaymentTypeEnum b : PlatformPaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PLATFORM_PAYMENT_TYPE = "platformPaymentType";
  private PlatformPaymentTypeEnum platformPaymentType;

  public static final String JSON_PROPERTY_PSP_PAYMENT_REFERENCE = "pspPaymentReference";
  private String pspPaymentReference;

  /**
   * **platformPayment**
   */
  public enum TypeEnum {
    PLATFORMPAYMENT("platformPayment");

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

  public PlatformPayment() { 
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   *
   * @param modificationMerchantReference
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment modificationMerchantReference(String modificationMerchantReference) {
    this.modificationMerchantReference = modificationMerchantReference;
    return this;
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   * @return modificationMerchantReference
   */
  @ApiModelProperty(value = "The capture's merchant reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModificationMerchantReference() {
    return modificationMerchantReference;
  }

  /**
   * The capture&#39;s merchant reference included in the transfer.
   *
   * @param modificationMerchantReference
   */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationMerchantReference(String modificationMerchantReference) {
    this.modificationMerchantReference = modificationMerchantReference;
  }

  /**
   * The capture reference included in the transfer.
   *
   * @param modificationPspReference
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment modificationPspReference(String modificationPspReference) {
    this.modificationPspReference = modificationPspReference;
    return this;
  }

  /**
   * The capture reference included in the transfer.
   * @return modificationPspReference
   */
  @ApiModelProperty(value = "The capture reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModificationPspReference() {
    return modificationPspReference;
  }

  /**
   * The capture reference included in the transfer.
   *
   * @param modificationPspReference
   */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationPspReference(String modificationPspReference) {
    this.modificationPspReference = modificationPspReference;
  }

  /**
   * The payment&#39;s merchant reference included in the transfer.
   *
   * @param paymentMerchantReference
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment paymentMerchantReference(String paymentMerchantReference) {
    this.paymentMerchantReference = paymentMerchantReference;
    return this;
  }

  /**
   * The payment&#39;s merchant reference included in the transfer.
   * @return paymentMerchantReference
   */
  @ApiModelProperty(value = "The payment's merchant reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentMerchantReference() {
    return paymentMerchantReference;
  }

  /**
   * The payment&#39;s merchant reference included in the transfer.
   *
   * @param paymentMerchantReference
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMerchantReference(String paymentMerchantReference) {
    this.paymentMerchantReference = paymentMerchantReference;
  }

  /**
   * The type of the related split.
   *
   * @param platformPaymentType
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment platformPaymentType(PlatformPaymentTypeEnum platformPaymentType) {
    this.platformPaymentType = platformPaymentType;
    return this;
  }

  /**
   * The type of the related split.
   * @return platformPaymentType
   */
  @ApiModelProperty(value = "The type of the related split.")
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PlatformPaymentTypeEnum getPlatformPaymentType() {
    return platformPaymentType;
  }

  /**
   * The type of the related split.
   *
   * @param platformPaymentType
   */ 
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformPaymentType(PlatformPaymentTypeEnum platformPaymentType) {
    this.platformPaymentType = platformPaymentType;
  }

  /**
   * The payment reference included in the transfer.
   *
   * @param pspPaymentReference
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment pspPaymentReference(String pspPaymentReference) {
    this.pspPaymentReference = pspPaymentReference;
    return this;
  }

  /**
   * The payment reference included in the transfer.
   * @return pspPaymentReference
   */
  @ApiModelProperty(value = "The payment reference included in the transfer.")
  @JsonProperty(JSON_PROPERTY_PSP_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspPaymentReference() {
    return pspPaymentReference;
  }

  /**
   * The payment reference included in the transfer.
   *
   * @param pspPaymentReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspPaymentReference(String pspPaymentReference) {
    this.pspPaymentReference = pspPaymentReference;
  }

  /**
   * **platformPayment**
   *
   * @param type
   * @return the current {@code PlatformPayment} instance, allowing for method chaining
   */
  public PlatformPayment type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **platformPayment**
   * @return type
   */
  @ApiModelProperty(value = "**platformPayment**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **platformPayment**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this PlatformPayment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformPayment platformPayment = (PlatformPayment) o;
    return Objects.equals(this.modificationMerchantReference, platformPayment.modificationMerchantReference) &&
        Objects.equals(this.modificationPspReference, platformPayment.modificationPspReference) &&
        Objects.equals(this.paymentMerchantReference, platformPayment.paymentMerchantReference) &&
        Objects.equals(this.platformPaymentType, platformPayment.platformPaymentType) &&
        Objects.equals(this.pspPaymentReference, platformPayment.pspPaymentReference) &&
        Objects.equals(this.type, platformPayment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modificationMerchantReference, modificationPspReference, paymentMerchantReference, platformPaymentType, pspPaymentReference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformPayment {\n");
    sb.append("    modificationMerchantReference: ").append(toIndentedString(modificationMerchantReference)).append("\n");
    sb.append("    modificationPspReference: ").append(toIndentedString(modificationPspReference)).append("\n");
    sb.append("    paymentMerchantReference: ").append(toIndentedString(paymentMerchantReference)).append("\n");
    sb.append("    platformPaymentType: ").append(toIndentedString(platformPaymentType)).append("\n");
    sb.append("    pspPaymentReference: ").append(toIndentedString(pspPaymentReference)).append("\n");
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
   * Create an instance of PlatformPayment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlatformPayment
   * @throws JsonProcessingException if the JSON string is invalid with respect to PlatformPayment
   */
  public static PlatformPayment fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PlatformPayment.class);
  }
/**
  * Convert an instance of PlatformPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
