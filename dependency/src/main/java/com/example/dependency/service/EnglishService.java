package com.example.dependency.service;

import com.example.dependency.repository.EnglishRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



public class EnglishService implements Greeting {
    @Override
    public String getGreeting() {
        return englishRepository.getGreeting();
    }

    private EnglishRepository englishRepository;

    public EnglishService(EnglishRepository englishRepository) {
        this.englishRepository = englishRepository;
    }


}
