package s4c.microservices.GIS.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.model.WfsCapabilities;
import s4c.microservices.GIS.services.WFSService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-01T12:38:20.844Z")

@Controller
public class WfsApiController implements WfsApi {

	@Autowired
	private WFSService wfsService;

	public ResponseEntity<WfsCapabilities> wfsGetCapabilities(
			@NotNull @ApiParam(value = "Service name. Value is WFS.", required = true, defaultValue = "WFS") @RequestParam(value = "service", required = true, defaultValue = "WFS") String service,
			@NotNull @ApiParam(value = "Service version. Value is one of 1.1.0, 2.0.0", required = true, allowableValues = "1.1.0, 2.0.0", defaultValue = "2.0.0") @RequestParam(value = "version", required = true, defaultValue = "2.0.0") String version,
			@NotNull @ApiParam(value = "Operation name. Value GetCapabilities", required = true, defaultValue = "GetCapabilities") @RequestParam(value = "request", required = true, defaultValue = "GetCapabilities") String request) {
		// do some magic!
		return new ResponseEntity<WfsCapabilities>(HttpStatus.OK);
	}

	public ResponseEntity<List<Device>> wfsGetFeature(
			@NotNull @ApiParam(value = "Service name. Value is WFS.", required = true, defaultValue = "WFS") @RequestParam(value = "service", required = true, defaultValue = "WFS") String service,
			@NotNull @ApiParam(value = "Service version. Value is one of 1.1.0, 2.0.0", required = true, allowableValues = "1.1.0, 2.0.0", defaultValue = "2.0.0") @RequestParam(value = "version", required = true, defaultValue = "2.0.0") String version,
			@NotNull @ApiParam(value = "Operation name. Value GetFeature", required = true, defaultValue = "GetFeature") @RequestParam(value = "request", required = true, defaultValue = "GetFeature") String request,
			@ApiParam(value = "Required (but Optional if FEATUREID is specified.) A list of feature type names to query") @RequestParam(value = "typeNames", required = false) String typeNames,
			@ApiParam(value = "(Mutually exclusive with BBOX) An enumerated list of feature instances to fetch identified by their feature identifiers.") @RequestParam(value = "featureID", required = false) String featureID,
			@ApiParam(value = "A positive integer indicating the maximum number of features that the WFS should return in response to a query. If no value is specified then all result instances should be presented.") @RequestParam(value = "count", required = false) BigDecimal count,
			@ApiParam(value = "The SORTBY parameter is used to specify a list of property names whose values should be used to order (upon presentation) the set of feature instances that satify the query") @RequestParam(value = "sortBy", required = false) String sortBy,
			@ApiParam(value = "This parameter is used to specify a coordinates system (WFSsupported SRS) that should be used for returned feature geometries. The value may be the DefaultSRS or any of the OtherSRS values that a WFS declares it supports in the capabilities document") @RequestParam(value = "srsName", required = false) String srsName,
			@ApiParam(value = "(Prerequisite = TYPENAME)(Mutually exclusive with FEATUREID This parameter allows you to search for features that are contained (or partially contained) inside a box of user-defined coordinates. The format of the BBOX parameter is bbox=a1,b1,a2,b2``where ``a1, b1, a2, and b2 represent the coordinate values. The order of coordinates passed to the BBOX parameter depends on the coordinate system used.") @RequestParam(value = "bbox", required = false) String bbox,
			@ApiParam(value = "WFS returns features and feature information in a number of formats. The syntax for specifying an output format is GML2, GML3, shape-zip,application/json, text/javascript, csv.", defaultValue = "GML3") @RequestParam(value = "outputFormat", required = false, defaultValue = "GML3") String outputFormat) {

		List<Device> devices = wfsService.getDummyDevices();

		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return ResponseEntity.ok().headers(httpHeaders).body(devices);
	}

	

}
