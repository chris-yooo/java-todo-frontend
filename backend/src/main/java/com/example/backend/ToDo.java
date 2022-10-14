package com.example.backend;

import lombok.Data;

@Data
public class ToDo {

    int id;
    String description;
    ToDoStatus status;

    public ToDo(int id, String name, ToDoStatus status) {
        this.id = id;
        this.description = name;
        this.status = status;
    }
}
