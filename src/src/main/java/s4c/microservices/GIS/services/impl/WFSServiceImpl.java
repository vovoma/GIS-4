package s4c.microservices.GIS.services.impl;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import s4c.microservices.GIS.handlers.ApiResponseErrorHandler;
import s4c.microservices.GIS.model.AccessToken;
import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.services.WFSService;
import s4c.microservices.config.AppConfig;

@Service("WFSService")
public class WFSServiceImpl implements WFSService {

	static Logger log = Logger.getLogger(WFSServiceImpl.class.getName());

	@Autowired
	private AppConfig appConfig;

	@Autowired
	ApiResponseErrorHandler responseErrorHandler;

	private AccessToken accessToken;
	private String BASE_URL;

	@PostConstruct
	void init() {
		BASE_URL = appConfig.getWFSBaseUrl();
	}

	@PostConstruct
	void authorization() {
		// accessToken = oauth2Client.executeAccessTokenRequest();
	}
	
	@Override
	public ResponseEntity<?> wfsGetCapabilities(String service, String version, String request) {
		StringBuilder sb = new StringBuilder();
		sb.append("?service=" + service);
		sb.append("&version=" + version);
		sb.append("&request=" + request);	
		

		return getRequest(sb.toString());
	}
	

	@Override
	public ResponseEntity<?> GetFeature(String service, String version, String request, String typeNames,
			String featureID, BigDecimal count, String sortBy, String srsName, String bbox, String outputFormat) {

		StringBuilder sb = new StringBuilder();
		sb.append("?service=" + service);
		sb.append("&version=" + version);
		sb.append("&request=" + request);
		if (typeNames != null)
			sb.append("&typename=" + typeNames);
		if (featureID != null)
			sb.append("&featureID=" + featureID);
		if (count != null)
			sb.append("&count=" + count);
		if (sortBy != null)
			sb.append("&sortBy=" + sortBy);
		if (srsName != null)
			sb.append("&srsName=" + srsName);
		if (bbox != null)
			sb.append("&bbox=" + bbox);
		// if(outputFormat!=null)
		sb.append("&outputFormat=" + "JSON");

		return getRequest(sb.toString());
	}

	private ResponseEntity<?> getRequest(String paramsURL) {

		ResponseEntity<?> response = executeGetRequest(paramsURL);
		try {
			if (ApiResponseErrorHandler.isError(response.getStatusCode())) {
				throw new RestClientException(MessageFormat.format("Response from: {0}{1} HttpStatus: {2}", BASE_URL,
						paramsURL, response.getStatusCode()));
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			if (e.getMessage().contains("HttpStatus: 401")) {
				authorization();
				response = executeGetRequest(paramsURL);
				log.info("Refresh AccessToken and Resend Request");
			}
		}
		log.info(MessageFormat.format("Response from: {0}{1} HttpStatus: {2}", BASE_URL, paramsURL,
				response.getStatusCode()));
		return response;
	}

	private ResponseEntity<?> executeGetRequest(String paramsURL) {
		HttpHeaders headers = new HttpHeaders();
		// headers.add("Authorization", "Bearer " + accessToken.getAccessToken());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		restTemplate.setErrorHandler(responseErrorHandler);
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		ResponseEntity<?> response = restTemplate.exchange(BASE_URL + paramsURL, HttpMethod.GET, request, Map.class);
		return response;
	}

	@Override
	public List<Device> getDummyDevices() {
		// Device device;
		// Geometry geom;
		// double[] coordinates = new double[2];v.......
		// List<Device> devices = new ArrayList<Device>();
		//
		// coordinates[0] = 43.461733;
		// coordinates[1] = -3.806941;
		// geom = new Geometry("point", coordinates);
		// device = new Device("5a5f0e9c2c260400131897e7", "devices_general", "IoTA-UL",
		// "glucometer-type-1", "HTTP", true,
		// "507f191e810c19729de860ed", "0", null, null, null, null, null, geom);
		// devices.add(device);
		//
		// coordinates[0] = 43.462551;
		// coordinates[1] = -3.802287;
		// geom = new Geometry("point", coordinates);
		// device = new Device("5a5f0f7f2c260400131897e9", "devices_general_2",
		// "IoTA-UL", "glucometer-type-1", "HTTP",
		// true, "507f191e810c19729de860ed", "0", null, null, null, null, null, geom);
		// devices.add(device);
		//
		// coordinates[0] = 43.467262;
		// coordinates[1] = -3.783029;
		// geom = new Geometry("point", coordinates);
		// device = new Device("5a5f0e9c2c260400131897e8", "devices_general", "IoTA-UL",
		// "glucometer-type-1", "HTTP", true,
		// "507f191e810c19729de860ed", "0", null, null, null, null, null, geom);
		// devices.add(device);
		//
		// coordinates[0] = 43.469754;
		// coordinates[1] = -3.782793;
		// geom = new Geometry("point", coordinates);
		// device = new Device(null, "hola", "IoTA-UL", "glucometer-type-1", "HTTP",
		// true, "507f191e810c19729de860ed", "0",
		// null, null, null, null, null, geom);
		// devices.add(device);
		//
		// coordinates[0] = 43.470198;
		// coordinates[1] = -3.788050;
		// geom = new Geometry("point", coordinates);
		// device = new Device("5a5f6f9e2c260400131897fe", "devices_general", "IoTA-UL",
		// "glucometer-type-1", "HTTP", true,
		// "507f191e810c19729de860ed", "0", null, null, null, null, null, geom);
		// devices.add(device);
		//
		// coordinates[0] = 43.469404;
		// coordinates[1] = -3.792760;
		// geom = new Geometry("point", coordinates);
		// device = new Device("5a606735e445980013c24904", "devices_general", "IoTA-UL",
		// "glucometer-type-1", "HTTP", true,
		// "507f191e810c19729de860ed", "0", null, null, null, null, null, geom);
		// devices.add(device);
		//
		// return devices;

		return null;
	}

}
