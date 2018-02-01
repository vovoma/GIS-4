package s4c.microservices.GIS.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * WfsCapabilities
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-01T12:38:20.844Z")

public class WfsCapabilities   {
  @JsonProperty("ServiceIdentification")
  private Object serviceIdentification = null;

  @JsonProperty("ServiceProvider")
  private Object serviceProvider = null;

  @JsonProperty("OperationsMetadata")
  private Object operationsMetadata = null;

  @JsonProperty("FeatureTypeList")
  private Object featureTypeList = null;

  @JsonProperty("Filter_Capabilities")
  private Object filterCapabilities = null;

  public WfsCapabilities serviceIdentification(Object serviceIdentification) {
    this.serviceIdentification = serviceIdentification;
    return this;
  }

   /**
   * Contains basic header information for the request such as the Title and ServiceType. The ServiceType indicates which version(s) of WFS are supported.
   * @return serviceIdentification
  **/
  @ApiModelProperty(required = true, value = "Contains basic header information for the request such as the Title and ServiceType. The ServiceType indicates which version(s) of WFS are supported.")
  @NotNull


  public Object getServiceIdentification() {
    return serviceIdentification;
  }

  public void setServiceIdentification(Object serviceIdentification) {
    this.serviceIdentification = serviceIdentification;
  }

  public WfsCapabilities serviceProvider(Object serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Provides contact information about the company publishing the WFS service, including telephone, website, and email.
   * @return serviceProvider
  **/
  @ApiModelProperty(required = true, value = "Provides contact information about the company publishing the WFS service, including telephone, website, and email.")
  @NotNull


  public Object getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(Object serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public WfsCapabilities operationsMetadata(Object operationsMetadata) {
    this.operationsMetadata = operationsMetadata;
    return this;
  }

   /**
   * Describes the operations that the WFS server supports and the parameters for each operation. A WFS server may be configured not to respond to the operations listed above.
   * @return operationsMetadata
  **/
  @ApiModelProperty(required = true, value = "Describes the operations that the WFS server supports and the parameters for each operation. A WFS server may be configured not to respond to the operations listed above.")
  @NotNull


  public Object getOperationsMetadata() {
    return operationsMetadata;
  }

  public void setOperationsMetadata(Object operationsMetadata) {
    this.operationsMetadata = operationsMetadata;
  }

  public WfsCapabilities featureTypeList(Object featureTypeList) {
    this.featureTypeList = featureTypeList;
    return this;
  }

   /**
   * Lists the feature types published by a WFS server. Feature types are listed in the form namespace:featuretype. The default projection of the feature type is also listed, along with the bounding box for the data in the stated projection.
   * @return featureTypeList
  **/
  @ApiModelProperty(required = true, value = "Lists the feature types published by a WFS server. Feature types are listed in the form namespace:featuretype. The default projection of the feature type is also listed, along with the bounding box for the data in the stated projection.")
  @NotNull


  public Object getFeatureTypeList() {
    return featureTypeList;
  }

  public void setFeatureTypeList(Object featureTypeList) {
    this.featureTypeList = featureTypeList;
  }

  public WfsCapabilities filterCapabilities(Object filterCapabilities) {
    this.filterCapabilities = filterCapabilities;
    return this;
  }

   /**
   * Lists the filters, or expressions, that are available to form query predicates, for example, SpatialOperators (such as Equals, Touches) and ComparisonOperators (such as LessThan, GreaterThan). The filters themselves are not included in the GetCapabilities document.
   * @return filterCapabilities
  **/
  @ApiModelProperty(required = true, value = "Lists the filters, or expressions, that are available to form query predicates, for example, SpatialOperators (such as Equals, Touches) and ComparisonOperators (such as LessThan, GreaterThan). The filters themselves are not included in the GetCapabilities document.")
  @NotNull


  public Object getFilterCapabilities() {
    return filterCapabilities;
  }

  public void setFilterCapabilities(Object filterCapabilities) {
    this.filterCapabilities = filterCapabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfsCapabilities wfsCapabilities = (WfsCapabilities) o;
    return Objects.equals(this.serviceIdentification, wfsCapabilities.serviceIdentification) &&
        Objects.equals(this.serviceProvider, wfsCapabilities.serviceProvider) &&
        Objects.equals(this.operationsMetadata, wfsCapabilities.operationsMetadata) &&
        Objects.equals(this.featureTypeList, wfsCapabilities.featureTypeList) &&
        Objects.equals(this.filterCapabilities, wfsCapabilities.filterCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceIdentification, serviceProvider, operationsMetadata, featureTypeList, filterCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfsCapabilities {\n");
    
    sb.append("    serviceIdentification: ").append(toIndentedString(serviceIdentification)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    operationsMetadata: ").append(toIndentedString(operationsMetadata)).append("\n");
    sb.append("    featureTypeList: ").append(toIndentedString(featureTypeList)).append("\n");
    sb.append("    filterCapabilities: ").append(toIndentedString(filterCapabilities)).append("\n");
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

