package org.velazquez.U7_colecciones.Practica.Examen_1920_Maniana;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean vacunado, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", propietario=" + propietario +
                ", raza=" + raza;
    }
}