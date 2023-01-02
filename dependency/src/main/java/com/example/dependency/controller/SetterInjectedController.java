package com.example.dependency.controller;

import com.example.dependency.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public SetterInjectedController() {
    }

    private Greeting greeting;
    @Qualifier("setterInjected")
    @Autowired
    public void setGreeting(Greeting greeting){
        this.greeting=greeting;
    }
    public String getString(){
        return greeting.getGreeting();
    }

}
