package com.example.system;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableWebSecurity
@OpenAPIDefinition(
		info = @Info(
				title = "Cilvil housing construcion",
				version = "1.0.0",
				description = "SWP391",
				termsOfService = "THien",
				contact = @Contact(
						name = "Mr.Thiên",
						email = "thien010502@gmail.com"
				),
				license = @License(
						name = "licence",
						url = "chcqs"
				)
		),
		servers = {
				@Server(url = "http://localhost:8080/", description = "Default Server URL")
		}
)
public class SystemApplication {
	public static void main(String[] args) {		
		SpringApplication.run(SystemApplication.class, args);
	}
}
