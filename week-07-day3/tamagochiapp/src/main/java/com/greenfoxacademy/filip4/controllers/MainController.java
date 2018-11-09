package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;
import com.greenfoxacademy.filip4.Models.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {


    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(value = "/")
    public String indexPageController(@RequestParam(value = "name", required = false) String name, Fox fox, Model model) {
        if (name != null) {

            model.addAttribute("name", name);
  //          model.addAttribute("food", fox.getFood());
//            model.addAttribute("drink", fox.getDrink());
//            model.addAttribute("trickCount", Integer.toString(fox.getListOfTricks().size()));
//            model.addAttribute("trickList", fox.getListOfTricks());
           // model.addAttribute("listOfFoxes", foxService.getListOfFoxes());

//            model.addAttribute("name", foxService.getListOfFoxes().stream()
//                    .filter(fox -> fox.getName() == name)
//                    .findFirst()
//                    .get());
//            model.addAttribute("food", foxService.getListOfFoxes().stream()
//                    .filter(fox -> fox.getFood() == food)
//                    .findFirst()
//                    .get());
//            model.addAttribute("drink", mrFox.getDrink());

            return "index";
        } else {
            model.addAttribute("listOfFoxes", foxService.getListOfFoxes());
            model.addAttribute("name", foxService.mrFox.getName());
            model.addAttribute("food", foxService.mrFox.getFood());
            model.addAttribute("drink", foxService.mrFox.getDrink());
            model.addAttribute("trickCount", Integer.toString(foxService.mrFoxTrickList.size()));
            model.addAttribute("trickList", foxService.mrFoxTrickList);
//
// model.addAttribute("food", mrFox.getFood());
//            model.addAttribute("drink", mrFox.getDrink());
//            model.addAttribute("tricks", mrFox.getDrink());
            return "index";
        }
    }

    @GetMapping(value = "/login")
    public String loginPageController() {
        return "login";
    }


    @PostMapping(value = "/login")
    public String loginNewFox(@RequestParam String name) {
        Fox fox = new Fox(name);
        foxService.addFox(fox);
        //model.addAttribute("foxName", fox);
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

}
