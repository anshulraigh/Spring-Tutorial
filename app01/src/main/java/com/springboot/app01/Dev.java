package com.springboot.app01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    private Laptop laptop;

    @Autowired // Injects the Laptop bean via the setter method
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
        System.out.println("Building something!");
    }
}
