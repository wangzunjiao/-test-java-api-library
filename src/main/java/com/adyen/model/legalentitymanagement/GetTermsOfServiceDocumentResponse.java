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
 * GetTermsOfServiceDocumentResponse
 */
@JsonPropertyOrder({
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_DOCUMENT,
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_ID,
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_LANGUAGE,
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_FORMAT,
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID,
  GetTermsOfServiceDocumentResponse.JSON_PROPERTY_TYPE
})
//pojo

public class GetTermsOfServiceDocumentResponse {
  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private byte[] document;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_FORMAT = "termsOfServiceDocumentFormat";
  private String termsOfServiceDocumentFormat;

  public static final String JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID = "termsOfServiceDocumentId";
  private String termsOfServiceDocumentId;

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

  public GetTermsOfServiceDocumentResponse() { 
  }

  /**
   * The Terms of Service document in Base64-encoded format.
   *
   * @param document
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse document(byte[] document) {
    this.document = document;
    return this;
  }

  /**
   * The Terms of Service document in Base64-encoded format.
   * @return document
   */
  @ApiModelProperty(value = "The Terms of Service document in Base64-encoded format.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public byte[] getDocument() {
    return document;
  }

  /**
   * The Terms of Service document in Base64-encoded format.
   *
   * @param document
   */ 
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(byte[] document) {
    this.document = document;
  }

  /**
   * The unique identifier of the legal entity.
   *
   * @param id
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the legal entity.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the legal entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the legal entity.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
   *
   * @param language
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
   * @return language
   */
  @ApiModelProperty(value = "The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  /**
   * The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
   *
   * @param language
   */ 
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The format of the Terms of Service document.
   *
   * @param termsOfServiceDocumentFormat
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse termsOfServiceDocumentFormat(String termsOfServiceDocumentFormat) {
    this.termsOfServiceDocumentFormat = termsOfServiceDocumentFormat;
    return this;
  }

  /**
   * The format of the Terms of Service document.
   * @return termsOfServiceDocumentFormat
   */
  @ApiModelProperty(value = "The format of the Terms of Service document.")
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTermsOfServiceDocumentFormat() {
    return termsOfServiceDocumentFormat;
  }

  /**
   * The format of the Terms of Service document.
   *
   * @param termsOfServiceDocumentFormat
   */ 
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsOfServiceDocumentFormat(String termsOfServiceDocumentFormat) {
    this.termsOfServiceDocumentFormat = termsOfServiceDocumentFormat;
  }

  /**
   * The unique identifier of the Terms of Service document.
   *
   * @param termsOfServiceDocumentId
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse termsOfServiceDocumentId(String termsOfServiceDocumentId) {
    this.termsOfServiceDocumentId = termsOfServiceDocumentId;
    return this;
  }

  /**
   * The unique identifier of the Terms of Service document.
   * @return termsOfServiceDocumentId
   */
  @ApiModelProperty(value = "The unique identifier of the Terms of Service document.")
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTermsOfServiceDocumentId() {
    return termsOfServiceDocumentId;
  }

  /**
   * The unique identifier of the Terms of Service document.
   *
   * @param termsOfServiceDocumentId
   */ 
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsOfServiceDocumentId(String termsOfServiceDocumentId) {
    this.termsOfServiceDocumentId = termsOfServiceDocumentId;
  }

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee** *  **adyenPccr** *  **adyenChargeCard**  
   *
   * @param type
   * @return the current {@code GetTermsOfServiceDocumentResponse} instance, allowing for method chaining
   */
  public GetTermsOfServiceDocumentResponse type(TypeEnum type) {
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
   * Return true if this GetTermsOfServiceDocumentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTermsOfServiceDocumentResponse getTermsOfServiceDocumentResponse = (GetTermsOfServiceDocumentResponse) o;
    return Arrays.equals(this.document, getTermsOfServiceDocumentResponse.document) &&
        Objects.equals(this.id, getTermsOfServiceDocumentResponse.id) &&
        Objects.equals(this.language, getTermsOfServiceDocumentResponse.language) &&
        Objects.equals(this.termsOfServiceDocumentFormat, getTermsOfServiceDocumentResponse.termsOfServiceDocumentFormat) &&
        Objects.equals(this.termsOfServiceDocumentId, getTermsOfServiceDocumentResponse.termsOfServiceDocumentId) &&
        Objects.equals(this.type, getTermsOfServiceDocumentResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(document), id, language, termsOfServiceDocumentFormat, termsOfServiceDocumentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTermsOfServiceDocumentResponse {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    termsOfServiceDocumentFormat: ").append(toIndentedString(termsOfServiceDocumentFormat)).append("\n");
    sb.append("    termsOfServiceDocumentId: ").append(toIndentedString(termsOfServiceDocumentId)).append("\n");
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
   * Create an instance of GetTermsOfServiceDocumentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTermsOfServiceDocumentResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetTermsOfServiceDocumentResponse
   */
  public static GetTermsOfServiceDocumentResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetTermsOfServiceDocumentResponse.class);
  }
/**
  * Convert an instance of GetTermsOfServiceDocumentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
