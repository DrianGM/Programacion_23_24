package org.velazquez.U7_colecciones.Practica.Entregables.T2_ej15_ListaOrdenada;

import java.util.Comparator;

public class EnterosCrecientes implements Comparator<Integer> {
  @Override
  public int compare(Integer i1, Integer i2) {
    return i1 - i2;
  }
}
