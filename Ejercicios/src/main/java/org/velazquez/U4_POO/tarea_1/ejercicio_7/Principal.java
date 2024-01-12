package org.velazquez.U4_POO.tarea_1.ejercicio_7;

public class Principal {
    public static void main(String[] args) {
        Controlador sintonizador = new Controlador();
        sintonizador.display();
        for (int i = 0; i < 57; i++) {
            sintonizador.up();
            sintonizador.display();
        }
    }
}
