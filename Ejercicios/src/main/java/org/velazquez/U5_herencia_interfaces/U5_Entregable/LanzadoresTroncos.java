package org.velazquez.U5_herencia_interfaces.U5_Entregable;

public class LanzadoresTroncos extends Participante {
    private Prueba prueba;

    public LanzadoresTroncos(int edad) {
        super(edad);
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + this.nombre + ", como lanzador, juro los valores deportivos mundiales");
    }

    public void lanzar() {
        System.out.println("Voy a lanzar");
    }
}
