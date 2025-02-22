package com.springboot.app01;

import org.springframework.context.annotation.Primary; // Marks this bean as the default choice when multiple implementations exist
import org.springframework.stereotype.Component; // Registers this class as a Spring-managed component (bean)

@Component // Marks this class as a Spring bean
@Primary // Gives this implementation priority when multiple beans of type Computer exist
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Compiling from laptop"); // Prints a message indicating compilation is happening from a laptop
    }
}
