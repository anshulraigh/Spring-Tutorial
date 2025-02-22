// Defines the package in which this class resides
package com.springboot.app01;

// Importing necessary Spring Boot classes
import org.springframework.boot.SpringApplication; // Used to bootstrap and launch the Spring application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Enables auto-configuration, component scanning, and configuration properties
import org.springframework.context.ApplicationContext; // Provides the application context to manage beans

// @SpringBootApplication is a convenience annotation that includes:
// 1. @Configuration - Marks this class as a configuration class
// 2. @EnableAutoConfiguration - Automatically configures Spring Boot based on dependencies
// 3. @ComponentScan - Enables component scanning to detect @Component, @Service, @Repository, etc.
@SpringBootApplication
public class App01Application {

	// The main method serves as the entry point for the Spring Boot application
	public static void main(String[] args) {
		// ApplicationContext manages all the beans and dependencies in the Spring application
		ApplicationContext context = SpringApplication.run(App01Application.class, args);

		// Fetching the Dev bean from the application context
		Dev dev = context.getBean(Dev.class);
		dev.build(); // Calling the build method
	}
}
