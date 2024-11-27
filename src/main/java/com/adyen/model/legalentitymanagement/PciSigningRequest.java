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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PciSigningRequest
 */
@JsonPropertyOrder({
  PciSigningRequest.JSON_PROPERTY_PCI_TEMPLATE_REFERENCES,
  PciSigningRequest.JSON_PROPERTY_SIGNED_BY
})

public class PciSigningRequest {
  public static final String JSON_PROPERTY_PCI_TEMPLATE_REFERENCES = "pciTemplateReferences";
  private List<String> pciTemplateReferences = new ArrayList<>();

  public static final String JSON_PROPERTY_SIGNED_BY = "signedBy";
  private String signedBy;

  public PciSigningRequest() { 
  }

  /**
   * The array of Adyen-generated unique identifiers for the questionnaires.
   *
   * @param pciTemplateReferences
   * @return the current {@code PciSigningRequest} instance, allowing for method chaining
   */
  public PciSigningRequest pciTemplateReferences(List<String> pciTemplateReferences) {
    this.pciTemplateReferences = pciTemplateReferences;
    return this;
  }

  public PciSigningRequest addPciTemplateReferencesItem(String pciTemplateReferencesItem) {
    this.pciTemplateReferences.add(pciTemplateReferencesItem);
    return this;
  }

  /**
   * The array of Adyen-generated unique identifiers for the questionnaires.
   * @return pciTemplateReferences
   */
  @ApiModelProperty(required = true, value = "The array of Adyen-generated unique identifiers for the questionnaires.")
  @JsonProperty(JSON_PROPERTY_PCI_TEMPLATE_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPciTemplateReferences() {
    return pciTemplateReferences;
  }

  /**
   * The array of Adyen-generated unique identifiers for the questionnaires.
   *
   * @param pciTemplateReferences
   */ 
  @JsonProperty(JSON_PROPERTY_PCI_TEMPLATE_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPciTemplateReferences(List<String> pciTemplateReferences) {
    this.pciTemplateReferences = pciTemplateReferences;
  }

  /**
   * The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signs the PCI questionnaire.
   *
   * @param signedBy
   * @return the current {@code PciSigningRequest} instance, allowing for method chaining
   */
  public PciSigningRequest signedBy(String signedBy) {
    this.signedBy = signedBy;
    return this;
  }

  /**
   * The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signs the PCI questionnaire.
   * @return signedBy
   */
  @ApiModelProperty(required = true, value = "The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signs the PCI questionnaire.")
  @JsonProperty(JSON_PROPERTY_SIGNED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSignedBy() {
    return signedBy;
  }

  /**
   * The [legal entity ID](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) of the individual who signs the PCI questionnaire.
   *
   * @param signedBy
   */ 
  @JsonProperty(JSON_PROPERTY_SIGNED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }

  /**
   * Return true if this PciSigningRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PciSigningRequest pciSigningRequest = (PciSigningRequest) o;
    return Objects.equals(this.pciTemplateReferences, pciSigningRequest.pciTemplateReferences) &&
        Objects.equals(this.signedBy, pciSigningRequest.signedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pciTemplateReferences, signedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PciSigningRequest {\n");
    sb.append("    pciTemplateReferences: ").append(toIndentedString(pciTemplateReferences)).append("\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
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
   * Create an instance of PciSigningRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PciSigningRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PciSigningRequest
   */
  public static PciSigningRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PciSigningRequest.class);
  }
/**
  * Convert an instance of PciSigningRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
