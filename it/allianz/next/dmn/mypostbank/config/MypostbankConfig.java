package it.allianz.next.dmn.mypostbank.config;

import it.allianz.next.apigee.integration.ApigeeInfrastracture;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;


@Configuration
@ComponentScan(basePackages = "it.allianz.next")
public class MypostbankConfig {
	private static final Log LOGGER = LogFactory.getLog(MypostbankConfig.class);
	
	@Bean
	@Qualifier("apigeeInfrastracture")
	@DependsOn("constantManagerAPIGEE")
	public ApigeeInfrastracture apigeeInfrastracture() {
		return new ApigeeInfrastracture();
	}
	
	@Bean
	@Qualifier("constantManagerAPIGEE")
	@ConfigurationProperties("apigee")
	public it.allianz.next.apigee.common.ConstantiManagerApigee constantManagerAPIGEE() {
		return new it.allianz.next.apigee.common.ConstantiManagerApigee();
	}

	private RestTemplate createSingleTemplate(String user,String password){
		RestTemplate template=null;
		try {
			template = new RestTemplate();
			// template.getInterceptors().add(new
			// BasicAuthorizationInterceptor(user,password));
		} catch (Exception e) {
			if(LOGGER.isErrorEnabled()){
				LOGGER.error("Unable to instantiate Htts rest template for pivotal notification engine");
			}
		} 
		return template;
	}
	
}
