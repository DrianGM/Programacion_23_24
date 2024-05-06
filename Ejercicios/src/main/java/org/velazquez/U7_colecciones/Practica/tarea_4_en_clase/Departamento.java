package org.velazquez.U7_colecciones.Practica.tarea_4_en_clase;

import java.io.Serializable;

public class Departamento implements Serializable {
  private String nombre;

  public Departamento(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Departamento{" + "nombre='" + nombre + '\'' + '}';
  }
}
