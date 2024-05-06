package org.velazquez.U7_colecciones.tarea_2;

//Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos.

import java.util.Set;
import java.util.HashSet;

public class ejercicio_9 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        Set<String> conjunto2 = new HashSet<>();
        conjunto1.add("Goku");
        conjunto1.add("Vegeta");
        conjunto1.add("Gohan");
        conjunto2.add("Satan");
        conjunto2.add("Krillin");
        conjunto2.add("Videl");
        conjunto1 = union(conjunto1,conjunto2);
        System.out.println(conjunto1);
    }
    public static <T> Set<T> union(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> conjuntoUnion = new HashSet<>(conjunto1);
        conjuntoUnion.addAll(conjunto2);
        return conjuntoUnion;
    }
}