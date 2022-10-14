package com.example.backend;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ToDo {

    String id;
    String description;
    ToDoStatus status;

    public ToDo(String id, String description, ToDoStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
}
