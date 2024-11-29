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
import com.adyen.model.legalentitymanagement.Address;
import com.adyen.model.legalentitymanagement.TaxInformation;
import com.adyen.model.legalentitymanagement.UndefinedBeneficiary;
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
 * Trust
 */
@JsonPropertyOrder({
  Trust.JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW,
  Trust.JSON_PROPERTY_DATE_OF_INCORPORATION,
  Trust.JSON_PROPERTY_DOING_BUSINESS_AS,
  Trust.JSON_PROPERTY_NAME,
  Trust.JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS,
  Trust.JSON_PROPERTY_REGISTERED_ADDRESS,
  Trust.JSON_PROPERTY_REGISTRATION_NUMBER,
  Trust.JSON_PROPERTY_TAX_ABSENT,
  Trust.JSON_PROPERTY_TAX_INFORMATION,
  Trust.JSON_PROPERTY_TYPE,
  Trust.JSON_PROPERTY_UNDEFINED_BENEFICIARY_INFO,
  Trust.JSON_PROPERTY_VAT_ABSENCE_REASON,
  Trust.JSON_PROPERTY_VAT_NUMBER
})
//pojo

public class Trust {
  public static final String JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW = "countryOfGoverningLaw";
  private String countryOfGoverningLaw;

  public static final String JSON_PROPERTY_DATE_OF_INCORPORATION = "dateOfIncorporation";
  private String dateOfIncorporation;

  public static final String JSON_PROPERTY_DOING_BUSINESS_AS = "doingBusinessAs";
  private String doingBusinessAs;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS = "principalPlaceOfBusiness";
  private Address principalPlaceOfBusiness;

  public static final String JSON_PROPERTY_REGISTERED_ADDRESS = "registeredAddress";
  private Address registeredAddress;

  public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
  private String registrationNumber;

  public static final String JSON_PROPERTY_TAX_ABSENT = "taxAbsent";
  private Boolean taxAbsent;

  public static final String JSON_PROPERTY_TAX_INFORMATION = "taxInformation";
  private List<TaxInformation> taxInformation = null;

  /**
   * Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**.
   */
  public enum TypeEnum {
    CASHMANAGEMENTTRUST("cashManagementTrust"),
    
    CORPORATEUNITTRUST("corporateUnitTrust"),
    
    DECEASEDESTATE("deceasedEstate"),
    
    DISCRETIONARYINVESTMENTTRUST("discretionaryInvestmentTrust"),
    
    DISCRETIONARYSERVICESMANAGEMENTTRUST("discretionaryServicesManagementTrust"),
    
    DISCRETIONARYTRADINGTRUST("discretionaryTradingTrust"),
    
    FIRSTHOMESAVERACCOUNTSTRUST("firstHomeSaverAccountsTrust"),
    
    FIXEDTRUST("fixedTrust"),
    
    FIXEDUNITTRUST("fixedUnitTrust"),
    
    HYBRIDTRUST("hybridTrust"),
    
    LISTEDPUBLICUNITTRUST("listedPublicUnitTrust"),
    
    OTHERTRUST("otherTrust"),
    
    POOLEDSUPERANNUATIONTRUST("pooledSuperannuationTrust"),
    
    PUBLICTRADINGTRUST("publicTradingTrust"),
    
    UNLISTEDPUBLICUNITTRUST("unlistedPublicUnitTrust");

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

  public static final String JSON_PROPERTY_UNDEFINED_BENEFICIARY_INFO = "undefinedBeneficiaryInfo";
  private List<UndefinedBeneficiary> undefinedBeneficiaryInfo = null;

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   */
  public enum VatAbsenceReasonEnum {
    INDUSTRYEXEMPTION("industryExemption"),
    
    BELOWTAXTHRESHOLD("belowTaxThreshold");

    private String value;

    VatAbsenceReasonEnum(String value) {
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
    public static VatAbsenceReasonEnum fromValue(String value) {
      for (VatAbsenceReasonEnum b : VatAbsenceReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VAT_ABSENCE_REASON = "vatAbsenceReason";
  private VatAbsenceReasonEnum vatAbsenceReason;

  public static final String JSON_PROPERTY_VAT_NUMBER = "vatNumber";
  private String vatNumber;

  public Trust() { 
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
   *
   * @param countryOfGoverningLaw
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust countryOfGoverningLaw(String countryOfGoverningLaw) {
    this.countryOfGoverningLaw = countryOfGoverningLaw;
    return this;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
   * @return countryOfGoverningLaw
   */
  @ApiModelProperty(required = true, value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountryOfGoverningLaw() {
    return countryOfGoverningLaw;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
   *
   * @param countryOfGoverningLaw
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryOfGoverningLaw(String countryOfGoverningLaw) {
    this.countryOfGoverningLaw = countryOfGoverningLaw;
  }

  /**
   * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
   *
   * @param dateOfIncorporation
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust dateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

  /**
   * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
   * @return dateOfIncorporation
   */
  @ApiModelProperty(value = "The date when the legal arrangement was incorporated in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDateOfIncorporation() {
    return dateOfIncorporation;
  }

  /**
   * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
   *
   * @param dateOfIncorporation
   */ 
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }

  /**
   * The registered name, if different from the &#x60;name&#x60;.
   *
   * @param doingBusinessAs
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust doingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

  /**
   * The registered name, if different from the &#x60;name&#x60;.
   * @return doingBusinessAs
   */
  @ApiModelProperty(value = "The registered name, if different from the `name`.")
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }

  /**
   * The registered name, if different from the &#x60;name&#x60;.
   *
   * @param doingBusinessAs
   */ 
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }

  /**
   * The legal name.
   *
   * @param name
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The legal name.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The legal name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * The legal name.
   *
   * @param name
   */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  /**
   * principalPlaceOfBusiness
   *
   * @param principalPlaceOfBusiness
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust principalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
    return this;
  }

  /**
   * principalPlaceOfBusiness
   * @return principalPlaceOfBusiness
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getPrincipalPlaceOfBusiness() {
    return principalPlaceOfBusiness;
  }

  /**
   * principalPlaceOfBusiness
   *
   * @param principalPlaceOfBusiness
   */ 
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
  }

  /**
   * registeredAddress
   *
   * @param registeredAddress
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust registeredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
    return this;
  }

  /**
   * registeredAddress
   * @return registeredAddress
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGISTERED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getRegisteredAddress() {
    return registeredAddress;
  }

  /**
   * registeredAddress
   *
   * @param registeredAddress
   */ 
  @JsonProperty(JSON_PROPERTY_REGISTERED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisteredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
  }

  /**
   * The registration number.
   *
   * @param registrationNumber
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * The registration number.
   * @return registrationNumber
   */
  @ApiModelProperty(value = "The registration number.")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  /**
   * The registration number.
   *
   * @param registrationNumber
   */ 
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  /**
   * The tax information is absent.
   *
   * @param taxAbsent
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust taxAbsent(Boolean taxAbsent) {
    this.taxAbsent = taxAbsent;
    return this;
  }

  /**
   * The tax information is absent.
   * @return taxAbsent
   */
  @ApiModelProperty(value = "The tax information is absent.")
  @JsonProperty(JSON_PROPERTY_TAX_ABSENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTaxAbsent() {
    return taxAbsent;
  }

  /**
   * The tax information is absent.
   *
   * @param taxAbsent
   */ 
  @JsonProperty(JSON_PROPERTY_TAX_ABSENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAbsent(Boolean taxAbsent) {
    this.taxAbsent = taxAbsent;
  }

  /**
   * The tax information of the entity.
   *
   * @param taxInformation
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust taxInformation(List<TaxInformation> taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

  public Trust addTaxInformationItem(TaxInformation taxInformationItem) {
    if (this.taxInformation == null) {
      this.taxInformation = new ArrayList<>();
    }
    this.taxInformation.add(taxInformationItem);
    return this;
  }

  /**
   * The tax information of the entity.
   * @return taxInformation
   */
  @ApiModelProperty(value = "The tax information of the entity.")
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TaxInformation> getTaxInformation() {
    return taxInformation;
  }

  /**
   * The tax information of the entity.
   *
   * @param taxInformation
   */ 
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxInformation(List<TaxInformation> taxInformation) {
    this.taxInformation = taxInformation;
  }

  /**
   * Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**.
   *
   * @param type
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The undefined beneficiary information of the entity.
   *
   * @param undefinedBeneficiaryInfo
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust undefinedBeneficiaryInfo(List<UndefinedBeneficiary> undefinedBeneficiaryInfo) {
    this.undefinedBeneficiaryInfo = undefinedBeneficiaryInfo;
    return this;
  }

  public Trust addUndefinedBeneficiaryInfoItem(UndefinedBeneficiary undefinedBeneficiaryInfoItem) {
    if (this.undefinedBeneficiaryInfo == null) {
      this.undefinedBeneficiaryInfo = new ArrayList<>();
    }
    this.undefinedBeneficiaryInfo.add(undefinedBeneficiaryInfoItem);
    return this;
  }

  /**
   * The undefined beneficiary information of the entity.
   * @return undefinedBeneficiaryInfo
   */
  @ApiModelProperty(value = "The undefined beneficiary information of the entity.")
  @JsonProperty(JSON_PROPERTY_UNDEFINED_BENEFICIARY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UndefinedBeneficiary> getUndefinedBeneficiaryInfo() {
    return undefinedBeneficiaryInfo;
  }

  /**
   * The undefined beneficiary information of the entity.
   *
   * @param undefinedBeneficiaryInfo
   */ 
  @JsonProperty(JSON_PROPERTY_UNDEFINED_BENEFICIARY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUndefinedBeneficiaryInfo(List<UndefinedBeneficiary> undefinedBeneficiaryInfo) {
    this.undefinedBeneficiaryInfo = undefinedBeneficiaryInfo;
  }

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   *
   * @param vatAbsenceReason
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust vatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
    return this;
  }

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   * @return vatAbsenceReason
   */
  @ApiModelProperty(value = "The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.")
  @JsonProperty(JSON_PROPERTY_VAT_ABSENCE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VatAbsenceReasonEnum getVatAbsenceReason() {
    return vatAbsenceReason;
  }

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   *
   * @param vatAbsenceReason
   */ 
  @JsonProperty(JSON_PROPERTY_VAT_ABSENCE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
  }

  /**
   * The VAT number.
   *
   * @param vatNumber
   * @return the current {@code Trust} instance, allowing for method chaining
   */
  public Trust vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * The VAT number.
   * @return vatNumber
   */
  @ApiModelProperty(value = "The VAT number.")
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVatNumber() {
    return vatNumber;
  }

  /**
   * The VAT number.
   *
   * @param vatNumber
   */ 
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  /**
   * Return true if this Trust object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trust trust = (Trust) o;
    return Objects.equals(this.countryOfGoverningLaw, trust.countryOfGoverningLaw) &&
        Objects.equals(this.dateOfIncorporation, trust.dateOfIncorporation) &&
        Objects.equals(this.doingBusinessAs, trust.doingBusinessAs) &&
        Objects.equals(this.name, trust.name) &&
        Objects.equals(this.principalPlaceOfBusiness, trust.principalPlaceOfBusiness) &&
        Objects.equals(this.registeredAddress, trust.registeredAddress) &&
        Objects.equals(this.registrationNumber, trust.registrationNumber) &&
        Objects.equals(this.taxAbsent, trust.taxAbsent) &&
        Objects.equals(this.taxInformation, trust.taxInformation) &&
        Objects.equals(this.type, trust.type) &&
        Objects.equals(this.undefinedBeneficiaryInfo, trust.undefinedBeneficiaryInfo) &&
        Objects.equals(this.vatAbsenceReason, trust.vatAbsenceReason) &&
        Objects.equals(this.vatNumber, trust.vatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfGoverningLaw, dateOfIncorporation, doingBusinessAs, name, principalPlaceOfBusiness, registeredAddress, registrationNumber, taxAbsent, taxInformation, type, undefinedBeneficiaryInfo, vatAbsenceReason, vatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trust {\n");
    sb.append("    countryOfGoverningLaw: ").append(toIndentedString(countryOfGoverningLaw)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    principalPlaceOfBusiness: ").append(toIndentedString(principalPlaceOfBusiness)).append("\n");
    sb.append("    registeredAddress: ").append(toIndentedString(registeredAddress)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    taxAbsent: ").append(toIndentedString(taxAbsent)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    undefinedBeneficiaryInfo: ").append(toIndentedString(undefinedBeneficiaryInfo)).append("\n");
    sb.append("    vatAbsenceReason: ").append(toIndentedString(vatAbsenceReason)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
   * Create an instance of Trust given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Trust
   * @throws JsonProcessingException if the JSON string is invalid with respect to Trust
   */
  public static Trust fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Trust.class);
  }
/**
  * Convert an instance of Trust to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
