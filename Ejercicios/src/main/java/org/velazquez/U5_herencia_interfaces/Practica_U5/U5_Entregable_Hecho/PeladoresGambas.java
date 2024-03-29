package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

public class PeladoresGambas extends Participante implements pelar {
  private int peso;

  public PeladoresGambas(String nombre, int edad, int peso) {
    super(nombre, edad);
    this.peso = peso;
  }

  @Override
  public void hacerjuramento() {
    System.out.println("Yo " + nombre + " , como pelador, juro los valores deportivos mundiales");
  }

  @Override
  public String toString() {
    return "PeladoresGambas{"
        + "peso="
        + peso
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + '}';
  }

  @Override
  public void pelar() {
    System.out.println("Voy a pelar mis gambas");
  }
}
