package com.webModule.webService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WebServiceApplication.class);
		application.run(args);
	}

}
