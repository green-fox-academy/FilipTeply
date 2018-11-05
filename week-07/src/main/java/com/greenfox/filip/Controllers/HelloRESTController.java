package com.greenfox.filip.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {

    private final AtomicLong idCounter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    //@GetMapping

    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello World!") String name) {
        return new Greeting(idCounter.incrementAndGet(), name);
    }

}
