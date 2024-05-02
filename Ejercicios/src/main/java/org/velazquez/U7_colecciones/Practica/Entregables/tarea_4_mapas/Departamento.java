package org.velazquez.U7_colecciones.Practica.Entregables.tarea_4_mapas;

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
