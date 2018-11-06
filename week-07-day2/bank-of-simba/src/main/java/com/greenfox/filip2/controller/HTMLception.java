package com.greenfox.filip2.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HTMLception {

    @RequestMapping(value = "/show2")
    public String show(Model model) {
        String stringy="This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("testString", stringy);
        return "index2";
    }

}