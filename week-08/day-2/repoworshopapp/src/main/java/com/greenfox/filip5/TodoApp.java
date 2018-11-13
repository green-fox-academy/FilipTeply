package com.greenfox.filip5;

import com.greenfox.filip5.models.Todo;
import com.greenfox.filip5.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TodoApp implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public TodoApp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(TodoApp.class, args);



    }

    @Override
    public void run(String... args) throws Exception {
//        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
//        todoRepository.save(new Todo("I have to learn JPA"));


    }
}
