/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * ThreeDSecureData
 */
@JsonPropertyOrder({
  ThreeDSecureData.JSON_PROPERTY_AUTHENTICATION_RESPONSE,
  ThreeDSecureData.JSON_PROPERTY_CAVV,
  ThreeDSecureData.JSON_PROPERTY_CAVV_ALGORITHM,
  ThreeDSecureData.JSON_PROPERTY_CHALLENGE_CANCEL,
  ThreeDSecureData.JSON_PROPERTY_DIRECTORY_RESPONSE,
  ThreeDSecureData.JSON_PROPERTY_DS_TRANS_I_D,
  ThreeDSecureData.JSON_PROPERTY_ECI,
  ThreeDSecureData.JSON_PROPERTY_RISK_SCORE,
  ThreeDSecureData.JSON_PROPERTY_THREE_D_S_VERSION,
  ThreeDSecureData.JSON_PROPERTY_TOKEN_AUTHENTICATION_VERIFICATION_VALUE,
  ThreeDSecureData.JSON_PROPERTY_TRANS_STATUS_REASON,
  ThreeDSecureData.JSON_PROPERTY_XID
})
//pojo

public class ThreeDSecureData {
  /**
   * In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the challenge result. If the transaction was frictionless, omit this parameter.
   */
  public enum AuthenticationResponseEnum {
    Y("Y"),
    
    N("N"),
    
    U("U"),
    
    A("A");

    private String value;

    AuthenticationResponseEnum(String value) {
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
    public static AuthenticationResponseEnum fromValue(String value) {
      for (AuthenticationResponseEnum b : AuthenticationResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTHENTICATION_RESPONSE = "authenticationResponse";
  private AuthenticationResponseEnum authenticationResponse;

  public static final String JSON_PROPERTY_CAVV = "cavv";
  private byte[] cavv;

  public static final String JSON_PROPERTY_CAVV_ALGORITHM = "cavvAlgorithm";
  private String cavvAlgorithm;

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
   * In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the &#x60;ARes&#x60;.
   */
  public enum DirectoryResponseEnum {
    A("A"),
    
    C("C"),
    
    D("D"),
    
    I("I"),
    
    N("N"),
    
    R("R"),
    
    U("U"),
    
    Y("Y");

    private String value;

    DirectoryResponseEnum(String value) {
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
    public static DirectoryResponseEnum fromValue(String value) {
      for (DirectoryResponseEnum b : DirectoryResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTORY_RESPONSE = "directoryResponse";
  private DirectoryResponseEnum directoryResponse;

  public static final String JSON_PROPERTY_DS_TRANS_I_D = "dsTransID";
  private String dsTransID;

  public static final String JSON_PROPERTY_ECI = "eci";
  private String eci;

  public static final String JSON_PROPERTY_RISK_SCORE = "riskScore";
  private String riskScore;

  public static final String JSON_PROPERTY_THREE_D_S_VERSION = "threeDSVersion";
  private String threeDSVersion;

  public static final String JSON_PROPERTY_TOKEN_AUTHENTICATION_VERIFICATION_VALUE = "tokenAuthenticationVerificationValue";
  private byte[] tokenAuthenticationVerificationValue;

  public static final String JSON_PROPERTY_TRANS_STATUS_REASON = "transStatusReason";
  private String transStatusReason;

  public static final String JSON_PROPERTY_XID = "xid";
  private byte[] xid;

  public ThreeDSecureData() { 
  }

  /**
   * In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the challenge result. If the transaction was frictionless, omit this parameter.
   *
   * @param authenticationResponse
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData authenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
    return this;
  }

  /**
   * In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the challenge result. If the transaction was frictionless, omit this parameter.
   * @return authenticationResponse
   */
  @ApiModelProperty(value = "In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the `transStatus` from the challenge result. If the transaction was frictionless, omit this parameter.")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthenticationResponseEnum getAuthenticationResponse() {
    return authenticationResponse;
  }

  /**
   * In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the challenge result. If the transaction was frictionless, omit this parameter.
   *
   * @param authenticationResponse
   */ 
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  /**
   * The cardholder authentication value (base64 encoded, 20 bytes in a decoded form).
   *
   * @param cavv
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData cavv(byte[] cavv) {
    this.cavv = cavv;
    return this;
  }

  /**
   * The cardholder authentication value (base64 encoded, 20 bytes in a decoded form).
   * @return cavv
   */
  @ApiModelProperty(value = "The cardholder authentication value (base64 encoded, 20 bytes in a decoded form).")
  @JsonProperty(JSON_PROPERTY_CAVV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public byte[] getCavv() {
    return cavv;
  }

  /**
   * The cardholder authentication value (base64 encoded, 20 bytes in a decoded form).
   *
   * @param cavv
   */ 
  @JsonProperty(JSON_PROPERTY_CAVV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCavv(byte[] cavv) {
    this.cavv = cavv;
  }

  /**
   * The CAVV algorithm used. Include this only for 3D Secure 1.
   *
   * @param cavvAlgorithm
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

  /**
   * The CAVV algorithm used. Include this only for 3D Secure 1.
   * @return cavvAlgorithm
   */
  @ApiModelProperty(value = "The CAVV algorithm used. Include this only for 3D Secure 1.")
  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }

  /**
   * The CAVV algorithm used. Include this only for 3D Secure 1.
   *
   * @param cavvAlgorithm
   */ 
  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }

  /**
   * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
   *
   * @param challengeCancel
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData challengeCancel(ChallengeCancelEnum challengeCancel) {
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
   * In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the &#x60;ARes&#x60;.
   *
   * @param directoryResponse
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData directoryResponse(DirectoryResponseEnum directoryResponse) {
    this.directoryResponse = directoryResponse;
    return this;
  }

  /**
   * In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the &#x60;ARes&#x60;.
   * @return directoryResponse
   */
  @ApiModelProperty(value = "In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the `transStatus` from the `ARes`.")
  @JsonProperty(JSON_PROPERTY_DIRECTORY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DirectoryResponseEnum getDirectoryResponse() {
    return directoryResponse;
  }

  /**
   * In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the &#x60;ARes&#x60;.
   *
   * @param directoryResponse
   */ 
  @JsonProperty(JSON_PROPERTY_DIRECTORY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoryResponse(DirectoryResponseEnum directoryResponse) {
    this.directoryResponse = directoryResponse;
  }

  /**
   * Supported for 3D Secure 2. The unique transaction identifier assigned by the Directory Server (DS) to identify a single transaction.
   *
   * @param dsTransID
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData dsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
    return this;
  }

  /**
   * Supported for 3D Secure 2. The unique transaction identifier assigned by the Directory Server (DS) to identify a single transaction.
   * @return dsTransID
   */
  @ApiModelProperty(value = "Supported for 3D Secure 2. The unique transaction identifier assigned by the Directory Server (DS) to identify a single transaction.")
  @JsonProperty(JSON_PROPERTY_DS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDsTransID() {
    return dsTransID;
  }

  /**
   * Supported for 3D Secure 2. The unique transaction identifier assigned by the Directory Server (DS) to identify a single transaction.
   *
   * @param dsTransID
   */ 
  @JsonProperty(JSON_PROPERTY_DS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
  }

  /**
   * The electronic commerce indicator.
   *
   * @param eci
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData eci(String eci) {
    this.eci = eci;
    return this;
  }

  /**
   * The electronic commerce indicator.
   * @return eci
   */
  @ApiModelProperty(value = "The electronic commerce indicator.")
  @JsonProperty(JSON_PROPERTY_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEci() {
    return eci;
  }

  /**
   * The electronic commerce indicator.
   *
   * @param eci
   */ 
  @JsonProperty(JSON_PROPERTY_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEci(String eci) {
    this.eci = eci;
  }

  /**
   * Risk score calculated by Directory Server (DS). Required for Cartes Bancaires integrations.
   *
   * @param riskScore
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData riskScore(String riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Risk score calculated by Directory Server (DS). Required for Cartes Bancaires integrations.
   * @return riskScore
   */
  @ApiModelProperty(value = "Risk score calculated by Directory Server (DS). Required for Cartes Bancaires integrations.")
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRiskScore() {
    return riskScore;
  }

  /**
   * Risk score calculated by Directory Server (DS). Required for Cartes Bancaires integrations.
   *
   * @param riskScore
   */ 
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskScore(String riskScore) {
    this.riskScore = riskScore;
  }

  /**
   * The version of the 3D Secure protocol.
   *
   * @param threeDSVersion
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData threeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
    return this;
  }

  /**
   * The version of the 3D Secure protocol.
   * @return threeDSVersion
   */
  @ApiModelProperty(value = "The version of the 3D Secure protocol.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getThreeDSVersion() {
    return threeDSVersion;
  }

  /**
   * The version of the 3D Secure protocol.
   *
   * @param threeDSVersion
   */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
  }

  /**
   * Network token authentication verification value (TAVV). The network token cryptogram.
   *
   * @param tokenAuthenticationVerificationValue
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData tokenAuthenticationVerificationValue(byte[] tokenAuthenticationVerificationValue) {
    this.tokenAuthenticationVerificationValue = tokenAuthenticationVerificationValue;
    return this;
  }

  /**
   * Network token authentication verification value (TAVV). The network token cryptogram.
   * @return tokenAuthenticationVerificationValue
   */
  @ApiModelProperty(value = "Network token authentication verification value (TAVV). The network token cryptogram.")
  @JsonProperty(JSON_PROPERTY_TOKEN_AUTHENTICATION_VERIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public byte[] getTokenAuthenticationVerificationValue() {
    return tokenAuthenticationVerificationValue;
  }

  /**
   * Network token authentication verification value (TAVV). The network token cryptogram.
   *
   * @param tokenAuthenticationVerificationValue
   */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_AUTHENTICATION_VERIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenAuthenticationVerificationValue(byte[] tokenAuthenticationVerificationValue) {
    this.tokenAuthenticationVerificationValue = tokenAuthenticationVerificationValue;
  }

  /**
   * Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).
   *
   * @param transStatusReason
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData transStatusReason(String transStatusReason) {
    this.transStatusReason = transStatusReason;
    return this;
  }

  /**
   * Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).
   * @return transStatusReason
   */
  @ApiModelProperty(value = "Provides information on why the `transStatus` field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).")
  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransStatusReason() {
    return transStatusReason;
  }

  /**
   * Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).
   *
   * @param transStatusReason
   */ 
  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransStatusReason(String transStatusReason) {
    this.transStatusReason = transStatusReason;
  }

  /**
   * Supported for 3D Secure 1. The transaction identifier (Base64-encoded, 20 bytes in a decoded form).
   *
   * @param xid
   * @return the current {@code ThreeDSecureData} instance, allowing for method chaining
   */
  public ThreeDSecureData xid(byte[] xid) {
    this.xid = xid;
    return this;
  }

  /**
   * Supported for 3D Secure 1. The transaction identifier (Base64-encoded, 20 bytes in a decoded form).
   * @return xid
   */
  @ApiModelProperty(value = "Supported for 3D Secure 1. The transaction identifier (Base64-encoded, 20 bytes in a decoded form).")
  @JsonProperty(JSON_PROPERTY_XID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public byte[] getXid() {
    return xid;
  }

  /**
   * Supported for 3D Secure 1. The transaction identifier (Base64-encoded, 20 bytes in a decoded form).
   *
   * @param xid
   */ 
  @JsonProperty(JSON_PROPERTY_XID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXid(byte[] xid) {
    this.xid = xid;
  }

  /**
   * Return true if this ThreeDSecureData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureData threeDSecureData = (ThreeDSecureData) o;
    return Objects.equals(this.authenticationResponse, threeDSecureData.authenticationResponse) &&
        Arrays.equals(this.cavv, threeDSecureData.cavv) &&
        Objects.equals(this.cavvAlgorithm, threeDSecureData.cavvAlgorithm) &&
        Objects.equals(this.challengeCancel, threeDSecureData.challengeCancel) &&
        Objects.equals(this.directoryResponse, threeDSecureData.directoryResponse) &&
        Objects.equals(this.dsTransID, threeDSecureData.dsTransID) &&
        Objects.equals(this.eci, threeDSecureData.eci) &&
        Objects.equals(this.riskScore, threeDSecureData.riskScore) &&
        Objects.equals(this.threeDSVersion, threeDSecureData.threeDSVersion) &&
        Arrays.equals(this.tokenAuthenticationVerificationValue, threeDSecureData.tokenAuthenticationVerificationValue) &&
        Objects.equals(this.transStatusReason, threeDSecureData.transStatusReason) &&
        Arrays.equals(this.xid, threeDSecureData.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationResponse, Arrays.hashCode(cavv), cavvAlgorithm, challengeCancel, directoryResponse, dsTransID, eci, riskScore, threeDSVersion, Arrays.hashCode(tokenAuthenticationVerificationValue), transStatusReason, Arrays.hashCode(xid));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureData {\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    challengeCancel: ").append(toIndentedString(challengeCancel)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
    sb.append("    dsTransID: ").append(toIndentedString(dsTransID)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
    sb.append("    tokenAuthenticationVerificationValue: ").append(toIndentedString(tokenAuthenticationVerificationValue)).append("\n");
    sb.append("    transStatusReason: ").append(toIndentedString(transStatusReason)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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
   * Create an instance of ThreeDSecureData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThreeDSecureData
   * @throws JsonProcessingException if the JSON string is invalid with respect to ThreeDSecureData
   */
  public static ThreeDSecureData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ThreeDSecureData.class);
  }
/**
  * Convert an instance of ThreeDSecureData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
