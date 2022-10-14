package com.example.backend;

import org.springframework.stereotype.Service;

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

    public ToDo getToDoDetail(int id) {
        return toDoRepo.getToDoDetail(id);
    }

}
