package org.velazquez.U7_colecciones.U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Artista implements Serializable {
    private static int contador = 1;
    private String nombre;
    private String genero;
    private String nacionalidad;
    private int id;

    public Artista(String nombre, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.id = contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
                ", genero=" + genero +
                ", nacionalidad='" + nacionalidad +
                ", id=" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return id == artista.id && Objects.equals(nombre, artista.nombre) && Objects.equals(genero, artista.genero) && Objects.equals(nacionalidad, artista.nacionalidad);
    }
}
