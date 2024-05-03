package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_9;

import java.io.Serializable;

public class Tren implements Serializable {
    private String nombre;
    private int numero;

    public Tren(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                '}';
    }
}