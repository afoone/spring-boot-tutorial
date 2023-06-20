package org.alfonso.nextraining.models;

public class Persona {
    private String nombre;
    private Integer edad; // Wrapper class int -> Integer

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
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
