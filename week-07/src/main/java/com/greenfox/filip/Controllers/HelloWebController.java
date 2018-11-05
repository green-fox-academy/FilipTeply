package com.greenfox.filip.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {


    private final AtomicLong idCounter = new AtomicLong();

    @RequestMapping(value = "web/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "Hello World!") String name, Model model) {



        model.addAttribute("name", name);
        model.addAttribute("idCounter", idCounter.incrementAndGet());
        return "greeting";
    }

}
