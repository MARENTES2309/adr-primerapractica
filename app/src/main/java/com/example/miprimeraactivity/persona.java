package com.example.miprimeraactivity;

import java.io.Serializable;

public class persona implements Serializable {

    private String Nombre;
    private Integer Edad;

    public persona(String nombre, Integer edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String esmayor(){
        if (this.Edad>18){
            return "Es mayor";
        }else {
            return "Es menor";
        }
    }
}
