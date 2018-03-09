package s4c.microservices.GIS.services.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import s4c.microservices.GIS.model.external.Device;

@Service
public class DeviceManagementService {
	
	private static Logger log = LoggerFactory.getLogger(DeviceManagementService.class);

	@Autowired
	protected RestTemplate restTemplate;
	protected String serviceUrl;

	public DeviceManagementService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
	}

	public List<Device> getMyDevices(String JWTTokenHeaderValue) {
		String url = serviceUrl + "/devices/myDevices";
		try {			
			
			HttpHeaders headers = new HttpHeaders();			
			
			headers.set("X-Authorization-s4c", JWTTokenHeaderValue);			
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

			log.debug("GET request to: " + url + " with JWT token " + JWTTokenHeaderValue);
			
			ResponseEntity<Device[]> response = restTemplate.exchange(url, HttpMethod.GET, entity, Device[].class);			
			
//			ResponseEntity<Device[]> response = restTemplate.getForEntity(serviceUrl + "/devices/myDevices",
//					Device[].class);
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				return new ArrayList<Device>(Arrays.asList(((Device[]) response.getBody())));
			}
		} catch (Exception ex) {
			log.error("Error sending request:" + ex.toString());
			return new ArrayList<Device>();
		}

		return new ArrayList<Device>();
	}

}