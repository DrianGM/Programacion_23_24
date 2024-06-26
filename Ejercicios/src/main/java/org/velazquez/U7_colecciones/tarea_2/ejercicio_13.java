package org.velazquez.U7_colecciones.tarea_2;

//Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros de entrada se mantengan intactas.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio_13 {
    public static void main(String[] args) {
        List<String> conjunto1 = new ArrayList<>();
        List<String> conjunto2 = new ArrayList<>();
        conjunto1.add("C");
        conjunto1.add("A");
        conjunto1.add("B");
        conjunto2.add("W");
        conjunto2.add("K");
        conjunto2.add("D");
        List<String> conjunto3 = listas(conjunto1,conjunto2);
        System.out.println(conjunto3);

    }
    public static List listas(List lista1, List lista2) {
        List listaUnion = new ArrayList<>(lista1);
        listaUnion.addAll(lista2);
        Collections.sort(listaUnion);
        return listaUnion;
    }
}