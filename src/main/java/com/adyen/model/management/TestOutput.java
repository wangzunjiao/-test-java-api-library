/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * TestOutput
 */
@JsonPropertyOrder({
  TestOutput.JSON_PROPERTY_MERCHANT_ID,
  TestOutput.JSON_PROPERTY_OUTPUT,
  TestOutput.JSON_PROPERTY_REQUEST_SENT,
  TestOutput.JSON_PROPERTY_RESPONSE_CODE,
  TestOutput.JSON_PROPERTY_RESPONSE_TIME,
  TestOutput.JSON_PROPERTY_STATUS
})
//pojo

public class TestOutput {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private String output;

  public static final String JSON_PROPERTY_REQUEST_SENT = "requestSent";
  private String requestSent;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private String responseCode;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private String responseTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public TestOutput() { 
  }

  /**
   * Unique identifier of the merchant account that the notification is about.
   *
   * @param merchantId
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Unique identifier of the merchant account that the notification is about.
   * @return merchantId
   */
  @ApiModelProperty(value = "Unique identifier of the merchant account that the notification is about.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantId() {
    return merchantId;
  }

  /**
   * Unique identifier of the merchant account that the notification is about.
   *
   * @param merchantId
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * The response your server returned for the test webhook.  Your server must respond with **HTTP 2xx* for the test webhook to be successful (&#x60;data.status&#x60;: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
   *
   * @param output
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The response your server returned for the test webhook.  Your server must respond with **HTTP 2xx* for the test webhook to be successful (&#x60;data.status&#x60;: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
   * @return output
   */
  @ApiModelProperty(value = "The response your server returned for the test webhook.  Your server must respond with **HTTP 2xx* for the test webhook to be successful (`data.status`: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.")
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOutput() {
    return output;
  }

  /**
   * The response your server returned for the test webhook.  Your server must respond with **HTTP 2xx* for the test webhook to be successful (&#x60;data.status&#x60;: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
   *
   * @param output
   */ 
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
   *
   * @param requestSent
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput requestSent(String requestSent) {
    this.requestSent = requestSent;
    return this;
  }

  /**
   * The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
   * @return requestSent
   */
  @ApiModelProperty(value = "The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.")
  @JsonProperty(JSON_PROPERTY_REQUEST_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestSent() {
    return requestSent;
  }

  /**
   * The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
   *
   * @param requestSent
   */ 
  @JsonProperty(JSON_PROPERTY_REQUEST_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestSent(String requestSent) {
    this.requestSent = requestSent;
  }

  /**
   * The HTTP response code for your server&#39;s response to the test webhook.  You can use the value of this field together with the the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
   *
   * @param responseCode
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * The HTTP response code for your server&#39;s response to the test webhook.  You can use the value of this field together with the the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
   * @return responseCode
   */
  @ApiModelProperty(example = "200", value = "The HTTP response code for your server's response to the test webhook.  You can use the value of this field together with the the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * The HTTP response code for your server&#39;s response to the test webhook.  You can use the value of this field together with the the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
   *
   * @param responseCode
   */ 
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
   *
   * @param responseTime
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput responseTime(String responseTime) {
    this.responseTime = responseTime;
    return this;
  }

  /**
   * The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
   * @return responseTime
   */
  @ApiModelProperty(value = "The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResponseTime() {
    return responseTime;
  }

  /**
   * The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
   *
   * @param responseTime
   */ 
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseTime(String responseTime) {
    this.responseTime = responseTime;
  }

  /**
   * The status of the test request. Possible values are: * **success**, &#x60;data.responseCode&#x60;: **2xx**. * **failed**, in all other cases.  You can use the value of the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
   *
   * @param status
   * @return the current {@code TestOutput} instance, allowing for method chaining
   */
  public TestOutput status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the test request. Possible values are: * **success**, &#x60;data.responseCode&#x60;: **2xx**. * **failed**, in all other cases.  You can use the value of the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of the test request. Possible values are: * **success**, `data.responseCode`: **2xx**. * **failed**, in all other cases.  You can use the value of the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  /**
   * The status of the test request. Possible values are: * **success**, &#x60;data.responseCode&#x60;: **2xx**. * **failed**, in all other cases.  You can use the value of the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Return true if this TestOutput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOutput testOutput = (TestOutput) o;
    return Objects.equals(this.merchantId, testOutput.merchantId) &&
        Objects.equals(this.output, testOutput.output) &&
        Objects.equals(this.requestSent, testOutput.requestSent) &&
        Objects.equals(this.responseCode, testOutput.responseCode) &&
        Objects.equals(this.responseTime, testOutput.responseTime) &&
        Objects.equals(this.status, testOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, output, requestSent, responseCode, responseTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOutput {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    requestSent: ").append(toIndentedString(requestSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of TestOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestOutput
   * @throws JsonProcessingException if the JSON string is invalid with respect to TestOutput
   */
  public static TestOutput fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TestOutput.class);
  }
/**
  * Convert an instance of TestOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
