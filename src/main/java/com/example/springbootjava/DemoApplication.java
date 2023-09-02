package com.example.springbootjava;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.datasource.url}")  // our property for the active profile
	private String dataByEnvironment;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void doSomething() {
		System.out.println("Property spring.datasource.url value is " + dataByEnvironment);
	}
}
