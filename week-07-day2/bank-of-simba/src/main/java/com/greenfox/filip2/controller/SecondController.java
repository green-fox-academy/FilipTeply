package com.greenfox.filip2.controller;

import com.greenfox.filip2.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class SecondController {

    @RequestMapping(value = "/show")
    public String show(Model model) {


        BigDecimal bigDecimal = new BigDecimal(2000.00);
        model.addAttribute("account", new BankAccount
                ("Simba", bigDecimal, "Zebra", "lion"));

        return "index";
    }

}