package com.springboot.app01;

import org.springframework.beans.factory.annotation.Autowired; // Injects dependencies automatically
import org.springframework.stereotype.Component; // Marks this class as a Spring-managed component (bean)

@Component // Registers this class as a Spring bean
public class Dev {

    private final Laptop laptop;

    @Autowired  // Not required from Spring 4.3+ if only one constructor is present
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
        System.out.println("Building something!");
    }
}
