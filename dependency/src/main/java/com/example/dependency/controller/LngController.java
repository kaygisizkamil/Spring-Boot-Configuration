package com.example.dependency.controller;

import com.example.dependency.service.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LngController {
    private Greeting greeting;
    public LngController(@Qualifier("language") Greeting greeting) {
        this.greeting = greeting;
    }
    public String whatup(){
        return greeting.getGreeting();
    }
}
