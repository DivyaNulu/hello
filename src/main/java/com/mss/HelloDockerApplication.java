package com.mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDockerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerApplication.class, args);

	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HelloDockerApplication.class);
	}

	@GetMapping("/hello")
	public String get() {
		return "hello world";
	}

}
