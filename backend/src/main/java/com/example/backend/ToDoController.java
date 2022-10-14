package com.example.backend;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<ToDo> toDoList() {
        return toDoService.getList();
    }

    @GetMapping(path = {"/{id}"})
    public ToDo getToDoDetail(@PathVariable String id) {
        return toDoService.getToDoDetail(id);
    }

    @PostMapping
    public ToDo addToDo(@RequestBody ToDo toDo) {
        return toDoService.addToDo(toDo);
    }

    @PutMapping(path = {"/{id}"})
    public ToDo editToDo(@RequestBody ToDo toDo) {
        return toDoService.editToDo(toDo);
    }

    @DeleteMapping(path = "/{id}")
        public ToDo deleteToDo(@PathVariable String id) {
            return toDoService.deleteToDo(id);
        }



}

