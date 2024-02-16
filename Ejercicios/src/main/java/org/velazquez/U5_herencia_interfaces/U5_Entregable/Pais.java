package org.velazquez.U5_herencia_interfaces.U5_Entregable;

public class Pais implements Comparable<Pais> {
    protected String nombre;
    protected int participantes;

    public Pais(String nombre, int participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    public int getParticipantes() {
        return participantes;
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.nombre);
    }
}
