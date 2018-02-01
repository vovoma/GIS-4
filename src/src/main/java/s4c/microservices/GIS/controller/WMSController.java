package s4c.microservices.GIS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.services.WMSService;


@Api
@RestController
@RequestMapping("wms")
public class WMSController {



	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private WMSService wmsService;

	@RequestMapping(method = RequestMethod.GET, value = "/", produces={"application/json", "application/xml"})
	@ApiOperation(value = "getAssets", nickname = "getAssets", response = Device.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 201, message = "OK"), @ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })	
	public List<Device> getAssets(
			@ApiParam(value = "request", required = false) @RequestBody(required = false) Device request){
		
		return null;		

	}	
	
}
