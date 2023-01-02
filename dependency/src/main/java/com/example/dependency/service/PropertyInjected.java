package com.example.dependency.service;


import org.springframework.stereotype.Service;

//@Service
public class PropertyInjected  implements  Greeting{
    @Override
    public String getGreeting() {
        return "Property Ine-jected";
    }
}
