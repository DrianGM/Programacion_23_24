package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

import java.util.Arrays;

public class Baloncesto extends Deporte {
  private int num_equipo;
  private Baloncestista[] lista_baloncestistas;

  public Baloncesto(String nombre, String pabellon) {
    super(nombre, pabellon);
  }

  public void mostrarJugadoresBaloncesPorAltura() {
    Arrays.sort(lista_baloncestistas, new BaloncestistasPorAltura());
  }
}
