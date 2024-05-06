package org.velazquez.U7_colecciones.tarea_1;

//Implementar una funciona a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos (sin modificar la original).

import java.util.ArrayList;
import java.util.List;

public class ejercicio_8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Juan");
        List<String> sinRepetidos = eliminaRepetidos(nombres);
        System.out.println(nombres);
        System.out.println(sinRepetidos);
    }

    static List<String> eliminaRepetidos(List<String> c) {
        List<String> copia = new ArrayList<>();
        for (String nombre : c) {
            if (!copia.contains(nombre)) {
                copia.add(nombre);
            }
        }
        return copia;
    }
}

