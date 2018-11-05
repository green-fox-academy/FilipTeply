package com.greenfox.filip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping(value="/hello")
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

}
