package com.example.dependency.animals;

public class AnimalServiceFactory {
    public AnimalService getAnimal(String sound){
        if(sound=="meoww") return new CatService();
        else if(sound=="woof") return new DogService();
        else return new DogService();
    }
}
