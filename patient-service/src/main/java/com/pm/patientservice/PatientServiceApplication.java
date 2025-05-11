package com.pm.patientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PatientServiceApplication {

	public static void main(String[] args) {
		System.out.println("===== ENVIRONMENT VARIABLES 1 =====");
		System.getenv().forEach((k, v) -> System.out.println(k + " = " + v));
		ConfigurableApplicationContext context = SpringApplication.run(PatientServiceApplication.class, args);
		Environment env = context.getEnvironment();
		String host = env.getProperty("server.address", "localhost");
		String port = env.getProperty("server.port", "8080");
		System.out.printf("✅ Patient Service is running at http://%s:%s%n", host, port);

	}

//	@Bean
//	public CommandLineRunner printServerInfo(@Value("${spring.port}") String port,
//											 @Value("${server.address:localhost}") String host) {
//		return args -> System.out.printf("✅ Patient Service started at http://%s:%s%n", host, port);
//	}

}
