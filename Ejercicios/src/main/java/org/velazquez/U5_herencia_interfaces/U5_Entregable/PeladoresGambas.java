package org.velazquez.U5_herencia_interfaces.U5_Entregable;

public class PeladoresGambas extends Participante {
    private int peso;

    public PeladoresGambas(int edad, int peso) {
        super(edad);
        this.peso = peso;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + this.nombre + ", como pelador, juro los valores deportivos mundiales");
    }

    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }
}
