package com.example.backend;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ToDoRepoTest {


    ToDoRepo toDoRepo = new ToDoRepo();


    @Test
    void getListTest() {

        //given
        List<ToDo> testToDoS = new ArrayList<>();

        //when
        List<ToDo> actual = toDoRepo.getList();

        //then
        List<ToDo> expected = testToDoS;
        assertEquals(expected, actual);

    }


    @Test
    void getToDoDetail() {

        //given
        String id = "2022-10-14T17:23:45.522293400";
        ToDo testToDo = new ToDo("2022-10-14T17:23:45.522293400", "testToDo", ToDoStatus.OPEN );
        List <ToDo> testToDoList = new ArrayList<>(List.of(testToDo));


        //when
        ToDo actual = toDoRepo.getToDoDetail(id);

        //then

        ToDo expected = testToDo;
        assertEquals(expected, actual);
    }

    @Test
    void addToDo() {
    }

    @Test
    void editToDo() {
    }

    @Test
    void deleteToDo() {
    }
}