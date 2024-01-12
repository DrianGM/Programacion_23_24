package org.velazquez.U4_POO.tarea_1.ejercicio_5;

public class Principal {
    public static void main(String[] args) {
        Texto cadena = new Texto(16);
        cadena.agregarCadena("octavios","inicio");
        cadena.agregarCaracter('o',"final");
        cadena.mostrarCadena();
        int i = cadena.contarVocales();
        System.out.println(i);
    }
}
