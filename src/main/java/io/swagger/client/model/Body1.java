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
import io.swagger.client.model.ProductsAttributes;
import io.swagger.client.model.ProductsImages;
import java.util.ArrayList;
import java.util.List;

/**
 * Body1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T17:28:46.190Z")
public class Body1 {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("productGroup")
  private String productGroup = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("productType")
  private String productType = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("flavor")
  private String flavor = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("manufacturerCode")
  private String manufacturerCode = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("eanIsbn")
  private String eanIsbn = null;

  @SerializedName("height")
  private Double height = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("depth")
  private Double depth = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("video")
  private String video = null;

  @SerializedName("images")
  private List<ProductsImages> images = new ArrayList<ProductsImages>();

  @SerializedName("attributes")
  private List<ProductsAttributes> attributes = new ArrayList<ProductsAttributes>();

  public Body1 sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Body1 productGroup(String productGroup) {
    this.productGroup = productGroup;
    return this;
  }

   /**
   * Get productGroup
   * @return productGroup
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(String productGroup) {
    this.productGroup = productGroup;
  }

  public Body1 department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Body1 productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Body1 brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Body1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body1 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Body1 color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Body1 flavor(String flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Get flavor
   * @return flavor
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public Body1 gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Body1 manufacturerCode(String manufacturerCode) {
    this.manufacturerCode = manufacturerCode;
    return this;
  }

   /**
   * Get manufacturerCode
   * @return manufacturerCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getManufacturerCode() {
    return manufacturerCode;
  }

  public void setManufacturerCode(String manufacturerCode) {
    this.manufacturerCode = manufacturerCode;
  }

  public Body1 size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Body1 eanIsbn(String eanIsbn) {
    this.eanIsbn = eanIsbn;
    return this;
  }

   /**
   * Get eanIsbn
   * @return eanIsbn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEanIsbn() {
    return eanIsbn;
  }

  public void setEanIsbn(String eanIsbn) {
    this.eanIsbn = eanIsbn;
  }

  public Body1 height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Body1 width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Body1 depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public Body1 weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Body1 video(String video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public Body1 images(List<ProductsImages> images) {
    this.images = images;
    return this;
  }

  public Body1 addImagesItem(ProductsImages imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ProductsImages> getImages() {
    return images;
  }

  public void setImages(List<ProductsImages> images) {
    this.images = images;
  }

  public Body1 attributes(List<ProductsAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Body1 addAttributesItem(ProductsAttributes attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ProductsAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ProductsAttributes> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.sku, body1.sku) &&
        Objects.equals(this.productGroup, body1.productGroup) &&
        Objects.equals(this.department, body1.department) &&
        Objects.equals(this.productType, body1.productType) &&
        Objects.equals(this.brand, body1.brand) &&
        Objects.equals(this.name, body1.name) &&
        Objects.equals(this.description, body1.description) &&
        Objects.equals(this.color, body1.color) &&
        Objects.equals(this.flavor, body1.flavor) &&
        Objects.equals(this.gender, body1.gender) &&
        Objects.equals(this.manufacturerCode, body1.manufacturerCode) &&
        Objects.equals(this.size, body1.size) &&
        Objects.equals(this.eanIsbn, body1.eanIsbn) &&
        Objects.equals(this.height, body1.height) &&
        Objects.equals(this.width, body1.width) &&
        Objects.equals(this.depth, body1.depth) &&
        Objects.equals(this.weight, body1.weight) &&
        Objects.equals(this.video, body1.video) &&
        Objects.equals(this.images, body1.images) &&
        Objects.equals(this.attributes, body1.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, productGroup, department, productType, brand, name, description, color, flavor, gender, manufacturerCode, size, eanIsbn, height, width, depth, weight, video, images, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    manufacturerCode: ").append(toIndentedString(manufacturerCode)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    eanIsbn: ").append(toIndentedString(eanIsbn)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

