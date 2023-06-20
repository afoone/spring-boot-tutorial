package org.alfonso.nextraining.models;

/**
 *  Clase Persona
 *  @version 1.0
 *  POJO (Plain Old Java Object)
 */
public class Persona {
    private String nombre;
    private Integer edad; // Wrapper class int -> Integer

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
