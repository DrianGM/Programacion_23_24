package org.velazquez.U7_colecciones.tarea_2;

import java.util.HashSet;
import java.util.Set;

public class ejercicio_12 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        Set<String> conjunto2 = new HashSet<>();
        conjunto1.add("Goku");
        conjunto1.add("Vegeta");
        conjunto1.add("Gohan");
        conjunto2.add("Goku");
        conjunto2.add("Vegeta");
        conjunto2.add("Gohan");
        boolean boo = incluido(conjunto1,conjunto2);
        System.out.println(boo);
    }

    public static <T> boolean incluido(Set<T> conjunto1, Set<T> conjunto2){
        for (Object elemento : conjunto1) {
            if (!conjunto2.contains(elemento)) {
                return false;
            }
        }
        return true;
    }
}
