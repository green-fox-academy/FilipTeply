package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxListHandler foxListHandler;

    @Autowired
    public MainController(FoxListHandler foxListHandler) {
        this.foxListHandler = foxListHandler;
    }

    @GetMapping(value = "/")
    public String indexPageController
            (@RequestParam(value = "name", defaultValue = "Mr Fox") String name, Model model) {

        model.addAttribute("fox",
                foxListHandler.listOfFoxes.stream()
                        .filter(l -> l.getName().equals(name))
                        .findFirst()
                        .get());

        return "index";
    }


    @GetMapping(value = "/login")
    public String loginPageController() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginNewFox(@RequestParam String name) {
        Fox f = new Fox(name);
        foxListHandler.addFox(f);
        return "redirect:/?name=" + name;
    }


//    @GetMapping(value = "/foodcenter")
//    public String foodCenter(@RequestParam(value = "name", required = false) String name, Model model) {
//        if (name != null) {
//            model.addAttribute("name", name);
//            return "foodcenter";
//        } else {
//            return "login";
//        }
//    }

//    @GetMapping(value = "/find")
//    public String findFox(@RequestParam String name) {
//        foxService.getListOfFoxes().stream()
//                .filter(fox -> fox.getName() == name)
//                .findFirst()
//                .get();
//        return "redirect:/?name=" + name;
//    }

//    @GetMapping("/listOfFoxes")
//    public String showAllFoxes(@RequestParam String name){
//
//    }


//    model.addAttribute("food", foxListHandler.listOfFoxes.stream()
//            .map(l -> l.getFood() == fox.getNa)
//            .findFirst()
//                .get());
//        model.addAttribute("drink", foxListHandler.listOfFoxes.);
//        model.addAttribute("fox", );
//
//        model.addAttribute("name", foxTxtFileHandler.mrFox.getName());
//        model.addAttribute("food", foxTxtFileHandler.mrFox.getFood());
//        model.addAttribute("drink", foxTxtFileHandler.mrFox.getDrink());

}
