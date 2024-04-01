package org.velazquez.U7_colecciones.tarea_2;

import java.util.HashSet;
import java.util.Set;

public class ejercicio_11 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        Set<String> conjunto2 = new HashSet<>();
        conjunto1.add("Goku");
        conjunto1.add("Vegeta");
        conjunto1.add("Gohan");
        conjunto2.add("Satan");
        conjunto2.add("Yamcha");
        conjunto2.add("Gohan");
        conjunto1 = diferencia(conjunto1,conjunto2);
        System.out.println(conjunto1);
    }
    public static <T> Set<T> diferencia(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> conjuntoUnion = new HashSet<>(conjunto1);
        conjuntoUnion.removeAll(conjunto2);
        return conjuntoUnion;
    }
}