package com.cuemby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@Configuration
@SpringBootApplication
@EnableJpaRepositories("com.cuemby.repository")
public class JavaTechnicalTestingCuembyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTechnicalTestingCuembyApplication.class, args);
	}
}
