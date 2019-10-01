package com.satya.springbootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {
	@Value("${spring.application.name}")
	private String propertyName;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
@RequestMapping(value="/")
public String getName() {
	return propertyName;
}
}
