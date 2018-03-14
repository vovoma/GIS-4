package s4c.microservices.GIS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import s4c.microservices.GIS.filters.PreFilter;
import s4c.microservices.GIS.services.external.DeviceManagementService;

@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("s4c.microservices")
public class Application extends SpringBootServletInitializer {

	public static final String DEVICE_MANAGEMENT_SERVICE_URL = "http://DEVICE-MANAGEMENT";
//	public static final String DEVICE_MANAGEMENT_SERVICE_URL = "http://us1.fiwoo.eu:10000";

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public DeviceManagementService deviceManagementService() {
		return new DeviceManagementService(DEVICE_MANAGEMENT_SERVICE_URL);
	}

}