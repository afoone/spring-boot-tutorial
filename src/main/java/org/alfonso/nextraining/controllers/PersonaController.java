package org.alfonso.nextraining.controllers;

import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/personas")
public class PersonaController {


    @Autowired
    PersonaService personaService;

    @GetMapping("")
    public String getPersonas(Model model) {
        model.addAttribute("items", personaService.getPersonas());
        return "personas";
    }
}
