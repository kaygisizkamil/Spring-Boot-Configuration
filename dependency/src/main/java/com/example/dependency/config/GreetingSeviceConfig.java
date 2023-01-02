package com.example.dependency.config;

import com.example.dependency.animals.AnimalService;
import com.example.dependency.animals.AnimalServiceFactory;
import com.example.dependency.animals.DogService;
import com.example.dependency.controller.ConstructorInjectedController;
import com.example.dependency.repository.EnglishRepository;
import com.example.dependency.repository.EnglishRepositoryImpl;
import com.example.dependency.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingSeviceConfig {
    @Bean
    PropertyInjected propertyInjected(){return new PropertyInjected();}
    //i got propertyinjected out of auto scan configured it myself
    @Bean
    ConstructorInjected constructorInjected(){return new ConstructorInjected();}

    @Bean
    SetterInjected setterInjected(){return new SetterInjected();}
    @Bean
    EnglishRepository englishRepository(){return new EnglishRepositoryImpl();}//implementasyonunu aliriz
   /* @Bean
    AnimalServiceFactory animalServiceFactory(){return new AnimalServiceFactory();}*/
    @Bean
    AnimalServiceFactory animalServiceFactory(){return new AnimalServiceFactory();}
    @Profile({"dog", "default"})
    @Bean//in here we can think it as from child to parent and let spring do its magic
    //to be able to use dependency injection as usual return value is the grand parent we can say
    // we used factory pattern in here and at grandparent level we also need to new it otherwise compile error would happen
    AnimalService dogService(AnimalServiceFactory animalServiceFactory){return animalServiceFactory.getAnimal("woof");}
    @Bean
    @Profile("cat")
    AnimalService catService(AnimalServiceFactory animalServiceFactory){return animalServiceFactory.getAnimal("meoww");}
    @Bean("language")//normally bean name would be the method we override it
    @Profile("EN")
    EnglishService englishService(EnglishRepository englishRepository){return new EnglishService(englishRepository);}
    @Bean("language")
    @Profile({"TR","default"})
    TrService trService(){//we did not use trService as annotatin
        //spring will search for the qualifier and the name of is "language"
        return  new TrService();
    }
    //and with this configurations we no longer need to use Service notation above them

}
