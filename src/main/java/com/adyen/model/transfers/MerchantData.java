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
import com.adyen.model.transfers.NameLocation;
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
 * MerchantData
 */
@JsonPropertyOrder({
  MerchantData.JSON_PROPERTY_ACQUIRER_ID,
  MerchantData.JSON_PROPERTY_MCC,
  MerchantData.JSON_PROPERTY_MERCHANT_ID,
  MerchantData.JSON_PROPERTY_NAME_LOCATION,
  MerchantData.JSON_PROPERTY_POSTAL_CODE
})

public class MerchantData {
  public static final String JSON_PROPERTY_ACQUIRER_ID = "acquirerId";
  private String acquirerId;

  public static final String JSON_PROPERTY_MCC = "mcc";
  private String mcc;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_NAME_LOCATION = "nameLocation";
  private NameLocation nameLocation;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public MerchantData() { 
  }

  /**
   * The unique identifier of the merchant&#39;s acquirer.
   *
   * @param acquirerId
   * @return the current {@code MerchantData} instance, allowing for method chaining
   */
  public MerchantData acquirerId(String acquirerId) {
    this.acquirerId = acquirerId;
    return this;
  }

  /**
   * The unique identifier of the merchant&#39;s acquirer.
   * @return acquirerId
   */
  @ApiModelProperty(value = "The unique identifier of the merchant's acquirer.")
  @JsonProperty(JSON_PROPERTY_ACQUIRER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAcquirerId() {
    return acquirerId;
  }

  /**
   * The unique identifier of the merchant&#39;s acquirer.
   *
   * @param acquirerId
   */ 
  @JsonProperty(JSON_PROPERTY_ACQUIRER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcquirerId(String acquirerId) {
    this.acquirerId = acquirerId;
  }

  /**
   * The merchant category code.
   *
   * @param mcc
   * @return the current {@code MerchantData} instance, allowing for method chaining
   */
  public MerchantData mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * The merchant category code.
   * @return mcc
   */
  @ApiModelProperty(value = "The merchant category code.")
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMcc() {
    return mcc;
  }

  /**
   * The merchant category code.
   *
   * @param mcc
   */ 
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  /**
   * The merchant identifier.
   *
   * @param merchantId
   * @return the current {@code MerchantData} instance, allowing for method chaining
   */
  public MerchantData merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The merchant identifier.
   * @return merchantId
   */
  @ApiModelProperty(value = "The merchant identifier.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantId() {
    return merchantId;
  }

  /**
   * The merchant identifier.
   *
   * @param merchantId
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * nameLocation
   *
   * @param nameLocation
   * @return the current {@code MerchantData} instance, allowing for method chaining
   */
  public MerchantData nameLocation(NameLocation nameLocation) {
    this.nameLocation = nameLocation;
    return this;
  }

  /**
   * nameLocation
   * @return nameLocation
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NameLocation getNameLocation() {
    return nameLocation;
  }

  /**
   * nameLocation
   *
   * @param nameLocation
   */ 
  @JsonProperty(JSON_PROPERTY_NAME_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameLocation(NameLocation nameLocation) {
    this.nameLocation = nameLocation;
  }

  /**
   * The merchant postal code.
   *
   * @param postalCode
   * @return the current {@code MerchantData} instance, allowing for method chaining
   */
  public MerchantData postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The merchant postal code.
   * @return postalCode
   */
  @ApiModelProperty(value = "The merchant postal code.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * The merchant postal code.
   *
   * @param postalCode
   */ 
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Return true if this MerchantData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantData merchantData = (MerchantData) o;
    return Objects.equals(this.acquirerId, merchantData.acquirerId) &&
        Objects.equals(this.mcc, merchantData.mcc) &&
        Objects.equals(this.merchantId, merchantData.merchantId) &&
        Objects.equals(this.nameLocation, merchantData.nameLocation) &&
        Objects.equals(this.postalCode, merchantData.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerId, mcc, merchantId, nameLocation, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantData {\n");
    sb.append("    acquirerId: ").append(toIndentedString(acquirerId)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    nameLocation: ").append(toIndentedString(nameLocation)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
   * Create an instance of MerchantData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MerchantData
   * @throws JsonProcessingException if the JSON string is invalid with respect to MerchantData
   */
  public static MerchantData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MerchantData.class);
  }
/**
  * Convert an instance of MerchantData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
