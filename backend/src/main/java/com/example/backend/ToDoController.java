package com.example.backend;

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
    public ToDo getToDoDetail(@PathVariable LocalDate id){
        return toDoService.getToDoDetail(id);
    }

}
