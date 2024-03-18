package org.velazquez.U7_colecciones.tarea_1;

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

