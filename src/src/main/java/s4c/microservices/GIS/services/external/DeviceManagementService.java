package s4c.microservices.GIS.services.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import s4c.microservices.GIS.model.external.Device;

@Service
public class DeviceManagementService {
 
    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl;
 
    public DeviceManagementService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http")  ? serviceUrl: "http://" + serviceUrl;
    }
    
    
    public List<Device> getMyDevices () {
    	try {
    		ResponseEntity<Device[]> response=   restTemplate.getForEntity(serviceUrl + "/devices/myDevices",Device[].class);
    	   	if(response.getStatusCode().equals(HttpStatus.OK)){
	    		return new ArrayList<Device>(Arrays.asList(((Device[])response.getBody())));
	    	}
    	} catch (Exception ex){
    		return new ArrayList<Device>(); 
    	}
    	
    	return new ArrayList<Device>();
    }

    
}