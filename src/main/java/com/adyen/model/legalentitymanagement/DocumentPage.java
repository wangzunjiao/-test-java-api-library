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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * DocumentPage
 */
@JsonPropertyOrder({
  DocumentPage.JSON_PROPERTY_PAGE_NAME,
  DocumentPage.JSON_PROPERTY_PAGE_NUMBER,
  DocumentPage.JSON_PROPERTY_TYPE
})

public class DocumentPage {
  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
  private Integer pageNumber;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BACK("BACK"),
    
    FRONT("FRONT"),
    
    UNDEFINED("UNDEFINED");

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

  public DocumentPage() { 
  }

  /**
   * pageName
   *
   * @param pageName
   * @return the current {@code DocumentPage} instance, allowing for method chaining
   */
  public DocumentPage pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * pageName
   * @return pageName
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPageName() {
    return pageName;
  }

  /**
   * pageName
   *
   * @param pageName
   */ 
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * pageNumber
   *
   * @param pageNumber
   * @return the current {@code DocumentPage} instance, allowing for method chaining
   */
  public DocumentPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * pageNumber
   * @return pageNumber
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPageNumber() {
    return pageNumber;
  }

  /**
   * pageNumber
   *
   * @param pageNumber
   */ 
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * type
   *
   * @param type
   * @return the current {@code DocumentPage} instance, allowing for method chaining
   */
  public DocumentPage type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * type
   * @return type
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * type
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this DocumentPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPage documentPage = (DocumentPage) o;
    return Objects.equals(this.pageName, documentPage.pageName) &&
        Objects.equals(this.pageNumber, documentPage.pageNumber) &&
        Objects.equals(this.type, documentPage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageName, pageNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPage {\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
   * Create an instance of DocumentPage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentPage
   * @throws JsonProcessingException if the JSON string is invalid with respect to DocumentPage
   */
  public static DocumentPage fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DocumentPage.class);
  }
/**
  * Convert an instance of DocumentPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}