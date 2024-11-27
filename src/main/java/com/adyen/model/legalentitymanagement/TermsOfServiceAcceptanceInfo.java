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
 * TermsOfServiceAcceptanceInfo
 */
@JsonPropertyOrder({
  TermsOfServiceAcceptanceInfo.JSON_PROPERTY_ACCEPTED_BY,
  TermsOfServiceAcceptanceInfo.JSON_PROPERTY_ACCEPTED_FOR,
  TermsOfServiceAcceptanceInfo.JSON_PROPERTY_CREATED_AT,
  TermsOfServiceAcceptanceInfo.JSON_PROPERTY_ID,
  TermsOfServiceAcceptanceInfo.JSON_PROPERTY_TYPE
})

public class TermsOfServiceAcceptanceInfo {
  public static final String JSON_PROPERTY_ACCEPTED_BY = "acceptedBy";
  private String acceptedBy;

  public static final String JSON_PROPERTY_ACCEPTED_FOR = "acceptedFor";
  private String acceptedFor;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  
   */
  public enum TypeEnum {
    ADYENACCOUNT("adyenAccount"),
    
    ADYENCAPITAL("adyenCapital"),
    
    ADYENCARD("adyenCard"),
    
    ADYENCHARGECARD("adyenChargeCard"),
    
    ADYENFORPLATFORMSADVANCED("adyenForPlatformsAdvanced"),
    
    ADYENFORPLATFORMSMANAGE("adyenForPlatformsManage"),
    
    ADYENFRANCHISEE("adyenFranchisee"),
    
    ADYENISSUING("adyenIssuing"),
    
    ADYENPCCR("adyenPccr");

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

  public TermsOfServiceAcceptanceInfo() { 
  }

  /**
   * The unique identifier of the user that accepted the Terms of Service.
   *
   * @param acceptedBy
   * @return the current {@code TermsOfServiceAcceptanceInfo} instance, allowing for method chaining
   */
  public TermsOfServiceAcceptanceInfo acceptedBy(String acceptedBy) {
    this.acceptedBy = acceptedBy;
    return this;
  }

  /**
   * The unique identifier of the user that accepted the Terms of Service.
   * @return acceptedBy
   */
  @ApiModelProperty(value = "The unique identifier of the user that accepted the Terms of Service.")
  @JsonProperty(JSON_PROPERTY_ACCEPTED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAcceptedBy() {
    return acceptedBy;
  }

  /**
   * The unique identifier of the user that accepted the Terms of Service.
   *
   * @param acceptedBy
   */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedBy(String acceptedBy) {
    this.acceptedBy = acceptedBy;
  }

  /**
   * The unique identifier of the legal entity for which the Terms of Service are accepted.
   *
   * @param acceptedFor
   * @return the current {@code TermsOfServiceAcceptanceInfo} instance, allowing for method chaining
   */
  public TermsOfServiceAcceptanceInfo acceptedFor(String acceptedFor) {
    this.acceptedFor = acceptedFor;
    return this;
  }

  /**
   * The unique identifier of the legal entity for which the Terms of Service are accepted.
   * @return acceptedFor
   */
  @ApiModelProperty(value = "The unique identifier of the legal entity for which the Terms of Service are accepted.")
  @JsonProperty(JSON_PROPERTY_ACCEPTED_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAcceptedFor() {
    return acceptedFor;
  }

  /**
   * The unique identifier of the legal entity for which the Terms of Service are accepted.
   *
   * @param acceptedFor
   */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTED_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedFor(String acceptedFor) {
    this.acceptedFor = acceptedFor;
  }

  /**
   * The date when the Terms of Service were accepted.
   *
   * @param createdAt
   * @return the current {@code TermsOfServiceAcceptanceInfo} instance, allowing for method chaining
   */
  public TermsOfServiceAcceptanceInfo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the Terms of Service were accepted.
   * @return createdAt
   */
  @ApiModelProperty(value = "The date when the Terms of Service were accepted.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * The date when the Terms of Service were accepted.
   *
   * @param createdAt
   */ 
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * An Adyen-generated reference for the accepted Terms of Service.
   *
   * @param id
   * @return the current {@code TermsOfServiceAcceptanceInfo} instance, allowing for method chaining
   */
  public TermsOfServiceAcceptanceInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An Adyen-generated reference for the accepted Terms of Service.
   * @return id
   */
  @ApiModelProperty(value = "An Adyen-generated reference for the accepted Terms of Service.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * An Adyen-generated reference for the accepted Terms of Service.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  
   *
   * @param type
   * @return the current {@code TermsOfServiceAcceptanceInfo} instance, allowing for method chaining
   */
  public TermsOfServiceAcceptanceInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  
   * @return type
   */
  @ApiModelProperty(value = "The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this TermsOfServiceAcceptanceInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsOfServiceAcceptanceInfo termsOfServiceAcceptanceInfo = (TermsOfServiceAcceptanceInfo) o;
    return Objects.equals(this.acceptedBy, termsOfServiceAcceptanceInfo.acceptedBy) &&
        Objects.equals(this.acceptedFor, termsOfServiceAcceptanceInfo.acceptedFor) &&
        Objects.equals(this.createdAt, termsOfServiceAcceptanceInfo.createdAt) &&
        Objects.equals(this.id, termsOfServiceAcceptanceInfo.id) &&
        Objects.equals(this.type, termsOfServiceAcceptanceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedBy, acceptedFor, createdAt, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsOfServiceAcceptanceInfo {\n");
    sb.append("    acceptedBy: ").append(toIndentedString(acceptedBy)).append("\n");
    sb.append("    acceptedFor: ").append(toIndentedString(acceptedFor)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of TermsOfServiceAcceptanceInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TermsOfServiceAcceptanceInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to TermsOfServiceAcceptanceInfo
   */
  public static TermsOfServiceAcceptanceInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TermsOfServiceAcceptanceInfo.class);
  }
/**
  * Convert an instance of TermsOfServiceAcceptanceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
