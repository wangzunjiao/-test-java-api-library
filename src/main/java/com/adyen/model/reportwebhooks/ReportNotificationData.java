/*
 * Report webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.reportwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.reportwebhooks.ResourceReference;
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
 * ReportNotificationData
 */
@JsonPropertyOrder({
  ReportNotificationData.JSON_PROPERTY_ACCOUNT_HOLDER,
  ReportNotificationData.JSON_PROPERTY_BALANCE_ACCOUNT,
  ReportNotificationData.JSON_PROPERTY_BALANCE_PLATFORM,
  ReportNotificationData.JSON_PROPERTY_CREATION_DATE,
  ReportNotificationData.JSON_PROPERTY_DOWNLOAD_URL,
  ReportNotificationData.JSON_PROPERTY_FILE_NAME,
  ReportNotificationData.JSON_PROPERTY_REPORT_TYPE
})

public class ReportNotificationData {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";
  private ResourceReference accountHolder;

  public static final String JSON_PROPERTY_BALANCE_ACCOUNT = "balanceAccount";
  private ResourceReference balanceAccount;

  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "downloadUrl";
  private String downloadUrl;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_REPORT_TYPE = "reportType";
  private String reportType;

  public ReportNotificationData() { 
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData accountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * accountHolder
   * @return accountHolder
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceReference getAccountHolder() {
    return accountHolder;
  }

  /**
   * accountHolder
   *
   * @param accountHolder
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
  }

  /**
   * balanceAccount
   *
   * @param balanceAccount
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData balanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

  /**
   * balanceAccount
   * @return balanceAccount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceReference getBalanceAccount() {
    return balanceAccount;
  }

  /**
   * balanceAccount
   *
   * @param balanceAccount
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
  }

  /**
   * The unique identifier of the balance platform.
   *
   * @param balancePlatform
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
   */
  @ApiModelProperty(value = "The unique identifier of the balance platform.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBalancePlatform() {
    return balancePlatform;
  }

  /**
   * The unique identifier of the balance platform.
   *
   * @param balancePlatform
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   *
   * @param creationDate
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   * @return creationDate
   */
  @ApiModelProperty(value = "The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   *
   * @param creationDate
   */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview).
   *
   * @param downloadUrl
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview).
   * @return downloadUrl
   */
  @ApiModelProperty(required = true, value = "The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview).")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview).
   *
   * @param downloadUrl
   */ 
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   * The filename of the report.
   *
   * @param fileName
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The filename of the report.
   * @return fileName
   */
  @ApiModelProperty(required = true, value = "The filename of the report.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }

  /**
   * The filename of the report.
   *
   * @param fileName
   */ 
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The type of report. Possible values:  - &#x60;balanceplatform_accounting_interactive_report&#x60; - &#x60;balanceplatform_accounting_report&#x60; - &#x60;balanceplatform_balance_report&#x60; - &#x60;balanceplatform_fee_report&#x60; - &#x60;balanceplatform_payment_instrument_report&#x60; - &#x60;balanceplatform_payout_report&#x60; - &#x60;balanceplatform_statement_report&#x60;  
   *
   * @param reportType
   * @return the current {@code ReportNotificationData} instance, allowing for method chaining
   */
  public ReportNotificationData reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * The type of report. Possible values:  - &#x60;balanceplatform_accounting_interactive_report&#x60; - &#x60;balanceplatform_accounting_report&#x60; - &#x60;balanceplatform_balance_report&#x60; - &#x60;balanceplatform_fee_report&#x60; - &#x60;balanceplatform_payment_instrument_report&#x60; - &#x60;balanceplatform_payout_report&#x60; - &#x60;balanceplatform_statement_report&#x60;  
   * @return reportType
   */
  @ApiModelProperty(required = true, value = "The type of report. Possible values:  - `balanceplatform_accounting_interactive_report` - `balanceplatform_accounting_report` - `balanceplatform_balance_report` - `balanceplatform_fee_report` - `balanceplatform_payment_instrument_report` - `balanceplatform_payout_report` - `balanceplatform_statement_report`  ")
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReportType() {
    return reportType;
  }

  /**
   * The type of report. Possible values:  - &#x60;balanceplatform_accounting_interactive_report&#x60; - &#x60;balanceplatform_accounting_report&#x60; - &#x60;balanceplatform_balance_report&#x60; - &#x60;balanceplatform_fee_report&#x60; - &#x60;balanceplatform_payment_instrument_report&#x60; - &#x60;balanceplatform_payout_report&#x60; - &#x60;balanceplatform_statement_report&#x60;  
   *
   * @param reportType
   */ 
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  /**
   * Return true if this ReportNotificationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportNotificationData reportNotificationData = (ReportNotificationData) o;
    return Objects.equals(this.accountHolder, reportNotificationData.accountHolder) &&
        Objects.equals(this.balanceAccount, reportNotificationData.balanceAccount) &&
        Objects.equals(this.balancePlatform, reportNotificationData.balancePlatform) &&
        Objects.equals(this.creationDate, reportNotificationData.creationDate) &&
        Objects.equals(this.downloadUrl, reportNotificationData.downloadUrl) &&
        Objects.equals(this.fileName, reportNotificationData.fileName) &&
        Objects.equals(this.reportType, reportNotificationData.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, balanceAccount, balancePlatform, creationDate, downloadUrl, fileName, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportNotificationData {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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
   * Create an instance of ReportNotificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportNotificationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to ReportNotificationData
   */
  public static ReportNotificationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ReportNotificationData.class);
  }
/**
  * Convert an instance of ReportNotificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
