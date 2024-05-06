package org.velazquez.U7_colecciones.tarea_2;

//Hacer lo mismo que en el ejercicio anterior con la intersección , formada por los elementos comunes a los dos conjuntos.

import java.util.HashSet;
import java.util.Set;

public class ejercicio_10 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        Set<String> conjunto2 = new HashSet<>();
        conjunto1.add("Goku");
        conjunto1.add("Vegeta");
        conjunto1.add("Gohan");
        conjunto2.add("Satan");
        conjunto2.add("Goku");
        conjunto2.add("Gohan");
        conjunto1 = interseccion(conjunto1,conjunto2);
        System.out.println(conjunto1);
    }
    public static <T> Set<T> interseccion(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> conjuntoUnion = new HashSet<>(conjunto1);
        conjuntoUnion.retainAll(conjunto2);
        return conjuntoUnion;
    }
}