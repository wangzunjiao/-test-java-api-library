/*
 * Payment API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.consult;

//model

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.consult.Discount;
import com.adyen.model.consult.InterestFree;
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
 * PromotionInfo
 */
@JsonPropertyOrder({
  PromotionInfo.JSON_PROPERTY_PROMOTION_TYPE,
  PromotionInfo.JSON_PROPERTY_DISCOUNT,
  PromotionInfo.JSON_PROPERTY_INTEREST_FREE
})
//pojo

public class PromotionInfo {
  /**
   * Promotion type. Valid values are:
   */
  public enum PromotionTypeEnum {
    DISCOUNT("DISCOUNT"),
    
    INTEREST_FREE("INTEREST_FREE");

    private String value;

    PromotionTypeEnum(String value) {
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
    public static PromotionTypeEnum fromValue(String value) {
      for (PromotionTypeEnum b : PromotionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROMOTION_TYPE = "promotionType";
  private PromotionTypeEnum promotionType;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private Discount discount;

  public static final String JSON_PROPERTY_INTEREST_FREE = "interestFree";
  private InterestFree interestFree;

  public PromotionInfo() { 
  }

  /**
   * Promotion type. Valid values are:
   *
   * @param promotionType
   * @return the current {@code PromotionInfo} instance, allowing for method chaining
   */
  public PromotionInfo promotionType(PromotionTypeEnum promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  /**
   * Promotion type. Valid values are:
   * @return promotionType
   */
  @ApiModelProperty(value = "Promotion type. Valid values are:")
  @JsonProperty(JSON_PROPERTY_PROMOTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PromotionTypeEnum getPromotionType() {
    return promotionType;
  }

  /**
   * Promotion type. Valid values are:
   *
   * @param promotionType
   */ 
  @JsonProperty(JSON_PROPERTY_PROMOTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionType(PromotionTypeEnum promotionType) {
    this.promotionType = promotionType;
  }

  /**
   * discount
   *
   * @param discount
   * @return the current {@code PromotionInfo} instance, allowing for method chaining
   */
  public PromotionInfo discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * discount
   * @return discount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Discount getDiscount() {
    return discount;
  }

  /**
   * discount
   *
   * @param discount
   */ 
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  /**
   * interestFree
   *
   * @param interestFree
   * @return the current {@code PromotionInfo} instance, allowing for method chaining
   */
  public PromotionInfo interestFree(InterestFree interestFree) {
    this.interestFree = interestFree;
    return this;
  }

  /**
   * interestFree
   * @return interestFree
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public InterestFree getInterestFree() {
    return interestFree;
  }

  /**
   * interestFree
   *
   * @param interestFree
   */ 
  @JsonProperty(JSON_PROPERTY_INTEREST_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestFree(InterestFree interestFree) {
    this.interestFree = interestFree;
  }

  /**
   * Return true if this PromotionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionInfo promotionInfo = (PromotionInfo) o;
    return Objects.equals(this.promotionType, promotionInfo.promotionType) &&
        Objects.equals(this.discount, promotionInfo.discount) &&
        Objects.equals(this.interestFree, promotionInfo.interestFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionType, discount, interestFree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionInfo {\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    interestFree: ").append(toIndentedString(interestFree)).append("\n");
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
   * Create an instance of PromotionInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PromotionInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to PromotionInfo
   */
  public static PromotionInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PromotionInfo.class);
  }
/**
  * Convert an instance of PromotionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
