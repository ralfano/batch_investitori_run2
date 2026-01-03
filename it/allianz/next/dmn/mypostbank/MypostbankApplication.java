package it.allianz.next.dmn.mypostbank;

import it.allianz.next.audit.JpaAuditingHandlerRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@ComponentScan(basePackages = "it.allianz.next")
@Import(JpaAuditingHandlerRegistrar.class)
public class MypostbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypostbankApplication.class, args);
	}

}