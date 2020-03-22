package com.youtube;
// HARD CODED STUFF
//We create a STUB which is only used for unit testing to test SUT
//Stub will return some dummy data
// Stub has disadvantages:
// - when we add another method in ToDoService than the Stub will not compile;
// - when we want to check something else, another list of tasks for another user, we will have to add
// conditions such as if user = user 1 than another list;
// THUS WE USE SOMETHING MORE DYNAMIC ----> MOCKS
import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {
    @Override
    public List<String> retrieveToDos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
    }
}
