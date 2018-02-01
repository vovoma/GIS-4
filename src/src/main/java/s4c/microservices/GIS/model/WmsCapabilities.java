package s4c.microservices.GIS.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WmsCapabilities
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-01T12:38:20.844Z")

public class WmsCapabilities   {
  @JsonProperty("service")
  private Object service = null;

  @JsonProperty("request")
  private Object request = null;

  @JsonProperty("layer")
  private Object layer = null;

  public WmsCapabilities service(Object service) {
    this.service = service;
    return this;
  }

   /**
   * Contains service metadata such as the service name, keywords, and contact information for the organization operating the server.
   * @return service
  **/
  @ApiModelProperty(required = true, value = "Contains service metadata such as the service name, keywords, and contact information for the organization operating the server.")
  @NotNull


  public Object getService() {
    return service;
  }

  public void setService(Object service) {
    this.service = service;
  }

  public WmsCapabilities request(Object request) {
    this.request = request;
    return this;
  }

   /**
   * Describes the operations the WMS service provides and the parameters and output formats for each operation.
   * @return request
  **/
  @ApiModelProperty(required = true, value = "Describes the operations the WMS service provides and the parameters and output formats for each operation.")
  @NotNull


  public Object getRequest() {
    return request;
  }

  public void setRequest(Object request) {
    this.request = request;
  }

  public WmsCapabilities layer(Object layer) {
    this.layer = layer;
    return this;
  }

   /**
   * Lists the available coordinate systems and layers. Each layer provides service metadata such as title, abstract and keywords.
   * @return layer
  **/
  @ApiModelProperty(required = true, value = "Lists the available coordinate systems and layers. Each layer provides service metadata such as title, abstract and keywords.")
  @NotNull


  public Object getLayer() {
    return layer;
  }

  public void setLayer(Object layer) {
    this.layer = layer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WmsCapabilities wmsCapabilities = (WmsCapabilities) o;
    return Objects.equals(this.service, wmsCapabilities.service) &&
        Objects.equals(this.request, wmsCapabilities.request) &&
        Objects.equals(this.layer, wmsCapabilities.layer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, request, layer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WmsCapabilities {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
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

