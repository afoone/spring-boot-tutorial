package org.alfonso.nextraining.controllers;

import org.alfonso.nextraining.entities.Persona;
import org.alfonso.nextraining.exceptions.NextrainingException;
import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/personas")
public class PersonaController {


    @Autowired
    PersonaService personaService;

    @GetMapping("")
    public String getPersonas(@RequestParam(required = false) String name, Model model) {
        System.out.println("El nombre es: " + name);
        if (name == null || name.equals("")) {
            Iterable<Persona> personas = personaService.getPersonas();
            for (Persona persona : personas) {
                System.out.println(persona);
                System.out.println(persona.getTelefonos());
            }
            model.addAttribute("items", personas);
            return "personas";
        }

        System.out.println("El nombre es: " + personaService.getPersonasByNombre(name));
        model.addAttribute("items", personaService.getPersonasByNombre(name));
        return "personas";
    }

    @PostMapping("")
    public String addPersona(@ModelAttribute Persona persona) throws NextrainingException{
        // persona.setApellido1("desconocido");
        personaService.addPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/create")
    public String createPersona(Model model) {
        model.addAttribute("persona", new Persona());
        return "personaForm";
    }
}
