package org.velazquez.U7_colecciones.Practica.ejercicios.entregable_2021_tarde;

import java.util.Comparator;

public class OrdenarAlumnoPorDni implements Comparator<Alumno> {

  @Override
  public int compare(Alumno o1, Alumno o2) {
    return o1.getDni().compareTo(o2.getDni());
  }
}
