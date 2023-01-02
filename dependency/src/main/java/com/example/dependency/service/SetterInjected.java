package com.example.dependency.service;


import org.springframework.stereotype.Service;



public class SetterInjected implements Greeting{
    @Override
    public String getGreeting() {
       return "Setter injected";
    }
}
