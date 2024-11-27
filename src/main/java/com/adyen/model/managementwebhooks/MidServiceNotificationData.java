/*
 * Management Webhooks
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.managementwebhooks;

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
 * MidServiceNotificationData
 */
@JsonPropertyOrder({
  MidServiceNotificationData.JSON_PROPERTY_ALLOWED,
  MidServiceNotificationData.JSON_PROPERTY_ENABLED,
  MidServiceNotificationData.JSON_PROPERTY_ID,
  MidServiceNotificationData.JSON_PROPERTY_MERCHANT_ID,
  MidServiceNotificationData.JSON_PROPERTY_REFERENCE,
  MidServiceNotificationData.JSON_PROPERTY_STATUS,
  MidServiceNotificationData.JSON_PROPERTY_STORE_ID,
  MidServiceNotificationData.JSON_PROPERTY_TYPE,
  MidServiceNotificationData.JSON_PROPERTY_VERIFICATION_STATUS
})

public class MidServiceNotificationData {
  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    CAPABILITYPENDING("capabilityPending"),
    
    DATAREQUIRED("dataRequired"),
    
    UPDATESEXPECTED("updatesExpected");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   */
  public enum VerificationStatusEnum {
    VALID("valid"),
    
    PENDING("pending"),
    
    INVALID("invalid"),
    
    REJECTED("rejected");

    private String value;

    VerificationStatusEnum(String value) {
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
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verificationStatus";
  private VerificationStatusEnum verificationStatus;

  public MidServiceNotificationData() { 
  }

  /**
   * Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
   *
   * @param allowed
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
   * @return allowed
   */
  @ApiModelProperty(value = "Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.")
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowed() {
    return allowed;
  }

  /**
   * Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
   *
   * @param allowed
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   *
   * @param enabled
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
   */
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   *
   * @param enabled
   */ 
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The unique identifier of the resource.
   *
   * @param id
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the resource.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the resource.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The unique identifier of the merchant account.
   *
   * @param merchantId
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The unique identifier of the merchant account.
   * @return merchantId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the merchant account.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantId() {
    return merchantId;
  }

  /**
   * The unique identifier of the merchant account.
   *
   * @param merchantId
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * Your reference for the payment method.
   *
   * @param reference
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the payment method.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the payment method.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the payment method.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
   *
   * @param status
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any.
   *
   * @param storeId
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any.
   * @return storeId
   */
  @ApiModelProperty(value = "The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any.")
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoreId() {
    return storeId;
  }

  /**
   * The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any.
   *
   * @param storeId
   */ 
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   *
   * @param type
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   * @return type
   */
  @ApiModelProperty(required = true, value = "Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   *
   * @param verificationStatus
   * @return the current {@code MidServiceNotificationData} instance, allowing for method chaining
   */
  public MidServiceNotificationData verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   * @return verificationStatus
   */
  @ApiModelProperty(value = "Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   *
   * @param verificationStatus
   */ 
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  /**
   * Return true if this MidServiceNotificationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MidServiceNotificationData midServiceNotificationData = (MidServiceNotificationData) o;
    return Objects.equals(this.allowed, midServiceNotificationData.allowed) &&
        Objects.equals(this.enabled, midServiceNotificationData.enabled) &&
        Objects.equals(this.id, midServiceNotificationData.id) &&
        Objects.equals(this.merchantId, midServiceNotificationData.merchantId) &&
        Objects.equals(this.reference, midServiceNotificationData.reference) &&
        Objects.equals(this.status, midServiceNotificationData.status) &&
        Objects.equals(this.storeId, midServiceNotificationData.storeId) &&
        Objects.equals(this.type, midServiceNotificationData.type) &&
        Objects.equals(this.verificationStatus, midServiceNotificationData.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, enabled, id, merchantId, reference, status, storeId, type, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MidServiceNotificationData {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
   * Create an instance of MidServiceNotificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MidServiceNotificationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to MidServiceNotificationData
   */
  public static MidServiceNotificationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MidServiceNotificationData.class);
  }
/**
  * Convert an instance of MidServiceNotificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}