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
 * SweepCounterparty
 */
@JsonPropertyOrder({
  SweepCounterparty.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  SweepCounterparty.JSON_PROPERTY_MERCHANT_ACCOUNT,
  SweepCounterparty.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID
})

public class SweepCounterparty {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  public SweepCounterparty() { 
  }

  /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   &gt; If you are updating the counterparty from a transfer instrument to a balance account, set &#x60;transferInstrumentId&#x60; to **null**.
   *
   * @param balanceAccountId
   * @return the current {@code SweepCounterparty} instance, allowing for method chaining
   */
  public SweepCounterparty balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

  /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   &gt; If you are updating the counterparty from a transfer instrument to a balance account, set &#x60;transferInstrumentId&#x60; to **null**.
   * @return balanceAccountId
   */
  @ApiModelProperty(value = "The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   > If you are updating the counterparty from a transfer instrument to a balance account, set `transferInstrumentId` to **null**.")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalanceAccountId() {
    return balanceAccountId;
  }

  /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   &gt; If you are updating the counterparty from a transfer instrument to a balance account, set &#x60;transferInstrumentId&#x60; to **null**.
   *
   * @param balanceAccountId
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }

  /**
   * The merchant account that will be the source of funds.  You can only use this parameter with sweeps of &#x60;type&#x60; **pull** and if you are processing payments with Adyen.
   *
   * @param merchantAccount
   * @return the current {@code SweepCounterparty} instance, allowing for method chaining
   */
  public SweepCounterparty merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account that will be the source of funds.  You can only use this parameter with sweeps of &#x60;type&#x60; **pull** and if you are processing payments with Adyen.
   * @return merchantAccount
   */
  @ApiModelProperty(value = "The merchant account that will be the source of funds.  You can only use this parameter with sweeps of `type` **pull** and if you are processing payments with Adyen.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account that will be the source of funds.  You can only use this parameter with sweeps of &#x60;type&#x60; **pull** and if you are processing payments with Adyen.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep &#x60;type&#x60;  . To set up automated top-up sweeps to balance accounts in your [marketplace](https://docs.adyen.com/marketplaces/top-up-balance-account/#before-you-begin) or [platform](https://docs.adyen.com/platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a &#x60;merchantAccount&#x60; and a sweep &#x60;type&#x60; of **pull**.  Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature.&gt; If you are updating the counterparty from a balance account to a transfer instrument, set &#x60;balanceAccountId&#x60; to **null**.
   *
   * @param transferInstrumentId
   * @return the current {@code SweepCounterparty} instance, allowing for method chaining
   */
  public SweepCounterparty transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

  /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep &#x60;type&#x60;  . To set up automated top-up sweeps to balance accounts in your [marketplace](https://docs.adyen.com/marketplaces/top-up-balance-account/#before-you-begin) or [platform](https://docs.adyen.com/platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a &#x60;merchantAccount&#x60; and a sweep &#x60;type&#x60; of **pull**.  Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature.&gt; If you are updating the counterparty from a balance account to a transfer instrument, set &#x60;balanceAccountId&#x60; to **null**.
   * @return transferInstrumentId
   */
  @ApiModelProperty(value = "The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep `type`  . To set up automated top-up sweeps to balance accounts in your [marketplace](https://docs.adyen.com/marketplaces/top-up-balance-account/#before-you-begin) or [platform](https://docs.adyen.com/platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a `merchantAccount` and a sweep `type` of **pull**.  Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature.> If you are updating the counterparty from a balance account to a transfer instrument, set `balanceAccountId` to **null**.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }

  /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep &#x60;type&#x60;  . To set up automated top-up sweeps to balance accounts in your [marketplace](https://docs.adyen.com/marketplaces/top-up-balance-account/#before-you-begin) or [platform](https://docs.adyen.com/platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a &#x60;merchantAccount&#x60; and a sweep &#x60;type&#x60; of **pull**.  Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature.&gt; If you are updating the counterparty from a balance account to a transfer instrument, set &#x60;balanceAccountId&#x60; to **null**.
   *
   * @param transferInstrumentId
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }

  /**
   * Return true if this SweepCounterparty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepCounterparty sweepCounterparty = (SweepCounterparty) o;
    return Objects.equals(this.balanceAccountId, sweepCounterparty.balanceAccountId) &&
        Objects.equals(this.merchantAccount, sweepCounterparty.merchantAccount) &&
        Objects.equals(this.transferInstrumentId, sweepCounterparty.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, merchantAccount, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepCounterparty {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
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
   * Create an instance of SweepCounterparty given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SweepCounterparty
   * @throws JsonProcessingException if the JSON string is invalid with respect to SweepCounterparty
   */
  public static SweepCounterparty fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SweepCounterparty.class);
  }
/**
  * Convert an instance of SweepCounterparty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
