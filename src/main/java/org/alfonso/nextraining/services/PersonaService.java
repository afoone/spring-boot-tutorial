package org.alfonso.nextraining.services;

import org.alfonso.nextraining.entities.Persona;
import org.alfonso.nextraining.repositories.PersonaRepository;
import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    // accessors
    public Iterable<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    public Iterable<Persona> getPersonasByNombre(String nombre) {
        return personaRepository.findByNombreLikeIgnoreCase('%' + nombre + '%');
    }

    // método que añada una persona a la lista
    public void addPersona(Persona persona) {
        try {
            personaRepository.save(persona);
        } catch (Exception e) {
            System.out.println("Error al guardar la persona: ".concat(e.getMessage()));
        }
    }

    // medoto que borra una persona de la lista
    public void borraPersona(Persona persona) {
        // personas.remove(persona);
    }

}
