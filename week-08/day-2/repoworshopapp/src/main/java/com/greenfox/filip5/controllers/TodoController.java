package com.greenfox.filip5.controllers;


import com.greenfox.filip5.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //Create a new controller called TodoController which maps to /todo
    //method which maps to / and /list in the controller, which returns
    // with "This is my first todo" string. Use the @ResponseBody annotation.

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
//        In the list method of the Controller use the repository
//        to find all elements and add them to the model as "todos" attribute

        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }



}
