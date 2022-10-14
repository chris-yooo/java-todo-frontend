package com.example.backend;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ToDoRepo {


    private List<ToDo> toDoS = new ArrayList<>(List.of(
            new ToDo(LocalDate.now(),"Put Methode schreiben", ToDoStatus.IN_PROGRESS),
            new ToDo(LocalDate.now(),"Controller aktualisieren", ToDoStatus.OPEN),
            new ToDo(LocalDate.now(),"Kochen :D", ToDoStatus.DONE)
    ));

    public List<ToDo> getList() {
        return toDoS;
    }

    public ToDo getToDoDetail(LocalDate id) {
        for(ToDo toDo : toDoS){
            if(toDo.getId() == id) {
                return toDo;
            }
        }
        throw new NoSuchElementException("Keine Todo für diese ID gefunden.");
    }

}
