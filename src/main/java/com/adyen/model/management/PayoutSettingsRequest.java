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
 * PayoutSettingsRequest
 */
@JsonPropertyOrder({
  PayoutSettingsRequest.JSON_PROPERTY_ENABLED,
  PayoutSettingsRequest.JSON_PROPERTY_ENABLED_FROM_DATE,
  PayoutSettingsRequest.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID
})
//pojo

public class PayoutSettingsRequest {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENABLED_FROM_DATE = "enabledFromDate";
  private String enabledFromDate;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  public PayoutSettingsRequest() { 
  }

  /**
   * Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both &#x60;enabled&#x60; and &#x60;allowed&#x60; must be **true**.
   *
   * @param enabled
   * @return the current {@code PayoutSettingsRequest} instance, allowing for method chaining
   */
  public PayoutSettingsRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both &#x60;enabled&#x60; and &#x60;allowed&#x60; must be **true**.
   * @return enabled
   */
  @ApiModelProperty(value = "Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both `enabled` and `allowed` must be **true**.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both &#x60;enabled&#x60; and &#x60;allowed&#x60; must be **true**.
   *
   * @param enabled
   */ 
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the &#x60;enabled&#x60; field indicates if payouts are enabled for this bank account.  If a date is specified and:  * &#x60;enabled&#x60;: **true**, payouts are enabled starting the specified date. * &#x60;enabled&#x60;: **false**, payouts are disabled until the specified date. On the specified date, &#x60;enabled&#x60; changes to **true** and this field is reset to **null**.
   *
   * @param enabledFromDate
   * @return the current {@code PayoutSettingsRequest} instance, allowing for method chaining
   */
  public PayoutSettingsRequest enabledFromDate(String enabledFromDate) {
    this.enabledFromDate = enabledFromDate;
    return this;
  }

  /**
   * The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the &#x60;enabled&#x60; field indicates if payouts are enabled for this bank account.  If a date is specified and:  * &#x60;enabled&#x60;: **true**, payouts are enabled starting the specified date. * &#x60;enabled&#x60;: **false**, payouts are disabled until the specified date. On the specified date, &#x60;enabled&#x60; changes to **true** and this field is reset to **null**.
   * @return enabledFromDate
   */
  @ApiModelProperty(value = "The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the `enabled` field indicates if payouts are enabled for this bank account.  If a date is specified and:  * `enabled`: **true**, payouts are enabled starting the specified date. * `enabled`: **false**, payouts are disabled until the specified date. On the specified date, `enabled` changes to **true** and this field is reset to **null**.")
  @JsonProperty(JSON_PROPERTY_ENABLED_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnabledFromDate() {
    return enabledFromDate;
  }

  /**
   * The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the &#x60;enabled&#x60; field indicates if payouts are enabled for this bank account.  If a date is specified and:  * &#x60;enabled&#x60;: **true**, payouts are enabled starting the specified date. * &#x60;enabled&#x60;: **false**, payouts are disabled until the specified date. On the specified date, &#x60;enabled&#x60; changes to **true** and this field is reset to **null**.
   *
   * @param enabledFromDate
   */ 
  @JsonProperty(JSON_PROPERTY_ENABLED_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledFromDate(String enabledFromDate) {
    this.enabledFromDate = enabledFromDate;
  }

  /**
   * The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.
   *
   * @param transferInstrumentId
   * @return the current {@code PayoutSettingsRequest} instance, allowing for method chaining
   */
  public PayoutSettingsRequest transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

  /**
   * The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.
   * @return transferInstrumentId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }

  /**
   * The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.
   *
   * @param transferInstrumentId
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }

  /**
   * Return true if this PayoutSettingsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutSettingsRequest payoutSettingsRequest = (PayoutSettingsRequest) o;
    return Objects.equals(this.enabled, payoutSettingsRequest.enabled) &&
        Objects.equals(this.enabledFromDate, payoutSettingsRequest.enabledFromDate) &&
        Objects.equals(this.transferInstrumentId, payoutSettingsRequest.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enabledFromDate, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutSettingsRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledFromDate: ").append(toIndentedString(enabledFromDate)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
   * Create an instance of PayoutSettingsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayoutSettingsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PayoutSettingsRequest
   */
  public static PayoutSettingsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PayoutSettingsRequest.class);
  }
/**
  * Convert an instance of PayoutSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
