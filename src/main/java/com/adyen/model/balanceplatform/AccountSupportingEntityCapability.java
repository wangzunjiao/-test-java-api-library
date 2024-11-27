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
 * AccountSupportingEntityCapability
 */
@JsonPropertyOrder({
  AccountSupportingEntityCapability.JSON_PROPERTY_ALLOWED,
  AccountSupportingEntityCapability.JSON_PROPERTY_ALLOWED_LEVEL,
  AccountSupportingEntityCapability.JSON_PROPERTY_ENABLED,
  AccountSupportingEntityCapability.JSON_PROPERTY_ID,
  AccountSupportingEntityCapability.JSON_PROPERTY_REQUESTED,
  AccountSupportingEntityCapability.JSON_PROPERTY_REQUESTED_LEVEL,
  AccountSupportingEntityCapability.JSON_PROPERTY_VERIFICATION_STATUS
})

public class AccountSupportingEntityCapability {
  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum AllowedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    AllowedLevelEnum(String value) {
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
    public static AllowedLevelEnum fromValue(String value) {
      for (AllowedLevelEnum b : AllowedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED_LEVEL = "allowedLevel";
  private AllowedLevelEnum allowedLevel;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REQUESTED = "requested";
  private Boolean requested;

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum RequestedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    RequestedLevelEnum(String value) {
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
    public static RequestedLevelEnum fromValue(String value) {
      for (RequestedLevelEnum b : RequestedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUESTED_LEVEL = "requestedLevel";
  private RequestedLevelEnum requestedLevel;

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   */
  public enum VerificationStatusEnum {
    INVALID("invalid"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
    VALID("valid");

    private String value;

    VerificationStatusEnum(String value) {
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
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verificationStatus";
  private VerificationStatusEnum verificationStatus;

  public AccountSupportingEntityCapability() { 
  }

  /**
   * Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   *
   * @param allowed
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   * @return allowed
   */
  @ApiModelProperty(value = "Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.")
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowed() {
    return allowed;
  }

  /**
   * Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   *
   * @param allowed
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   *
   * @param allowedLevel
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability allowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
    return this;
  }

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return allowedLevel
   */
  @ApiModelProperty(value = "The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AllowedLevelEnum getAllowedLevel() {
    return allowedLevel;
  }

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   *
   * @param allowedLevel
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
  }

  /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   *
   * @param enabled
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   * @return enabled
   */
  @ApiModelProperty(value = "Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   *
   * @param enabled
   */ 
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The ID of the supporting entity.
   *
   * @param id
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the supporting entity.
   * @return id
   */
  @ApiModelProperty(value = "The ID of the supporting entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The ID of the supporting entity.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field.
   *
   * @param requested
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability requested(Boolean requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field.
   * @return requested
   */
  @ApiModelProperty(value = "Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the `allowed` field.")
  @JsonProperty(JSON_PROPERTY_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequested() {
    return requested;
  }

  /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field.
   *
   * @param requested
   */ 
  @JsonProperty(JSON_PROPERTY_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequested(Boolean requested) {
    this.requested = requested;
  }

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   *
   * @param requestedLevel
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability requestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
    return this;
  }

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return requestedLevel
   */
  @ApiModelProperty(value = "The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.")
  @JsonProperty(JSON_PROPERTY_REQUESTED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RequestedLevelEnum getRequestedLevel() {
    return requestedLevel;
  }

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   *
   * @param requestedLevel
   */ 
  @JsonProperty(JSON_PROPERTY_REQUESTED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
  }

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   *
   * @param verificationStatus
   * @return the current {@code AccountSupportingEntityCapability} instance, allowing for method chaining
   */
  public AccountSupportingEntityCapability verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   * @return verificationStatus
   */
  @ApiModelProperty(value = "The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. ")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   *
   * @param verificationStatus
   */ 
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  /**
   * Return true if this AccountSupportingEntityCapability object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSupportingEntityCapability accountSupportingEntityCapability = (AccountSupportingEntityCapability) o;
    return Objects.equals(this.allowed, accountSupportingEntityCapability.allowed) &&
        Objects.equals(this.allowedLevel, accountSupportingEntityCapability.allowedLevel) &&
        Objects.equals(this.enabled, accountSupportingEntityCapability.enabled) &&
        Objects.equals(this.id, accountSupportingEntityCapability.id) &&
        Objects.equals(this.requested, accountSupportingEntityCapability.requested) &&
        Objects.equals(this.requestedLevel, accountSupportingEntityCapability.requestedLevel) &&
        Objects.equals(this.verificationStatus, accountSupportingEntityCapability.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, allowedLevel, enabled, id, requested, requestedLevel, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSupportingEntityCapability {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    allowedLevel: ").append(toIndentedString(allowedLevel)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    requestedLevel: ").append(toIndentedString(requestedLevel)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
   * Create an instance of AccountSupportingEntityCapability given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountSupportingEntityCapability
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountSupportingEntityCapability
   */
  public static AccountSupportingEntityCapability fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountSupportingEntityCapability.class);
  }
/**
  * Convert an instance of AccountSupportingEntityCapability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
