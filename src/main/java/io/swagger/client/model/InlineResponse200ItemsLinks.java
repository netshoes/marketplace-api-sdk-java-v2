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
 * InlineResponse200ItemsLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T17:28:46.190Z")
public class InlineResponse200ItemsLinks {
  @SerializedName("rel")
  private String rel = null;

  public InlineResponse200ItemsLinks rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Get rel
   * @return rel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ItemsLinks inlineResponse200ItemsLinks = (InlineResponse200ItemsLinks) o;
    return Objects.equals(this.rel, inlineResponse200ItemsLinks.rel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ItemsLinks {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

