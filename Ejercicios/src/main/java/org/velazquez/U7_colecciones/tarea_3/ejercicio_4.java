package org.velazquez.U7_colecciones.tarea_3;

public class ejercicio_4 {
    public static void main(String[] args) {
        Traductor traductor = new Traductor("src/main/java/org/velazquez/U7_colecciones/tarea_3/diccionario.txt");
        String castellano = "mundo";
        String ingles = traductor.traduccion(castellano);
        System.out.println(castellano);
        System.out.println(ingles);
    }
}