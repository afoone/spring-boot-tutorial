package org.alfonso.nextraining.controllers;

import org.alfonso.nextraining.models.Persona;
import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("")
    public String addPersona(@ModelAttribute Persona persona) {
        personaService.addPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/create")
    public String createPersona(Model model) {
        model.addAttribute("persona", new Persona());
        return "personaForm";
    }
}
