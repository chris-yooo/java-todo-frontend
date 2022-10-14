package com.example.backend;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ToDoService {

    private ToDoRepo toDoRepo;

    public ToDoService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public List<ToDo> getList() {
        return toDoRepo.getList();
    }

    public ToDo getToDoDetail(String id) {
        return toDoRepo.getToDoDetail(id);
    }

    public ToDo addToDo(ToDo toDo) {
        ToDo toDoWithDate =  new ToDo(
                LocalDateTime.now().toString(),
                toDo.getDescription(), ToDoStatus.OPEN);
        return toDoRepo.addToDo(toDoWithDate);
    }

    public ToDo editToDo(ToDo toDo) {
        return toDoRepo.editToDo(toDo);
    }

    public ToDo deleteToDo(String id) {
        return toDoRepo.deleteToDo(id);
    }
}
