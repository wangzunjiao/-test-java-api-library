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
 * SweepSchedule
 */
@JsonPropertyOrder({
  SweepSchedule.JSON_PROPERTY_CRON_EXPRESSION,
  SweepSchedule.JSON_PROPERTY_TYPE
})
//pojo

public class SweepSchedule {
  public static final String JSON_PROPERTY_CRON_EXPRESSION = "cronExpression";
  private String cronExpression;

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a &#x60;cronExpression&#x60;.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: execute the sweep instantly if the &#x60;triggerAmount&#x60; is reached. 
   */
  public enum TypeEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    BALANCE("balance"),
    
    CRON("cron");

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

  public SweepSchedule() { 
  }

  /**
   * A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account.  For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&amp;ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.  Required when &#x60;type&#x60; is **cron**. 
   *
   * @param cronExpression
   * @return the current {@code SweepSchedule} instance, allowing for method chaining
   */
  public SweepSchedule cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  /**
   * A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account.  For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&amp;ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.  Required when &#x60;type&#x60; is **cron**. 
   * @return cronExpression
   */
  @ApiModelProperty(value = "A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account.  For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.  Required when `type` is **cron**. ")
  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCronExpression() {
    return cronExpression;
  }

  /**
   * A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account.  For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&amp;ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.  Required when &#x60;type&#x60; is **cron**. 
   *
   * @param cronExpression
   */ 
  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a &#x60;cronExpression&#x60;.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: execute the sweep instantly if the &#x60;triggerAmount&#x60; is reached. 
   *
   * @param type
   * @return the current {@code SweepSchedule} instance, allowing for method chaining
   */
  public SweepSchedule type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a &#x60;cronExpression&#x60;.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: execute the sweep instantly if the &#x60;triggerAmount&#x60; is reached. 
   * @return type
   */
  @ApiModelProperty(required = true, value = "The schedule type.  Possible values:  * **cron**: push out funds based on a `cronExpression`.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: execute the sweep instantly if the `triggerAmount` is reached. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a &#x60;cronExpression&#x60;.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: execute the sweep instantly if the &#x60;triggerAmount&#x60; is reached. 
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this SweepSchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepSchedule sweepSchedule = (SweepSchedule) o;
    return Objects.equals(this.cronExpression, sweepSchedule.cronExpression) &&
        Objects.equals(this.type, sweepSchedule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepSchedule {\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
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
   * Create an instance of SweepSchedule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SweepSchedule
   * @throws JsonProcessingException if the JSON string is invalid with respect to SweepSchedule
   */
  public static SweepSchedule fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SweepSchedule.class);
  }
/**
  * Convert an instance of SweepSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
