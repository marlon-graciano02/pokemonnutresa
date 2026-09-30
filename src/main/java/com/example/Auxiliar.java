package com.example;

import java.util.UUID;

public class Auxiliar {
   private  UUID id;
   private  String nombre;
  private  String profesion;
  private  String ciudad;

    
    public Auxiliar(){

    }

    public Auxiliar(String ciudad, UUID id, String nombre, String profesion) {
        this.ciudad = ciudad;
        this.id = id;
        this.nombre = nombre;
        this.profesion = profesion;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




}
