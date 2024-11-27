/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * ReturnTransferResponse
 */
@JsonPropertyOrder({
  ReturnTransferResponse.JSON_PROPERTY_ID,
  ReturnTransferResponse.JSON_PROPERTY_REFERENCE,
  ReturnTransferResponse.JSON_PROPERTY_STATUS,
  ReturnTransferResponse.JSON_PROPERTY_TRANSFER_ID
})

public class ReturnTransferResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The resulting status of the return.  Possible values: **Authorised**, **Declined**.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    DECLINED("Declined");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TRANSFER_ID = "transferId";
  private String transferId;

  public ReturnTransferResponse() { 
  }

  /**
   * The unique identifier of the return.
   *
   * @param id
   * @return the current {@code ReturnTransferResponse} instance, allowing for method chaining
   */
  public ReturnTransferResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the return.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the return.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the return.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Your internal reference for the return.
   *
   * @param reference
   * @return the current {@code ReturnTransferResponse} instance, allowing for method chaining
   */
  public ReturnTransferResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your internal reference for the return.
   * @return reference
   */
  @ApiModelProperty(value = "Your internal reference for the return.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your internal reference for the return.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The resulting status of the return.  Possible values: **Authorised**, **Declined**.
   *
   * @param status
   * @return the current {@code ReturnTransferResponse} instance, allowing for method chaining
   */
  public ReturnTransferResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The resulting status of the return.  Possible values: **Authorised**, **Declined**.
   * @return status
   */
  @ApiModelProperty(value = "The resulting status of the return.  Possible values: **Authorised**, **Declined**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The resulting status of the return.  Possible values: **Authorised**, **Declined**.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The unique identifier of the original transfer.
   *
   * @param transferId
   * @return the current {@code ReturnTransferResponse} instance, allowing for method chaining
   */
  public ReturnTransferResponse transferId(String transferId) {
    this.transferId = transferId;
    return this;
  }

  /**
   * The unique identifier of the original transfer.
   * @return transferId
   */
  @ApiModelProperty(value = "The unique identifier of the original transfer.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransferId() {
    return transferId;
  }

  /**
   * The unique identifier of the original transfer.
   *
   * @param transferId
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

  /**
   * Return true if this ReturnTransferResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnTransferResponse returnTransferResponse = (ReturnTransferResponse) o;
    return Objects.equals(this.id, returnTransferResponse.id) &&
        Objects.equals(this.reference, returnTransferResponse.reference) &&
        Objects.equals(this.status, returnTransferResponse.status) &&
        Objects.equals(this.transferId, returnTransferResponse.transferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reference, status, transferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnTransferResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
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
   * Create an instance of ReturnTransferResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnTransferResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to ReturnTransferResponse
   */
  public static ReturnTransferResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ReturnTransferResponse.class);
  }
/**
  * Convert an instance of ReturnTransferResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
