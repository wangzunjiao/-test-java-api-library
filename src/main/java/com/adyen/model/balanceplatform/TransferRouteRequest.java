/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.Counterparty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransferRouteRequest
 */
@JsonPropertyOrder({
  TransferRouteRequest.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  TransferRouteRequest.JSON_PROPERTY_BALANCE_PLATFORM,
  TransferRouteRequest.JSON_PROPERTY_CATEGORY,
  TransferRouteRequest.JSON_PROPERTY_COUNTERPARTY,
  TransferRouteRequest.JSON_PROPERTY_COUNTRY,
  TransferRouteRequest.JSON_PROPERTY_CURRENCY,
  TransferRouteRequest.JSON_PROPERTY_PRIORITIES
})
//pojo

public class TransferRouteRequest {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  /**
   *  The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account. 
   */
  public enum CategoryEnum {
    BANK("bank");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private Counterparty counterparty;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  /**
   * Gets or Sets priorities
   */
  public enum PrioritiesEnum {
    CROSSBORDER("crossBorder"),
    
    FAST("fast"),
    
    INSTANT("instant"),
    
    INTERNAL("internal"),
    
    REGULAR("regular"),
    
    WIRE("wire");

    private String value;

    PrioritiesEnum(String value) {
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
    public static PrioritiesEnum fromValue(String value) {
      for (PrioritiesEnum b : PrioritiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private List<PrioritiesEnum> priorities = null;

  public TransferRouteRequest() { 
  }

  /**
   * The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). Required if &#x60;counterparty&#x60; is **transferInstrumentId**.
   *
   * @param balanceAccountId
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

  /**
   * The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). Required if &#x60;counterparty&#x60; is **transferInstrumentId**.
   * @return balanceAccountId
   */
  @ApiModelProperty(value = "The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). Required if `counterparty` is **transferInstrumentId**.")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalanceAccountId() {
    return balanceAccountId;
  }

  /**
   * The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). Required if &#x60;counterparty&#x60; is **transferInstrumentId**.
   *
   * @param balanceAccountId
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }

  /**
   * The unique identifier assigned to the balance platform associated with the account holder.
   *
   * @param balancePlatform
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier assigned to the balance platform associated with the account holder.
   * @return balancePlatform
   */
  @ApiModelProperty(required = true, value = "The unique identifier assigned to the balance platform associated with the account holder.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalancePlatform() {
    return balancePlatform;
  }

  /**
   * The unique identifier assigned to the balance platform associated with the account holder.
   *
   * @param balancePlatform
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }

  /**
   *  The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account. 
   *
   * @param category
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   *  The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account. 
   * @return category
   */
  @ApiModelProperty(required = true, value = " The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account. ")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CategoryEnum getCategory() {
    return category;
  }

  /**
   *  The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account. 
   *
   * @param category
   */ 
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * counterparty
   *
   * @param counterparty
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest counterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * counterparty
   * @return counterparty
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Counterparty getCounterparty() {
    return counterparty;
  }

  /**
   * counterparty
   *
   * @param counterparty
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**.  &gt; Either &#x60;counterparty&#x60; or &#x60;country&#x60; field must be provided in a transfer route request.
   *
   * @param country
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**.  &gt; Either &#x60;counterparty&#x60; or &#x60;country&#x60; field must be provided in a transfer route request.
   * @return country
   */
  @ApiModelProperty(value = "The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**.  > Either `counterparty` or `country` field must be provided in a transfer route request.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**.  &gt; Either &#x60;counterparty&#x60; or &#x60;country&#x60; field must be provided in a transfer route request.
   *
   * @param country
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The three-character ISO currency code of transfer. For example, **USD** or **EUR**.
   *
   * @param currency
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character ISO currency code of transfer. For example, **USD** or **EUR**.
   * @return currency
   */
  @ApiModelProperty(required = true, value = "The three-character ISO currency code of transfer. For example, **USD** or **EUR**.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-character ISO currency code of transfer. For example, **USD** or **EUR**.
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The list of priorities for the bank transfer. Priorities set the speed at which the transfer is sent and the fees that you have to pay. Multiple values can be provided. Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).
   *
   * @param priorities
   * @return the current {@code TransferRouteRequest} instance, allowing for method chaining
   */
  public TransferRouteRequest priorities(List<PrioritiesEnum> priorities) {
    this.priorities = priorities;
    return this;
  }

  public TransferRouteRequest addPrioritiesItem(PrioritiesEnum prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

  /**
   * The list of priorities for the bank transfer. Priorities set the speed at which the transfer is sent and the fees that you have to pay. Multiple values can be provided. Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).
   * @return priorities
   */
  @ApiModelProperty(value = "The list of priorities for the bank transfer. Priorities set the speed at which the transfer is sent and the fees that you have to pay. Multiple values can be provided. Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).")
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PrioritiesEnum> getPriorities() {
    return priorities;
  }

  /**
   * The list of priorities for the bank transfer. Priorities set the speed at which the transfer is sent and the fees that you have to pay. Multiple values can be provided. Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).
   *
   * @param priorities
   */ 
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorities(List<PrioritiesEnum> priorities) {
    this.priorities = priorities;
  }

  /**
   * Return true if this TransferRouteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRouteRequest transferRouteRequest = (TransferRouteRequest) o;
    return Objects.equals(this.balanceAccountId, transferRouteRequest.balanceAccountId) &&
        Objects.equals(this.balancePlatform, transferRouteRequest.balancePlatform) &&
        Objects.equals(this.category, transferRouteRequest.category) &&
        Objects.equals(this.counterparty, transferRouteRequest.counterparty) &&
        Objects.equals(this.country, transferRouteRequest.country) &&
        Objects.equals(this.currency, transferRouteRequest.currency) &&
        Objects.equals(this.priorities, transferRouteRequest.priorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, balancePlatform, category, counterparty, country, currency, priorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRouteRequest {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
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
   * Create an instance of TransferRouteRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferRouteRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferRouteRequest
   */
  public static TransferRouteRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferRouteRequest.class);
  }
/**
  * Convert an instance of TransferRouteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
