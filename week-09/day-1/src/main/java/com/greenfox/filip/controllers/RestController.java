package com.greenfox.filip.controllers;

import com.greenfox.filip.Model.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        Integer result;
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (input == null) {

            //        HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("error", "Please provide an input!");
            return hashMap2;
        } else {
            //DoublingResponse.
            result = 2 * input;

            hashMap1.put("received", input);
            hashMap1.put("result", result);
            return hashMap1;
        }
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object append(@PathVariable("appendable") String appendable) {
        return new Appenda(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) RequestNumber until) {

        return new DoUntil(action, until);


    }




//    @GetMapping("/dountil/{action}")
//    public Object doUntil(@PathVariable("action") String action, Integer until) {
//        return new DoUntil(action, until);
//    }


}


//    public Object error() {

//
//    }

