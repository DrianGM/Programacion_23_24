package org.velazquez.U5_herencia_interfaces.Practica_U5.U5_Entregable_Hecho;

public class Baloncestista extends Participante implements encestar {
  private float altura;

  public Baloncestista(String nombre, int edad, float altura) {
    super(nombre, edad);
    this.altura = altura;
  }

  @Override
  public void hacerjuramento() {
    System.out.println(
        "Yo" + nombre + " , como jugador de baloncesto, juro los valores deportivos mundiales");
  }

  @Override
  public String toString() {
    return "Baloncestista{"
        + "altura="
        + altura
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + '}';
  }

  public float getAltura() {
    return altura;
  }

  @Override
  public void encestar() {
    System.out.println("2 puntos");
  }
}
