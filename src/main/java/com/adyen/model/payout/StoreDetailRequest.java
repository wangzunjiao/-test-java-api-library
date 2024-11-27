/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payout.Address;
import com.adyen.model.payout.BankAccount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * StoreDetailRequest
 */
@JsonPropertyOrder({
  StoreDetailRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  StoreDetailRequest.JSON_PROPERTY_BANK,
  StoreDetailRequest.JSON_PROPERTY_BILLING_ADDRESS,
  StoreDetailRequest.JSON_PROPERTY_CARD,
  StoreDetailRequest.JSON_PROPERTY_DATE_OF_BIRTH,
  StoreDetailRequest.JSON_PROPERTY_ENTITY_TYPE,
  StoreDetailRequest.JSON_PROPERTY_FRAUD_OFFSET,
  StoreDetailRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoreDetailRequest.JSON_PROPERTY_NATIONALITY,
  StoreDetailRequest.JSON_PROPERTY_RECURRING,
  StoreDetailRequest.JSON_PROPERTY_SELECTED_BRAND,
  StoreDetailRequest.JSON_PROPERTY_SHOPPER_EMAIL,
  StoreDetailRequest.JSON_PROPERTY_SHOPPER_NAME,
  StoreDetailRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  StoreDetailRequest.JSON_PROPERTY_SOCIAL_SECURITY_NUMBER,
  StoreDetailRequest.JSON_PROPERTY_TELEPHONE_NUMBER
})

public class StoreDetailRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_BANK = "bank";
  private BankAccount bank;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  /**
   * The type of the entity the payout is processed for.
   */
  public enum EntityTypeEnum {
    NATURALPERSON("NaturalPerson"),
    
    COMPANY("Company");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityTypeEnum entityType;

  public static final String JSON_PROPERTY_FRAUD_OFFSET = "fraudOffset";
  private Integer fraudOffset;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Recurring recurring;

  public static final String JSON_PROPERTY_SELECTED_BRAND = "selectedBrand";
  private String selectedBrand;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  private String socialSecurityNumber;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  public StoreDetailRequest() { 
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   *
   * @param additionalData
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public StoreDetailRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
   */
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * bank
   *
   * @param bank
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest bank(BankAccount bank) {
    this.bank = bank;
    return this;
  }

  /**
   * bank
   * @return bank
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccount getBank() {
    return bank;
  }

  /**
   * bank
   *
   * @param bank
   */ 
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBank(BankAccount bank) {
    this.bank = bank;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * billingAddress
   * @return billingAddress
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getBillingAddress() {
    return billingAddress;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * card
   *
   * @param card
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * card
   * @return card
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Card getCard() {
    return card;
  }

  /**
   * card
   *
   * @param card
   */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   *
   * @param dateOfBirth
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   * @return dateOfBirth
   */
  @ApiModelProperty(required = true, value = "The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. > This field is mandatory for natural persons.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   *
   * @param dateOfBirth
   */ 
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The type of the entity the payout is processed for.
   *
   * @param entityType
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The type of the entity the payout is processed for.
   * @return entityType
   */
  @ApiModelProperty(required = true, value = "The type of the entity the payout is processed for.")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  /**
   * The type of the entity the payout is processed for.
   *
   * @param entityType
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest fraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
    return this;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
   */
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFraudOffset() {
    return fraudOffset;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   */ 
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   *
   * @param nationality
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   * @return nationality
   */
  @ApiModelProperty(required = true, value = "The shopper's nationality.  A valid value is an ISO 2-character country code (e.g. 'NL').")
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNationality() {
    return nationality;
  }

  /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   *
   * @param nationality
   */ 
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * recurring
   *
   * @param recurring
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * recurring
   * @return recurring
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Recurring getRecurring() {
    return recurring;
  }

  /**
   * recurring
   *
   * @param recurring
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   *
   * @param selectedBrand
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest selectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
    return this;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   * @return selectedBrand
   */
  @ApiModelProperty(value = "The name of the brand to make a payout to.  For Paysafecard it must be set to `paysafecard`.")
  @JsonProperty(JSON_PROPERTY_SELECTED_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelectedBrand() {
    return selectedBrand;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   *
   * @param selectedBrand
   */ 
  @JsonProperty(JSON_PROPERTY_SELECTED_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
  }

  /**
   * The shopper&#39;s email address.
   *
   * @param shopperEmail
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * The shopper&#39;s email address.
   * @return shopperEmail
   */
  @ApiModelProperty(required = true, value = "The shopper's email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * The shopper&#39;s email address.
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * shopperName
   *
   * @param shopperName
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest shopperName(Name shopperName) {
    this.shopperName = shopperName;
    return this;
  }

  /**
   * shopperName
   * @return shopperName
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Name getShopperName() {
    return shopperName;
  }

  /**
   * shopperName
   *
   * @param shopperName
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }

  /**
   * The shopper&#39;s reference for the payment transaction.
   *
   * @param shopperReference
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * The shopper&#39;s reference for the payment transaction.
   * @return shopperReference
   */
  @ApiModelProperty(required = true, value = "The shopper's reference for the payment transaction.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * The shopper&#39;s reference for the payment transaction.
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * The shopper&#39;s social security number.
   *
   * @param socialSecurityNumber
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * The shopper&#39;s social security number.
   * @return socialSecurityNumber
   */
  @ApiModelProperty(value = "The shopper's social security number.")
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  /**
   * The shopper&#39;s social security number.
   *
   * @param socialSecurityNumber
   */ 
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  /**
   * The shopper&#39;s phone number.
   *
   * @param telephoneNumber
   * @return the current {@code StoreDetailRequest} instance, allowing for method chaining
   */
  public StoreDetailRequest telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * The shopper&#39;s phone number.
   * @return telephoneNumber
   */
  @ApiModelProperty(value = "The shopper's phone number.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * The shopper&#39;s phone number.
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * Return true if this StoreDetailRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetailRequest storeDetailRequest = (StoreDetailRequest) o;
    return Objects.equals(this.additionalData, storeDetailRequest.additionalData) &&
        Objects.equals(this.bank, storeDetailRequest.bank) &&
        Objects.equals(this.billingAddress, storeDetailRequest.billingAddress) &&
        Objects.equals(this.card, storeDetailRequest.card) &&
        Objects.equals(this.dateOfBirth, storeDetailRequest.dateOfBirth) &&
        Objects.equals(this.entityType, storeDetailRequest.entityType) &&
        Objects.equals(this.fraudOffset, storeDetailRequest.fraudOffset) &&
        Objects.equals(this.merchantAccount, storeDetailRequest.merchantAccount) &&
        Objects.equals(this.nationality, storeDetailRequest.nationality) &&
        Objects.equals(this.recurring, storeDetailRequest.recurring) &&
        Objects.equals(this.selectedBrand, storeDetailRequest.selectedBrand) &&
        Objects.equals(this.shopperEmail, storeDetailRequest.shopperEmail) &&
        Objects.equals(this.shopperName, storeDetailRequest.shopperName) &&
        Objects.equals(this.shopperReference, storeDetailRequest.shopperReference) &&
        Objects.equals(this.socialSecurityNumber, storeDetailRequest.socialSecurityNumber) &&
        Objects.equals(this.telephoneNumber, storeDetailRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, bank, billingAddress, card, dateOfBirth, entityType, fraudOffset, merchantAccount, nationality, recurring, selectedBrand, shopperEmail, shopperName, shopperReference, socialSecurityNumber, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetailRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    selectedBrand: ").append(toIndentedString(selectedBrand)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
   * Create an instance of StoreDetailRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoreDetailRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoreDetailRequest
   */
  public static StoreDetailRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoreDetailRequest.class);
  }
/**
  * Convert an instance of StoreDetailRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
