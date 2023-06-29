package org.alfonso.nextraining.controllers;

import org.alfonso.nextraining.entities.Persona;
import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {
    

    @Autowired
    PersonaService personaService;

    @GetMapping("/")
    public Iterable<Persona> getPersonas() {
        return personaService.getPersonas();
    }

    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable Long id) {
        return personaService.getPersona(id);
    }

    @PostMapping("/")
    public void addPersona(@RequestBody Persona persona) {
        System.out.println("Persona recibida: " + persona);
        personaService.addPersona(persona);
    }

}
