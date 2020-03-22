package com.youtube;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

class ToDoBusinessImplTestSuit {

    @Test
    public void ShouldReturnToDosOnlyConnectedWithSpring_UsingStub () {

        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceStub);

        List<String> list = toDoBusiness.retrieveToDosRelatedToSpring("user");

        List<String> expectedList = Arrays.asList("Learn Spring MVC", "Learn Spring");

        assertEquals(expectedList.get(0), list.get(0));
        assertEquals(expectedList.get(1), list.get(1));
        assertEquals(expectedList.size(), list.size());
    }

    //What is Mocking?
    //mocking is creating objects that simulates tha behaviour of real objects.
    //unlike stubs, mocks can be dynamically created from code
    // mocks offer a lot of more functionality than stubbing
    @Test
    public void ShouldReturnToDosOnlyConnectedWithSpring_UsingMock () {
        //<creating something similar to STUB>
        ToDoService toDoServiceMock = Mockito.mock(ToDoService.class);
        Mockito.when(toDoServiceMock.retrieveToDos("user"))
                .thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance"));
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        //</creating something similar to STUB>
        List<String> list = toDoBusiness.retrieveToDosRelatedToSpring("user");
        List<String> expectedList = Arrays.asList("Learn Spring MVC", "Learn Spring");
        assertEquals(expectedList.get(0), list.get(0));
        assertEquals(expectedList.get(1), list.get(1));
        assertEquals(expectedList.size(), list.size());
    }

    @Test
    public void ShouldReturnEmptyList_UsingMock () {
        //<creating something similar to STUB>
        ToDoService toDoServiceMock = Mockito.mock(ToDoService.class);
        Mockito.when(toDoServiceMock.retrieveToDos("another user"))
                .thenReturn(Arrays.asList());
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        //</creating something similar to STUB>
        List<String> list = toDoBusiness.retrieveToDosRelatedToSpring("another user");
        assertEquals(0, list.size());
    }

    //Mocking the list size method
    @Test
    public void LEtsMockTheListSizeMethod() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void LEtsMockTheListSizeMethod_MultipleTimes() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
        assertEquals(4, listMock.size());
    }

    //Mocking the list get method

    @Test
    public void LetsMockListGetMethod() {
        List listMock = Mockito.mock(List.class);

        Mockito.when(listMock.get(0)).thenReturn("Super");

        assertEquals("Super", listMock.get(0));
    }

    @Test
    public void LetsMockListGetMethod_AnyInt() {
        List listMock = Mockito.mock(List.class);

        Mockito.when(listMock.get(anyInt())).thenReturn("Super");

        assertEquals("Super", listMock.get(0));
        assertEquals("Super", listMock.get(1));
        assertEquals("Super", listMock.get(2));
        assertEquals("Super", listMock.get(3));
    }
}