package com.pm.billingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BillingServiceApplication {

	public static void main(String[] args) {
		System.out.println("===== ENVIRONMENT VARIABLES 1 =====");
		System.getenv().forEach((k, v) -> System.out.println(k + " = " + v));
		ConfigurableApplicationContext context = SpringApplication.run(BillingServiceApplication.class, args);
		Environment env = context.getEnvironment();
		String host = env.getProperty("server.address", "localhost");
		String port = env.getProperty("server.port", "8080");
		System.out.printf("✅ Patient Service is running at http://%s:%s%n", host, port);
	}

}
