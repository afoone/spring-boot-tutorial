package org.alfonso.nextraining.repositories;

import org.alfonso.nextraining.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
    Iterable<Persona> findByNombre(String nombre);

    Iterable<Persona> findByNombreLike(String nombre);

    Iterable<Persona> findByNombreLikeIgnoreCase(String nombre);
}
