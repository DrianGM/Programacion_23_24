package org.velazquez.U7_colecciones.tarea_2;

import java.util.Set;
import java.util.TreeSet;

public class ejercicio_13 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        Set<String> conjunto2 = new TreeSet<>();
        conjunto1.add("C");
        conjunto1.add("A");
        conjunto1.add("B");
        conjunto2.add("W");
        conjunto2.add("K");
        conjunto2.add("D");
        Set<String> conjunto3 = union(conjunto1,conjunto2);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        System.out.println(conjunto3);
    }
    public static <T> Set<T> union(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> conjuntoUnion = new TreeSet<>(conjunto1);
        conjuntoUnion.addAll(conjunto2);
        return conjuntoUnion;
    }
}