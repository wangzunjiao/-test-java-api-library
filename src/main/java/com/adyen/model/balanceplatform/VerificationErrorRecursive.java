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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.RemediatingAction;
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
 * VerificationErrorRecursive
 */
@JsonPropertyOrder({
  VerificationErrorRecursive.JSON_PROPERTY_CAPABILITIES,
  VerificationErrorRecursive.JSON_PROPERTY_CODE,
  VerificationErrorRecursive.JSON_PROPERTY_MESSAGE,
  VerificationErrorRecursive.JSON_PROPERTY_TYPE,
  VerificationErrorRecursive.JSON_PROPERTY_REMEDIATING_ACTIONS
})
@JsonTypeName("VerificationError-recursive")

public class VerificationErrorRecursive {
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
  private List<CapabilitiesEnum> capabilities = null;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  /**
   * The type of error.   Possible values: **invalidInput**, **dataMissing**.
   */
  public enum TypeEnum {
    DATAMISSING("dataMissing"),
    
    INVALIDINPUT("invalidInput"),
    
    PENDINGSTATUS("pendingStatus");

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

  public static final String JSON_PROPERTY_REMEDIATING_ACTIONS = "remediatingActions";
  private List<RemediatingAction> remediatingActions = null;

  public VerificationErrorRecursive() { 
  }

  /**
   * Contains the capabilities that the verification error applies to.
   *
   * @param capabilities
   * @return the current {@code VerificationErrorRecursive} instance, allowing for method chaining
   */
  public VerificationErrorRecursive capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public VerificationErrorRecursive addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Contains the capabilities that the verification error applies to.
   * @return capabilities
   */
  @ApiModelProperty(value = "Contains the capabilities that the verification error applies to.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }

  /**
   * Contains the capabilities that the verification error applies to.
   *
   * @param capabilities
   */ 
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The verification error code.
   *
   * @param code
   * @return the current {@code VerificationErrorRecursive} instance, allowing for method chaining
   */
  public VerificationErrorRecursive code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The verification error code.
   * @return code
   */
  @ApiModelProperty(value = "The verification error code.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  /**
   * The verification error code.
   *
   * @param code
   */ 
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A description of the error.
   *
   * @param message
   * @return the current {@code VerificationErrorRecursive} instance, allowing for method chaining
   */
  public VerificationErrorRecursive message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A description of the error.
   * @return message
   */
  @ApiModelProperty(value = "A description of the error.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  /**
   * A description of the error.
   *
   * @param message
   */ 
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The type of error.   Possible values: **invalidInput**, **dataMissing**.
   *
   * @param type
   * @return the current {@code VerificationErrorRecursive} instance, allowing for method chaining
   */
  public VerificationErrorRecursive type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error.   Possible values: **invalidInput**, **dataMissing**.
   * @return type
   */
  @ApiModelProperty(value = "The type of error.   Possible values: **invalidInput**, **dataMissing**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of error.   Possible values: **invalidInput**, **dataMissing**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Contains the actions that you can take to resolve the verification error.
   *
   * @param remediatingActions
   * @return the current {@code VerificationErrorRecursive} instance, allowing for method chaining
   */
  public VerificationErrorRecursive remediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
    return this;
  }

  public VerificationErrorRecursive addRemediatingActionsItem(RemediatingAction remediatingActionsItem) {
    if (this.remediatingActions == null) {
      this.remediatingActions = new ArrayList<>();
    }
    this.remediatingActions.add(remediatingActionsItem);
    return this;
  }

  /**
   * Contains the actions that you can take to resolve the verification error.
   * @return remediatingActions
   */
  @ApiModelProperty(value = "Contains the actions that you can take to resolve the verification error.")
  @JsonProperty(JSON_PROPERTY_REMEDIATING_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediatingAction> getRemediatingActions() {
    return remediatingActions;
  }

  /**
   * Contains the actions that you can take to resolve the verification error.
   *
   * @param remediatingActions
   */ 
  @JsonProperty(JSON_PROPERTY_REMEDIATING_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
  }

  /**
   * Return true if this VerificationError-recursive object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationErrorRecursive verificationErrorRecursive = (VerificationErrorRecursive) o;
    return Objects.equals(this.capabilities, verificationErrorRecursive.capabilities) &&
        Objects.equals(this.code, verificationErrorRecursive.code) &&
        Objects.equals(this.message, verificationErrorRecursive.message) &&
        Objects.equals(this.type, verificationErrorRecursive.type) &&
        Objects.equals(this.remediatingActions, verificationErrorRecursive.remediatingActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, code, message, type, remediatingActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationErrorRecursive {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remediatingActions: ").append(toIndentedString(remediatingActions)).append("\n");
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
   * Create an instance of VerificationErrorRecursive given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationErrorRecursive
   * @throws JsonProcessingException if the JSON string is invalid with respect to VerificationErrorRecursive
   */
  public static VerificationErrorRecursive fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, VerificationErrorRecursive.class);
  }
/**
  * Convert an instance of VerificationErrorRecursive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
