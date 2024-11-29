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

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.InvalidField;
import com.adyen.model.transfers.RoutingDetails;
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
 * TransferServiceRestServiceError
 */
@JsonPropertyOrder({
  TransferServiceRestServiceError.JSON_PROPERTY_DETAIL,
  TransferServiceRestServiceError.JSON_PROPERTY_ERROR_CODE,
  TransferServiceRestServiceError.JSON_PROPERTY_INSTANCE,
  TransferServiceRestServiceError.JSON_PROPERTY_INVALID_FIELDS,
  TransferServiceRestServiceError.JSON_PROPERTY_REQUEST_ID,
  TransferServiceRestServiceError.JSON_PROPERTY_RESPONSE,
  TransferServiceRestServiceError.JSON_PROPERTY_ROUTING_DETAILS,
  TransferServiceRestServiceError.JSON_PROPERTY_STATUS,
  TransferServiceRestServiceError.JSON_PROPERTY_TITLE,
  TransferServiceRestServiceError.JSON_PROPERTY_TYPE
})
//pojo

public class TransferServiceRestServiceError {
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private String instance;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<InvalidField> invalidFields = null;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private Object response;

  public static final String JSON_PROPERTY_ROUTING_DETAILS = "routingDetails";
  private List<RoutingDetails> routingDetails = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TransferServiceRestServiceError() { 
  }

  /**
   * A human-readable explanation specific to this occurrence of the problem.
   *
   * @param detail
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
   */
  @ApiModelProperty(required = true, value = "A human-readable explanation specific to this occurrence of the problem.")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDetail() {
    return detail;
  }

  /**
   * A human-readable explanation specific to this occurrence of the problem.
   *
   * @param detail
   */ 
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   * A code that identifies the problem type.
   *
   * @param errorCode
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * A code that identifies the problem type.
   * @return errorCode
   */
  @ApiModelProperty(required = true, value = "A code that identifies the problem type.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * A code that identifies the problem type.
   *
   * @param errorCode
   */ 
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * A unique URI that identifies the specific occurrence of the problem.
   *
   * @param instance
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * A unique URI that identifies the specific occurrence of the problem.
   * @return instance
   */
  @ApiModelProperty(value = "A unique URI that identifies the specific occurrence of the problem.")
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstance() {
    return instance;
  }

  /**
   * A unique URI that identifies the specific occurrence of the problem.
   *
   * @param instance
   */ 
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(String instance) {
    this.instance = instance;
  }

  /**
   * Detailed explanation of each validation error, when applicable.
   *
   * @param invalidFields
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError invalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public TransferServiceRestServiceError addInvalidFieldsItem(InvalidField invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

  /**
   * Detailed explanation of each validation error, when applicable.
   * @return invalidFields
   */
  @ApiModelProperty(value = "Detailed explanation of each validation error, when applicable.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<InvalidField> getInvalidFields() {
    return invalidFields;
  }

  /**
   * Detailed explanation of each validation error, when applicable.
   *
   * @param invalidFields
   */ 
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
  }

  /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   *
   * @param requestId
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   * @return requestId
   */
  @ApiModelProperty(value = "A unique reference for the request, essentially the same as `pspReference`.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   *
   * @param requestId
   */ 
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * response
   *
   * @param response
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError response(Object response) {
    this.response = response;
    return this;
  }

  /**
   * response
   * @return response
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getResponse() {
    return response;
  }

  /**
   * response
   *
   * @param response
   */ 
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(Object response) {
    this.response = response;
  }

  /**
   * Detailed explanation of each attempt to route the transfer with the priorities from the request.
   *
   * @param routingDetails
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError routingDetails(List<RoutingDetails> routingDetails) {
    this.routingDetails = routingDetails;
    return this;
  }

  public TransferServiceRestServiceError addRoutingDetailsItem(RoutingDetails routingDetailsItem) {
    if (this.routingDetails == null) {
      this.routingDetails = new ArrayList<>();
    }
    this.routingDetails.add(routingDetailsItem);
    return this;
  }

  /**
   * Detailed explanation of each attempt to route the transfer with the priorities from the request.
   * @return routingDetails
   */
  @ApiModelProperty(value = "Detailed explanation of each attempt to route the transfer with the priorities from the request.")
  @JsonProperty(JSON_PROPERTY_ROUTING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RoutingDetails> getRoutingDetails() {
    return routingDetails;
  }

  /**
   * Detailed explanation of each attempt to route the transfer with the priorities from the request.
   *
   * @param routingDetails
   */ 
  @JsonProperty(JSON_PROPERTY_ROUTING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingDetails(List<RoutingDetails> routingDetails) {
    this.routingDetails = routingDetails;
  }

  /**
   * The HTTP status code.
   *
   * @param status
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code.
   * @return status
   */
  @ApiModelProperty(required = true, value = "The HTTP status code.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStatus() {
    return status;
  }

  /**
   * The HTTP status code.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * A short, human-readable summary of the problem type.
   *
   * @param title
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable summary of the problem type.
   * @return title
   */
  @ApiModelProperty(required = true, value = "A short, human-readable summary of the problem type.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  /**
   * A short, human-readable summary of the problem type.
   *
   * @param title
   */ 
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   *
   * @param type
   * @return the current {@code TransferServiceRestServiceError} instance, allowing for method chaining
   */
  public TransferServiceRestServiceError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   * @return type
   */
  @ApiModelProperty(required = true, value = "A URI that identifies the problem type, pointing to human-readable documentation on this problem type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this TransferServiceRestServiceError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferServiceRestServiceError transferServiceRestServiceError = (TransferServiceRestServiceError) o;
    return Objects.equals(this.detail, transferServiceRestServiceError.detail) &&
        Objects.equals(this.errorCode, transferServiceRestServiceError.errorCode) &&
        Objects.equals(this.instance, transferServiceRestServiceError.instance) &&
        Objects.equals(this.invalidFields, transferServiceRestServiceError.invalidFields) &&
        Objects.equals(this.requestId, transferServiceRestServiceError.requestId) &&
        Objects.equals(this.response, transferServiceRestServiceError.response) &&
        Objects.equals(this.routingDetails, transferServiceRestServiceError.routingDetails) &&
        Objects.equals(this.status, transferServiceRestServiceError.status) &&
        Objects.equals(this.title, transferServiceRestServiceError.title) &&
        Objects.equals(this.type, transferServiceRestServiceError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, errorCode, instance, invalidFields, requestId, response, routingDetails, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferServiceRestServiceError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    routingDetails: ").append(toIndentedString(routingDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
   * Create an instance of TransferServiceRestServiceError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferServiceRestServiceError
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferServiceRestServiceError
   */
  public static TransferServiceRestServiceError fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferServiceRestServiceError.class);
  }
/**
  * Convert an instance of TransferServiceRestServiceError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
