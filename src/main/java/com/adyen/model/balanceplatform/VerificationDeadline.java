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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * VerificationDeadline
 */
@JsonPropertyOrder({
  VerificationDeadline.JSON_PROPERTY_CAPABILITIES,
  VerificationDeadline.JSON_PROPERTY_ENTITY_IDS,
  VerificationDeadline.JSON_PROPERTY_EXPIRES_AT
})
//pojo

public class VerificationDeadline {
  /**
   * Gets or Sets capabilities
   */
  public enum CapabilitiesEnum {
    ACCEPTEXTERNALFUNDING("acceptExternalFunding"),
    
    ACCEPTPSPFUNDING("acceptPspFunding"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIES("acceptTransactionInRestrictedCountries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCOMMERCIAL("acceptTransactionInRestrictedCountriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCONSUMER("acceptTransactionInRestrictedCountriesConsumer"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIES("acceptTransactionInRestrictedIndustries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCOMMERCIAL("acceptTransactionInRestrictedIndustriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCONSUMER("acceptTransactionInRestrictedIndustriesConsumer"),
    
    ACQUIRING("acquiring"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALCOMMERCIAL("atmWithdrawalCommercial"),
    
    ATMWITHDRAWALCONSUMER("atmWithdrawalConsumer"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIES("atmWithdrawalInRestrictedCountries"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCOMMERCIAL("atmWithdrawalInRestrictedCountriesCommercial"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCONSUMER("atmWithdrawalInRestrictedCountriesConsumer"),
    
    AUTHORISEDPAYMENTINSTRUMENTUSER("authorisedPaymentInstrumentUser"),
    
    GETGRANTOFFERS("getGrantOffers"),
    
    ISSUEBANKACCOUNT("issueBankAccount"),
    
    ISSUECARD("issueCard"),
    
    ISSUECARDCOMMERCIAL("issueCardCommercial"),
    
    ISSUECARDCONSUMER("issueCardConsumer"),
    
    ISSUECREDITLIMIT("issueCreditLimit"),
    
    LOCALACCEPTANCE("localAcceptance"),
    
    PAYOUT("payout"),
    
    PAYOUTTOTRANSFERINSTRUMENT("payoutToTransferInstrument"),
    
    PROCESSING("processing"),
    
    RECEIVEFROMBALANCEACCOUNT("receiveFromBalanceAccount"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    RECEIVEFROMTHIRDPARTY("receiveFromThirdParty"),
    
    RECEIVEFROMTRANSFERINSTRUMENT("receiveFromTransferInstrument"),
    
    RECEIVEGRANTS("receiveGrants"),
    
    RECEIVEPAYMENTS("receivePayments"),
    
    SENDTOBALANCEACCOUNT("sendToBalanceAccount"),
    
    SENDTOTHIRDPARTY("sendToThirdParty"),
    
    SENDTOTRANSFERINSTRUMENT("sendToTransferInstrument"),
    
    THIRDPARTYFUNDING("thirdPartyFunding"),
    
    USECARD("useCard"),
    
    USECARDCOMMERCIAL("useCardCommercial"),
    
    USECARDCONSUMER("useCardConsumer"),
    
    USECARDINRESTRICTEDCOUNTRIES("useCardInRestrictedCountries"),
    
    USECARDINRESTRICTEDCOUNTRIESCOMMERCIAL("useCardInRestrictedCountriesCommercial"),
    
    USECARDINRESTRICTEDCOUNTRIESCONSUMER("useCardInRestrictedCountriesConsumer"),
    
    USECARDINRESTRICTEDINDUSTRIES("useCardInRestrictedIndustries"),
    
    USECARDINRESTRICTEDINDUSTRIESCOMMERCIAL("useCardInRestrictedIndustriesCommercial"),
    
    USECARDINRESTRICTEDINDUSTRIESCONSUMER("useCardInRestrictedIndustriesConsumer"),
    
    WITHDRAWFROMATM("withdrawFromAtm"),
    
    WITHDRAWFROMATMCOMMERCIAL("withdrawFromAtmCommercial"),
    
    WITHDRAWFROMATMCONSUMER("withdrawFromAtmConsumer"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIES("withdrawFromAtmInRestrictedCountries"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCOMMERCIAL("withdrawFromAtmInRestrictedCountriesCommercial"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCONSUMER("withdrawFromAtmInRestrictedCountriesConsumer");

    private String value;

    CapabilitiesEnum(String value) {
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
    public static CapabilitiesEnum fromValue(String value) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private List<CapabilitiesEnum> capabilities = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTITY_IDS = "entityIds";
  private List<String> entityIds = null;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
  private OffsetDateTime expiresAt;

  public VerificationDeadline() { 
  }

  /**
   * The names of the capabilities to be disallowed.
   *
   * @param capabilities
   * @return the current {@code VerificationDeadline} instance, allowing for method chaining
   */
  public VerificationDeadline capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public VerificationDeadline addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * The names of the capabilities to be disallowed.
   * @return capabilities
   */
  @ApiModelProperty(required = true, value = "The names of the capabilities to be disallowed.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }

  /**
   * The names of the capabilities to be disallowed.
   *
   * @param capabilities
   */ 
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The unique identifiers of the bank account(s) that the deadline applies to
   *
   * @param entityIds
   * @return the current {@code VerificationDeadline} instance, allowing for method chaining
   */
  public VerificationDeadline entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public VerificationDeadline addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * The unique identifiers of the bank account(s) that the deadline applies to
   * @return entityIds
   */
  @ApiModelProperty(value = "The unique identifiers of the bank account(s) that the deadline applies to")
  @JsonProperty(JSON_PROPERTY_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEntityIds() {
    return entityIds;
  }

  /**
   * The unique identifiers of the bank account(s) that the deadline applies to
   *
   * @param entityIds
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

  /**
   * The date that verification is due by before capabilities are disallowed.
   *
   * @param expiresAt
   * @return the current {@code VerificationDeadline} instance, allowing for method chaining
   */
  public VerificationDeadline expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The date that verification is due by before capabilities are disallowed.
   * @return expiresAt
   */
  @ApiModelProperty(required = true, value = "The date that verification is due by before capabilities are disallowed.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  /**
   * The date that verification is due by before capabilities are disallowed.
   *
   * @param expiresAt
   */ 
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Return true if this VerificationDeadline object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationDeadline verificationDeadline = (VerificationDeadline) o;
    return Objects.equals(this.capabilities, verificationDeadline.capabilities) &&
        Objects.equals(this.entityIds, verificationDeadline.entityIds) &&
        Objects.equals(this.expiresAt, verificationDeadline.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, entityIds, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationDeadline {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
   * Create an instance of VerificationDeadline given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationDeadline
   * @throws JsonProcessingException if the JSON string is invalid with respect to VerificationDeadline
   */
  public static VerificationDeadline fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, VerificationDeadline.class);
  }
/**
  * Convert an instance of VerificationDeadline to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
