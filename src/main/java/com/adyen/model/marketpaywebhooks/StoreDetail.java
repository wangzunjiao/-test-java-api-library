/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.ViasAddress;
import com.adyen.model.marketpaywebhooks.ViasPhoneNumber;
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
 * StoreDetail
 */
@JsonPropertyOrder({
  StoreDetail.JSON_PROPERTY_ADDRESS,
  StoreDetail.JSON_PROPERTY_FULL_PHONE_NUMBER,
  StoreDetail.JSON_PROPERTY_LOGO,
  StoreDetail.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoreDetail.JSON_PROPERTY_MERCHANT_CATEGORY_CODE,
  StoreDetail.JSON_PROPERTY_MERCHANT_HOUSE_NUMBER,
  StoreDetail.JSON_PROPERTY_PHONE_NUMBER,
  StoreDetail.JSON_PROPERTY_SHOPPER_INTERACTION,
  StoreDetail.JSON_PROPERTY_SPLIT_CONFIGURATION_U_U_I_D,
  StoreDetail.JSON_PROPERTY_STATUS,
  StoreDetail.JSON_PROPERTY_STORE,
  StoreDetail.JSON_PROPERTY_STORE_NAME,
  StoreDetail.JSON_PROPERTY_STORE_REFERENCE,
  StoreDetail.JSON_PROPERTY_VIRTUAL_ACCOUNT,
  StoreDetail.JSON_PROPERTY_WEB_ADDRESS
})

public class StoreDetail {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private ViasAddress address;

  public static final String JSON_PROPERTY_FULL_PHONE_NUMBER = "fullPhoneNumber";
  private String fullPhoneNumber;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private String logo;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_MERCHANT_CATEGORY_CODE = "merchantCategoryCode";
  private String merchantCategoryCode;

  public static final String JSON_PROPERTY_MERCHANT_HOUSE_NUMBER = "merchantHouseNumber";
  private String merchantHouseNumber;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private ViasPhoneNumber phoneNumber;

  /**
   * The sales channel. Possible values: **Ecommerce**, **POS**.
   */
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
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
    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SHOPPER_INTERACTION = "shopperInteraction";
  private ShopperInteractionEnum shopperInteraction;

  public static final String JSON_PROPERTY_SPLIT_CONFIGURATION_U_U_I_D = "splitConfigurationUUID";
  private String splitConfigurationUUID;

  /**
   * The status of the store. Possible values: **Pending**, **Active**, **Inactive**, **InactiveWithModifications**, **Closed**.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    INACTIVEWITHMODIFICATIONS("InactiveWithModifications"),
    
    PENDING("Pending");

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

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public static final String JSON_PROPERTY_STORE_NAME = "storeName";
  private String storeName;

  public static final String JSON_PROPERTY_STORE_REFERENCE = "storeReference";
  private String storeReference;

  public static final String JSON_PROPERTY_VIRTUAL_ACCOUNT = "virtualAccount";
  private String virtualAccount;

  public static final String JSON_PROPERTY_WEB_ADDRESS = "webAddress";
  private String webAddress;

  public StoreDetail() { 
  }

  public StoreDetail address(ViasAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViasAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(ViasAddress address) {
    this.address = address;
  }


  public StoreDetail fullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
    return this;
  }

   /**
   * The phone number of the store provided as a single string.  It will be handled as a landline phone.  Examples: \&quot;0031 6 11 22 33 44\&quot;, \&quot;+316/1122-3344\&quot;, \&quot;(0031) 611223344\&quot;
   * @return fullPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the store provided as a single string.  It will be handled as a landline phone.  Examples: \"0031 6 11 22 33 44\", \"+316/1122-3344\", \"(0031) 611223344\"")
  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullPhoneNumber() {
    return fullPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
  }


  public StoreDetail logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Store logo for payment method setup.
   * @return logo
  **/
  @ApiModelProperty(value = "Store logo for payment method setup.")
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(String logo) {
    this.logo = logo;
  }


  public StoreDetail merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account to which the store belongs.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account to which the store belongs.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StoreDetail merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * The merchant category code (MCC) that classifies the business of the account holder.
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(required = true, value = "The merchant category code (MCC) that classifies the business of the account holder.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_CATEGORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CATEGORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public StoreDetail merchantHouseNumber(String merchantHouseNumber) {
    this.merchantHouseNumber = merchantHouseNumber;
    return this;
  }

   /**
   * Merchant house number for payment method setup.
   * @return merchantHouseNumber
  **/
  @ApiModelProperty(value = "Merchant house number for payment method setup.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantHouseNumber() {
    return merchantHouseNumber;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantHouseNumber(String merchantHouseNumber) {
    this.merchantHouseNumber = merchantHouseNumber;
  }


  public StoreDetail phoneNumber(ViasPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViasPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(ViasPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public StoreDetail shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * The sales channel. Possible values: **Ecommerce**, **POS**.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "The sales channel. Possible values: **Ecommerce**, **POS**.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public StoreDetail splitConfigurationUUID(String splitConfigurationUUID) {
    this.splitConfigurationUUID = splitConfigurationUUID;
    return this;
  }

   /**
   * The unique reference for the split configuration, returned when you configure splits in your Customer Area. When this is provided, the &#x60;virtualAccount&#x60; is also required. Adyen uses the configuration and the &#x60;virtualAccount&#x60; to split funds between accounts in your platform.
   * @return splitConfigurationUUID
  **/
  @ApiModelProperty(value = "The unique reference for the split configuration, returned when you configure splits in your Customer Area. When this is provided, the `virtualAccount` is also required. Adyen uses the configuration and the `virtualAccount` to split funds between accounts in your platform.")
  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSplitConfigurationUUID() {
    return splitConfigurationUUID;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitConfigurationUUID(String splitConfigurationUUID) {
    this.splitConfigurationUUID = splitConfigurationUUID;
  }


  public StoreDetail status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the store. Possible values: **Pending**, **Active**, **Inactive**, **InactiveWithModifications**, **Closed**.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the store. Possible values: **Pending**, **Active**, **Inactive**, **InactiveWithModifications**, **Closed**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public StoreDetail store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Adyen-generated unique alphanumeric identifier (UUID) for the store, returned in the response when you create a store. Required when updating an existing store in an &#x60;/updateAccountHolder&#x60; request.
   * @return store
  **/
  @ApiModelProperty(value = "Adyen-generated unique alphanumeric identifier (UUID) for the store, returned in the response when you create a store. Required when updating an existing store in an `/updateAccountHolder` request.")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStore() {
    return store;
  }


  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }


  public StoreDetail storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The name of the account holder&#39;s store. This value is shown in shopper statements.  * Length: Between 3 to 22 characters   * The following characters are *not* supported: **:;}{$#@!|&lt;&gt;%^*+&#x3D;\\\\**
   * @return storeName
  **/
  @ApiModelProperty(value = "The name of the account holder's store. This value is shown in shopper statements.  * Length: Between 3 to 22 characters   * The following characters are *not* supported: **:;}{$#@!|<>%^*+=\\\\**")
  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreName() {
    return storeName;
  }


  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public StoreDetail storeReference(String storeReference) {
    this.storeReference = storeReference;
    return this;
  }

   /**
   * Your unique identifier for the store. The Customer Area also uses this value for the store description.   * Length: Between 3 to 128 characters  * The following characters are *not* supported: **:;}{$#@!|&lt;&gt;%^*+&#x3D;\\\\**
   * @return storeReference
  **/
  @ApiModelProperty(value = "Your unique identifier for the store. The Customer Area also uses this value for the store description.   * Length: Between 3 to 128 characters  * The following characters are *not* supported: **:;}{$#@!|<>%^*+=\\\\**")
  @JsonProperty(JSON_PROPERTY_STORE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreReference() {
    return storeReference;
  }


  @JsonProperty(JSON_PROPERTY_STORE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreReference(String storeReference) {
    this.storeReference = storeReference;
  }


  public StoreDetail virtualAccount(String virtualAccount) {
    this.virtualAccount = virtualAccount;
    return this;
  }

   /**
   * The account holder&#39;s &#x60;accountCode&#x60; where the split amount will be sent. Required when you provide the &#x60;splitConfigurationUUID&#x60;.
   * @return virtualAccount
  **/
  @ApiModelProperty(value = "The account holder's `accountCode` where the split amount will be sent. Required when you provide the `splitConfigurationUUID`.")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualAccount() {
    return virtualAccount;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualAccount(String virtualAccount) {
    this.virtualAccount = virtualAccount;
  }


  public StoreDetail webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

   /**
   * URL of the ecommerce store.
   * @return webAddress
  **/
  @ApiModelProperty(value = "URL of the ecommerce store.")
  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebAddress() {
    return webAddress;
  }


  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }


  /**
   * Return true if this StoreDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetail storeDetail = (StoreDetail) o;
    return Objects.equals(this.address, storeDetail.address) &&
        Objects.equals(this.fullPhoneNumber, storeDetail.fullPhoneNumber) &&
        Objects.equals(this.logo, storeDetail.logo) &&
        Objects.equals(this.merchantAccount, storeDetail.merchantAccount) &&
        Objects.equals(this.merchantCategoryCode, storeDetail.merchantCategoryCode) &&
        Objects.equals(this.merchantHouseNumber, storeDetail.merchantHouseNumber) &&
        Objects.equals(this.phoneNumber, storeDetail.phoneNumber) &&
        Objects.equals(this.shopperInteraction, storeDetail.shopperInteraction) &&
        Objects.equals(this.splitConfigurationUUID, storeDetail.splitConfigurationUUID) &&
        Objects.equals(this.status, storeDetail.status) &&
        Objects.equals(this.store, storeDetail.store) &&
        Objects.equals(this.storeName, storeDetail.storeName) &&
        Objects.equals(this.storeReference, storeDetail.storeReference) &&
        Objects.equals(this.virtualAccount, storeDetail.virtualAccount) &&
        Objects.equals(this.webAddress, storeDetail.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, fullPhoneNumber, logo, merchantAccount, merchantCategoryCode, merchantHouseNumber, phoneNumber, shopperInteraction, splitConfigurationUUID, status, store, storeName, storeReference, virtualAccount, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetail {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fullPhoneNumber: ").append(toIndentedString(fullPhoneNumber)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantHouseNumber: ").append(toIndentedString(merchantHouseNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    splitConfigurationUUID: ").append(toIndentedString(splitConfigurationUUID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeReference: ").append(toIndentedString(storeReference)).append("\n");
    sb.append("    virtualAccount: ").append(toIndentedString(virtualAccount)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
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
   * Create an instance of StoreDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoreDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoreDetail
   */
  public static StoreDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoreDetail.class);
  }
/**
  * Convert an instance of StoreDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

