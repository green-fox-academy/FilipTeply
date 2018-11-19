package com.greenfox.filip.controllers;

import com.greenfox.filip.Model.DoublingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//    public Object error() {

//
//    }
}
