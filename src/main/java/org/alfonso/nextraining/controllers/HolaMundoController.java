package org.alfonso.nextraining.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.alfonso.nextraining.models.Persona;
import org.alfonso.nextraining.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class HolaMundoController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/hola/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    // @GetMapping("/personas/")
    // devuelva toda la lista de personas

    @GetMapping("/persona/{nombre}")
    public Persona getPersona(@PathVariable String nombre) {
        System.out.println(personaService.getPersonas().size() + " personas hay en el servicio");

        Persona result = null;

        for (int i = 0; i < personaService.getPersonas().size(); i++) {
            if (personaService.getPersonas().get(i).getNombre().equals(nombre)) {
                result = personaService.getPersonas().get(i);
            }
        }

        return result;
    }

    @GetMapping("/add/{nombre}/{edad}")
    public Persona addPersona(@PathVariable String nombre, @PathVariable Integer edad ) {
        Persona nuevaPersona = new Persona(nombre, edad);
        // añadir a la persona a la lista

        return nuevaPersona;
    }


}