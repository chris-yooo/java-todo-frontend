package com.example.backend;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Component
public class ToDoRepo {


    private List<ToDo> toDoS = new ArrayList<>();

    public List<ToDo> getList() {
        return toDoS;
    }

    public ToDo getToDoDetail(String id) {
        for (ToDo toDo : toDoS) {
            if (Objects.equals(toDo.getId(), id)) {
                return toDo;
            }
        }
        throw new NoSuchElementException("Keine Todo für diese ID gefunden!");
    }

    public ToDo addToDo(ToDo toDoWithDateTime) {
        toDoS.add(toDoWithDateTime);
        return toDoWithDateTime;
    }

    public ToDo editToDo(ToDo toDo) {
        for (ToDo newForToDo : toDoS) {
            if (Objects.equals(toDo.getId(), newForToDo.id)) {
                toDoS.remove(newForToDo);
                toDoS.add(toDo);
                return toDo;
            }
        }
        throw new NoSuchElementException("Keine ToDo gefunden!");
    }

    public ToDo deleteToDo(String id) {
        for (ToDo newForToDo : toDoS) {
            if (Objects.equals(newForToDo.getId(), id)) {
                ToDo removedToDoReturn = newForToDo;
                toDoS.remove(newForToDo);
                return removedToDoReturn;
            }
        }
        throw new NoSuchElementException("ToDo konnte nicht gelöscht werden!");
    }
}

