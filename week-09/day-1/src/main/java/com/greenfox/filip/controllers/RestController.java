package com.greenfox.filip.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input") int input) {
        int result;
        result = 2*input;
        HashMap<String, Integer> hashMap1= new HashMap<>();

        hashMap1.put("received", input);
        hashMap1.put("result", result);

        return hashMap1;
    }

}
