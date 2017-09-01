/*
 * API Marketplace Grupo Netshoes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Body3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T17:28:46.190Z")
public class Body3 {
  @SerializedName("listPrice")
  private Double listPrice = null;

  @SerializedName("salePrice")
  private Double salePrice = null;

  public Body3 listPrice(Double listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * Get listPrice
   * @return listPrice
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getListPrice() {
    return listPrice;
  }

  public void setListPrice(Double listPrice) {
    this.listPrice = listPrice;
  }

  public Body3 salePrice(Double salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Get salePrice
   * @return salePrice
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.listPrice, body3.listPrice) &&
        Objects.equals(this.salePrice, body3.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listPrice, salePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

