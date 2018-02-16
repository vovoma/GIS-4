package s4c.microservices.GIS;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
@RequestMapping("gis")
@CrossOrigin
public class GISController {


    @SuppressWarnings("rawtypes")
    @RequestMapping(method = RequestMethod.GET, value = "wmsGetCapabilities", produces="application/json")
	@ApiOperation(value = "wmsGetCapabilities", nickname = "wmsGetCapabilities", response = String.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 201, message = "OK"), @ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public ResponseEntity wmsGetCapabilities( @NotNull@ApiParam(value = "Service name. Value is WMS.", required = true, defaultValue = "WMS") @RequestParam(value = "service", required = true, defaultValue="WMS") String service,
         @NotNull@ApiParam(value = "Service version. Value is one of 1.0.0, 1.1.0, 1.1.1, 1.3.0", required = true, allowableValues = "1.0.0, 1.1.0, 1.1.1, 1.3.0", defaultValue = "1.3.0") @RequestParam(value = "version", required = true, defaultValue="1.3.0") String version,
         @NotNull@ApiParam(value = "Operation name. Value GetCapabilities", required = true, defaultValue = "GetCapabilities") @RequestParam(value = "request", required = true, defaultValue="GetCapabilities") String request) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "wmsGetMap")
	@ApiOperation(value = "wmsGetMap", nickname = "wmsGetMap", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = ResponseEntity.class),
			@ApiResponse(code = 201, message = "OK"), @ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
    public ResponseEntity<Void> wmsGetMap( @NotNull@ApiParam(value = "Service name. Value is WMS.", required = true, defaultValue = "WMS") @RequestParam(value = "service", required = true, defaultValue="WMS") String service,
         @NotNull@ApiParam(value = "Service version. Value is one of 1.0.0, 1.1.0, 1.1.1, 1.3.0", required = true, allowableValues = "1.0.0, 1.1.0, 1.1.1, 1.3.0", defaultValue = "1.3.0") @RequestParam(value = "version", required = true, defaultValue="1.3.0") String version,
         @NotNull@ApiParam(value = "Operation name. Value is GetMap", required = true, defaultValue = "GetMap") @RequestParam(value = "request", required = true, defaultValue="GetMap") String request,
         @NotNull@ApiParam(value = "Layers to display on map. Value is a comma-separated list of layer names.", required = true) @RequestParam(value = "layers", required = true) String layers,
         @NotNull@ApiParam(value = "Styles in which layers are to be rendered. Value is a comma-separated list of style names, or empty if default styling is required. Style names may be empty in the list, to use default layer styling.", required = true) @RequestParam(value = "styles", required = true) String styles,
         @NotNull@ApiParam(value = "Spatial Reference System for map output. Value is in form EPSG:nnn. crs is the parameter key used in WMS 1.3.0.", required = true) @RequestParam(value = "srs", required = true) String srs,
         @NotNull@ApiParam(value = "Bounding box for map extent. Value is minx,miny,maxx,maxy in units of the SRS.", required = true) @RequestParam(value = "bbox", required = true) String bbox,
         @NotNull@ApiParam(value = "Width of map output, in pixels.", required = true) @RequestParam(value = "width", required = true) String width,
         @NotNull@ApiParam(value = "Height of map output, in pixels.", required = true) @RequestParam(value = "height", required = true) String height,
         @NotNull@ApiParam(value = "Format for the map output. See WMS output formats for supported values.", required = true) @RequestParam(value = "format", required = true) String format,
        @ApiParam(value = "Whether the map background should be transparent. Values are true or false. Default is false") @RequestParam(value = "transparent", required = false) Boolean transparent,
        @ApiParam(value = "Background color for the map image. Value is in the form RRGGBB. Default is FFFFFF (white).") @RequestParam(value = "bgcolor", required = false) String bgcolor,
        @ApiParam(value = "Format in which to report exceptions. Default value is application/vnd.ogc.se_xml.") @RequestParam(value = "exceptions", required = false) String exceptions,
        @ApiParam(value = "Time value or range for map data. See Time Support in OGC WMS for more information.") @RequestParam(value = "time", required = false) String time,
        @ApiParam(value = "A URL referencing a StyledLayerDescriptor XML file which controls or enhances map layers and styling") @RequestParam(value = "sld", required = false) String sld,
        @ApiParam(value = "A URL-encoded StyledLayerDescriptor XML document which controls or enhances map layers and styling") @RequestParam(value = "sld_body", required = false) String sldBody) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
