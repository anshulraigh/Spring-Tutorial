// Defines the package where this class is located
package com.springboot.app01;

// Importing necessary Spring annotations
import org.springframework.stereotype.Component; // Marks this class as a Spring-managed component (bean)

// @Component annotation tells Spring Boot to register this class as a bean in the application context
@Component
public class Dev {

    Laptop laptop = new Laptop();

    // A simple method that prints a message when invoked
    public void build() {
        laptop.compile();
        System.out.println("Building something!");
    }
}
