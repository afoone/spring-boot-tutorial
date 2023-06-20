package org.alfonso.nextraining.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.alfonso.nextraining.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class HolaMundoController {

    @GetMapping("/hola/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/persona")
    public Persona getPersona() {
        return new Persona("Alfonso", 49);
    }

}