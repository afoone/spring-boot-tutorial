package org.alfonso.nextraining.repositories;

import org.alfonso.nextraining.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
    
}
