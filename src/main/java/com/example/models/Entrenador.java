package com.example.models;

import java.util.UUID;

public class Entrenador {
   private   UUID id;
    private String nombre;
 private  String ciudadOrigen;
   private  Integer edad;

    public Entrenador() {
    }

    public Entrenador(String ciudadOrigen, Integer edad, UUID id, String nombre) {
        this.ciudadOrigen = ciudadOrigen;
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    

}
