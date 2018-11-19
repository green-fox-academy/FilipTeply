package com.greenfox.filip5.controllers;

import com.greenfox.filip5.models.Todo;
import com.greenfox.filip5.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.stream.Collectors;


@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String listAllTodos(Model model) {
        model.addAttribute("todos", todoRepository.findAllByOrderByIdDesc());
        return "todolist";
    }

    @GetMapping("/add")
    public String showAddTodoForm() {
        return "add";
    }

    @PostMapping("/add")
    public String saveNewTodoItem(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo/";
    }

    @PostMapping(value = "/{id}/delete")
    public String deleteTodoItem(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String editTodoItem(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id).get());
        System.out.println(todoRepository.findById(id).get().getId());
        return "edit";
    }

    @GetMapping(value = "/urgentnotcompleted")
    public String showUrgentNotCompletedTodos(Model model) {
        model.addAttribute("todos", todoRepository.findAllByUrgentIsTrueAndCompletedIsFalseOrderByIdDesc());
        return "todolist";
    }

    @GetMapping(value = "/notcompleted")
    public String showNotCompletedTodos(Model model) {

        model.addAttribute("todos",
                todoRepository.findAllByCompletedIsFalseOrderByIdDesc());

        return "todolist";

    }




    @GetMapping(value = "/completed")
    public String showCompletedTodos(Model model) {
        model.addAttribute("todos", todoRepository.findAllByCompletedIsTrueOrderByIdDesc());
        return "todolist";
    }


    @PostMapping(value = "/{id}/edit")
    public String editTodoItem(@PathVariable("id") Long id, @RequestParam(value = "Title", required = false)
            String title,
                               @RequestParam(value = "Urgent", required = false, defaultValue = "false") boolean urgent,
                               @RequestParam(value = "Done", required = false, defaultValue = "false") boolean completed) {
        Todo t = todoRepository.findById(id).get();
//        if (title != null) {
        t.setTitle(title);
        //  }
        t.setUrgent(urgent);
        t.setCompleted(completed);
        todoRepository.save(t);
        return "redirect:/todo/";
    }


}


//    @GetMapping(value = "/notcompleted")
//    public String showNotCompletedTodos(Model model) {
//        model.addAttribute("todos",
//                todoRepository.findAll().stream()
//                        .filter(t -> t.isCompleted() == false)
//                        .sorted((t1, t2) -> t1.compareTo(t2))
//                        .sorted(Collections.reverseOrder())
//                        .collect(Collectors.toList()));
//        return "todolist";
//    }


//


//    @GetMapping(value = {"/", "/list"})
//    public String list (@RequestParam(value = "isActive", required = false) String completed, Model model) {
//        if (completed != null && completed.equals("true")) {
//            model.addAttribute("todolist",todoRepository.findAll().stream().filter(x -> true == (x.isCompleted())).collect(Collectors.toList()));
//            return "todolist";
//        } else  if (completed != null && completed.equals("false")) {
//            model.addAttribute("todolist",todoRepository.findAll().stream().filter(x -> false == (x.isCompleted())).collect(Collectors.toList()));
//            return "todolist";
//        } else {
//            model.addAttribute("todolist",todoRepository.findAll());
//            return "todolist";
//        }

//findAllByOrderByIdDesc()

//Extend the controller class with delete() method mapping to /{id}/delete
//The aim is to delete the clicked item
//To do this the clicked item should be specified in the path, so we will need a uniq @PathVariable, which in our case is the long id of the todo item
//Use the delete(id) method of the repository passing the id in it
//Don't forget to specify the id in the template when you create the 'delete' link
//After the user deleted the item the list page should come up


//    Extend the project and add a create todo view and methods
//    You will need two different methods(GET, POST) in controller
//    The view should be a simple form, which should receive the new object and if the template is right then it should create the needed object for us
//    hint: google handling form submission spring
//    In your controller you only need to save the passed object with the repository, this should be the POST method
//    After the user submitted the form and the Todo is saved redirect to the list page
//    Add a link to the list page which redirects to the add todo page


//    Extend Listing
//    Extend the listing method with a request parameter
// for listing the active todos (active means !isCompleted) If you write
//    http://localhost:8080/todo/?isActive=true then only those todos
// which are not done yet should be lsited.


//Create a new controller called TodoController which maps to /todo
//method which maps to / and /list in the controller, which returns
// with "This is my first todo" string. Use the @ResponseBody annotation.