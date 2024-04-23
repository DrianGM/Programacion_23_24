package org.velazquez.U7_colecciones.tarea_5;

import java.io.Serializable;

public class Aspirante implements Serializable {
    private String nombre;
    private String dni;
    private String telefono;

    public Aspirante(String nombre, String dni, String telefono){
        this.nombre=nombre;
        this.dni=dni;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }
}
