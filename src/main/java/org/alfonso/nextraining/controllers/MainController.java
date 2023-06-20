package org.alfonso.nextraining.controllers;

import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {



    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Soy el mensaje desde el inframundo de los controladores");
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }




}
