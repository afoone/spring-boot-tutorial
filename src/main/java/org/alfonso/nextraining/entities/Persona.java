package org.alfonso.nextraining.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.Column;
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

    @OneToMany(mappedBy = "persona")
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

}
