package s4c.microservices.GIS.controller;



import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.model.WfsCapabilities;

@Api(value = "wfs", description = "the wfs API")
public interface WfsApi {

    @ApiOperation(value = "The GetCapabilities operation is a request to the microservice for a list of the operations and services, or capabilities, supported by that microservice. To fully comply with OGC WFS this endpoint needs to be enabled.", notes = "", response = WfsCapabilities.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "WFS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WfsCapabilities.class),
        @ApiResponse(code = 400, message = "Request format (i.e. parameters) are not ok.", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Unknown error", response = Void.class) })
    
    @RequestMapping(value = "/wfs/GetCapabilities",
        produces = { "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<WfsCapabilities> wfsGetCapabilities( @NotNull@ApiParam(value = "Service name. Value is WFS.", required = true, defaultValue = "WFS") @RequestParam(value = "service", required = true, defaultValue="WFS") String service, @NotNull@ApiParam(value = "Service version. Value is one of 1.1.0, 2.0.0", required = true, allowableValues = "1.1.0, 2.0.0", defaultValue = "2.0.0") @RequestParam(value = "version", required = true, defaultValue="2.0.0") String version, @NotNull@ApiParam(value = "Operation name. Value GetCapabilities", required = true, defaultValue = "GetCapabilities") @RequestParam(value = "request", required = true, defaultValue="GetCapabilities") String request);


    @ApiOperation(value = "The response is a map image, or other map output artifact, depending on the format requested. The  microservice provides a wide variety of output formats.", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "WFS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation. It returns an GML/XML that contains a collection of geographic feature instances filtered according to a criteria set by the requesting client.", response = Void.class),
        @ApiResponse(code = 400, message = "Request format (i.e. parameters) are not ok.", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Unknown error", response = Void.class) })
    
    @RequestMapping(value = "/wfs/GetFeature",
//        produces = { "application/json","application/xml" , "application/javascript", "text/csv", "application/zip" },
    	produces = { "application/json"},
        method = RequestMethod.GET)
    ResponseEntity<List<Device>> wfsGetFeature( @NotNull@ApiParam(value = "Service name. Value is WFS.", required = true, defaultValue = "WFS") @RequestParam(value = "service", required = true, defaultValue="WFS") String service, @NotNull@ApiParam(value = "Service version. Value is one of 1.1.0, 2.0.0", required = true, allowableValues = "1.1.0, 2.0.0", defaultValue = "2.0.0") @RequestParam(value = "version", required = true, defaultValue="2.0.0") String version, @NotNull@ApiParam(value = "Operation name. Value GetFeature", required = true, defaultValue = "GetFeature") @RequestParam(value = "request", required = true, defaultValue="GetFeature") String request,@ApiParam(value = "Required (but Optional if FEATUREID is specified.) A list of feature type names to query") @RequestParam(value = "typeNames", required = false) String typeNames,@ApiParam(value = "(Mutually exclusive with BBOX) An enumerated list of feature instances to fetch identified by their feature identifiers.") @RequestParam(value = "featureID", required = false) String featureID,@ApiParam(value = "A positive integer indicating the maximum number of features that the WFS should return in response to a query. If no value is specified then all result instances should be presented.") @RequestParam(value = "count", required = false) BigDecimal count,@ApiParam(value = "The SORTBY parameter is used to specify a list of property names whose values should be used to order (upon presentation) the set of feature instances that satify the query") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "This parameter is used to specify a coordinates system (WFSsupported SRS) that should be used for returned feature geometries. The value may be the DefaultSRS or any of the OtherSRS values that a WFS declares it supports in the capabilities document") @RequestParam(value = "srsName", required = false) String srsName,@ApiParam(value = "(Prerequisite = TYPENAME)(Mutually exclusive with FEATUREID This parameter allows you to search for features that are contained (or partially contained) inside a box of user-defined coordinates. The format of the BBOX parameter is bbox=a1,b1,a2,b2``where ``a1, b1, a2, and b2 represent the coordinate values. The order of coordinates passed to the BBOX parameter depends on the coordinate system used.") @RequestParam(value = "bbox", required = false) String bbox,@ApiParam(value = "WFS returns features and feature information in a number of formats. The syntax for specifying an output format is GML2, GML3, shape-zip,application/json, text/javascript, csv.", defaultValue = "GML3") @RequestParam(value = "outputFormat", required = false, defaultValue="GML3") String outputFormat);

}
