package com.greenfox.filip5.controllers;


import com.greenfox.filip5.models.Todo;
import com.greenfox.filip5.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        return "add";
    }

    @PostMapping("/add")
    public String addSubmit(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo/";
    }

    @PostMapping(value = "/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
              return "redirect:/todo/";
    }

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
// for listing the active todos (active means !isDone) If you write
//    http://localhost:8080/todo/?isActive=true then only those todos
// which are not done yet should be lsited.

}