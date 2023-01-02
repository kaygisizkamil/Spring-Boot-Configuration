package com.example.dependency.animals;

public class CatService implements  AnimalService{
    @Override
    public String getPetService() {
        return "meoww";
    }
}
