package com.example.dependency.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonByDefault {

    public SingletonByDefault() {
        System.out.println("Created");
    }

}
