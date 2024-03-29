package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

import java.util.Comparator;

public class OrdenPaisesParticipantes implements Comparator<Pais> {
  @Override
  public int compare(Pais o1, Pais o2) {
    if (o1.getNum_participantes() > o2.getNum_participantes()) {
      return 1;
    } else if (o1.getNum_participantes() < o2.getNum_participantes()) {
      return -1;
    } else {
      return 0;
    }
  }
}
