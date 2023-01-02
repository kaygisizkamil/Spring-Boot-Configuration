package com.example.dependency.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



public class TrService implements Greeting{
    @Override
    public String getGreeting() {
        return "Selam";
    }
}
