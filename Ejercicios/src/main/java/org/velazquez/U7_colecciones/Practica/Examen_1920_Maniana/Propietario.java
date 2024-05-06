package org.velazquez.U7_colecciones.Practica.Examen_1920_Maniana;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int numSocio;
    private String pais;

    public Propietario(String nombre, String apellido1, String apellido2, int numSocio, String pais) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numSocio = numSocio;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", apellido1=" + apellido1 +
                ", apellido2=" + apellido2 +
                ", numSocio=" + numSocio +
                ", pais=" + pais;
    }
}