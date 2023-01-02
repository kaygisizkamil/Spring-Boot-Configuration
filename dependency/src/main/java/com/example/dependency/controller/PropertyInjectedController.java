package com.example.dependency.controller;

import com.example.dependency.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    public PropertyInjectedController() {
    }

    @Autowired
    @Qualifier("propertyInjected")
    private Greeting greeting;
        public String getString(){
        return   greeting.getGreeting();

        }

}
