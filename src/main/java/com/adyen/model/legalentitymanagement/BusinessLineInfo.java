/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.SourceOfFunds;
import com.adyen.model.legalentitymanagement.WebData;
import com.adyen.model.legalentitymanagement.WebDataExemption;
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
 * BusinessLineInfo
 */
@JsonPropertyOrder({
  BusinessLineInfo.JSON_PROPERTY_CAPABILITY,
  BusinessLineInfo.JSON_PROPERTY_INDUSTRY_CODE,
  BusinessLineInfo.JSON_PROPERTY_LEGAL_ENTITY_ID,
  BusinessLineInfo.JSON_PROPERTY_SALES_CHANNELS,
  BusinessLineInfo.JSON_PROPERTY_SERVICE,
  BusinessLineInfo.JSON_PROPERTY_SOURCE_OF_FUNDS,
  BusinessLineInfo.JSON_PROPERTY_WEB_DATA,
  BusinessLineInfo.JSON_PROPERTY_WEB_DATA_EXEMPTION
})
//pojo

public class BusinessLineInfo {
  /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   */
  public enum CapabilityEnum {
    RECEIVEPAYMENTS("receivePayments"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    ISSUEBANKACCOUNT("issueBankAccount");

    private String value;

    CapabilityEnum(String value) {
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
    public static CapabilityEnum fromValue(String value) {
      for (CapabilityEnum b : CapabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPABILITY = "capability";
  @Deprecated // deprecated since Legal Entity Management API v3: Use `service` instead.
  private CapabilityEnum capability;

  public static final String JSON_PROPERTY_INDUSTRY_CODE = "industryCode";
  private String industryCode;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_SALES_CHANNELS = "salesChannels";
  private List<String> salesChannels = null;

  /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   */
  public enum ServiceEnum {
    PAYMENTPROCESSING("paymentProcessing"),
    
    BANKING("banking");

    private String value;

    ServiceEnum(String value) {
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
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE = "service";
  private ServiceEnum service;

  public static final String JSON_PROPERTY_SOURCE_OF_FUNDS = "sourceOfFunds";
  private SourceOfFunds sourceOfFunds;

  public static final String JSON_PROPERTY_WEB_DATA = "webData";
  private List<WebData> webData = null;

  public static final String JSON_PROPERTY_WEB_DATA_EXEMPTION = "webDataExemption";
  private WebDataExemption webDataExemption;

  public BusinessLineInfo() { 
  }

  /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   *
   * @param capability
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   *
   * @deprecated since Legal Entity Management API v3
   * Use &#x60;service&#x60; instead.
   */
  @Deprecated
  public BusinessLineInfo capability(CapabilityEnum capability) {
    this.capability = capability;
    return this;
  }

  /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   * @return capability
   *
   * @deprecated since Legal Entity Management API v3
   * Use &#x60;service&#x60; instead.
   */
  @Deprecated
  @ApiModelProperty(value = "The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**")
  @JsonProperty(JSON_PROPERTY_CAPABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CapabilityEnum getCapability() {
    return capability;
  }

  /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   *
   * @param capability
   *
   * @deprecated since Legal Entity Management API v3
   * Use &#x60;service&#x60; instead.
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_CAPABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapability(CapabilityEnum capability) {
    this.capability = capability;
  }

  /**
   * A code that represents the industry of the legal entity for [marketplaces](https://docs.adyen.com/marketplaces/verification-requirements/reference-additional-products/#list-industry-codes) or [platforms](https://docs.adyen.com/platforms/verification-requirements/reference-additional-products/#list-industry-codes). For example, **4431A** for computer software stores.
   *
   * @param industryCode
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * A code that represents the industry of the legal entity for [marketplaces](https://docs.adyen.com/marketplaces/verification-requirements/reference-additional-products/#list-industry-codes) or [platforms](https://docs.adyen.com/platforms/verification-requirements/reference-additional-products/#list-industry-codes). For example, **4431A** for computer software stores.
   * @return industryCode
   */
  @ApiModelProperty(required = true, value = "A code that represents the industry of the legal entity for [marketplaces](https://docs.adyen.com/marketplaces/verification-requirements/reference-additional-products/#list-industry-codes) or [platforms](https://docs.adyen.com/platforms/verification-requirements/reference-additional-products/#list-industry-codes). For example, **4431A** for computer software stores.")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndustryCode() {
    return industryCode;
  }

  /**
   * A code that represents the industry of the legal entity for [marketplaces](https://docs.adyen.com/marketplaces/verification-requirements/reference-additional-products/#list-industry-codes) or [platforms](https://docs.adyen.com/platforms/verification-requirements/reference-additional-products/#list-industry-codes). For example, **4431A** for computer software stores.
   *
   * @param industryCode
   */ 
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   *
   * @param legalEntityId
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

  /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   * @return legalEntityId
   */
  @ApiModelProperty(required = true, value = "Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegalEntityId() {
    return legalEntityId;
  }

  /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   *
   * @param legalEntityId
   */ 
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }

  /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   *
   * @param salesChannels
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo salesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
    return this;
  }

  public BusinessLineInfo addSalesChannelsItem(String salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new ArrayList<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

  /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   * @return salesChannels
   */
  @ApiModelProperty(value = "A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**.")
  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSalesChannels() {
    return salesChannels;
  }

  /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   *
   * @param salesChannels
   */ 
  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
  }

  /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   *
   * @param service
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo service(ServiceEnum service) {
    this.service = service;
    return this;
  }

  /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   * @return service
   */
  @ApiModelProperty(required = true, value = "The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  ")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceEnum getService() {
    return service;
  }

  /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   *
   * @param service
   */ 
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(ServiceEnum service) {
    this.service = service;
  }

  /**
   * sourceOfFunds
   *
   * @param sourceOfFunds
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo sourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

  /**
   * sourceOfFunds
   * @return sourceOfFunds
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }

  /**
   * sourceOfFunds
   *
   * @param sourceOfFunds
   */ 
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }

  /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   *
   * @param webData
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo webData(List<WebData> webData) {
    this.webData = webData;
    return this;
  }

  public BusinessLineInfo addWebDataItem(WebData webDataItem) {
    if (this.webData == null) {
      this.webData = new ArrayList<>();
    }
    this.webData.add(webDataItem);
    return this;
  }

  /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   * @return webData
   */
  @ApiModelProperty(value = "List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object.")
  @JsonProperty(JSON_PROPERTY_WEB_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WebData> getWebData() {
    return webData;
  }

  /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   *
   * @param webData
   */ 
  @JsonProperty(JSON_PROPERTY_WEB_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebData(List<WebData> webData) {
    this.webData = webData;
  }

  /**
   * webDataExemption
   *
   * @param webDataExemption
   * @return the current {@code BusinessLineInfo} instance, allowing for method chaining
   */
  public BusinessLineInfo webDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
    return this;
  }

  /**
   * webDataExemption
   * @return webDataExemption
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_DATA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebDataExemption getWebDataExemption() {
    return webDataExemption;
  }

  /**
   * webDataExemption
   *
   * @param webDataExemption
   */ 
  @JsonProperty(JSON_PROPERTY_WEB_DATA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
  }

  /**
   * Return true if this BusinessLineInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLineInfo businessLineInfo = (BusinessLineInfo) o;
    return Objects.equals(this.capability, businessLineInfo.capability) &&
        Objects.equals(this.industryCode, businessLineInfo.industryCode) &&
        Objects.equals(this.legalEntityId, businessLineInfo.legalEntityId) &&
        Objects.equals(this.salesChannels, businessLineInfo.salesChannels) &&
        Objects.equals(this.service, businessLineInfo.service) &&
        Objects.equals(this.sourceOfFunds, businessLineInfo.sourceOfFunds) &&
        Objects.equals(this.webData, businessLineInfo.webData) &&
        Objects.equals(this.webDataExemption, businessLineInfo.webDataExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, industryCode, legalEntityId, salesChannels, service, sourceOfFunds, webData, webDataExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLineInfo {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
    sb.append("    webDataExemption: ").append(toIndentedString(webDataExemption)).append("\n");
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
   * Create an instance of BusinessLineInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessLineInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to BusinessLineInfo
   */
  public static BusinessLineInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BusinessLineInfo.class);
  }
/**
  * Convert an instance of BusinessLineInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
