package com.todolist.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoCotroller {
    @GetMapping("/")
    public String todo() {return  "todo";}
}
