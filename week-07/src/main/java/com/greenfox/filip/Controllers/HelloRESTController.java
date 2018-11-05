package com.greenfox.filip.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRESTController {


    @RequestMapping(value="/greeting")
    //@GetMapping

    public Greeting greeting(@RequestParam (value="name", defaultValue = "Hello World!") String name) {
        return new Greeting( 1, name);
    }

}
