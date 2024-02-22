package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

import java.util.Comparator;

public class BaloncestistasPorAltura implements Comparator<Baloncestista> {
  @Override
  public int compare(Baloncestista o1, Baloncestista o2) {
    if (o1.getAltura() > o2.getAltura()) {
      return 1;
    } else if (o1.getAltura() < o2.getAltura()) {
      return -1;
    } else {
      return 0;
    }
  }
}
