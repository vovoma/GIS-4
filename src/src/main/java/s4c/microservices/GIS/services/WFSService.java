package s4c.microservices.GIS.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.ResponseEntity;

import s4c.microservices.GIS.model.Device;

public interface WFSService {
	
	public List<Device> getDummyDevices();
		  
	public ResponseEntity<?> GetFeature(String service,String version,String request,String typeNames,String featureID,BigDecimal count,String sortBy,String srsName,String bbox,String outputFormat);

	public ResponseEntity<?> wfsGetCapabilities(String service, String version, String request);

}
