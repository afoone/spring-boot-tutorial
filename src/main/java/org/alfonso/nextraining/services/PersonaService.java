package org.alfonso.nextraining.services;

import java.util.ArrayList;
import java.util.List;

import org.alfonso.nextraining.models.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private List<Persona> personas;

    public PersonaService() {
        personas = new ArrayList<>();
        personas.add(new Persona("pepito", 48));
        personas.add(new Persona("juanito", 18));
        personas.add(new Persona("menganito", 17));
        personas.add(new Persona("fulanito", 16));
        personas.add(new Persona("juanita", 56));
        personas.add(new Persona("menganita", 17));
        personas.add(new Persona("fulanita", 16));
    }

    // accessors
    public List<Persona> getPersonas() {
        return personas;
    }

    // método que añada una persona a la lista
    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    // medoto que borra una persona de la lista
    public void borraPersona(Persona persona) {
        personas.remove(persona);
    }


}
