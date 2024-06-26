package org.velazquez.U7_colecciones.Practica.teoria;

import java.util.Comparator;

public class OrdenaDescendente implements Comparator<Cliente> {
  @Override
  public int compare(Cliente c1, Cliente c2) {
    return -c1.getDni().compareTo(c2.getDni());
  }
}
