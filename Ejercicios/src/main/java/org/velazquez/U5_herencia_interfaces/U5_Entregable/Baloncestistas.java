package org.velazquez.U5_herencia_interfaces.U5_Entregable;

public class Baloncestistas extends Participante {
    private double altura;

    public Baloncestistas(int edad) {
        super(edad);
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + this.nombre + ", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }
}
