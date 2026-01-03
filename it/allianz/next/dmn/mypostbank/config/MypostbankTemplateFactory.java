package it.allianz.next.dmn.mypostbank.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@ComponentScan(basePackages = "it.allianz.next")
public class MypostbankTemplateFactory {

	@Bean(name = "myPostBankRestTemplate")
	public RestTemplate myPostBankRestTemplate() {
		RestTemplate myPostBankRestTemplate = new RestTemplate();
		return myPostBankRestTemplate;
	}
	
}
