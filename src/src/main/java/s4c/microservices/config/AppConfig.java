package s4c.microservices.config;

import javax.annotation.PostConstruct;

import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig implements EnvironmentAware{

	@Autowired
	private Environment environment;
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ProxyServlet(),
				propertyResolver.getProperty("servlet_url"));
		servletRegistrationBean.addInitParameter("targetUri",
				propertyResolver.getProperty("target_url"));
		servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG,
				propertyResolver.getProperty("logging_enabled", "false"));
		return servletRegistrationBean;
	}

	private RelaxedPropertyResolver propertyResolver;
	
    	 
    @PostConstruct
	private void init(){
    	   	
    }
    
    public Environment getEnvironment() {
		return environment;
	}
	public void setEnvironment(Environment environment) {
		this.environment = environment;
		this.propertyResolver = new RelaxedPropertyResolver(environment, "proxy.geoserver.");
	} 
}
