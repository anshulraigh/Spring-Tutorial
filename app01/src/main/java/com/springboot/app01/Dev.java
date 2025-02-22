package com.springboot.app01;

import org.springframework.beans.factory.annotation.Autowired; // Injects dependencies automatically
import org.springframework.stereotype.Component; // Marks this class as a Spring-managed component (bean)

@Component // Registers this class as a Spring bean
public class Dev {

    @Autowired // Automatically injects an instance of Laptop into this class
    private Laptop laptop;

    public void build() {
        laptop.compile(); // Calls the compile method of Laptop
        System.out.println("Building something!");
    }
}
