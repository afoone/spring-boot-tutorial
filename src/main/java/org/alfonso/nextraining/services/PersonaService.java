package org.alfonso.nextraining.services;

import org.alfonso.nextraining.entities.Persona;
import org.alfonso.nextraining.exceptions.NextrainingException;
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
    public void addPersona(Persona persona) throws NextrainingException {
        if (persona.getApellido1().trim().length() == 0) {
            throw new NextrainingException("El apellido 1 no puede estar vacío");
        }

        try {
            personaRepository.save(persona);
            System.out.println("Persona guardada: " + persona);
        } catch (Exception e) {
            throw new NextrainingException("error al guardar la persona", e);
        }
    }

    public Persona getPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    // medoto que borra una persona de la lista
    public void borraPersona(Persona persona) {
        // personas.remove(persona);
    }

}
