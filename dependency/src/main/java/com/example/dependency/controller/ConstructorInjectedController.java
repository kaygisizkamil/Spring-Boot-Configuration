package com.example.dependency.controller;

import com.example.dependency.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {
    public ConstructorInjectedController() {
    }

    private Greeting greeting;
    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorInjected") Greeting greeting) {
        this.greeting = greeting;
    }
    public String getString(){

       return greeting.getGreeting();
    }
}
