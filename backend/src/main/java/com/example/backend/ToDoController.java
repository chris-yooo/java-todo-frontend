package com.example.backend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/api/todo")
    public List<ToDo> toDoList(){
        return toDoService.getList();
    }

    @GetMapping("/api/todo/" + "{id}")
    public ToDo getToDoDetail(@PathVariable int id){
        return toDoService.getToDoDetail(id);
    }

}
