package com.youtube.Bykowski.Animal;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnimalControllerTestSuit {

    AnimalRepo animalRepo = Mockito.mock(AnimalRepo.class);
    AnimalController animalController = new AnimalController(animalRepo);

    //przekazałem wynik metody do naszego mocka
    // poniżej prawilne podejście BDD
    @Test
    public void Test_getAnimal() {
        //given
        Mockito.when(animalRepo.Method_1()).thenReturn(MockList());
        List<Animal> expectedList = Arrays.asList(new Animal("dog", 1), new Animal("cat", 2));
        //when
        List<Animal> actualList = animalController.getAnimals();
        //then
        for(int i = 0; i < actualList.size(); i++) {
            Assertions.assertEquals(expectedList.get(i), actualList.get(i));
        }
    }

    //jeszcze bardziej prawilne podejście BDD, żeby when z mocka nie było w given
    // Mockito BDD https://www.baeldung.com/bdd-mockito

//    @Test
//    public void Test_addAnimal() {
//
//        Mockito.when(animalRepo.Method_2()).thenReturn()
//    }


    private static List<Animal> MockList() {
        List<Animal> mockList = new ArrayList<>();
        mockList.add(new Animal("dog", 1));
        mockList.add(new Animal("cat", 2));
        return mockList;
    }

}