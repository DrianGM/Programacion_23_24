package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

public abstract class Participante {
  protected String nombre;
  protected int edad;

  public Participante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public abstract void hacerjuramento();

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
