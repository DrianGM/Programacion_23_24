package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;

public class ejercicio_6 {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 3, 2, 1, 6, 7, 5, 3};
        int[] array2 = sinRepetidos(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static int[] sinRepetidos(int[] t) {
        int[] sinRepetidos = null;
        int contadorRepetidos = 0;
        int aumentarArray = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i] == t[j]) {
                    contadorRepetidos++;
                }
            }
            if (contadorRepetidos < 2) {
                aumentarArray++;
            } else {

            }
            contadorRepetidos = 0;
        }
        sinRepetidos = new int[aumentarArray];
        return sinRepetidos;
    }
}
