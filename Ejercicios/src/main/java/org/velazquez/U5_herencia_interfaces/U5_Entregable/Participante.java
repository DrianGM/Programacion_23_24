package org.velazquez.U5_herencia_interfaces.U5_Entregable;

public abstract class Participante {
    protected String nombre;
    protected int edad;

    public Participante(int edad) {
    }

    public abstract void hacerJuramento();

    public int compareTo(Participante o2) {
        return 0;
    }

    public int getEdad() {
        return edad;
    }
}
