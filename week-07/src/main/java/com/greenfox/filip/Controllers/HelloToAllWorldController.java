package com.greenfox.filip.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller

public class HelloToAllWorldController {

    int index;

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"black", "blue", "red", "green", "lime"};

    String[] sizes = {"20px", "40px"};

    @RequestMapping(value = "web/greetingToAllWorld")
    public String greetingWorld(Model model) {

        Random r = new Random();
        //index = r.nextInt(hellos.length);
        model.addAttribute("oneHello", hellos[r.nextInt(hellos.length)]);
        model.addAttribute("color", colors[r.nextInt(colors.length)]);
        model.addAttribute("size", sizes[r.nextInt(sizes.length)]);

        return "greetAllWorld";
    }

}
