package com.greenfoxacademy.filip3;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {

    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    @RequestMapping(value = "/useful")
    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    @RequestMapping(value = "/useful/email")
    public boolean validateEmail(String email) {
        return (email.contains("@") && email.contains("."));
    }


//check if the string contains a @ and a .


}

