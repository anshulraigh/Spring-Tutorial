package com.springboot.app01;

import org.springframework.beans.factory.annotation.Autowired; // Enables dependency injection
import org.springframework.beans.factory.annotation.Qualifier; // Specifies which bean to inject when multiple implementations exist
import org.springframework.stereotype.Component; // Marks this class as a Spring-managed component (bean)

@Component // Registers this class as a Spring bean
public class Dev {

    @Autowired // Injects a specific implementation of Computer
    @Qualifier("desktop") // Specifies that the "desktop" bean should be injected instead of the default one
    private Computer comp;

    public void build() {
        comp.compile(); // Calls the compile method of the injected Computer implementation
        System.out.println("Building something!");
    }
}
