package com.example.dependency.animals;

public class DogService implements  AnimalService{
    @Override
    public String getPetService() {
        return "woof";
    }
}
