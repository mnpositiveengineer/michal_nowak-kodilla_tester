package com.youtube;

import java.util.ArrayList;
import java.util.List;


//ToDoBusinessImpl is SUT -> Service Under Test
//ToDoService is Dependency, because when we call method retrieveToDosRelatedToSpring we depend on the ToDoService
//We need to write Tests on ToDoBusinessImpl but we do not have an implementation of ToDoService, which we depend on
//ToDoService Could be developed by other team or could be an external interface
public class ToDoBusinessImpl {

    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveToDosRelatedToSpring (String user) {
        List<String> filteredToDos = new ArrayList<>();
        List<String> toDos = toDoService.retrieveToDos(user);
        for (String toDo : toDos){
            if(toDo.contains("Spring")) {
                filteredToDos.add(toDo);
            }
        }
        return filteredToDos;
    }
}
