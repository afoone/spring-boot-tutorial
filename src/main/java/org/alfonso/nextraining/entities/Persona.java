package org.alfonso.nextraining.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

/**
 *  Entidad Persona
 *  @version 1.0
 */
@Entity
@Table(name = "persons")
public class Persona {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String nombre;

    @Column(name = "surname1", nullable = false, length = 100)
    private String apellido1;

    @Column(name = "surname2", nullable = true, length = 100)
    private String apellido2;

    @Column(name = "age", nullable = false)
    private Integer edad; // Wrapper class int -> Integer

    // @OneToMany(mappedBy = "persona")
    @ElementCollection
    @CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "person_id"))
    private List<Telefono> telefonos;


    // Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { id: ").append(id).append(", nombre: ").append(nombre).append(", apellido1: ").append(apellido1).append(", apellido2: ").append(apellido2).append(", edad: ").append(edad).append(" }");
        return sb.toString();
    }

}
