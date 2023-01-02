package com.example.dependency.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NonSingletonModified {
    public NonSingletonModified() {
        System.out.println("supposed to be non singleton");
    }
}
