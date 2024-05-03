package org.velazquez.U7_colecciones.U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Caseta implements Serializable {
    private static int contador = 1;
    private String nombre;
    private String ubicacion;
    private int tamanio;
    private int id;

    public Caseta(String nombre, String ubicacion, int tamanio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
        this.id = contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", ubicacion=" + ubicacion +
                ", tamanio=" + tamanio +
                ", id=" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caseta caseta = (Caseta) o;
        return tamanio == caseta.tamanio && id == caseta.id && Objects.equals(nombre, caseta.nombre) && Objects.equals(ubicacion, caseta.ubicacion);
    }
}
