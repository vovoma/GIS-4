package s4c.microservices.GIS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppBasicTest 
{
    
	@Autowired
	private TestRestTemplate restTemplate;	
	
	@Bean
	public RestTemplate restTemplate(List<HttpMessageConverter<?>> messageConverters) {
	    return new RestTemplate(messageConverters);
	}

	@Bean
	public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
	    return new ByteArrayHttpMessageConverter();
	}
	
	@Test
	public void WFSGetCapabilitiesTest() {
		String url = "/gis/ows?service=wfs&version=2.0.0&request=GetCapabilities";
		HashMap<String, String> urlVariables = new HashMap<String, String>();	
		ResponseEntity<?> response = this.restTemplate.getForEntity(url,
				Object.class, String.class,urlVariables);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void WMSGetCapabilitiesTest() {
		String url = "/gis/ows?service=wms&version=1.3.0&request=GetCapabilities";
		HashMap<String, String> urlVariables = new HashMap<String, String>();	
		ResponseEntity<?> response = this.restTemplate.getForEntity(url,
				Object.class, String.class,urlVariables);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void WFSGetFeatureTest() {
		String url = "/gis/ows?service=wfs&version=2.0.0&request=Getfeature&typeName=s4c:devices&outputFormat=JSON";
		HashMap<String, String> urlVariables = new HashMap<String, String>();	
		ResponseEntity<?> response = this.restTemplate.getForEntity(url,
				Object.class, String.class,urlVariables);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void WFSGetMapTest() {
		boolean success=false;
		String url = "/gis/ows?service=WMS&version=1.1.0&request=GetMap&layers=s4c:devices&styles=&bbox=-3.806941,43.461733,-3.782793,43.470198&width=768&height=330&srs=EPSG:4326&format=image/png";
		HashMap<String, String> urlVariables = new HashMap<String, String>();	
		byte[] imageBytes = restTemplate.getForObject(url, byte[].class);
		try {
			Files.write(Paths.get("image.png"), imageBytes);
			success= true;
			Files.delete(Paths.get("image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, success);
	}

}

