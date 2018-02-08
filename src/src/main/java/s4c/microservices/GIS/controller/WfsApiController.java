package s4c.microservices.GIS.controller;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import s4c.microservices.GIS.model.WfsCapabilities;
import s4c.microservices.GIS.services.WFSService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-01T12:38:20.844Z")

@Controller
public class WfsApiController implements WfsApi {

	@Autowired
	private WFSService wfsService;
	
	@Override
	public ResponseEntity<?> wfs(String service, String version, String request, String typeName, String featureID,
			BigDecimal count, String sortBy, String srsName, String bbox, String outputFormat) {

		return wfsCall(service, version, request, typeName, featureID, count, sortBy, srsName, bbox, outputFormat);
	}

	@Override
	public ResponseEntity<?> wfsXML(String service, String version, String request, String typeName, String featureID,
			BigDecimal count, String sortBy, String srsName, String bbox, String outputFormat) {
		// TODO Auto-generated method stub
		return wfsCall(service, version, request, typeName, featureID, count, sortBy, srsName, bbox, outputFormat);
	}
	
	private ResponseEntity<?> wfsCall(String service, String version, String request, String typeName, String featureID,
			BigDecimal count, String sortBy, String srsName, String bbox, String outputFormat) {
		if(request.equals("GetCapabilities")){
			return wfsService.wfsGetCapabilities(service, version, request);
		}else if(request.equals("GetFeature")){
			return wfsService.GetFeature(service, version, request, typeName, featureID, count, sortBy, srsName, bbox, outputFormat);
		}else {
			return null;
		}
	}
	
	

	

}
