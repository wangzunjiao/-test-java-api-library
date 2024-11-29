/*
 * Authentication webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.acswebhooks;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * ChallengeInfo
 */
@JsonPropertyOrder({
  ChallengeInfo.JSON_PROPERTY_CHALLENGE_CANCEL,
  ChallengeInfo.JSON_PROPERTY_FLOW,
  ChallengeInfo.JSON_PROPERTY_LAST_INTERACTION,
  ChallengeInfo.JSON_PROPERTY_PHONE_NUMBER,
  ChallengeInfo.JSON_PROPERTY_RESENDS,
  ChallengeInfo.JSON_PROPERTY_RETRIES
})
//pojo

public class ChallengeInfo {
  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   */
  public enum ChallengeCancelEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07");

    private String value;

    ChallengeCancelEnum(String value) {
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
    public static ChallengeCancelEnum fromValue(String value) {
      for (ChallengeCancelEnum b : ChallengeCancelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHALLENGE_CANCEL = "challengeCancel";
  private ChallengeCancelEnum challengeCancel;

  /**
   * The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow
   */
  public enum FlowEnum {
    OTP_SMS("OTP_SMS"),
    
    OOB("OOB");

    private String value;

    FlowEnum(String value) {
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
    public static FlowEnum fromValue(String value) {
      for (FlowEnum b : FlowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FLOW = "flow";
  private FlowEnum flow;

  public static final String JSON_PROPERTY_LAST_INTERACTION = "lastInteraction";
  private OffsetDateTime lastInteraction;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_RESENDS = "resends";
  private Integer resends;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Integer retries;

  public ChallengeInfo() { 
  }

  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   *
   * @param challengeCancel
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo challengeCancel(ChallengeCancelEnum challengeCancel) {
    this.challengeCancel = challengeCancel;
    return this;
  }

  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   * @return challengeCancel
   */
  @ApiModelProperty(value = "Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).")
  @JsonProperty(JSON_PROPERTY_CHALLENGE_CANCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChallengeCancelEnum getChallengeCancel() {
    return challengeCancel;
  }

  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   *
   * @param challengeCancel
   */ 
  @JsonProperty(JSON_PROPERTY_CHALLENGE_CANCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallengeCancel(ChallengeCancelEnum challengeCancel) {
    this.challengeCancel = challengeCancel;
  }

  /**
   * The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow
   *
   * @param flow
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo flow(FlowEnum flow) {
    this.flow = flow;
    return this;
  }

  /**
   * The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow
   * @return flow
   */
  @ApiModelProperty(required = true, value = "The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow")
  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlowEnum getFlow() {
    return flow;
  }

  /**
   * The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow
   *
   * @param flow
   */ 
  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlow(FlowEnum flow) {
    this.flow = flow;
  }

  /**
   * The last time of interaction with the challenge.
   *
   * @param lastInteraction
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo lastInteraction(OffsetDateTime lastInteraction) {
    this.lastInteraction = lastInteraction;
    return this;
  }

  /**
   * The last time of interaction with the challenge.
   * @return lastInteraction
   */
  @ApiModelProperty(required = true, value = "The last time of interaction with the challenge.")
  @JsonProperty(JSON_PROPERTY_LAST_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastInteraction() {
    return lastInteraction;
  }

  /**
   * The last time of interaction with the challenge.
   *
   * @param lastInteraction
   */ 
  @JsonProperty(JSON_PROPERTY_LAST_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastInteraction(OffsetDateTime lastInteraction) {
    this.lastInteraction = lastInteraction;
  }

  /**
   * The last four digits of the phone number used in the challenge.
   *
   * @param phoneNumber
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The last four digits of the phone number used in the challenge.
   * @return phoneNumber
   */
  @ApiModelProperty(value = "The last four digits of the phone number used in the challenge.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The last four digits of the phone number used in the challenge.
   *
   * @param phoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The number of times the one-time password (OTP) was resent during the challenge.
   *
   * @param resends
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo resends(Integer resends) {
    this.resends = resends;
    return this;
  }

  /**
   * The number of times the one-time password (OTP) was resent during the challenge.
   * @return resends
   */
  @ApiModelProperty(value = "The number of times the one-time password (OTP) was resent during the challenge.")
  @JsonProperty(JSON_PROPERTY_RESENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getResends() {
    return resends;
  }

  /**
   * The number of times the one-time password (OTP) was resent during the challenge.
   *
   * @param resends
   */ 
  @JsonProperty(JSON_PROPERTY_RESENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResends(Integer resends) {
    this.resends = resends;
  }

  /**
   * The number of retries used in the challenge.
   *
   * @param retries
   * @return the current {@code ChallengeInfo} instance, allowing for method chaining
   */
  public ChallengeInfo retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of retries used in the challenge.
   * @return retries
   */
  @ApiModelProperty(value = "The number of retries used in the challenge.")
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRetries() {
    return retries;
  }

  /**
   * The number of retries used in the challenge.
   *
   * @param retries
   */ 
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  /**
   * Return true if this ChallengeInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeInfo challengeInfo = (ChallengeInfo) o;
    return Objects.equals(this.challengeCancel, challengeInfo.challengeCancel) &&
        Objects.equals(this.flow, challengeInfo.flow) &&
        Objects.equals(this.lastInteraction, challengeInfo.lastInteraction) &&
        Objects.equals(this.phoneNumber, challengeInfo.phoneNumber) &&
        Objects.equals(this.resends, challengeInfo.resends) &&
        Objects.equals(this.retries, challengeInfo.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeCancel, flow, lastInteraction, phoneNumber, resends, retries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeInfo {\n");
    sb.append("    challengeCancel: ").append(toIndentedString(challengeCancel)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    lastInteraction: ").append(toIndentedString(lastInteraction)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    resends: ").append(toIndentedString(resends)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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
   * Create an instance of ChallengeInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChallengeInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to ChallengeInfo
   */
  public static ChallengeInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ChallengeInfo.class);
  }
/**
  * Convert an instance of ChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
