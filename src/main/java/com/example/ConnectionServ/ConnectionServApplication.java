package com.example.ConnectionServ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConnectionServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionServApplication.class, args);
		System.out.println("'Hellllo");
	}
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//	return builder.build();
//	}
}
