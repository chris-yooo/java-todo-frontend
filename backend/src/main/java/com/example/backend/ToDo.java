package com.example.backend;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ToDo {

    LocalDate id;
    String description;
    ToDoStatus status;

    public ToDo(LocalDate id, String description, ToDoStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
}
