package com.example.dependency.service;

import org.springframework.stereotype.Service;


public class ConstructorInjected implements Greeting{
    @Override
    public String getGreeting() {
        return "ctor injected";
    }
}
