package com.youtube.Bykowski.Animal;

import java.util.ArrayList;
import java.util.List;

//AnimalController i System Under Tests (SUT)
//AnimalRepo is dependency class that is not implemented yet

public class AnimalController {

    private AnimalRepo animalRepo;

    public AnimalController(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public List<Animal> getAnimals () {
        List<Animal> list = new ArrayList<>();
        return animalRepo.Method_1();
    }

    public void addAnimal (Animal animal) {
            animalRepo.Method_2();
    }
}
