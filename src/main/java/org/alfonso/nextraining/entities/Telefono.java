package org.alfonso.nextraining.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "phones")
public class Telefono {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false, length = 15)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Persona persona;
    
}
