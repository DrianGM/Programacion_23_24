package org.velazquez.U7_colecciones.Practica.ejercicios.entregable_2021_tarde;

import java.util.Comparator;

public class OrdenarAlumnoPorApellido implements Comparator<Alumno> {

  @Override
  public int compare(Alumno o1, Alumno o2) {
    return o1.getApellidos().compareTo(o2.getApellidos());
  }
}
