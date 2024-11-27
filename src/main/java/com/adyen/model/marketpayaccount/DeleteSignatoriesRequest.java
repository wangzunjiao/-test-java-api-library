/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

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
 * DeleteSignatoriesRequest
 */
@JsonPropertyOrder({
  DeleteSignatoriesRequest.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  DeleteSignatoriesRequest.JSON_PROPERTY_SIGNATORY_CODES
})

public class DeleteSignatoriesRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_SIGNATORY_CODES = "signatoryCodes";
  private List<String> signatoryCodes = new ArrayList<>();

  public DeleteSignatoriesRequest() { 
  }

  public DeleteSignatoriesRequest accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the account holder from which to delete the signatories.
   * @return accountHolderCode
  **/
  @ApiModelProperty(required = true, value = "The code of the account holder from which to delete the signatories.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public DeleteSignatoriesRequest signatoryCodes(List<String> signatoryCodes) {
    this.signatoryCodes = signatoryCodes;
    return this;
  }

  public DeleteSignatoriesRequest addSignatoryCodesItem(String signatoryCodesItem) {
    this.signatoryCodes.add(signatoryCodesItem);
    return this;
  }

   /**
   * Array of codes of the signatories to be deleted.
   * @return signatoryCodes
  **/
  @ApiModelProperty(required = true, value = "Array of codes of the signatories to be deleted.")
  @JsonProperty(JSON_PROPERTY_SIGNATORY_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSignatoryCodes() {
    return signatoryCodes;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATORY_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatoryCodes(List<String> signatoryCodes) {
    this.signatoryCodes = signatoryCodes;
  }


  /**
   * Return true if this DeleteSignatoriesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSignatoriesRequest deleteSignatoriesRequest = (DeleteSignatoriesRequest) o;
    return Objects.equals(this.accountHolderCode, deleteSignatoriesRequest.accountHolderCode) &&
        Objects.equals(this.signatoryCodes, deleteSignatoriesRequest.signatoryCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, signatoryCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSignatoriesRequest {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    signatoryCodes: ").append(toIndentedString(signatoryCodes)).append("\n");
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
   * Create an instance of DeleteSignatoriesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteSignatoriesRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to DeleteSignatoriesRequest
   */
  public static DeleteSignatoriesRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DeleteSignatoriesRequest.class);
  }
/**
  * Convert an instance of DeleteSignatoriesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

