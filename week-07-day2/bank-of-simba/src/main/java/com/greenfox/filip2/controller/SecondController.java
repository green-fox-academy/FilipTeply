package com.greenfox.filip2.controller;

import com.greenfox.filip2.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class SecondController {

    @RequestMapping(value = "/show")
    @GetMapping

    public String show(
            Model model) {

        BankAccount lion;
        lion = new BankAccount("Simba", "2000", "lion");
        model.addAttribute();

        return "Hello World";
    }

}