package com.greenfoxacademy.filip3.model;

import com.greenfoxacademy.filip3.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ColorController {

    @Autowired
    UtilityService utilityService;

    @RequestMapping(value = "/useful")
    public String usefulUtil() {
        return "useful";
    }

    @RequestMapping(value = "/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "usefulColored";
    }

    @RequestMapping(value = "/useful/email")
    public String validEmail(@RequestParam String email, Model model) {
        model.addAttribute("isValidEmail", utilityService.validateEmail(email));
        model.addAttribute("testedEmail", email);
        return "usefulEmail";
    }


}
