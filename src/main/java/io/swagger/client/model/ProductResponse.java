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
import io.swagger.client.model.InlineResponse200ItemsAttributes;
import io.swagger.client.model.InlineResponse200ItemsImages;
import io.swagger.client.model.InlineResponse200ItemsLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T17:28:46.190Z")
public class ProductResponse {
  @SerializedName("expands")
  private List<String> expands = new ArrayList<String>();

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
  private List<InlineResponse200ItemsImages> images = new ArrayList<InlineResponse200ItemsImages>();

  @SerializedName("attributes")
  private List<InlineResponse200ItemsAttributes> attributes = new ArrayList<InlineResponse200ItemsAttributes>();

  @SerializedName("links")
  private List<InlineResponse200ItemsLinks> links = new ArrayList<InlineResponse200ItemsLinks>();

  public ProductResponse expands(List<String> expands) {
    this.expands = expands;
    return this;
  }

  public ProductResponse addExpandsItem(String expandsItem) {
    this.expands.add(expandsItem);
    return this;
  }

   /**
   * Get expands
   * @return expands
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getExpands() {
    return expands;
  }

  public void setExpands(List<String> expands) {
    this.expands = expands;
  }

  public ProductResponse sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductResponse productGroup(String productGroup) {
    this.productGroup = productGroup;
    return this;
  }

   /**
   * Get productGroup
   * @return productGroup
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(String productGroup) {
    this.productGroup = productGroup;
  }

  public ProductResponse department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public ProductResponse productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ProductResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ProductResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductResponse color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ProductResponse flavor(String flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Get flavor
   * @return flavor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public ProductResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ProductResponse manufacturerCode(String manufacturerCode) {
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

  public ProductResponse size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ProductResponse eanIsbn(String eanIsbn) {
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

  public ProductResponse height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ProductResponse width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ProductResponse depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public ProductResponse weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ProductResponse video(String video) {
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

  public ProductResponse images(List<InlineResponse200ItemsImages> images) {
    this.images = images;
    return this;
  }

  public ProductResponse addImagesItem(InlineResponse200ItemsImages imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse200ItemsImages> getImages() {
    return images;
  }

  public void setImages(List<InlineResponse200ItemsImages> images) {
    this.images = images;
  }

  public ProductResponse attributes(List<InlineResponse200ItemsAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProductResponse addAttributesItem(InlineResponse200ItemsAttributes attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse200ItemsAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<InlineResponse200ItemsAttributes> attributes) {
    this.attributes = attributes;
  }

  public ProductResponse links(List<InlineResponse200ItemsLinks> links) {
    this.links = links;
    return this;
  }

  public ProductResponse addLinksItem(InlineResponse200ItemsLinks linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse200ItemsLinks> getLinks() {
    return links;
  }

  public void setLinks(List<InlineResponse200ItemsLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResponse productResponse = (ProductResponse) o;
    return Objects.equals(this.expands, productResponse.expands) &&
        Objects.equals(this.sku, productResponse.sku) &&
        Objects.equals(this.productGroup, productResponse.productGroup) &&
        Objects.equals(this.department, productResponse.department) &&
        Objects.equals(this.productType, productResponse.productType) &&
        Objects.equals(this.brand, productResponse.brand) &&
        Objects.equals(this.name, productResponse.name) &&
        Objects.equals(this.description, productResponse.description) &&
        Objects.equals(this.color, productResponse.color) &&
        Objects.equals(this.flavor, productResponse.flavor) &&
        Objects.equals(this.gender, productResponse.gender) &&
        Objects.equals(this.manufacturerCode, productResponse.manufacturerCode) &&
        Objects.equals(this.size, productResponse.size) &&
        Objects.equals(this.eanIsbn, productResponse.eanIsbn) &&
        Objects.equals(this.height, productResponse.height) &&
        Objects.equals(this.width, productResponse.width) &&
        Objects.equals(this.depth, productResponse.depth) &&
        Objects.equals(this.weight, productResponse.weight) &&
        Objects.equals(this.video, productResponse.video) &&
        Objects.equals(this.images, productResponse.images) &&
        Objects.equals(this.attributes, productResponse.attributes) &&
        Objects.equals(this.links, productResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expands, sku, productGroup, department, productType, brand, name, description, color, flavor, gender, manufacturerCode, size, eanIsbn, height, width, depth, weight, video, images, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponse {\n");
    
    sb.append("    expands: ").append(toIndentedString(expands)).append("\n");
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
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
