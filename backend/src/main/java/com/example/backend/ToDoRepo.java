package com.example.backend;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class ToDoRepo {

    private List<ToDo> toDoS = new ArrayList<>(List.of(
            new ToDo(1,"Testtodo", ToDoStatus.OPEN),
            new ToDo(2, "TestTodo2", ToDoStatus.OPEN),
            new ToDo(3, "Ko", ToDoStatus.OPEN),
    ));

    public List<ToDo> getList() {
        return toDoS;
    }

    public ToDo getToDoDetail(int id) {
        for(ToDo toDo : toDoS){
            if(toDo.getId() == id) {
                return toDo;
            }
        }
        throw new NoSuchElementException("Keine Todo für diese ID gefunden.");
    }

}
